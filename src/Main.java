/**
 * Created by Mihran Galstyan
 * All rights reserved
 */
public class Main {
    public static void main(final String[] args) {
        int a = 2;
        try {
            int b = 7 / a;
            String text = "12adsf";
            int i = Integer.parseInt(text);
        } catch (ArithmeticException e) {
            System.out.println("You are not allowed to divide by zero!");
        } catch (NumberFormatException e) {
            System.out.println("String contains not only numbers");
        } catch (Exception e) {
            System.out.println("Runtime error");
        } finally {
            System.out.println("This is block finally");
        }

        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        try {
            for (int i = 0; i <= array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds");
        }


        System.out.println("Hello");
    }
}
