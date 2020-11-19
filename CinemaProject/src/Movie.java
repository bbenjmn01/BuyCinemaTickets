/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public final class Movie {
    
    private String[] movieName;
    private int amount;
    
    public Movie(int a){
        
    }
    
    public Movie(String name){
        insertMovieName(name);
    }
    
    public void createMovieAmount(int a){
        movieName = new String[a];
    } 
    
    public void insertMovieName(String name){
        movieName[this.amount] = name;
    }
            
}
