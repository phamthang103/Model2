package model.facility;

public class Villa extends Facility {
    private String villaStandard;
    private double swimPoolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String villaStandard, double swimPoolArea, int numberOfFloors) {
        this.villaStandard = villaStandard;
        this.swimPoolArea = swimPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String facilityID, String facilityName, double usableArea, int rentalCosts, int numberMaxPerson, String rentaltype, String villaStandard, double swimPoolArea, int numberOfFloors) {
        super(facilityID, facilityName, usableArea, rentalCosts, numberMaxPerson, rentaltype);
        this.villaStandard = villaStandard;
        this.swimPoolArea = swimPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getVillaStandard() {
        return villaStandard;
    }

    public void setVillaStandard(String villaStandard) {
        this.villaStandard = villaStandard;
    }

    public double getSwimPoolArea() {
        return swimPoolArea;
    }

    public void setSwimPoolArea(double swimPoolArea) {
        this.swimPoolArea = swimPoolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "facilityID='" + facilityID + '\'' +
                ", facilityName='" + facilityName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", numberMaxPerson=" + numberMaxPerson +
                ", rentaltype='" + rentaltype + '\'' +
                ", villaStandard='" + villaStandard + '\'' +
                ", swimPoolArea=" + swimPoolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    public String toInfomation() {
        return "ID:" + facilityID + ", Facility:" + facilityName + ", Swimming area:" + swimPoolArea
                + ", Number of floors:" + numberOfFloors + ", Villa standard:" + villaStandard + ", Usable area:" + usableArea
                + ", Rentalc costs:" + rentalCosts + ", Max person:" + numberMaxPerson
                + ", Rental type:" + rentaltype;
    }
}
