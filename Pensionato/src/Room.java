public class Room {

    private String studentName;
    private String studentEmail;
    private int rentedRoom;

    public Room(String studentName, String studentEmail, int rentedRoom) {
        this.studentName = studentName;
        this.studentEmail = studentEmail;
        this.rentedRoom = rentedRoom;
    }

    public String message(){
        return rentedRoom +
                ": " +
                studentName +
                ", " +
                studentEmail;
    }
}
