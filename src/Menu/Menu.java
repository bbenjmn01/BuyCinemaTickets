/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Admin.Admin;
import BuyTickets.TicketMachine;
import Movie.Movie;
import Movie.MovieDetails;
import Seats.ChangeSeatStatus;
import java.util.Scanner;

/**
 *
 * @author Benjamin
 */
public final class Menu {

//    Admin am = new Admin();
    MovieDetails md = new MovieDetails(5);
//    ChangeSeatStatus cs = new ChangeSeatStatus();
//    TicketMachine tm = new TicketMachine();

    public Menu() {
        SetMovie();
    }
    
    public void SetMovie(){ 
//        MovieDetails md = new MovieDetails(5);
        md.append(new Movie("1. Demon Slayer: Kimetsu no Yaiba", "8:00", 11, 11));
        md.append(new Movie("2. Violet Evergarden             ", "10:00", 12, 12));
        md.append(new Movie("3. Sword Art Online              ", "12:00", 13, 13));
        md.append(new Movie("4. Your Name                     ", "14:00", 14, 14));
        md.append(new Movie("5. Detective Conan The Movie     ", "16:00", 15, 15));
        StartApp();
    }

    public void StartApp() {
        Scanner sc = new Scanner(System.in);
        TicketMachine tm = new TicketMachine();
        ChangeSeatStatus cs = new ChangeSeatStatus();
//        try {
            String menuStr = "----------------------\n"
                    + "      Choose Menu     \n"
                    + "   1. Select Movies   \n"
                    + "   0. Exit            \n"
                    + "----------------------\n";
            System.out.print(menuStr);
            System.out.print("Select menu: ");

            while (true) {
                int select;
                int choose = sc.nextInt();
                int selectMore;
                int row;
                int col;
                int coin;
                System.out.print("----------------------\n");
                switch (choose) {
                    case 1:
                        System.out.print("----------------------------------------------------\n");
                        System.out.print(md);
                        System.out.print("----------------------------------------------------\n");
                        System.out.print("Select movie: ");
                        select = sc.nextInt();
                        System.out.print("----------------------------------------------------\n");
                        System.out.println("");
                        switch (select) {
                            case 1:
                                do {
                                    System.out.println(MovieDetails.movie[0]);
                                    System.out.print(MovieDetails.movie[0].seatsToString());
                                    System.out.print("Select your seat (row) : ");
                                    row = sc.nextInt();
                                    System.out.print("Select your seat (column) : ");
                                    col = sc.nextInt();
                                    sc.nextLine();
                                    cs.buy(row, col);
                                    System.out.println(cs);
                                    String sale = "Do you want more?\n"
                                            + "Press 0 : No \n"
                                            + "Press 1 : Yes \n"
                                            + "Press: \n";
                                    System.out.print(sale);
                                    selectMore = sc.nextInt();
                                } while (selectMore == 1);
                                {
                                    System.out.println(Movie.setSeats.toString());
                                }

                                TicketMachine t1 = new TicketMachine();
                                System.out.println("TicketPrice: " + t1.getTicketPrice());
                                System.out.println("Number of ticket: " + t1.getTicket());
                                System.out.print("Total prices: " + t1.getPrices());
                                System.out.print("Enter you coins: ");
                                coin = sc.nextInt();
                                t1.setCustomerCoins(coin);
                                System.out.println(cs);
                                t1.sellTicketsToCustomer();
                                System.out.println("\n" + t1 + "\n");
                                ChangeSeatStatus.resetAmounts();
                                break;
                            case 2:
                                
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                        }
                        break;
                    case 0:
                        System.exit(0);
                        break;
                }

            }

//        } catch (Exception ex) {
//            System.out.println("Input incorrect! Please do it again.");
//            sc.reset();
//            sc.next();
//            StartApp();
//        }
    }
}
