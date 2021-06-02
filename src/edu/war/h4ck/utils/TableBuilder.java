package edu.war.h4ck.utils;

public class TableBuilder {

    public static void padEndOfRow(StringBuilder table, String referenceRow, int rowNumber, boolean isLastRow) {
        int lastIndexOfBar = table.lastIndexOf("|");
        if ((table.indexOf("||") != table.lastIndexOf("||")) && (lastIndexOfBar == table.lastIndexOf("||")+1) ) {
            lastIndexOfBar = table.lastIndexOf("|", table.indexOf("||")-2);
        }

        int space = (lastIndexOfBar + (referenceRow.length()-1)) - table.length();
        table.append(getPadding(space," ")).append("|");
        if (!isLastRow) {
            table.append("\n");
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
        int lastIndexOfBar = table.lastIndexOf("|");
        if (lastIndexOfBar == (table.lastIndexOf("||")+1)) {
            lastIndexOfBar = table.lastIndexOf("|", lastIndexOfBar-2);
        }
        // last index of table being built, offset of word in title row of table
//        int locationForNextWord = table.lastIndexOf("|") + referenceRow.indexOf(columnHeader);
        int locationForNextWord = lastIndexOfBar + referenceRow.indexOf(columnHeader);
        return locationForNextWord - table.length();
    }

    public static void addHeaderAndFooter(int referenceRowLength, StringBuilder table) {
        StringBuilder headerAndFooter = getPadding(referenceRowLength, "|");
        headerAndFooter.append("\n");
        table.insert(0, headerAndFooter);
        table.append("\n").append(headerAndFooter);
    }

    public static StringBuilder getPadding(int length, String decoration) {
        StringBuilder headerAndFooter = new StringBuilder();for (int count = 0; count < length; count++) {
            headerAndFooter.append(decoration);
        }
        return headerAndFooter;
    }
}
