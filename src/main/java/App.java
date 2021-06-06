import java.util.Scanner;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        Scanner sc = new Scanner(System.in);

        //write out
        System.out.print("How many people? ");
        int manyPeople = sc.nextInt();

        System.out.print("How many pizzas do you have? ");
        int manyPizzas = sc.nextInt();

        System.out.print("How many slices per pizza? ");
        int manySlices = sc.nextInt();

        int manyofSlices = manyPizzas * manySlices;

        System.out.println(manyPeople + " people with " + manyPizzas + " pizzas (" + manyofSlices + " slices)");

        int manyRatio = manyofSlices/manyPeople;
        System.out.println("Each person gets " + manyRatio + " pieces of pizza.");
        int remPizza = manyofSlices%manyPeople;
        System.out.println("There are " +  remPizza + " leftover pieces.");
    }
}
