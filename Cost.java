import java.util.Scanner;

 public class Cost{
  public static void main(String[] args){

    Scanner input = new Scanner(System.in);

       System.out.print("Enter driving distance:  ");
         double Distance= input.nextDouble();

            System.out.print("Mile Per Gallon:  ");
            double Miles = input.nextDouble();
              
                System.out.print("Cost of Driving:  ");
                  double Price= input.nextDouble();

                    double Result= Distance /( Miles / Price);

                      System.out.printf("Cost is %f%n", Result);











}















}