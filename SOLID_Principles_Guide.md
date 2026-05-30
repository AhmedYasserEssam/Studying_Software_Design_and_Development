# SOLID Principles — Clear Explanation With Bad and Good Code Examples

SOLID is a set of five object-oriented design principles commonly associated with Robert C. Martin. Their purpose is to make software easier to change, test, and maintain by reducing unnecessary coupling and improving separation of responsibilities.

The five principles are:

| Letter | Principle | Core idea |
|---|---|---|
| S | Single Responsibility Principle | A class should have one reason to change. |
| O | Open/Closed Principle | Code should be open for extension but closed for modification. |
| L | Liskov Substitution Principle | A subclass should be usable wherever its parent class is expected. |
| I | Interface Segregation Principle | Do not force classes to depend on methods they do not use. |
| D | Dependency Inversion Principle | Depend on abstractions, not concrete low-level classes. |

> Important: SOLID is not a rulebook. It is a set of design guidelines. Applying it blindly can create unnecessary abstraction and over-engineered code.

---

## 1. Single Responsibility Principle (SRP)

### Meaning

A class should have **one responsibility** and therefore **one reason to change**.

This does **not** mean every class must have only one method. It means the class should focus on one coherent job.

### Bad Code

```java
public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double calculateTotal() {
        return amount * 1.14; // tax calculation
    }

    public void saveToDatabase() {
        System.out.println("Saving invoice to database...");
    }

    public void sendEmail() {
        System.out.println("Sending invoice email...");
    }
}
```

### What is wrong?

The `Invoice` class has multiple responsibilities:

1. Calculating invoice totals.
2. Saving invoices to a database.
3. Sending emails.

This class may change because of tax rules, database logic, or email formatting. These are separate reasons to change.

### Good Code

```java
public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double calculateTotal() {
        return amount * 1.14;
    }
}
```

```java
public class InvoiceRepository {
    public void save(Invoice invoice) {
        System.out.println("Saving invoice to database...");
    }
}
```

```java
public class EmailService {
    public void sendInvoiceEmail(Invoice invoice) {
        System.out.println("Sending invoice email...");
    }
}
```

### Why this is better

Each class now has a clear responsibility:

| Class | Responsibility |
|---|---|
| `Invoice` | Represents invoice data and invoice calculation. |
| `InvoiceRepository` | Handles persistence. |
| `EmailService` | Handles email delivery. |

If email logic changes, `Invoice` does not need to change.

---

## 2. Open/Closed Principle (OCP)

### Meaning

Software entities should be **open for extension** but **closed for modification**.

You should be able to add new behavior without repeatedly editing stable existing code.

### Bad Code

```java
public class DiscountCalculator {
    public double calculateDiscount(String customerType, double price) {
        if (customerType.equals("REGULAR")) {
            return price * 0.05;
        } else if (customerType.equals("PREMIUM")) {
            return price * 0.10;
        } else if (customerType.equals("VIP")) {
            return price * 0.20;
        }

        return 0;
    }
}
```

### What is wrong?

Every time a new customer type is added, this class must be modified.

For example, adding `STUDENT` requires editing `DiscountCalculator`. That violates OCP because existing tested code keeps changing.

### Good Code

```java
public interface DiscountPolicy {
    double calculateDiscount(double price);
}
```

```java
public class RegularDiscount implements DiscountPolicy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.05;
    }
}
```

```java
public class PremiumDiscount implements DiscountPolicy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.10;
    }
}
```

```java
public class VipDiscount implements DiscountPolicy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.20;
    }
}
```

```java
public class DiscountCalculator {
    public double calculate(double price, DiscountPolicy discountPolicy) {
        return discountPolicy.calculateDiscount(price);
    }
}
```

### Adding a new discount without modifying old code

```java
public class StudentDiscount implements DiscountPolicy {
    @Override
    public double calculateDiscount(double price) {
        return price * 0.15;
    }
}
```

### Why this is better

The existing `DiscountCalculator` does not need to change when a new discount type is added. New behavior is added through new classes.

---

## 3. Liskov Substitution Principle (LSP)

### Meaning

A subclass should be usable anywhere its parent class is expected without breaking the program.

Inheritance should represent valid behavior, not just a real-world category.

### Bad Code

```java
public class Bird {
    public void fly() {
        System.out.println("Flying...");
    }
}
```

```java
public class Sparrow extends Bird {
    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}
```

```java
public class Penguin extends Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
}
```

```java
public class BirdService {
    public void makeBirdFly(Bird bird) {
        bird.fly();
    }
}
```

### What is wrong?

`Penguin` extends `Bird`, but it cannot correctly perform the behavior promised by `Bird.fly()`.

This breaks code like:

```java
BirdService service = new BirdService();
service.makeBirdFly(new Penguin()); // Runtime error
```

The program expects every `Bird` to fly, but `Penguin` breaks that expectation.

### Good Code

```java
public abstract class Bird {
    public abstract void eat();
}
```

```java
public abstract class FlyingBird extends Bird {
    public abstract void fly();
}
```

```java
public class Sparrow extends FlyingBird {
    @Override
    public void eat() {
        System.out.println("Sparrow is eating...");
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying...");
    }
}
```

```java
public class Penguin extends Bird {
    @Override
    public void eat() {
        System.out.println("Penguin is eating...");
    }
}
```

```java
public class BirdService {
    public void makeBirdFly(FlyingBird bird) {
        bird.fly();
    }
}
```

### Why this is better

Only birds that can actually fly inherit from `FlyingBird`. `Penguin` is still a `Bird`, but it is not incorrectly treated as something that can fly.

The design now respects the behavior expected from each type.

---

## 4. Interface Segregation Principle (ISP)

### Meaning

A class should not be forced to implement methods it does not need.

Large interfaces should be split into smaller, more specific interfaces.

### Bad Code

```java
public interface Worker {
    void work();
    void eat();
    void sleep();
}
```

```java
public class HumanWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Human is working...");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping...");
    }
}
```

```java
public class RobotWorker implements Worker {
    @Override
    public void work() {
        System.out.println("Robot is working...");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Robot does not eat");
    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException("Robot does not sleep");
    }
}
```

### What is wrong?

`RobotWorker` is forced to implement `eat()` and `sleep()`, even though those methods do not apply to robots.

This creates fake methods, runtime errors, and misleading interfaces.

### Good Code

```java
public interface Workable {
    void work();
}
```

```java
public interface Eatable {
    void eat();
}
```

```java
public interface Sleepable {
    void sleep();
}
```

```java
public class HumanWorker implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        System.out.println("Human is working...");
    }

    @Override
    public void eat() {
        System.out.println("Human is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping...");
    }
}
```

```java
public class RobotWorker implements Workable {
    @Override
    public void work() {
        System.out.println("Robot is working...");
    }
}
```

### Why this is better

Each class implements only the behavior it actually supports.

| Class | Interfaces implemented |
|---|---|
| `HumanWorker` | `Workable`, `Eatable`, `Sleepable` |
| `RobotWorker` | `Workable` |

The design is more accurate and less fragile.

---

## 5. Dependency Inversion Principle (DIP)

### Meaning

High-level modules should not depend directly on low-level modules. Both should depend on abstractions.

In simpler terms: important business logic should not be tightly coupled to specific technical details like MySQL, file storage, or email providers.

### Bad Code

```java
public class MySQLDatabase {
    public void save(String data) {
        System.out.println("Saving data to MySQL: " + data);
    }
}
```

```java
public class UserService {
    private MySQLDatabase database;

    public UserService() {
        this.database = new MySQLDatabase();
    }

    public void registerUser(String username) {
        database.save(username);
    }
}
```

### What is wrong?

`UserService` is directly tied to `MySQLDatabase`.

If the application changes from MySQL to PostgreSQL, MongoDB, or a file-based database, `UserService` must be modified.

That is tight coupling.

### Good Code

```java
public interface UserRepository {
    void save(String username);
}
```

```java
public class MySQLUserRepository implements UserRepository {
    @Override
    public void save(String username) {
        System.out.println("Saving user to MySQL: " + username);
    }
}
```

```java
public class PostgreSQLUserRepository implements UserRepository {
    @Override
    public void save(String username) {
        System.out.println("Saving user to PostgreSQL: " + username);
    }
}
```

```java
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void registerUser(String username) {
        userRepository.save(username);
    }
}
```

```java
public class Main {
    public static void main(String[] args) {
        UserRepository repository = new MySQLUserRepository();
        UserService userService = new UserService(repository);

        userService.registerUser("ahmed");
    }
}
```

### Why this is better

`UserService` depends on the `UserRepository` abstraction, not a specific database class.

To switch databases, change only the object passed into `UserService`:

```java
UserRepository repository = new PostgreSQLUserRepository();
UserService userService = new UserService(repository);
```

No change is required inside `UserService`.

---

# Summary Table

| Principle | Bad design symptom | Better design approach |
|---|---|---|
| SRP | One class handles unrelated tasks | Split responsibilities into focused classes |
| OCP | Existing code changes every time a feature is added | Add behavior through abstractions and new classes |
| LSP | Subclasses break expected parent behavior | Use inheritance only when behavior is substitutable |
| ISP | Classes implement methods they do not use | Split large interfaces into smaller ones |
| DIP | Business logic depends on concrete technical classes | Depend on interfaces or abstractions |

---

# Common Mistakes

## Mistake 1: Thinking SRP means one method per class

Wrong. SRP means one reason to change, not one method.

## Mistake 2: Using inheritance just because objects are related in real life

Real-world classification does not always produce correct software inheritance.

Example: A penguin is a bird, but it should not inherit from a software class that promises `fly()` behavior.

## Mistake 3: Creating too many interfaces

Interfaces are useful when they reduce coupling or represent meaningful variation. Creating interfaces for every class without need is usually unnecessary.

## Mistake 4: Treating SOLID as mandatory everywhere

Small scripts, prototypes, and simple applications may not need heavy abstraction. SOLID becomes more valuable when software grows and changes frequently.

---

# Practical Rule

Use SOLID when you notice these problems:

- A class keeps changing for unrelated reasons.
- Adding a feature requires editing many existing classes.
- Subclasses throw errors for inherited behavior they cannot support.
- Interfaces contain methods many classes do not need.
- Business logic is tightly coupled to databases, APIs, frameworks, or file systems.

SOLID is useful because it helps control change. It is not useful when it creates complexity without solving a real design problem.

---

# References

1. Robert C. Martin, **Design Principles and Design Patterns**. The paper discusses object-oriented class design principles including the Open/Closed Principle and Dependency Inversion Principle.  
   Link: https://www.fil.univ-lille.fr/~routier/enseignement/licence/coo/cours/Principles_and_Patterns.pdf

2. Barbara Liskov and Jeannette Wing, **A Behavioral Notion of Subtyping**, *ACM Transactions on Programming Languages and Systems*, Vol. 16, No. 6, 1994. This paper provides the formal basis behind behavioral subtyping, which underlies the Liskov Substitution Principle.  
   Link: https://dl.acm.org/doi/10.1145/197320.197383

3. Spring Framework Documentation, **Bean Scopes**. The documentation explains dependency management and singleton scope in the Spring IoC container, relevant to Dependency Inversion and object lifecycle management in Java applications.  
   Link: https://docs.spring.io/spring-framework/reference/core/beans/factory-scopes.html

4. Refactoring.Guru, **SOLID Principles** and related design-pattern explanations. This is a secondary reference useful for practical examples and explanations of object-oriented design principles.  
   Link: https://refactoring.guru/design-patterns
