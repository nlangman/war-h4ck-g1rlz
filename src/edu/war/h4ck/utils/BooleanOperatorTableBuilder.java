package edu.war.h4ck.utils;

public class BooleanOperatorTableBuilder {
    public static StringBuilder getBooleanOperatorTable() {
        StringBuilder booleanTable = new StringBuilder();

        String wordBuffer = TableBuilder.getPadding(40, " ").toString();
        // r1
        booleanTable.append("|");
        booleanTable.append(wordBuffer).append("Operator");
        booleanTable.append(wordBuffer).append("Definition");
        booleanTable.append(wordBuffer).append("Example");
        booleanTable.append(wordBuffer).append("|");
        String referenceRow = booleanTable.toString();
        booleanTable.append("\n");
        // r2
        TableBuilder.addSpacerRow(booleanTable, referenceRow);
        // r3
        buildRow(booleanTable, referenceRow, "==", "equals (objects or primitives)", "if (firstName == \"Olga\") { do something }", 3);
        //r4
        TableBuilder.addSpacerRow(booleanTable, referenceRow);
        //r5
        buildRow(booleanTable, referenceRow, "!=", "not equals (objects or primitives)", "if (numberDogs != 3) { do something }", 5);
        //r6
        TableBuilder.addSpacerRow(booleanTable, referenceRow);
        //r7
        buildRow(booleanTable, referenceRow, ">", "left side is greater than right side", "if (numMomChores > 10) { do something }", 7);
        //r8
        TableBuilder.addSpacerRow(booleanTable, referenceRow);
        //r9
        buildRow(booleanTable, referenceRow, ">=", "Greater than or equal to", "if (tests >= totalNumClasses) { do something }", 9);
        //r10
        TableBuilder.addSpacerRow(booleanTable, referenceRow);
        // r11
        buildRow(booleanTable, referenceRow, "<", "Less than", "if (totalFrowns < totalSmiles) { do something }", 11);
        // r12
        TableBuilder.addSpacerRow(booleanTable, referenceRow);
        // r13
        buildRow(booleanTable, referenceRow, "<=", "Less than or equal to", "if (time <= totalTime) { do something }", 13);
        //r14
        TableBuilder.addSpacerRow(booleanTable, referenceRow);
        // r15
        buildRow(booleanTable, referenceRow, "&&", "AND", "if (isSmart && isStrong) { do something }", 15);
        //r16
        TableBuilder.addSpacerRow(booleanTable, referenceRow);
        //r17
        buildRow(booleanTable, referenceRow, "||", "OR", "if (isPretty || isHandsome) { do something }", 17);
        //r18
        TableBuilder.addSpacerRow(booleanTable, referenceRow);
        //19
        buildRow(booleanTable, referenceRow, "!", "NOT, negates a boolean", "if (!isSmart) { do something }", 19);
        //20
        TableBuilder.addSpacerRow(booleanTable, referenceRow);
        //21
        buildLastRow(booleanTable, referenceRow, "A ? B : C", "Tierany Operator: if A, then B else C", "isSmart ? reward() : teach();", 21);
        TableBuilder.addHeaderAndFooter(referenceRow.length(), booleanTable);

        return booleanTable;
    }

    private static void buildRow(StringBuilder booleanTable, String referenceRow, String operator, String definition, String example, int rowNum) {
        buildBaseRow(booleanTable, referenceRow, operator, definition, example);
        TableBuilder.padEndOfRow(booleanTable, referenceRow, rowNum, false);
    }

    private static void buildLastRow(StringBuilder booleanTable, String referenceRow, String operator, String definition, String example, int rowNum) {
        buildBaseRow(booleanTable, referenceRow, operator, definition, example);
        TableBuilder.padEndOfRow(booleanTable, referenceRow, rowNum, true);
    }

    private static void buildBaseRow(StringBuilder booleanTable, String referenceRow, String operator, String definition, String example) {
        booleanTable.append("|");
        TableBuilder.addColumnContent(booleanTable, referenceRow, "Operator", operator);
        TableBuilder.addColumnContent(booleanTable, referenceRow, "Definition", definition);
        TableBuilder.addColumnContent(booleanTable, referenceRow, "Example", example);
    }
}
