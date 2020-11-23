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
public class Seats {

    public static String[][] seatStatus;
    public static int rows = 0;
    public static int columns = 0;

    public Seats(int a, int b) {
        Seats.rows = a;
        Seats.columns = b;
        seatStatus = new String[a][b];
    }

    public Seats() {

    }

    public void resetSeats() {
        for (int i = 0; i < seatStatus.length; i++) {
            for (int j = 0; j < seatStatus[i].length; j++) {
                seatStatus[i][j] = null;
            }
        }
    }

    @Override
    public String toString() {
        String seatsChart = "";
        for (int i = 0; i < seatStatus.length; i++) {
            for (int j = 0; j < seatStatus[i].length; j++) {
               seatsChart += (i + "" + j + " : " + seatStatus[i][j] + "\t");
            }
            seatsChart += "\n";
        }
        return seatsChart;
    }

}
