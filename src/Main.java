import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Part6 and 7
        Client Jo = new Client("Jo",32);
        Client Riley = new Client("Riley",473);
        Client Peyton = new Client ("Peyton",555);
        Client Avery = new Client("Avery",654);
        Client Taylor = new Client("Taylor",840);
        Client Remi = new Client("Remi",912);

        SalesAssociate Sven = new SalesAssociate("Sven",null,7);
        SalesAssociate Alex = new SalesAssociate("Alex", null,20);

        SalesManager Sam = new SalesManager("Sam",null,3);
        Sam.addEmployee(Alex);
        SalesManager Charlie = new SalesManager("Charlie",null,4);
        Charlie.addEmployee(Sven);

        Alex.setSalesManager(Sam);
        Sven.setSalesManager(Charlie);

        Sam.addClient(Jo);
        Sam.addClient(Riley);
        Charlie.addClient(Avery);
        Sven.addClient(Peyton);
        Alex.addClient(Taylor);
        Alex.addClient(Remi);
    }
}
