/**
 *  Java program to use print substring from till required index.
 */

package com.strings;

/**
 *  Main class.
 */
public class Main {

    // Main class to run java program.
    public static void main(String[] args) {

        // Creating strings.
        String myString = "Yogurt is a popular, tangy dairy product made by fermenting milk with specific live " +
                "bacterial cultures, which convert milk's sugar (lactose) into lactic acid, giving it a thick texture" +
                " and tart taste. Rich in nutrients like calcium, protein, and B vitamins, yogurt supports digestive," +
                " immune, bone, and heart health, with varieties like Greek yogurt offering higher protein content. ";

        // Finding index of substring we want to print.
        int index = myString.indexOf("dairy product");

        // Printing substring
        System.out.println(myString.substring(index, ("dairy product".length() + index))); // Output: dairy product

    }
}