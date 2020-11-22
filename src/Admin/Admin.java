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

    public Admin() {
        MovieDetails md = new MovieDetails(5);
        md.append(new Movie("Demon Slayer: Kimetsu no Yaiba", "8:00", 11, 11));
        md.append(new Movie("Violet Evergarden", "10:00", 12, 12));
        md.append(new Movie("Sword Art Online", "12:00", 13, 13));
        md.append(new Movie("Your Name", "14:00", 14, 14));
        md.append(new Movie("Detective Conan The Movie", "16:00", 15, 15));
    }

}
