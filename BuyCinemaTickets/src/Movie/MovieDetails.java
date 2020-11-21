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
public class MovieDetails {

    private String[] movieName;
    private String[] movieTime;
    private Seats setSeats;
    private int movieNum;
    private int count = 0;
    private int roundAmount = 0;

    public MovieDetails(int movieAmounts) {
        movieName = new String[movieAmounts];
    }
    
    public MovieDetails append(String name) {
        if (count < movieName.length) {
            movieName[count++] = name;
            return this;
        }
        return null;
    }
    
    private void insertMovieDetails(String name, String time, int rowsAmount, int colsAmount){
        movieNum++;
        movieName[this.movieNum] = name;
        roundAmount++;
        this.movieTime[this.roundAmount] = time;
        setSeats = new Seats(rowsAmount, colsAmount);
    }

    public String[] getMovieName() {
        return movieName;
    }

    @Override
    public String toString() {
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb1.append(movieName[i]).append("\n");
        }
        return sb1.toString();
    }
    
}