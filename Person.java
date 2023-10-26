public class Person extends TelephoneEntry {

    String name;
    String lastName;
    String address;
    TelephoneNumber telephoneNumber;

    Person()
    {
        name = "";
        lastName = "";
        address = "";
        telephoneNumber = new TelephoneNumber();
    }

    Person(String name, String lastName, 
            String address, TelephoneNumber telephoneNumber)
    {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public String description()
    {
        return (
            "Person: " + name + ", " + lastName + ", " + 
            address + ", " + telephoneNumber
        );
    }
}
