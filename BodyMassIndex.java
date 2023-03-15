import java.util.Scanner;
public class BodyMassIndex{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter weight in pounds:  "    );
double height = input.nextDouble();
System.out.print("Enter heigth in inches: "  );
double weight = input.nextDouble();
double pounds = height * 0.45359237;
double inches = weight * 0.0254;
double bmi = pounds / (inches * inches);

System.out.println("BmI  is  "   + bmi);


}






}