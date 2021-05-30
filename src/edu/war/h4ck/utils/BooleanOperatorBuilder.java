package edu.war.h4ck.utils;

public class BooleanOperatorBuilder {
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
        booleanTable.append("|");
        TableBuilder.addColumnContent(booleanTable, referenceRow, "Operator", "==");
        TableBuilder.addColumnContent(booleanTable, referenceRow, "Definition", "equals");
        TableBuilder.addColumnContent(booleanTable, referenceRow, "Example", "if (firstName == \"Olga\") { do something }");
        TableBuilder.padEndOfRow(booleanTable, referenceRow, 3, false);
        //r4
        TableBuilder.addSpacerRow(booleanTable, referenceRow);
        //r5
        booleanTable.append("|");
        TableBuilder.addColumnContent(booleanTable, referenceRow, "Operator", "!=");
        TableBuilder.addColumnContent(booleanTable, referenceRow, "Definition", "not equals");
        TableBuilder.addColumnContent(booleanTable, referenceRow, "Example", "if (numberDogs != 3) { do something }");
        TableBuilder.padEndOfRow(booleanTable, referenceRow, 5, true);


        TableBuilder.addHeaderAndFooter(referenceRow.length(), booleanTable);

        return booleanTable;
    }
}
