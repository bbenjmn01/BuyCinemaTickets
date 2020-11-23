package Admin;

import Movie.Movie;
import Movie.MovieDetails;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Benjamin
 */
public class Admin {

    /**
     * 
     * Set details of movies in cinema.
     */
    
    public Admin() {
        MovieDetails md = new MovieDetails(5);
        md.append(new Movie("1. Demon Slayer: Kimetsu no Yaiba", "8:00", 10, 10));
        md.append(new Movie("2. Violet Evergarden             ", "10:00", 10, 10));
        md.append(new Movie("3. Sword Art Online              ", "12:00", 10, 10));
        md.append(new Movie("4. Your Name                     ", "14:00", 10, 10));
        md.append(new Movie("5. Detective Conan The Movie     ", "16:00", 10, 10));
    }

}
