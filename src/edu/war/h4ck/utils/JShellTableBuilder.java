package edu.war.h4ck.utils;

public class JShellTableBuilder {

    public static StringBuilder getJshellBuilder() {
        StringBuilder table = new StringBuilder();


        String wordBuffer = TableBuilder.getPadding(75, " ").toString();
        // r1
        table.append("|");
        table.append(wordBuffer).append("Tool");
        table.append(wordBuffer).append("Where");
        table.append(wordBuffer).append("Description");
        table.append(wordBuffer).append("|");
        String referenceRow = table.toString();
        table.append("\n");
        //r2
        TableBuilder.addSpacerRow(table, referenceRow);
        //r3
        buildLastRow(table, referenceRow, "JShell", "IntelliJ menu -> Tools -> JShell Console",
                "JShell is an interactive sandbox for experimenting with Java commands. Try it out!",3);
        TableBuilder.addHeaderAndFooter(referenceRow.length(), table);

        return table;
    }

    private static void buildLastRow(StringBuilder table, String referenceRow, String tool, String where, String description, int rowNum) {
        buildBaseRow(table, referenceRow, tool, where, description);
        TableBuilder.padEndOfRow(table, referenceRow, rowNum, true);
    }

    private static void buildBaseRow(StringBuilder table, String referenceRow, String tool, String where, String description) {
        table.append("|");
        TableBuilder.addColumnContent(table, referenceRow, "Tool", tool);
        TableBuilder.addColumnContent(table, referenceRow, "Where", where);
        TableBuilder.addColumnContent(table, referenceRow, "Description", description);
    }
}
