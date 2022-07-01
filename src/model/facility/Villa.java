package model.facility;

public class Villa extends Facility {
    private int roomStandard; //tiêu chuẩn phòng
    private int poolArea; // diện tích hồ bơi
    private int numberOfFloors; // số tầng

    public Villa() {

    }

    public Villa(int roomStandard, int poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceName, int usableArea, int rentalCosts, int maxiMumNumberOfPeople, String rentStyle, int roomStandard, int poolArea, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maxiMumNumberOfPeople, rentStyle);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public int getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(int roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(int poolArea) {
        this.poolArea = poolArea;
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
                super.toString() +
                ", Tiêu chuẩn phòng: " + roomStandard + "sao" +
                ", Diện tích hồ bơi" + poolArea + "m2" +
                ", Số tầng: " + numberOfFloors + "tầng" +
                '}';
    }

    @Override
    public String getToCsv() {
        return super.getToCsv() + "," + roomStandard + "," + poolArea + "," + numberOfFloors;
    }
}
