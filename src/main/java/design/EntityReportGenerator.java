package design;

public class EntityReportGenerator implements ReportGenerator {

    @Override
    public void generate(SearchVO searchVO) {
        System.out.println(searchVO.getReportName());
        System.out.println();

    }
}
