package Menu;

import Seats.ChangeSeatStatus;
import BuyTickets.TicketMachine;
import Movie.Movie;
import Movie.MovieDetails;
import Seats.Seats;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Benjamin
 */
public class TestMenu {

    public static void main(String[] args) {
        TestSeats();
        TestChangeSeatStatus();
        TestTicketMachine();
//        TestMovieDetails();
    }

    public static void TestSeats() {
        Seats s1 = new Seats(10, 10);
        s1.resetSeats();
        System.out.println(s1);
    }

    public static void TestChangeSeatStatus() {
        ChangeSeatStatus b1 = new ChangeSeatStatus();
        b1.buy(1, 1);
        b1.buy(9, 9);
//        b1.buy(9, 9);
        System.out.println(b1.toString());
    }

    public static void TestTicketMachine() {
        Scanner sc = new Scanner(System.in);
        TicketMachine t = new TicketMachine();
        System.out.println("TicketPrice : " + t.getTicketPrice());
        System.out.println("Ticket: " + t.getTicket());
        System.out.println(t.getPrices());
        System.out.println("Enter you coins: ");
        int coi = sc.nextInt();
        t.setCustomerCoins(coi);
        t.sellTicketsToCustomer();
        System.out.println("\n" + t + "\n");
        ChangeSeatStatus.resetAmounts();
    }

    public static void TestMovieDetails() {
        MovieDetails m = new MovieDetails(5);
        m.append(new Movie("Reborn", "8:00", 0, 0));
        m.append(new Movie("Reborn", "10:00", 0, 0));
        m.append(new Movie("Reborn", "12:00", 0, 0));
        m.append(new Movie("Reborn", "14:00", 0, 0));
        m.append(new Movie("Reborn", "16:00", 0, 0));
        m.append(new Movie("Reborn", "18:00", 0, 0));
        System.out.print(m);
    }

}
