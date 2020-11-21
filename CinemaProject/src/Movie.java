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
    private String[] movieTime;
    private int[] round;
    private int amount;
    public static int movieRound;
    
   public Movie(int a){
        round = new int[a];
        movieName = new String[a];
        movieTime = new String[a];
        this.movieRound=a;
    }
   
    public void creatMovie(String name,String time){
        round[this.amount]=amount+1;
        insertMovieName(name);
        insertTime(time);
        amount++; 
    }
   
  
    public void insertMovieName(String name){
        movieName[this.amount] = name;
    }
    
    public void insertTime(String time){
        this.movieTime[this.amount] = time;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < movieRound; i++) {
            result += round[i] + " " + movieName[i] + " " + movieTime[i] +"\n";
        }
        return result;
    }  
}
