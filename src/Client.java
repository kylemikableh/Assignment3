public class Client implements Comparable<Client> {
    private int clientID;
    private String clientName;
    private Employee employee;

    public Client (String clientName, int clientID) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.employee = null;
    }

    protected Employee getEmployee() {
        return employee;
    }

    protected void setEmployee(Employee employee) {
        this.employee = employee;
    }

    protected int getClientID() {
        return clientID;
    }

    protected String getClientName() {
        return clientName;
    }

    protected void setClientID(int clientID) {
        this.clientID = clientID;
    }

    protected void setClientName(String client) {
        this.clientName = client;
    }

    protected double totalSales() {
        return 0;
    }

    @Override
    public int compareTo(Client o) {
        return clientID;
    }

    public String toString() {
        return clientName + " " + clientID;
    }
}