/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Movie {

    private Seats createSeat;
    private final String[] movieName;
    private String time;
    private int count = 0;
    private int round = 0;

    public Movie(int a) {
        movieName = new String[a];
    }
    
    public Movie append(String name) {
        if (count < movieName.length) {
            movieName[count++] = name;
            return this;
        }
        return null;
    }

    public void movieRound(String time, int x, int y) {
        ++round;
        this.time = time;
        createSeat = new Seats(x, y);
    }

    public String[] getMovieName() {
        return movieName;
    }

    public int getRound() {
        return round;
    }

    @Override
    public String toString() {
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb1.append(movieName[i]).append("\n");
        }
        return sb1.toString();
    }
    
    public static void main(String[] args) {
        Movie m = new Movie(3);
        m.append("1. Benjamin");
        m.append("2. Job-kun");
        m.append("3. Malamild");
        m.movieRound("12:00", 10, 10);
        m.movieRound("14:00", 10, 10);
        m.movieRound("16:00", 10, 10);
        System.out.println(m);
    }
    
}