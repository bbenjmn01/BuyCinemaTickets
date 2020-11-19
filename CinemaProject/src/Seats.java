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

    private boolean[][] seatStatus;
    private int count = 0;
    private int amount = 0;

    public Seats(int a, int b) {
        seatStatus = new boolean[a][b];
    }

    public int buy(int a, int b) {
        ++count;
        this.amount = count; 
        seatStatus[a][b] = true;
        this.count = 0;
        return this.amount;
    }

    public void resetSeats() {
        for (int i = 0; i < seatStatus.length; i++) {
            seatStatus[i][i] = false;
        }
    }
}
