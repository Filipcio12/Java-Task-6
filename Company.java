public class Company extends TelephoneEntry {

    String name;
    String address;
    TelephoneNumber telephoneNumber;

    Company()
    {
        name = "";
        address = "";
        telephoneNumber = new TelephoneNumber();
    }

    Company(String name, String address, TelephoneNumber telephoneNumber)
    {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public String description()
    {
        return (
            "Company: " + name + ", " + address + ", " + telephoneNumber
        );
    }
}
