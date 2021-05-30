package edu.war.h4ck.utils;

import org.jetbrains.annotations.NotNull;

public class TableBuilder {

    public static void padEndOfRow(StringBuilder primitiveTable, String titleRow, int rowNumber, boolean isLastRow) {
        int space = (primitiveTable.lastIndexOf("|") + (titleRow.length()-1)) - primitiveTable.length();
        primitiveTable.append(getPadding(space," ")).append("|");
        if (!isLastRow) {
            primitiveTable.append("\n");
        }
    }

    public static void addColumnContent(StringBuilder table, String referenceRow, String columnHeader, String content){
        int spacesNeeded = getLocationFromLastWord(table, referenceRow, columnHeader);
        table.append(getPadding(spacesNeeded, " ")).append(content);
    }

    public static void addSpacerRow(StringBuilder table, String referenceRow) {
        table.append("|").append(getPadding(referenceRow.length()-2, "-")).append("|").append("\n");
    }

    public static int getLocationFromLastWord(StringBuilder table, String referenceRow, String columnHeader ) {
        // last index of table being built, offset of word in title row of table
        int locationForNextWord = table.lastIndexOf("|") + referenceRow.indexOf(columnHeader);
        return locationForNextWord - table.length();
    }

    public static void addHeaderAndFooter(int tableLength, StringBuilder table) {
        StringBuilder headerAndFooter = getPadding(tableLength, "|");
        headerAndFooter.append("\n");
        table.insert(0, headerAndFooter);
        table.append("\n").append(headerAndFooter);
    }

    public static @NotNull StringBuilder getPadding(int length, String decoration) {
        StringBuilder headerAndFooter = new StringBuilder();
        for (int count = 0; count < length; count++) {
            headerAndFooter.append(decoration);
        }
        return headerAndFooter;
    }
}
