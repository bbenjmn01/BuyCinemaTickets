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

    public static Movie movie[];
    public static int movieNum;

    public MovieDetails(int movieAmounts) {
        movie = new Movie[movieAmounts];
    }

    public MovieDetails append(Movie mv) {
        if (movieNum < movie.length) {
            movie[this.movieNum++] = mv;
            return this;
        }
        return null;
    }
    
    public Movie getMovie(int i){
        return movie[i];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < movieNum; i++) {
            sb.append(movie[i].toString()).append("\n");
        }
        return sb.toString();
    }

}
