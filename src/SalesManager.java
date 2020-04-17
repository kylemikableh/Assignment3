import java.util.ArrayList;
import java.util.Collections;

public class SalesManager extends Employee{
    protected String employeeName;
    private ArrayList<Employee> employees;
    protected SalesManager manager;
    protected long salesID;
    private ArrayList<Client> list;

    public SalesManager (String employeeName, SalesManager manager, long salesID){
        this.employeeName = employeeName;
        this.manager = manager;
        this.salesID = salesID;
        employees = new ArrayList<Employee>();
        list = new ArrayList<Client>();
    }
    protected long getName() {
        return employeeName;
    }

    protected void setName(long salesID) { }

    protected ArrayList<Employee> getEmployees() {
        return employees;
    }

    protected void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    protected void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    protected SalesManager getSalesManager() {
        return manager;
    }

    protected void setSalesManager(SalesManager salesManager) {
        manager = salesManager;
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

    public boolean addClient(Client client) {
        boolean didAdd = list.add(client);
        Collections.sort(list);
        return didAdd;
    }

    public ArrayList<Client> getClients()
    {
        return this.list;
    }

    public void printSMInfo(){
        System.out.println("SalesManager: " + this.getName() + " Employees: " + this.getEmployees() + " Clients: " + this.getClients());
    }

    public String toString() {
        return employeeName;
    }
}
