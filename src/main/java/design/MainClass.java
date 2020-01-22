package design;

public class MainClass {
    public static void main(String[] args) {
        SearchVO searchVO = new EntitySearchVO("Report Name");
        ((EntitySearchVO) searchVO).setBusinessGroupId(10);

        ReportGenerator reportGenerator = EntityFactory.createReportGenerator("Entity");
        reportGenerator.generate(searchVO);

    }

}
