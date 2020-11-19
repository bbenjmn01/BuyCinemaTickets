

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
    public static int count = 0;

    public Seats(int a, int b) {
        seatStatus = new boolean[a][b];
    }

    public int buy(int a, int b) {
        count++;
        seatStatus[a][b] = true;
        return count;
    }

    public void reset() {
        this.count = 0;
    }
}
