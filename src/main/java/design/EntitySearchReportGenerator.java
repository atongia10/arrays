package design;

public class EntitySearchReportGenerator implements ReportGenerator {

    @Override
    public void generate(SearchVO searchVO) {
        System.out.println(searchVO.getReportName());
        System.out.println(((EntitySearchVO) searchVO).getBusinessGroupId());
    }
}
