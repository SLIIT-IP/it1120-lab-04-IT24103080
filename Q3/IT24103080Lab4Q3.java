import java.util.Scanner;

public class IT24103080Lab4Q3
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       double num = input.nextDouble();
  
       String result = (num<0)?"Negative":(num==0)?"Zero": "Positive";
       System.out.println("The number is: "+result);
   }
}