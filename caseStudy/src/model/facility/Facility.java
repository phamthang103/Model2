package model.facility;

public abstract class Facility {
    protected static int id=1000;
    protected String facilityID;
    protected String facilityName;
    protected double usableArea;
    protected int rentalCosts;
    protected int numberMaxPerson;
    protected  String rentaltype;

    public Facility() {
    }

    public Facility(String facilityID, String facilityName, double usableArea, int rentalCosts, int numberMaxPerson, String rentaltype) {
        this.facilityID = facilityID;
        this.facilityName = facilityName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.numberMaxPerson = numberMaxPerson;
        this.rentaltype = rentaltype;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Facility.id = id;
    }

    public String getFacilityID() {
        return facilityID;
    }

    public void setFacilityID(String facilityID) {
        this.facilityID = facilityID;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getNumberMaxPerson() {
        return numberMaxPerson;
    }

    public void setNumberMaxPerson(int numberMaxPerson) {
        this.numberMaxPerson = numberMaxPerson;
    }

    public String getRentaltype() {
        return rentaltype;
    }

    public void setRentaltype(String rentaltype) {
        this.rentaltype = rentaltype;
    }
}
