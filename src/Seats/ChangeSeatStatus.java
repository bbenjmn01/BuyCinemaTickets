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
    /** Returns Amount of Tickets
     * 
     * @param row the row seat in the cinema.
     * @param col the column seat in the cinema.
     * @return Amount of Tickets
	 * @see #buy
    */
    public int buy(int row, int col) {
        ++ticketAmounts;
        ++count;
        if ("Booked".equals(Seats.seatStatus[row][col])) {
            --ticketAmounts;
        } else if (row <= Seats.rows && col <= Seats.columns) {
            amounts[count - 1] = "R" + Integer.toString(row) + "C" + Integer.toString(col);
            Seats.seatStatus[row][col] = "Booked";
            return ticketAmounts;
        }
        return 0;
    }
    /** Reset the Amount of tickets to zero.
    */
    public static void resetAmounts() {
        ChangeSeatStatus.ticketAmounts = 0;
    }

    @Override
    public String toString() {
        String seatNumber = "";
        for (int i = 0; i < count; i++) {
            seatNumber += amounts[i];
            if (i < ChangeSeatStatus.ticketAmounts - 1) {
                seatNumber += ", ";
            }
        }
        return seatNumber;
    }
}