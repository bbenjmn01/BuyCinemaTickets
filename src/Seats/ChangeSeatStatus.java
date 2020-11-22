package Seats;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Benjamin
 */
public final class ChangeSeatStatus {

    public static int ticketAmounts = 0;
    private int count = 0;
    private final String[] amounts;

    public ChangeSeatStatus() {
        amounts = new String[Seats.rows * Seats.columns];
    }

    public int buy(int row, int col) {
        ++ticketAmounts;
        ++count;
        if ("Booked".equals(Seats.seatStatus[row][col])) {
            --ticketAmounts;
        } else if (row <= Seats.rows && col <= Seats.columns) {
//            String a = Integer.toString(row);
//            String b = Integer.toString(col);
            amounts[count - 1] = "R" + Integer.toString(row) + "C" + Integer.toString(col);
            Seats.seatStatus[row][col] = "Booked";
            return ticketAmounts;
        }
        return 0;
    }

    public static void resetAmounts() {
        ChangeSeatStatus.ticketAmounts = 0;
    }

    @Override
    public String toString() {
        System.out.print("Seat number : ");
        for (int i = 0; i < ChangeSeatStatus.ticketAmounts; i++) {
            System.out.print(amounts[i]);
            if (i < ChangeSeatStatus.ticketAmounts - 1) {
                System.out.print(", ");
            }
        }
        return "";
    }
}
