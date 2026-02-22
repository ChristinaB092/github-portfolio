//decision structures and loops
import java.util.Scanner; //when taking data from the user you must import Scanner

public class RecapDL
{

   public static void main(String[] args)
   {
      //if statement
      //sequentially when writing code
      //taking data from the user
      
      
      int age;
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Please enter in your age");
      age = keyboard.nextInt();
      System.out.println("The age you entered was " + age);
      
      keyboard.nextLine();
      String myName = "Christina";
      System.out.println("Please enter in a name");
      String inputString = keyboard.nextLine();
      
      if(myName.equals("Christina"))
      {
      System.out.println("Your name is Christina");
      }
      else
      { 
      System.out.println("Name does not match");
      }
      
      //if statement
      
      if(age == 12)
      {
         System.out.println("You are too young");
      
      }
      else if ((age > 12) && (age < 20))
      {
         System.out.println("You are a teen.");
      }
      else
      {
         System.out.println("You are older.");
      }
      
      System.out.println("You are outside of the if statement.");
      
      switch(age)
      {
         case 12:
            System.out.println("You are 12.");
            break;
         case 13:
            System.out.println("You are 13.");
            break;
      
      }
      //loops
      //increment and decrement
      //prefix and postfix
      int value = 0;
      //value++;
      System.out.println(++value);
      
      //loops
      while(value < 10)
      {
         System.out.println("The value is " + value);
         value++;
      }
      while(age != 21)
      {
         System.out.println("You are not old enough");
         System.out.println("Please enter another age");
         age = keyboard.nextInt();
      }
      for(int k = 0; k < 10; k++)
      {
         System.out.print(" The k value is: " + k);
      
      }
      
   
   }//end of main method


}