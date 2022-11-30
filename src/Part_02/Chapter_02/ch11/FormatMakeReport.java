package Part_02.Chapter_02.ch11;

public class FormatMakeReport {


    StringBuffer buffer = new StringBuffer();

    private String line = "============================================\n";
    private String title = String.format("%-10s", "Name") + " " + String.format("%-20s", "Address") + " " + String.format("%-20s", "Phone Number") + "\n";

    private void makeHeader() {
        buffer.append(line);
        buffer.append(title);
        buffer.append(line);
    }

    private void generateBody() {
        buffer.append(String.format("%-10s", "James") + " ");
        buffer.append(String.format("%-20s", "Seoul Korea") + " ");
        buffer.append(String.format("%-20s", "010-2222-3333") + "\n");

        buffer.append(String.format("%-10s", "Tomas") + " ");
        buffer.append(String.format("%-20s", "NewYork US") + " ");
        buffer.append(String.format("%-20s", "010-7777-0987") + "\n");
    }

    private void makeFooter() {

        buffer.append(line);
    }

    public String getReport() {
        makeHeader();
        generateBody();
        makeFooter();
        return buffer.toString();
    }

}



