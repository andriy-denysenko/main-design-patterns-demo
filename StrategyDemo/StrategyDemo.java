// Declare the interface

interface Strategy {
   double doOperation(double x, double y);
}

// Declare classes that implement the same interface.

class AddOperation implements Strategy{
   @Override
   public double doOperation(double x, double y) {
      return x + y;
   }
}

class SubstractOperation implements Strategy{
   @Override
   public double doOperation(double x, double y) {
      return x - y;
   }
}

class MultiplyOperation implements Strategy{
   @Override
   public double doOperation(double x, double y) {
      return x * y;
   }
}

class DivideOperation implements Strategy{
   @Override
   public double doOperation(double x, double y) {
      return x / y;
   }
}

// Create context class

class Context {
   private Strategy strategy;

   Context(Strategy strategy){
      this.strategy = strategy;
   }

   double executeStrategy(double x, double y){
      return strategy.doOperation(x, y);
   }
}

// Use the Context to see how behaviour changes with the change of Strategy.

public class StrategyDemo {
   public static void main(String[] args) {
      Context context = new Context(new AddOperation());        
      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

      context = new Context(new SubstractOperation());      
      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

      context = new Context(new MultiplyOperation());       
      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));

      context = new Context(new DivideOperation());       
      System.out.println("10 / 5 = " + context.executeStrategy(10, 5));
   }
}
