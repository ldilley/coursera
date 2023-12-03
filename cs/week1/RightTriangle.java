/*
 * Coursera/Princeton University Computer Science: Programming with a Purpose
 * Week 1: RightTriangle.java
 * Lloyd Dilley
 */

public class RightTriangle
{
  public static boolean isRight(int x, int y, int z)
  {
    return x * x + y * y == z * z;
  }

  public static void main(String[] args)
  {
    int a, b, c;
    boolean retval;

    if(args.length < 3)
    {
      System.err.println("This program requires 3 arguments!");
      System.exit(1);
    }

    try
    {
      a = Integer.parseInt(args[0]);
      b = Integer.parseInt(args[1]);
      c = Integer.parseInt(args[2]);
      /*if(a < 0 || b < 0 || c < 0)
      {
        System.err.println("All arguments must be positive integers!");
        System.exit(1);
      }*/

      if(a < b && b < c)
        retval = isRight(a, b, c);
      else if(a < b && c < b)
        retval = isRight(a, c, b);
      else
        retval = isRight(b, c, a);

      System.out.println(retval);
    }
    catch(NumberFormatException nfe)
    {
      System.err.println("All arguments must be integers!");
      System.exit(1);
    }
  }
}
