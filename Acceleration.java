import java.util.Scanner;

public class Acceleration{

public static void main(String[] args ){

Scanner input = new Scanner(System.in);

System.out.print("Enter velocity v0 in m\s ");
double v0 = input. nextDouble( );

System.out.print("Enter ending velocity in m/s");
double v1 = input. nextDouble();

System.out.print("Enter t in seconds");
double t = input.nextDouble();

double acceleration =  (v1 - v0) / t;
System.out.println("Average acceleration is "  + acceleration );

}
}