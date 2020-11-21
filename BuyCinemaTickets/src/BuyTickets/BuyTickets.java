package BuyTickets;

import Seats.Seats;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Benjamin
 */
public final class BuyTickets {

    private Seats changeStatus;
    private int ticketAmounts;
    private final String[] amounts;
    private int row;
    private int col;

    public BuyTickets() {
        this.amounts = new String[Seats.rows * Seats.cols];
    }

    public int buy(int row, int col) {
        ++this.ticketAmounts;
        
        if (Seats.seatStatus[row][col] == "Booked"){
           --this.ticketAmounts;
        }
        else if (row <= Seats.rows && col <= Seats.cols) {
            String a = Integer.toString(row);
            String b = Integer.toString(col);
            amounts[this.ticketAmounts-1] = "R" + a + "C" + b;
            Seats.seatStatus[row][col] = "Booked";
            return this.ticketAmounts;
        }
       
        return 0;
    }

    public void resetAmounts() {
        this.ticketAmounts = 0;
    }

    @Override
    public String toString() {
        System.out.print("Number of tickets : " + this.ticketAmounts);
        System.out.print(", Seat number : ");
        for (int i = 0; i < this.ticketAmounts; i++) {
           
           
                System.out.print(amounts[i]);
            if (i < this.ticketAmounts - 1) {
                System.out.print(", ");
            }
        }
        return "";
    }
}