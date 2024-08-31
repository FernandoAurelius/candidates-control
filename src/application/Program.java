package application;

import java.security.InvalidParameterException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first parameter: ");
        int firstParameter = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter second parameter: ");
        int secondParameter = sc.nextInt();

        try {
            count(firstParameter, secondParameter);
        }catch (InvalidParameterException e) {
            System.out.println("The second parameter should be bigger than the first!");
        }
    }
    static void count(int firstParameter, int secondParameter ) throws InvalidParameterException {
        if(secondParameter < firstParameter) {
            throw new InvalidParameterException();
        }
        int count = secondParameter - firstParameter;
        for(int i = 1; i <= count; i++) {
            System.out.println("Printing number " + i);
        }
    }
}