import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numberOfRooms = 10;
        Room[] rooms = new Room[numberOfRooms];

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        String name;
        String email;
        int room;
        for(int i =  0; i < n; i++){
            System.out.println();
            System.out.println("Rent #" + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Email: ");
            email = sc.nextLine();
            System.out.print("Room: ");
            room = sc.nextInt();
            Room newRoom = new Room(name,email,room);
            rooms[room] = newRoom;
        }

        for(int i = 0; i < numberOfRooms; i++){
            if(rooms[i] != null){
                System.out.println("Busy rooms:");
                System.out.println(rooms[i].message());
            }
        }

        sc.close();

    }
}