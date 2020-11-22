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
    ChangeSeatStatus cs = new ChangeSeatStatus();
    TicketMachine tm = new TicketMachine();

    public Menu() {
        StartApp();
    }

    public void StartApp() {

        Scanner sc = new Scanner(System.in);
        md.append(new Movie("1. Demon Slayer: Kimetsu no Yaiba", "8:00", 11, 11));
        md.append(new Movie("2. Violet Evergarden             ", "10:00", 12, 12));
        md.append(new Movie("3. Sword Art Online              ", "12:00", 13, 13));
        md.append(new Movie("4. Your Name                     ", "14:00", 14, 14));
        md.append(new Movie("5. Detective Conan The Movie     ", "16:00", 15, 15));
        try {
            String menuStr = "----------------------\n"
                    + "      Choose Menu     \n"
                    + "   1. Select Movies   \n"
                    + "   0. Exit            \n"
                    + "----------------------\n";
            System.out.print(menuStr);
            System.out.print("Select menu: ");

            while (true) {
                int choose = sc.nextInt();
                System.out.println("");
                switch (choose) {
                    case 1:
                        System.out.print("----------------------------------------------------\n");
                        System.out.print(md);
                        System.out.print("----------------------------------------------------\n");
                        System.out.print("Select movie: ");
                        int select = sc.nextInt();
                        System.out.println("");
                        switch (select) {
                            case 1:
                                int selectMore;
                                do {
                                    System.out.println(MovieDetails.movie[0]);
                                    System.out.print("Select your seat (row) : ");
                                    int row = sc.nextInt();
                                    sc.nextLine();
                                    System.out.print("Select your seat (column) : ");
                                    int col = sc.nextInt();
                                    sc.nextLine();
                                    cs.buy(row, col);
                                    String sale = "Do you want more?\n" + "Press 1 : Yes \n"
                                            + "Press 0 : No \n"
                                            + "Press 1 : Yes \n"
                                            + "Press: ";
                                    System.out.print(sale);
                                    selectMore = sc.nextInt();
                                } while (selectMore == 1);
                                {
                                    System.out.println(Movie.setSeats.toString());
                                }

                                TicketMachine t = new TicketMachine();
                                System.out.println("TicketPrice: " + t.getTicketPrice());
                                System.out.println("Number of ticket: " + t.getTicket());
                                System.out.print("Total prices: " + t.getPrices());
                                System.out.print("Enter you coins: ");
                                int coin = sc.nextInt();
                                t.setCustomerCoins(coin);
                                System.out.println(cs);
                                t.sellTicketsToCustomer();
                                System.out.println("\n" + t + "\n");
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

        } catch (Exception ex) {
            System.out.println("Input incorrect! Please do it again");
            sc.reset();
            sc.next();
            StartApp();
        }
    }
}
