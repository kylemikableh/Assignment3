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

    protected void setClients(ArrayList<Client> list) {
        this.list = list;
    }

    protected long getSalesID() {
        return salesID;
    }

    protected void setSalesID(long salesID) {
        this.salesID = salesID;
    }

    private double bonus(){
        return 500*(getClientHelper().size());
    }

    public boolean addClient(Client client) {
        boolean didAdd = list.add(client);
        Collections.sort(list);
        return didAdd;
    }

    public ArrayList<Client> getClientHelper()
    {
        return list;
    }

    public void printSAInfo(){
        System.out.println("Sales Associate: " + this.getName() + ". Sales Manager: " + this.getSalesManager() + ". Clients: " + this.getClientsToString());
    }

    public String getClientsToString(){
        String string = "";
        for(int i = 0; i < list.size(); i++)
        {
            Client e = list.get(i);
            string+= e;
            if(i != list.size() - 1)
            {
                string+= ", ";
            }
        }
        return string;
    }

    public String toString() {
        return employeeName;
    }
}
