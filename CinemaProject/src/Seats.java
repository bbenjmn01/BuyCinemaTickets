

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
    public static int amounts = 0;

    public Seats() {
        seatStatus = new boolean[10][15];
    }

    public int buy(int a, int b) {
        ++count;
        int amount;
        amount = count; 
        seatStatus[a][b] = true;
        amounts=0;
        this.count = 0;
        return amount;
    }
    
    public static void resetAmounts(){
        amounts=0;
    }

    public void resetSeats() {
        for (int i = 0; i < seatStatus.length; i++) {
            seatStatus[i][i] = false;
        }
    }
}
