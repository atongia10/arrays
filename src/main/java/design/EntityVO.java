package design;

public class EntityVO extends SearchVO {

    private long taxGroupId;

    public EntityVO(String reportName) {
        super(reportName);
    }

    public long getTaxGroupId() {
        return taxGroupId;
    }

    public void setTaxGroupId(long taxGroupId) {
        this.taxGroupId = taxGroupId;
    }
}
