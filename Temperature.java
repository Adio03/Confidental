import java.util.Scanner;

public class Temperature{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter amount of water");

double water = input.nextDouble();

System.out.println("Enter initial temperature");

double temperature = input.nextDouble();

System.out.println("Enter final temperature");

double finaltem = input.nextDouble();

double answer = water * (finaltem - temperature) * 4184;

System.out.println("The energy needed is "+ answer);















}


























}