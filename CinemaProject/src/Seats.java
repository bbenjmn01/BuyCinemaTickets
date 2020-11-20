

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
    public static int count = 0;
    public static int amounts ;
    public static int rows = 0;
    public static int columns = 0;

    public Seats() {
        seatStatus = new String[10][15];
    }

    public int buy(int a, int b) {
        ++count;
        amounts += count; 
        seatStatus[a][b] = "booked";
        this.count = 0;
        rows=a;
        columns=b;
        return amounts;
    }
    
    public static void resetAmounts(){
        amounts=0;
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
