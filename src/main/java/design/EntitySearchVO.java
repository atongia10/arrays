package design;

public class EntitySearchVO extends SearchVO {

    private long businessGroupId;

    public EntitySearchVO(String reportName) {
        super(reportName);
    }

    public long getBusinessGroupId() {
        return businessGroupId;
    }

    public void setBusinessGroupId(long businessGroupId) {
        this.businessGroupId = businessGroupId;
    }
}
