import java.util.ArrayList;

public abstract class Employee {
    public abstract boolean addClient(Client client);

    public abstract ArrayList<Client> getClients();

    public abstract String toString();
}
