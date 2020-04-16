public class SalesAssociate extends Employee{
    protected String employeeName;
    protected SalesManager manager;
    protected long salesID;

    public SalesAssociate (employeeName, manager, salesID){
        this.employeeName = employeeName;
        this.manager = manager;
        this.salesID = salesID;
    }

    protected getSalesManager() {
        return SalesManager;
    }

    protected void setSalesManager(Protected salesManager) {
        SalesManager = salesManager;
    }

    protected long getSalesID() {
        return salesID;
    }

    protected void setSalesID(long salesID) {
        this.salesID = salesID;
    }

    private double bonus(){
        return 500*(getClients().size());
    }
}
