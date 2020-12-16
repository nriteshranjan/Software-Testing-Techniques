public class CourierAgency {
    public int courierType; /** 0->Simple & 1->Express **/
    public String zipCode;
    public int itemType;   /** 0->Document & 1->Parcel **/
    public int weight;         /** in grams **/
    public int totalCost = 0;
    public int deliveryCountry = -1; /** 0->India & 1->USA **/
    String regex = "^[0-9]{5}(?:-[0-9]{4})?$";
    String regex1 = "^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}$";

    public int getCourierType() {
        return courierType;
    }

    public CourierAgency(int courierType, String zipCode, int itemType, int weight) {
        this.courierType = courierType;
        this.zipCode = zipCode;
        this.itemType = itemType;
        this.weight = weight;
    }



    public Boolean maximumAllowedWt() throws Exception {
        if(itemType == 0) // for document
            if(weight < 1 || weight > 300) {
                if(weight > 300)
                throw new Exception("Item too heavy");
                else throw new Exception("Item too light");
            }
        else // for parcel
            if(weight < 1 || weight > 5000) {
                if(weight > 5000)
                    throw new Exception("Item too heavy");
                else throw new Exception("Item too light");
            }
        return true;
    }

    public Boolean validZipCode() {
        if(zipCode == null) return false;
        if(zipCode.matches(regex))  deliveryCountry = 1;
        if(zipCode.matches(regex1)) deliveryCountry = 0;
        return (zipCode.matches(regex) || zipCode.matches(regex1)) ;
    }

    public int costCalculate() {
        // For DOCUMENTS
        if(itemType == 0) {
            if(weight > 1 && weight <= 100) {
                if(deliveryCountry == 1)  totalCost = 1500; // International Delivery
                else totalCost = 100; // Domestic Delivery
            }
            if(weight > 100  && weight <= 300) {
                if(deliveryCountry == 1)  totalCost = 2500; // International Delivery
                else totalCost = 200; // Domestic Delivery
            }
        }
        // For Parcel
        else {
            if(weight > 1 && weight < 5000) {
                if(deliveryCountry == 1)  totalCost = 5000; // International Delivery
                else totalCost = 700; // Domestic Delivery
            }
        }
        if(courierType == 1) totalCost *= 2;
        return totalCost;
    }
}

