import java.util.HashMap;
import java.util.Map;
/* Adapter design pattern question:
You are building a payment system.
Your application already expects all payment
services to follow this interface:
interface PaymentProcessor {
    void pay(double amount);
}
Your system already supports PayPalPayment,
which implements PaymentProcessor.
Now you need to integrate a third-party payment
library called StripeGateway, but you cannot modify its code. 
It has a different method name and structure*/
interface PaymentProcessor {
    void pay(double amount);
}
class StripeGateway {
    public void makePayment(double amountInDollars) {
        System.out.println("Paid $" + amountInDollars + " using Stripe");
    }
}
class PaymentProcessorAdapter implements PaymentProcessor {
    private final StripeGateway stripGateway;
    public PaymentProcessorAdapter(StripeGateway stripGateway) {
        this.stripGateway = stripGateway;
    }
    @Override
    public void pay(double amount) {
        stripGateway.makePayment(amount);
    }
}
/* Bridge design pattern question:
You are building a drawing application.
The app supports different shapes, such as Circle and Rectangle.
Each shape can be drawn using different rendering engines,
such as VectorRenderer and RasterRenderer.
*/
interface Renderer {
    void render(String shapeName);
}

class VectorRenderer implements Renderer {
    @Override
    public void render(String shapeName) {
        System.out.println("drawing " + shapeName + " using vector renderer");
    }
}

class RasterRenderer implements Renderer {
    @Override
    public void render(String shapeName) {
        System.out.println("drawing " + shapeName + " using raster renderer");
    }
}

abstract class Shape {
    protected Renderer renderer;

    protected Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}

class Square extends Shape {
    public Square(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        renderer.render("square");
    }
}

class Rectangle extends Shape {
    public Rectangle(Renderer renderer) {
        super(renderer);
    }

    @Override
    public void draw() {
        renderer.render("rectangle");
    }
}
/* decorator design pattern question:
Question:
You are building a coffee ordering system.
The base product is a simple coffee,
but customers can add optional extras such as milk,
sugar, and whipped cream.
*/
interface Coffee {
    String getDescription();
    double getCost();
}
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Coffee was added";
    }
    @Override
    public double getCost() {
        return 10.0;
    }
}
abstract class CoffeeDecorator implements Coffee {
    protected final Coffee coffee;
    protected CoffeeDecorator (Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public String getDescription() {
        return coffee.getDescription();
    }
    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
class MilkCoffee extends CoffeeDecorator {
    public MilkCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Milk was added.";
    }
    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }
}
class SugarCoffee extends CoffeeDecorator {
    public SugarCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Sugar was added.";
    }
    @Override
    public double getCost() {
        return super.getCost() + 2.0;
    }
}
class WhippedCreamCoffee extends CoffeeDecorator {
    public WhippedCreamCoffee(Coffee coffee) {
        super(coffee);
    }
    @Override
    public String getDescription() {
        return super.getDescription() + "Whipped cream was added.";
    }
    @Override
    public double getCost() {
        return super.getCost() + 10.0;
    }
}
/* Flyweight design pattern question:
You are building a forest simulation game.
The game may contain thousands of trees.
we want to decrease the memory usage by
not creating too many objects.
for each tree there is type, color, texture, x, and y.
*/
class TreeType {
    private final String type;
    private final String color;
    private final String texture;
    public TreeType(String type, String color, String texture) {
        this.type = type;
        this.color = color;
        this.texture = texture;
    }
    public void draw(int x, int y) {
        System.out.println("Drawing tree of type " + type +
        " using " + color + " color "+ "with texture " + texture +
        " at x_axis equals " + x + " and y_axis equals "+ y + ".");
    }
}
class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();
    public static TreeType getTreeType(String type, String color, String texture) {
        String key = type + "-" + color + "-" + texture;
        if(!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(type, color, texture));
        }
        return treeTypes.get(key);
    }
}
class Tree {
    private final int x;
    private final int y;
    private final TreeType treeType;
    public Tree(int x, int y, TreeType treeType) {
        this.x = x;
        this.y = y;
        this.treeType = treeType;
    }
    public void draw() {
        treeType.draw(x, y);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Adapter design pattern ---");
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor paymentProcessorAdapter = new PaymentProcessorAdapter(stripeGateway);
        paymentProcessorAdapter.pay(40.5);
        System.out.println("--- Bridge design pattern ---");
        Renderer vectorRender = new VectorRenderer();
        Renderer rasterRender = new RasterRenderer();
        Shape square = new Square(vectorRender);
        square.draw();
        Shape rectangle = new Rectangle(rasterRender);
        rectangle.draw();
        System.out.println("--- Decorator design pattern ---");
        Coffee coffee = new MilkCoffee(new SugarCoffee(
            new WhippedCreamCoffee(
                new SimpleCoffee()
            ))
        );
        System.out.println("Description:" + coffee.getDescription());
        System.out.println("Cost:" + coffee.getCost());
        System.out.println("--- Flyweight design pattern ---");
        TreeType oakType1 = TreeFactory.getTreeType("Oak", "Green", "Rough");
        TreeType oakType2 = TreeFactory.getTreeType("Oak", "Green", "Rough");
        TreeType pineType = TreeFactory.getTreeType("Pine", "Dark Green", "Needle");
        Tree tree1 = new Tree(10, 20, oakType1);
        Tree tree2 = new Tree(30, 40, oakType2);
        Tree tree3 = new Tree(50, 60, pineType);
        tree1.draw();
        tree2.draw();
        tree3.draw();
        System.out.println(oakType1 == oakType2);
    }
}