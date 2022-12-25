// Declare the 1st interface
interface Transport
{
    void travel();
}

// Declare the class implementing the 1st interface
class Car implements Transport{
    public void travel(){
        System.out.println("Traveling by car");
    }
}

// Declare the client class
class Passenger{
    public void travel(Transport transport){
        transport.travel();
    }
}

// Declare the 2nd interface
interface Animal
{
    void walk();
}

// Declare the class implementing the 2nd interface
class Horse implements Animal{
    public void walk(){
        System.out.println("Riding a horse");
    }
}

// Declare the adapter
class HorseAdapter implements Transport
{
    Horse horse;
    public HorseAdapter(Horse horse)
    {
        this.horse = horse;
    }
 
    public void travel()
    {
        horse.walk();
    }
}

// Run the demo
public class AdapterDemo{
    public static void main(String[] args){
        Passenger p = new Passenger();
        Car c = new Car();
        p.travel(c);

        Horse h = new Horse();
        Transport hTransport = new HorseToTransportAdapter(h);
        hTransport.travel();
    }
}
