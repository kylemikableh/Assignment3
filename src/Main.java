public class Main {
    //Part6 and 7
    Client Jo = new Client("Jo",32);
    Client Riley = new Client("Riley",473);
    Client Peyton = new Client ("Peyton",555);
    Client Avery = new Client("Avery",654);
    Client Taylor = new Client("Taylor",840);
    Client Remi = new Client("Remi",912);

    SalesAssociate Sven = new SalesAssociate("Sven",Charlie,7);
    SalesAssociate Alex = new SalesAssociate("Alex",Sam,20);

    ArrayList<Employee> samEmployees = new ArrayList<Employee>();
    samEmployees.add(Alex);
    ArrayList<Employee> CharlieEmployees = new ArrayList<Employee>();
    CharlieEmployees.add(Sven);

    SalesManager Sam = new SalesManager("Sam",samEmployees,null,3);
    SalesManager Charlie = new SalesManager("Charlie",CharlieEmployees,null,4);

    Sam.addClient(Jo);
    Sam.addClient(Riley);
    Charlie.addClient(Avery);
    Sven.addClient(Peyton);
    Alex.addClient(Taylor);
    Alex.addClient(Remi);


}
