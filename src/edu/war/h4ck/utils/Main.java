package edu.war.h4ck.utils;


import org.jetbrains.annotations.NotNull;
//import edu.war.h4ck.utils.TableBuilder;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        String userInput;
        Scanner inputReader = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            showMenu();
            userInput = inputReader.nextLine();
            System.out.println("You selected [" + userInput + "]. Great choice! Here you go...");
            switch (userInput.toLowerCase()) {
                case "a" -> showPrimitives();
                case "b" -> System.out.println("Nothing yet.");
                case "q" -> done = true;
                default -> System.out.println("I couldn't find your selection [" + userInput + "]. Please try again.");
            }
        }
    }

    private static void showMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Welcome to the Quick Primer Program!").append("\n\n");
        menu.append("Please make your selection below to see a quick reminder on a topic:").append("\n\n");
        menu.append("A. Show me Java Primitives.").append("\n");
        menu.append("B. Show me Boolean Operators.").append("\n");
        menu.append("C. Show me Mathematical Operators.").append("\n");
        menu.append("D. Show me JShell!").append("\n");
        menu.append("E.").append("\n");
        System.out.println(menu.toString());
    }
    //to-do factor me.
    private static void showPrimitives() {
        StringBuilder primitiveTable = new StringBuilder();
        // We build up the title row for our table first.
        // We will use the length of the StringBuffer to frame our header and footer
        String wordBuffer10 = TableBuilder.getPadding(15, " ").toString();
        // Add Row 1
        primitiveTable.append("|");
        primitiveTable.append(wordBuffer10).append("Type");
        primitiveTable.append(wordBuffer10).append("Definition");
        primitiveTable.append(wordBuffer10).append("Range or Value");
        primitiveTable.append(wordBuffer10).append("Wrapper");
        primitiveTable.append(wordBuffer10).append("|");

        String titleRow = primitiveTable.toString();
        primitiveTable.append("\n");
        // Add Row 2
        TableBuilder.addSpacerRow(primitiveTable, titleRow);
        // Add Row 3
        // refactor to first row method
        primitiveTable.append("|");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Type", "boolean");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Definition", "Logical Value");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Range or Value", "true or false");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Wrapper", "java.lang.Boolean");
        TableBuilder.padEndOfRow(primitiveTable, titleRow, 3, false);
        // Add Row 4
        TableBuilder.addSpacerRow(primitiveTable, titleRow);
        // Add Row 5
        primitiveTable.append("|");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Type", "char");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Definition", "16-bit unicode");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Range or Value", "64k characters");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Wrapper", "java.lang.Character");
        TableBuilder.padEndOfRow(primitiveTable, titleRow, 5, false);
        // Add row 6
        TableBuilder.addSpacerRow(primitiveTable, titleRow);
        // add row 7
        primitiveTable.append("|");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Type", "byte");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Definition", "8-bit signed");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Range or Value", "-128 to 127");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Wrapper", "java.lang.Byte");
        TableBuilder.padEndOfRow(primitiveTable, titleRow, 7, false);
        // Add row 8
        TableBuilder.addSpacerRow(primitiveTable, titleRow);
        // add row 9
        primitiveTable.append("|");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Type", "short");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Definition", "16-bit signed");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Range or Value", "-32,768 to 32,767");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Wrapper", "java.lang.Short");
        TableBuilder.padEndOfRow(primitiveTable, titleRow, 9, false);
        // add row 10
        TableBuilder.addSpacerRow(primitiveTable, titleRow);
        // add row 11
        primitiveTable.append("|");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Type", "int");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Definition", "32 bit signed");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Range or Value", "-2.1e9 to 2.1e9");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Wrapper", "java.lang.Integer");
        TableBuilder.padEndOfRow(primitiveTable, titleRow, 11, false);
        // add row 12
        TableBuilder.addSpacerRow(primitiveTable, titleRow);
        // add row 13
        primitiveTable.append("|");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Type", "long");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Definition", "64 bit signed");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Range or Value", "-9.2e18 to 9.2e18");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Wrapper", "java.lang.Long");
        TableBuilder.padEndOfRow(primitiveTable, titleRow, 13, false);
        // add row 14
        TableBuilder.addSpacerRow(primitiveTable, titleRow);
        // add row 15
        primitiveTable.append("|");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Type", "float");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Definition", "32 bit floating point");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Range or Value", "6-7 significant spaces");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Wrapper", "java.lang.Float");
        TableBuilder.padEndOfRow(primitiveTable, titleRow, 15, false);
        // add row 16
        TableBuilder.addSpacerRow(primitiveTable, titleRow);
        // add row 17
        primitiveTable.append("|");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Type", "double");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Definition", "64 bit floating point");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Range or Value", "15 significant spaces");
        TableBuilder.addColumnContent(primitiveTable, titleRow, "Wrapper", "java.lang.Double");
        TableBuilder.padEndOfRow(primitiveTable, titleRow, 17, true);

        TableBuilder.addHeaderAndFooter(titleRow.length(), primitiveTable);
        System.out.println(primitiveTable.toString());
    }


}