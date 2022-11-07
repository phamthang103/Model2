package model.facility;

public class House extends Facility {
    private String houseStandard;
    private int numberOfFloors;

    public House() {


    }

    public House(String houseStandard, int numberOfFloors) {
        this.houseStandard = houseStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String facilityID, String facilityName, double usableArea, int rentalCosts, int numberMaxPerson, String rentaltype, String houseStandard, int numberOfFloors) {
        super(facilityID, facilityName, usableArea, rentalCosts, numberMaxPerson, rentaltype);
        this.houseStandard = houseStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "facilityID='" + facilityID + '\'' +
                ", facilityName='" + facilityName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", numberMaxPerson=" + numberMaxPerson +
                ", rentaltype='" + rentaltype + '\'' +
                ", houseStandard='" + houseStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
    public String toInfomation()
    {
        return   "ID:"+facilityID+", Facility:"+facilityName+", Number of floors:"+numberOfFloors+", HouseStandard:"
                +houseStandard +", Usable area:"+usableArea+", Rentalc costs:"+rentalCosts+", Max person:"
                +numberMaxPerson+ ", Rental type:"+rentaltype;
    }
}
