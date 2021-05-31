package edu.war.h4ck.utils;

import java.util.Scanner;

public class Main {

    public static void main(String... args) {
        String userInput;
        Scanner inputReader = new Scanner(System.in);
        boolean done = false;
        while (!done) {
            showMenu();
            userInput = inputReader.nextLine();
            System.out.println("You selected [" + userInput + "]. Great choice! Here you go...\n");
            switch (userInput.toLowerCase()) {
                case "a" -> System.out.println(PrimitiveTableBuilder.getPrimitiveTable().toString());
                case "b" -> System.out.println(BooleanOperatorTableBuilder.getBooleanOperatorTable().toString());
                case "c" -> System.out.println(MathematicalOperatorTableBuilder.getMathematicalOperatorTable().toString());
                case "d" -> System.out.println(JShellTableBuilder.getJshellBuilder().toString());
                case "q" -> done = true;
                default -> System.out.println("I couldn't find your selection [" + userInput + "]. Please try again.");
            }
        }
    }

    private static void showMenu() {
        StringBuilder menu = new StringBuilder();
        menu.append("Welcome to the Quick Primer Program!").append("\n\n");
        menu.append("Please make your selection below to see a quick reminder on a topic:").append("\n\n");
        menu.append("[a] Show me Java Primitives.").append("\n");
        menu.append("[b] Show me Boolean Operators.").append("\n");
        menu.append("[c] Show me Mathematical Operators.").append("\n");
        menu.append("[d] Show me JShell!").append("\n");
        menu.append("[q] Quit").append("\n");
        System.out.println(menu.toString());
    }
}