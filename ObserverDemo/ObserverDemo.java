import java.util.ArrayList;
import java.util.List;

// Declare the Subject interface

interface Subject{
    void add(Observer observer);
    void remove(Observer observer);
    void notify(Message message);
}

// Declare the Observer interface

interface Observer{
    void update(Message message);
}

// Declare concrete Subject

class Publisher implements Subject {
     
    private List<Observer> observers = new ArrayList<>();
 
    @Override
    public void add(Observer o) {
        observers.add(o);
    }
 
    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }
 
    @Override
    public void notify(Message m) {
        for(Observer o: observers) {
            o.update(m);
        }
    }
}

// Declare concrete Observers

class Subscriber1 implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("Subscriber 1 received a message: " + m.getContent());
    }
}

class Subscriber2 implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("Subscriber 2 received a message: " + m.getContent());
    }
}

// Declare the state object

class Message 
{
    final String content;
     
    Message (String s) {
        this.content = s;
    }
 
    String getContent() {
        return content;
    }
}

// Test the communication

class ObserverDemo 
{
    public static void main(String[] args) 
    {
        Subscriber1 s1 = new Subscriber1();
        Subscriber2 s2 = new Subscriber2();
         
        Publisher p = new Publisher();
         
        p.add(s1);
        p.add(s2);
         
        p.notify(new Message("First Message")); // both observers will receive the message
         
        p.remove(s1);
         
        p.notify(new Message("Second Message")); // only the second observer will receive the message
    }
}
