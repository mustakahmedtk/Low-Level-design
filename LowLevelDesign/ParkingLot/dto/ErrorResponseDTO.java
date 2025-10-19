package ParkingLot.dto;

public class ErrorResponseDTO extends ResponseDTO{
    private String message;
    private int errorCode;

    public ErrorResponseDTO(String message, int errorCode) {
        this.message = message;
        this.errorCode = errorCode;
    }

    public ErrorResponseDTO(){

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
