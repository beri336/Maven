package de.hfu;
import java.util.Scanner;

public class App
{
    public static void main(String args[])
    {
        System.out.println("Please input your text: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        System.out.println("User input was: " + input);

        scanner.close();
    }
}
