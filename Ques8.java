package Java_OOPS_Program;

import java.util.Scanner;

class Room {
    int roomno;
    String roomtype;
    double roomarea;
    boolean ACmachine;

    void setData(int roomno, String roomtype, double roomarea, boolean ACmachine) {
        this.roomno = roomno;
        this.roomtype = roomtype;
        this.roomarea = roomarea;
        this.ACmachine = ACmachine;
    }

    void displayData() {
        System.out.println("Room No = " + roomno);
        System.out.println("Room Type = " + roomtype);
        System.out.println("Room Area = " + roomarea);
        System.out.println("AC Machine = " + ACmachine);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Room room = new Room();

        System.out.print("Enter room number: ");
        int roomno = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter room type: ");
        String roomtype = sc.nextLine();

        System.out.print("Enter room area: ");
        double roomarea = sc.nextDouble();

        System.out.print("Does room have AC? true/false: ");
        boolean ac = sc.nextBoolean();

        room.setData(roomno, roomtype, roomarea, ac);
        room.displayData();
    }
}
