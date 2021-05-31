package edu.war.h4ck.utils;

public class MathematicalOperatorTableBuilder {

    public static StringBuilder getMathematicalOperatorTable() {
        StringBuilder table = new StringBuilder();

        String wordBuffer = TableBuilder.getPadding(45, " ").toString();
        // r1
        table.append("|");
        table.append(wordBuffer).append("Operator");
        table.append(wordBuffer).append("Definition");
        table.append(wordBuffer).append("Example");
        table.append(wordBuffer).append("|");
        String referenceRow = table.toString();
        table.append("\n");
        // r2
        TableBuilder.addSpacerRow(table, referenceRow);
        //r3
        buildRow(table, referenceRow, "+", "summation: add two numbers (whole or decimal)", "int allMyMoney = allMyMoney + lotteryWin;", 3);
        //r4
        TableBuilder.addSpacerRow(table, referenceRow);
        //r5
        buildRow(table,referenceRow, "+", "concatenation: add two strings together", "String tadah = \"ta\" + \"da\";", 5);
        //r6
        TableBuilder.addSpacerRow(table, referenceRow);
        //r7
        buildRow(table, referenceRow, "-", "subtraction: subtract two numbers", "int allMyMoney = allMyMoney - whatIOU;", 7);
        // r8
        TableBuilder.addSpacerRow(table, referenceRow);
        //r9
        buildRow(table, referenceRow, "*", "Multiplication: multiply two numbers", "int allMyMoney = allMyMoney*100;", 9);
        //10
        TableBuilder.addSpacerRow(table, referenceRow);
        //11
        buildRow(table, referenceRow, "/", "Divide: divides two numbers (w/o remainder)", "double myMoney = myMoney/100;", 11);
        //12
        TableBuilder.addSpacerRow(table, referenceRow);
        //13
        buildRow(table, referenceRow, "%", "Modulo: produces the remainder of a division", "double whatsLeftOver = myMoney % 100", 13);
        //14
        TableBuilder.addSpacerRow(table, referenceRow);
        //15
        buildRow(table, referenceRow, "++", "Incrementer: adds one to a number", "int num3 = 2++;", 15);
        //16
        TableBuilder.addSpacerRow(table, referenceRow);
        //17
        buildRow(table, referenceRow, "--", "Decrementor: subtracts one from a number", "int num2 = 3--;", 17);
        //18
        TableBuilder.addSpacerRow(table, referenceRow);
        //19
        buildRow(table, referenceRow, "+=", "Adds a number to a value", "int dogCount += 10; OR dogCount = dogCount + 10;", 19);
        //20
        TableBuilder.addSpacerRow(table, referenceRow);
        //21
        buildRow(table, referenceRow, "-=", "Subtracts a number from a value", "int dogCount -= 10; OR dogCount = dogCount - 10;", 21);
        //22
        TableBuilder.addSpacerRow(table, referenceRow);
        //23
        buildRow(table, referenceRow, "*=", "Multiplies a number by an amount", "double myMoney *= 1000; OR myMoney = myMoney*1000;", 23);
        //24
        TableBuilder.addSpacerRow(table, referenceRow);
        //25
        buildLastRow(table, referenceRow, "/=", "Divides a number by an amount", "double myMoney /= 1000; OR myMoney = myMoney/1000;", 25);
        TableBuilder.addHeaderAndFooter(referenceRow.length(), table);
        return table;
    }

    private static void buildRow(StringBuilder table, String referenceRow, String operator, String definition, String example, int rowNum) {
        buildBaseRow(table, referenceRow, operator, definition, example);
        TableBuilder.padEndOfRow(table, referenceRow, rowNum, false);
    }

    private static void buildLastRow(StringBuilder table, String referenceRow, String operator, String definition, String example, int rowNum) {
        buildBaseRow(table, referenceRow, operator, definition, example);
        TableBuilder.padEndOfRow(table, referenceRow, rowNum, true);
    }

    private static void buildBaseRow(StringBuilder table, String referenceRow, String operator, String definition, String example) {
        table.append("|");
        TableBuilder.addColumnContent(table, referenceRow, "Operator", operator);
        TableBuilder.addColumnContent(table, referenceRow, "Definition", definition);
        TableBuilder.addColumnContent(table, referenceRow, "Example", example);
    }
}
