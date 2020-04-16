public class SalesManager extends Employee{
    protected String employeeName;
    private ArrayList<Employee> employees;
    protected SalesManager manager;
    protected long salesID;

    public SalesManager (employeeName, employees, manager, salesID){
        this.employeeName = employeeName;
        this.employees = employees;
        this.manager = manager;
        this.salesID = salesID;
    }

    protected ArrayList<Employee> getEmployees() {
        return employees;
    }

    protected void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
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
        return 10000*(getClients().size());
    }
}
