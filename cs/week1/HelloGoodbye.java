/*
 * Coursera/Princeton University Computer Science: Programming with a Purpose
 * Week 1: HelloGoodbye.java
 * Lloyd Dilley
 */

class HelloGoodbye
{
  public static void main(String[] args)
  {
    if(args.length != 2)
    {
      System.out.println("This program requires 2 arguments!");
      System.exit(1);
    }
    System.out.println("Hello " + args[0] + " and " + args[1] + ".");
    System.out.println("Goodbye " + args[1] + " and " + args[0] + ".");
  }
}
