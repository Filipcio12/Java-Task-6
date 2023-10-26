import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Person mateusz = new Person("Mateusz", "Galinski", "Piotrkowska 66", new TelephoneNumber("+48", "666666666"));
        Person kubus = new Person("Kubus", "Dulas", "Radwanska 12", new TelephoneNumber("+48", "123123123"));
        Person marcinek = new Person("Marcinek", "Grawinski", "Aleje Politechniki 99", new TelephoneNumber("00", "999999999"));
    
        Company ericson = new Company("Ericson", "Sweden 67", new TelephoneNumber("72", "766734892"));
        Company google = new Company("Google", "Manhattan 54", new TelephoneNumber("54", "821394320"));
        Company intersoft = new Company("INTERsoft", "Sienkiewicza 24", new TelephoneNumber("+48", "671230049"));
        
        TreeMap <TelephoneNumber, TelephoneEntry> directory = new TreeMap<TelephoneNumber, TelephoneEntry>();
        directory.put(mateusz.telephoneNumber, mateusz);
        directory.put(kubus.telephoneNumber, kubus);
        directory.put(marcinek.telephoneNumber, marcinek);
        directory.put(ericson.telephoneNumber, ericson);
        directory.put(google.telephoneNumber, google);
        directory.put(intersoft.telephoneNumber, intersoft);

        Set <TelephoneNumber> keyset = directory.keySet();
        Iterator <TelephoneNumber> it = keyset.iterator();

        while (it.hasNext()) {
            TelephoneNumber key = it.next();
            System.out.println(directory.get(key).description());
        }
    }
}