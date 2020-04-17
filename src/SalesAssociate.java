import java.util.ArrayList;
import java.util.Collections;

public class SalesAssociate extends Employee{
    protected String employeeName;
    protected SalesManager manager;
    protected long salesID;
    private ArrayList<Client> list;

    public SalesAssociate (String employeeName, SalesManager manager, long salesID){
        this.employeeName = employeeName;
        this.manager = manager;
        this.salesID = salesID;
        list = new ArrayList<Client>();
    }

    protected String getName() {
        return employeeName;
    }

    protected void setName(long salesID) { }

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
        return 500*(getClients().size());
    }

    public boolean addClient(Client client) {
        boolean didAdd = list.add(client);
        Collections.sort(list);
        return didAdd;
    }

    public ArrayList<Client> getClients()
    {
        return list;
    }

    public void printSAInfo(){
        System.out.println("SalesManager: " + this.getName() + " Sales Manager: " + this.getSalesManager() + " Clients: " + this.getClients());
    }

    public String toString() {
        return employeeName;
    }
}
