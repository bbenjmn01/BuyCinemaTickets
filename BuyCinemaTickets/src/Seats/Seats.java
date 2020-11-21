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
    public static int cols = 0;

    public Seats(int a, int b) {
        Seats.rows = a;
        Seats.cols = b;
        seatStatus = new String[a][b];
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
        for (int i = 0; i < seatStatus.length; i++) {
            for (int j = 0; j < seatStatus[i].length; j++) {
                    System.out.print(i+""+j+" : "+seatStatus[i][j] + "\t");
                }
            System.out.println();
        }
        return "";
    }

}