package model.facility;

public class Room extends Facility{
    private String serviceFree;
    public Room(){
    }

    public Room(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    public Room(String facilityID, String facilityName, double usableArea, int rentalCosts, int numberMaxPerson, String rentaltype, String serviceFree) {
        super(facilityID, facilityName, usableArea, rentalCosts, numberMaxPerson, rentaltype);
        this.serviceFree = serviceFree;
    }

    public String getServiceFree() {
        return serviceFree;
    }

    public void setServiceFree(String serviceFree) {
        this.serviceFree = serviceFree;
    }

    @Override
    public String toString() {
        return "Room{" +
                "facilityID='" + facilityID + '\'' +
                ", facilityName='" + facilityName + '\'' +
                ", usableArea=" + usableArea +
                ", rentalCosts=" + rentalCosts +
                ", numberMaxPerson=" + numberMaxPerson +
                ", rentaltype='" + rentaltype + '\'' +
                ", serviceFree='" + serviceFree + '\'' +
                '}';
    }
    public String toInfomation()
    {
        return   "ID:"+facilityID+", Facility:"+facilityName+", Usable area:"+usableArea+", Rentalc costs:"+rentalCosts
                +", Max person:" +numberMaxPerson+ ", Rental type:"+rentaltype+", Service free:"+serviceFree;
    }
}
