package design;

public class EntityFactory {
    public static ReportGenerator createReportGenerator(String reportName) {
        if(reportName.equals("Entity"))
            return new EntitySearchReportGenerator();
        else if(reportName.equals("EntityContact"))
            return new EntityReportGenerator();
        else
            return new EntityReportGenerator();
    }

}
