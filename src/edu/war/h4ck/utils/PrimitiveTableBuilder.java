package edu.war.h4ck.utils;

public class PrimitiveTableBuilder {
    public static StringBuilder getPrimitiveTable() {
        StringBuilder primitiveTable = new StringBuilder();
        // We build up the title row for our table first.
        // We will use the length of the StringBuffer to frame our header and footer
        String wordBuffer10 = TableBuilder.getPadding(30, " ").toString();
        // Add Row 1
        primitiveTable.append("|");
        primitiveTable.append(wordBuffer10).append("Type");
        primitiveTable.append(wordBuffer10).append("Definition");
        primitiveTable.append(wordBuffer10).append("Range or Value");
        primitiveTable.append(wordBuffer10).append("Wrapper");
        primitiveTable.append(wordBuffer10).append("|");

        String rerferenceRow = primitiveTable.toString();
        primitiveTable.append("\n");
        // Add Row 2
        TableBuilder.addSpacerRow(primitiveTable, rerferenceRow);
        // Add Row 3
        // refactor to first row method
        buildRow(primitiveTable, rerferenceRow, "boolean", "Logical Value", "true or false", "java.lang.Boolean", 3);
        // Add Row 4
        TableBuilder.addSpacerRow(primitiveTable, rerferenceRow);
        // Add Row 5
        buildRow(primitiveTable, rerferenceRow, "char", "16-bit unicode", "64k characters", "java.lang.Character", 5);
        // Add row 6
        TableBuilder.addSpacerRow(primitiveTable, rerferenceRow);
        // add row 7
        buildRow(primitiveTable, rerferenceRow, "byte", "8-bit signed", "-128 to 127", "java.lang.Byte", 7);
        // Add row 8
        TableBuilder.addSpacerRow(primitiveTable, rerferenceRow);
        // add row 9
        buildRow(primitiveTable, rerferenceRow, "short", "16-bit signed", "-32,768 to 32,767", "java.lang.Short", 9);
        // add row 10
        TableBuilder.addSpacerRow(primitiveTable, rerferenceRow);
        // add row 11
        buildRow(primitiveTable, rerferenceRow, "int", "+/- whole numbers, 32 bit signed", "-2.1e9 to 2.1e9", "java.lang.Integer", 11);
        // add row 12
        TableBuilder.addSpacerRow(primitiveTable, rerferenceRow);
        // add row 13
        buildRow(primitiveTable, rerferenceRow, "long", "+/- whole numbers, 64 bit signed", "-9.2e18 to 9.2e18", "java.lang.Long", 13);
        // add row 14
        TableBuilder.addSpacerRow(primitiveTable, rerferenceRow);
        // add row 15
        buildRow(primitiveTable, rerferenceRow, "float", "+/- decimal numbers, 32 bit floating point", "6-7 significant spaces", "java.lang.Float", 15);
        // add row 16
        TableBuilder.addSpacerRow(primitiveTable, rerferenceRow);
        // add row 17
        buildLastRow(primitiveTable, rerferenceRow, "double", "+/- Decimal Numbers, 64 bit floating point", "15 significant spaces", "java.lang.Double", 17);

        TableBuilder.addHeaderAndFooter(rerferenceRow.length(), primitiveTable);
        return primitiveTable;
    }

    private static void buildRow(StringBuilder primitiveTable, String rerferenceRow, String type, String definition, String rangOrValue, String wrapper, int row) {
        buildBaseRow(primitiveTable, rerferenceRow, type, definition, rangOrValue, wrapper);
        TableBuilder.padEndOfRow(primitiveTable, rerferenceRow, row, false);
    }

    private static void buildLastRow(StringBuilder primitiveTable, String rerferenceRow, String type, String definition, String rangOrValue, String wrapper, int row) {
        buildBaseRow(primitiveTable, rerferenceRow, type, definition, rangOrValue, wrapper);
        TableBuilder.padEndOfRow(primitiveTable, rerferenceRow, row, true);
    }

    private static void buildBaseRow(StringBuilder primitiveTable, String rerferenceRow, String type, String definition, String rangOrValue, String wrapper) {
        primitiveTable.append("|");
        TableBuilder.addColumnContent(primitiveTable, rerferenceRow, "Type", type);
        TableBuilder.addColumnContent(primitiveTable, rerferenceRow, "Definition", definition);
        TableBuilder.addColumnContent(primitiveTable, rerferenceRow, "Range or Value", rangOrValue);
        TableBuilder.addColumnContent(primitiveTable, rerferenceRow, "Wrapper", wrapper);
    }
}
