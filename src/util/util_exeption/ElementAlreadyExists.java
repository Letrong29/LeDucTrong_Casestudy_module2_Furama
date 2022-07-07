package util.util_exeption;


public class ElementAlreadyExists extends Exception{
    // Đối tượng đã tồn tại
    public ElementAlreadyExists(String message) {
        super(message);
    }
}
