import java.util.ArrayList;
import java.util.List;
/* Template behavioral class pattern question:
You are building a document processing system.
Different document types need to be processed,
such as PDF documents and Word documents.
Every document follows the same general processing steps:
openDocument, extractContent, parseContent, and closeDocument.
However, each document type has different logic
for opening, extracting, and parsing content.
*/
abstract class DocumentProcessor {
    public final void processDocument() {
        openDocument();
        extractContent();
        parseContent();
        closeDocument();
    }

    protected abstract void openDocument();
    protected abstract void extractContent();
    protected abstract void parseContent();

    private void closeDocument() {
        System.out.println("closing the document.");
    }
}

class PDFDocumentProcessor extends DocumentProcessor {
    @Override
    protected void openDocument() {
        System.out.println("opening pdf document.");
    }

    @Override
    protected void extractContent() {
        System.out.println("extracting pdf content.");
    }

    @Override
    protected void parseContent() {
        System.out.println("parsing pdf content.");
    }
}

class WordDocumentProcessor extends DocumentProcessor {
    @Override
    protected void openDocument() {
        System.out.println("opening word document.");
    }

    @Override
    protected void extractContent() {
        System.out.println("extracting word content.");
    }

    @Override
    protected void parseContent() {
        System.out.println("parsing word content.");
    }
}
/* Strategy object design pattern:
You are building an online checkout system.
Customers can choose how they want to pay:
by credit card, PayPal, or bank transfer.
Each payment method has different processing rules.
You want the system to allow the customer
to change the payment method at runtime 
without modifying the checkout logic.
*/
interface PaymentStrategy {
    void pay(double amount);
}
class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("paying " + amount + " using credit card.");
    }
}
class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("paying " + amount + " using PayPal.");
    }
}
class BankTransferPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("paying " + amount + " using bank transfer.");
    }
}
class Checkout {
    private PaymentStrategy paymentStrategy;
    public Checkout(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(double amount) {
        paymentStrategy.pay(amount);
    }
}
/* Iterator design pattern question:
You are building a music playlist system. 
A playlist contains many songs, 
but the client code should not 
access the playlist’s internal storage directly.
The playlist might store songs internally using an array, 
an ArrayList, or another collection later. 
The client should still be able to move through 
the songs one by one without knowing how the playlist stores them.
*/
interface MyIterator<T> {
    boolean hasNext();
    T next();
}
interface IterableCollection<T> {
    MyIterator<T> createIterator();
}
class Playlist implements IterableCollection<Song> {
    private final ArrayList<Song> songs = new ArrayList<>();
    public void addSong(Song song) {
        songs.add(song);
    }
    public Song getSongAt(int index) {
        return songs.get(index);
    }
    public int getSize() {
        return songs.size();
    }
    @Override
    public MyIterator<Song> createIterator() {
        return new SongIterator(this);
    }
}
class SongIterator implements MyIterator<Song> {
    private final Playlist playlist;
    private int position;
    public SongIterator(Playlist playlist) {
        this.playlist = playlist;
        this.position = 0;
    }
    @Override
    public boolean hasNext() {
        return position < playlist.getSize();
    }
    @Override
    public Song next() {
        Song song = playlist.getSongAt(position);
        position++;
        return song;
    }
}
class Song {
    private final String title;
    public Song(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
/* Mediator object design pattern question:
You are building a chat room system. 
Multiple users can send messages to each other, 
but you do not want each User object to 
directly know about every other User.
Without a central coordination object, 
every user would need references to many other users, 
creating tightly coupled code.
*/
interface ChatMediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
}
class ChatRoom implements ChatMediator {
    private final List<User> users = new ArrayList<>();
    @Override
    public void addUser(User user) {
        users.add(user);
    }
    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receive(message, sender.getName());
            }
        }
    }
}
class User {
    private final String name;
    private final ChatMediator mediator;
    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    public String getName() {
        return name;
    }
    public void send(String message) {
        mediator.sendMessage(message, this);
    }
    public void receive(String message, String senderName) {
        System.out.println(name + " received from " + senderName + ": " + message);
    }
}
/* Observer object design pattern:
Build a small Java program where a YouTube channel 
notifies all its subscribers whenever a new video is uploaded.
*/
interface Observer {
    void update(String videoTitle);
}
interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
class YouTubeChannel implements Subject {
    private final List<Observer> subscribers = new ArrayList<>();
    private String latestVideo;
    public void uploadVideo(String title) {
        latestVideo = title;
        notifyObservers();
    }
    @Override
    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }
    @Override
    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer subscriber : subscribers) {
            subscriber.update(latestVideo);
        }
    }
}
class Subscriber implements Observer {
    private final String name;
    public Subscriber(String name) {
        this.name = name;
    }
    @Override
    public void update(String videoTitle) {
        System.out.println(name + " was notified: " + videoTitle);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Template design pattern ---");
        DocumentProcessor pdfDocumentProcessor = new PDFDocumentProcessor();
        pdfDocumentProcessor.processDocument();
        DocumentProcessor wordDocumentProcessor = new WordDocumentProcessor();
        wordDocumentProcessor.processDocument();
        System.out.println("--- Strategy design pattern ---");
        PaymentStrategy paymentStrategy = new BankTransferPayment();
        Checkout checkout = new Checkout(paymentStrategy);
        checkout.pay(100.0);
        checkout.setPaymentStrategy(new PayPalPayment());
        checkout.pay(100.0);
        checkout.setPaymentStrategy(new CreditCardPayment());
        checkout.pay(100.0);
        System.out.println("--- Iterator design pattern ---");
        Playlist playlist = new Playlist();
        playlist.addSong(new Song("Song 1"));
        playlist.addSong(new Song("Song 2"));
        playlist.addSong(new Song("Song 3"));
        MyIterator<Song> iterator = playlist.createIterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            System.out.println("playing " + song.getTitle());
        }
        System.out.println("--- Mediator Pattern ---");
        ChatMediator chatRoom = new ChatRoom();
        User Ahmed = new User("Ahmed", chatRoom);
        User Maro = new User("Maro", chatRoom);
        User Ashoush = new User("Ashoush", chatRoom);
        chatRoom.addUser(Ahmed);
        chatRoom.addUser(Maro);
        chatRoom.addUser(Ashoush);
        Ahmed.send("Hanes'at!");
        System.out.println("--- Observer Pattern ---");
        YouTubeChannel channel = new YouTubeChannel();
        Observer Hamed = new Subscriber("Hamed");
        Observer Eriksen = new Subscriber("Eriksen");
        Observer Ashour = new Subscriber("Ashour");
        channel.subscribe(Hamed);
        channel.subscribe(Eriksen);
        channel.subscribe(Ashour);
        channel.uploadVideo("Like we Subscribe yakhwaty.");
    }
}