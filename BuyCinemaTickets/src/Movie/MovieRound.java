package Movie;

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
public class MovieRound {
    private String time;
    private Seats seatDetail;
    
    public MovieRound(String time, int a, int b){
        this.time = time;
        seatDetail = new Seats(a, b);
    }

    @Override
    public String toString() {
        return "MovieRound" + "time :" + time + "\n" + seatDetail.toString();
    }
    
}
