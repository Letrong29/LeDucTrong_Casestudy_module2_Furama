package model.facility;

public class Room extends Facility{
    private String freeServiceIncluded; // dịch vụ miễn phí đi kèm

    public Room(){

    }

    public Room(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public Room(String serviceName, int usableArea, int rentalCosts, int maxiMumNumberOfPeople, String rentStyle, String freeServiceIncluded) {
        super(serviceName, usableArea, rentalCosts, maxiMumNumberOfPeople, rentStyle);
        this.freeServiceIncluded = freeServiceIncluded;
    }

    public String getFreeServiceIncluded() {
        return freeServiceIncluded;
    }

    public void setFreeServiceIncluded(String freeServiceIncluded) {
        this.freeServiceIncluded = freeServiceIncluded;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                ", freeServiceIncluded='" + freeServiceIncluded + '\'' +
                '}';
    }

    @Override
    public String getToCsv() {
        return super.getToCsv() + "," + freeServiceIncluded;
    }
}
