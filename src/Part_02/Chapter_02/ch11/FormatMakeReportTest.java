package Part_02.Chapter_02.ch11;

public class FormatMakeReportTest {
    public static void main(String[] args) {

        FormatMakeReport report = new FormatMakeReport();
        String builder = report.getReport();

        System.out.println(builder);
    }
}
