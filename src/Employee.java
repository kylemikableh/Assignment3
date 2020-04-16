import java.util.ArrayList;
import java.util.Collections;

public abstract class Employee {

    private ArrayList<Client> list = new ArrayList<Client>();

    public boolean addClient(Client client) {
        boolean didAdd = list.add(client);
        Collections.sort(list);
        return didAdd;
    }

    private ArrayList<Client> getClients()
    {
        return list;
    }
}
