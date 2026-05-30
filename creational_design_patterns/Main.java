/* Singelton design pattern Question:
You are designing a logging system for an application.
The application has many classes, 
but all of them should write logs through 
the same logger instance so that log formatting, 
file access, and configuration remain consistent. */
class Logger {
    private static volatile Logger logger;
    private Logger(){}
    public static Logger getInstance() {
        if (logger == null) {
            synchronized(Logger.class) {
                if(logger == null) {
                    logger = new Logger();
                }
            }
        }
        return logger;
    }
}
/* Factory design pattern question:
You are building a notification system. 
The application needs to send different types of 
notifications: Email, SMS, and Push Notification.
Each notification type has its own sending logic, 
but the client code should not directly create 
EmailNotification, SMSNotification, or PushNotification 
objects using new. */
abstract class NotificationFactory {
    public void sendNotification() {
        Notification notification = createNotification();
        notification.send();
    }
    public abstract Notification createNotification();
}
class SMSNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
class EmailNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
class PushNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
interface Notification {
    void send();
}
class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("recieved a SMS");
    }
}
class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("recieved an Email");
    }
}
class PushNotification implements Notification {
    @Override
    public void send() {
        System.out.println("recieved a push notification");
    }
}
/* Abstract Factory design pattern question:
You are building a cross-platform UI library.
The application must support two operating systems: Windows and MacOS.
Each operating system needs its own family of UI components:
Windows button
Windows checkbox
MacOS button
MacOS checkbox */
interface Button {
    void render();
}

class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("rendering Windows button");
    }
}

class MacOSButton implements Button {
    @Override
    public void render() {
        System.out.println("rendering MacOS button");
    }
}

interface CheckBox {
    void render();
}

class WindowsCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("rendering Windows Checkbox");
    }
}

class MacOSCheckBox implements CheckBox {
    @Override
    public void render() {
        System.out.println("rendering MacOS Checkbox");
    }
}

abstract class UIFactory {
    public abstract Button createButton();
    public abstract CheckBox createCheckBox();
}

class WindowsFactory extends UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}

class MacOSFactory extends UIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBox();
    }
}

public class Main {
    public static void main(String[] args) {
        // Singelton client code
        System.out.println("--- Singelton design pattern ---");
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();
        System.out.println(logger1 == logger2);
        System.out.println("logger1 hashCode: " + logger1.hashCode());
        System.out.println("logger2 hashCode: " + logger2.hashCode());
        // Factory client code
        System.out.println("--- Factory design pattern ---");
        NotificationFactory smsNotificationFactory = new SMSNotificationFactory();
        smsNotificationFactory.sendNotification();
        NotificationFactory emailNotificationFactory = new EmailNotificationFactory();
        emailNotificationFactory.sendNotification();
        NotificationFactory pushNotificationFactory = new PushNotificationFactory();
        pushNotificationFactory.sendNotification();
        // Abstract Factory client code
        System.out.println("--- Abstract Factory design pattern ---");
        UIFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        CheckBox windowsCheckBox = windowsFactory.createCheckBox();
        windowsButton.render();
        windowsCheckBox.render();
        UIFactory macOSFactory = new MacOSFactory();
        Button macOSButton = macOSFactory.createButton();
        CheckBox macOSCheckBox = macOSFactory.createCheckBox();
        macOSButton.render();
        macOSCheckBox.render();
    }
}