// Declare the common interface
interface Meal {
   void cook();
}

// Declare classes implementing the same interface.

class Pizza implements Meal {

   @Override
   public void cook() {
      System.out.println("Cooking a pizza.");
   }
}

class Lasagna implements Meal {

   @Override
   public void cook() {
      System.out.println("Cooking a lasagna.");
   }
}

class Soup implements Meal {

   @Override
   public void cook() {
      System.out.println("Cooking a soup.");
   }
}

// Create a facade class

class MealMaker {
   private Meal pizza;
   private Meal lasagna;
   private Meal soup;

   public MealMaker() {
      pizza = new Pizza();
      lasagna = new Lasagna();
      soup = new Soup();
   }

   public void cookPizza(){
      pizza.cook();
   }
   public void cookLasagna(){
      lasagna.cook();
   }
   public void cookSoup(){
      soup.cook();
   }
}

// Use the facade to cook three Meals.

public class FacadeDemo {
   public static void main(String[] args) {
      MealMaker MealMaker = new MealMaker();

      MealMaker.cookPizza();
      MealMaker.cookLasagna();
      MealMaker.cookSoup();      
   }
}
