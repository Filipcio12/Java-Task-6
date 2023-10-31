public class TelephoneNumber implements Comparable<TelephoneNumber> {

    String countryCode;
    String localNumber;

    TelephoneNumber() {
        countryCode = "";
        localNumber = "";
    }

    TelephoneNumber(String countryCode, String localNumber) {
        this.countryCode = new String(countryCode);
        this.localNumber = new String(localNumber);
    }

    public int compareTo(TelephoneNumber oTelephoneNumber) {
        /*
        try {
            int a = Integer.parseInt(countryCode);
            int b = Integer.parseInt(oTelephoneNumber.countryCode);
            
            if (a != b) {
                return a - b;
            }

            a = Integer.parseInt(localNumber);
            b = Integer.parseInt(oTelephoneNumber.localNumber);

            return a - b;
        }
        catch (NumberFormatException ex) {
            System.out.println("Can't convert string to int.");
            return 0;
        }
        */
        
        int diff = countryCode.compareTo(oTelephoneNumber.countryCode);

        if (diff != 0) {
            return diff;
        }
        else {
            return localNumber.compareTo(oTelephoneNumber.localNumber);
        }
    }

    public String toString() {
        return ("+" + countryCode + "-" + localNumber);
    }
}
