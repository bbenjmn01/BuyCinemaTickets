/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Seats {

    private String[][] seatStatus;
    private int count = 0;
    private int a = 0;
    private int amount = 0;

    public Seats(int a, int b) {
        seatStatus = new String[a][b];
    }

    public String show() {
        for (int i = 0; i < seatStatus.length; i++) {
            for (int j = 0; j < seatStatus[i].length; j++) {
                    System.out.print(i+""+j+" : "+seatStatus[i][j] + "\t");
                }
            System.out.println();
            }
        return "";
    }

    public int buy(int a, int b) {
        ++count;
        this.amount = count;
        seatStatus[a][b] = "Booked";
        this.count = 0;
        return this.amount;
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
        return show();
    }

    public static void main(String[] args) {
        Seats s = new Seats(10, 15);
        s.buy(0, 0);
        s.buy(9, 1);
        s.buy(4, 2);
        s.buy(6, 3);
        s.buy(9, 4);
        System.out.println(s);
    }

}
