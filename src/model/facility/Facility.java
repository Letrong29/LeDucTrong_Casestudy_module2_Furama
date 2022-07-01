package model.facility;

public abstract class Facility {
    private String serviceName; // tên dịch vụ
    private int usableArea; // diện tích sử dụng
    private int rentalCosts; // giá thuê
    private int maxiMumNumberOfPeople; // số lượng người tối đa
    private String rentStyle; // kiểu thuê

    public Facility() {

    }

    public Facility(String serviceName, int usableArea, int rentalCosts, int maxiMumNumberOfPeople, String rentStyle) {
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxiMumNumberOfPeople = maxiMumNumberOfPeople;
        this.rentStyle = rentStyle;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(int usableArea) {
        this.usableArea = usableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxiMumNumberOfPeople() {
        return maxiMumNumberOfPeople;
    }

    public void setMaxiMumNumberOfPeople(int maxiMumNumberOfPeople) {
        this.maxiMumNumberOfPeople = maxiMumNumberOfPeople;
    }

    public String getRentStyle() {
        return rentStyle;
    }

    public void setRentStyle(String rentStyle) {
        this.rentStyle = rentStyle;
    }

    @Override
    public String toString() {
        return "Tên dịch vụ: '" + serviceName + '\'' +
                ", Diện tích sử dụng: " + usableArea + "m2" +
                ", Giá thuê: " + rentalCosts + "VND" +
                ", Số lượng người tối đa: " + maxiMumNumberOfPeople +
                ", Kiểu thuê: '" + rentStyle;
    }

    public String getToCsv(){
        return serviceName + "," + usableArea + "," + rentalCosts + "," + maxiMumNumberOfPeople + "," + rentStyle;
    }
}
