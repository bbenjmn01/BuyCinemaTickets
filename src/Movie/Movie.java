/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Movie;

import Seats.Seats;

/**
 *
 * @author User
 */
public class Movie {

    private final String name;
    private final String time;
    public static Seats setSeats;

    /**
     * 
     * @param name the name of movie.
     * @param time the time of movie start.
     * @param rowsAmount the amount of rows seat.
     * @param colsAmount the amount of cols seat.
     */
    
    
    public Movie(String name, String time, int rowsAmount, int colsAmount) {
        this.name = name;
        this.time = time;
        setSeats = new Seats(rowsAmount, colsAmount);
    }

    /**
     * 
     * @return name and time start of movie .
     */
    
    
    @Override
    public String toString() {
        return name + "\t" + "Time: " + time;
    }
    
    /**
     * 
     * @return SeatStatus.
     */
    
    
    public Seats seatsToString(){
        return setSeats;
    } 
            
}
