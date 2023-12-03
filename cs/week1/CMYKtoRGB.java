/*
 * Coursera/Princeton University Computer Science: Programming with a Purpose
 * Week 1: CMYKtoRGB.java
 * Lloyd Dilley
 */

public class CMYKtoRGB
{
  private static void printRGB(double cyan, double magenta, double yellow, double black)
  {
    int white = (int)(1.0 - black);
    int red = (int)(255.0 * white * (1.0 - cyan));
    int green = (int)(255.0 * white * (1.0 - magenta));
    int blue = (int)(255.0 * white * (1.0 - yellow));

    System.out.println("red   = " + red);
    System.out.println("green = " + green);
    System.out.println("blue  = " + blue);
  }

  public static void main(String[] args)
  {
    double cyan, magenta, yellow, black;

    if(args.length < 4)
    {
      System.err.println("This program requires 4 arguments!");
      System.exit(1);
    }

    try
    {
      cyan = Double.parseDouble(args[0]);
      magenta = Double.parseDouble(args[1]);
      yellow = Double.parseDouble(args[2]);
      black = Double.parseDouble(args[3]);
      /*if(cyan < 0 || magenta < 0 || yellow < 0 || black < 0)
      {
        System.err.println("All arguments must be positive doubles!");
        System.exit(1);
      }*/

      printRGB(cyan, magenta, yellow, black);
    }
    catch(NumberFormatException nfe)
    {
      System.err.println("All arguments must be doubles!");
      System.exit(1);
    }
  }
}
