import java.util.Scanner;

public class Methods
{

   public static void greeting(String n)
   {
        //greeting
      System.out.println("Hello there " + n + "! You look lovely today!");
   
   }
   public static String getName()
   {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter your name");
      String name = keyboard.nextLine();
      return name;
   
   }

   public static void main(String[] args)
   {
      greeting(getName());
     // System.out.println(getName());
          
   }


}