package design;

public abstract class SearchVO {
    private String reportName;

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public SearchVO(String reportName) {
        this.reportName = reportName;
    }
}
