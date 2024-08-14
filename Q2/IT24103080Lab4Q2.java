import java.util.Scanner;

public class IT24103080Lab4Q2
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Please enter exam marks (out of 100): ");
       double num1 = input.nextDouble();
       if(num1<0 || num1>100)
         {
          System.out.print("Invalid input for exam marks. Terminating program");
         }
       else
         {
          System.out.print("Please enter lab submission marks(out of 100): ");
          double num2 = input.nextDouble();
          if(num2<0 || num2>100)
             {
              System.out.print("Invalid input for lab submission marks. Terminating program");
             } 
          else
             {
              System.out.print("Please enter the precentage given for the exam: ");
              double num3 = input.nextDouble();
              System.out.print("Please enter the precentage given for the lab submission: ");
              double num4 = input.nextDouble();
              if(num4+num3 > 100)
                 {
                  System.out.print("The percentages must add up to 100. Terminating program");
                 }
              else
                 {
                  double finalmark = (num1*num3/100) + (num2*num4/100);
                  System.out.print("Final Exam Mark is : "+finalmark);
                 }
              }
          }
     }
}
                