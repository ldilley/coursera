/*
 * Coursera/Princeton University Computer Science: Programming with a Purpose
 * Week 1: GreatCircle.java
 * Lloyd Dilley
 */

public class GreatCircle
{
  private final static double EARTH_RADIUS = 6371.0;

  private static double calcDist(double x1, double y1, double x2, double y2)
  {
    return 2 * EARTH_RADIUS * Math.asin(Math.sqrt((Math.pow(Math.sin((x2 - x1) / 2.0), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2.0), 2))));
  }

  public static void main(String[] args)
  {
    double x1, y1, x2, y2;

    if(args.length < 4)
    {
      System.err.println("This program requires 4 arguments!");
      System.exit(1);
    }

    try
    {
      x1 = Math.toRadians(Double.parseDouble(args[0]));
      y1 = Math.toRadians(Double.parseDouble(args[1]));
      x2 = Math.toRadians(Double.parseDouble(args[2]));
      y2 = Math.toRadians(Double.parseDouble(args[3]));
      /*if(x1 < 0 || y1 < 0 || x2 < 0 || y2 < 0)
      {
        System.err.println("All arguments must be positive doubles!");
        System.exit(1);
      }*/

      System.out.println(calcDist(x1, y1, x2, y2) + " kilometers");
    }
    catch(NumberFormatException nfe)
    {
      System.err.println("All arguments must be doubles!");
      System.exit(1);
    }
  }
}
