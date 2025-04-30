import java.util.Scanner;

public class AirlineReservation {
    public static void main(String[] args) {
        boolean[] seats = new boolean[10]; 
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            System.out.println("Please type 1 for First Class or 2 for Economy:");
            int choice = scanner.nextInt();

            int seatNumber = assignSeat(seats, choice == 1 ? 0 : 5, choice == 1 ? 5 : 10);

            if (seatNumber == -1) {
               
                int alternativeChoice = (choice == 1) ? 2 : 1;
                seatNumber = assignSeat(seats, alternativeChoice == 1 ? 0 : 5, alternativeChoice == 1 ? 5 : 10);

                if (seatNumber == -1) {
                    System.out.println("Next flight leaves in 3 hours.");
                    break; 
                } else {
                    System.out.println("Your assigned seat is: " + (seatNumber + 1) + 
                                       " (Switched to " + (alternativeChoice == 1 ? "First Class)" : "Economy)"));
                }
            } else {
                System.out.println("Your assigned seat is: " + (seatNumber + 1) + 
                                   " (" + (choice == 1 ? "First Class)" : "Economy)"));
            }
        }
    }

    public static int assignSeat(boolean[] seats, int start, int end) {
        for (int i = start; i < end; i++) {
            if (!seats[i]) { 
                seats[i] = true;
                return i;
            }
        }
        return -1; 
    }
}
