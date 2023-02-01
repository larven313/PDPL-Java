import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int floor;

        // membuat scanner
        Scanner inp_floor = new Scanner(System.in);
        System.out.print("Masukkan lantai : ");

        floor = inp_floor.nextInt();

        if (floor > 13) {
            floor = floor - 1;
        }

        // output
        System.out.println("Kamu berada di lantai " + floor);

    }
}
