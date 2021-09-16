/*
Write a program that asks the user to enter two sets of x,y coords
and prints out the distance between those coords.

Write a program that asks the user to enter two 2d points
and prints out the distance between those 2d points.
 */

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Application {
    private static final Scanner in = new Scanner(System.in);

    /*
    Letters = expressions
    Words = statements
    Sentence = method
    Paragraphs = classes
    Chapters = packages
    Book = program
     */

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    private int readCoordValueFromUser(String prompt) {
        System.out.println(prompt);
        return in.nextInt();
    }
    public double calcDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        Application app = new Application();
        // reading in point 1
        app.x1 = app.readCoordValueFromUser("Enter x1:");
        app.y1 = app.readCoordValueFromUser("Enter y1");
        app.x2 = app.readCoordValueFromUser("x2");
        app.y2 = app.readCoordValueFromUser("y2");

        double dist = app.calcDistance(app.x1, app.y1, app.x2, app.y2);
        System.out.println("The distance between p1 and p2 is " + dist);

        System.out.println(makeGreeting());
    }

    public static String makeGreeting() {
        return "Hello, World!";
    }

}
