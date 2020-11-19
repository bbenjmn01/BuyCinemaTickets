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
    private String[] Time;
    private int[] Round;
    private int amount;
    public static int round;
    
   public Movie(int a){
        Round = new int[a];
        movieName = new String[a];
        Time = new String[a];
        this.round=a;
    }
   
    public void creatMovie(String name,String time){
        Round[this.amount]=amount+1;
        insertMovieName(name);
        insertTime(time);
        Seats s = new Seats();
        amount++;
        
    }
  
    public void insertMovieName(String name){
        movieName[this.amount] = name;
    }
    
    public void insertTime(String time){
        Time[this.amount] = time;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < round; i++) {
            result += Round[i] + " " + movieName[i] + " " + Time[i] +"\n";
        }
        return result;
    }  
}
