package model.facility;

public class House extends Facility{
    private int roomStandard; // tiêu chuẩn phòng
    private int numberOfFloors; // số tầng

    public House(){

    }

    public House(int roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceName, int usableArea, int rentalCosts, int maxiMumNumberOfPeople, String rentStyle, int roomStandard, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maxiMumNumberOfPeople, rentStyle);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public int getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(int roomStandard)    {
        this.roomStandard = roomStandard;
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
                super.toString() +
                ", Tiêu chuẩn phòng: " + roomStandard + "sao" +
                ", Số tầng: " + numberOfFloors +
                '}';
    }

    @Override
    public String getToCsv() {
        return super.getToCsv() + "," + roomStandard + "," + numberOfFloors;
    }
}
