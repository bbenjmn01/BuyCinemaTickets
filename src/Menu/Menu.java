/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

import Admin.Admin;
import BuyTickets.TicketMachine;
import Movie.MovieDetails;
import Seats.ChangeSeatStatus;
import java.util.Scanner;

/**
 *
 * @author Benjamin
 */
public final class Menu {

    int select;
    int choose;
    int selectMore;
    int row;
    int col;
    int coin;

    MovieDetails md = new MovieDetails(5);

    public Menu() {
        SetMovie();
    }

    public void SetMovie() {
        Admin am = new Admin();
        StartApp();
    }

    public void StartApp() {
        Scanner sc = new Scanner(System.in);
        TicketMachine tm = new TicketMachine();
        ChangeSeatStatus cs = new ChangeSeatStatus();

        try {
            String menuStr = "----------------------\n"
                    + "      Choose Menu     \n"
                    + "   1. Select Movies   \n"
                    + "   0. Exit            \n"
                    + "----------------------\n";

            do {

                System.out.print(menuStr);
                System.out.print("Select menu: ");
                choose = sc.nextInt();
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
                        if (select <= MovieDetails.movieNum && select > 0) {
                            switch (select) {
                                case 1:
                                    do {
                                        System.out.println(MovieDetails.movie[0]);
                                        System.out.print(MovieDetails.movie[0].seatsToString());
                                        System.out.print("Select your seat (row) : ");
                                        row = sc.nextInt();
                                        System.out.print("Select your seat (column) : ");
                                        col = sc.nextInt();
                                        System.out.println("");
                                        sc.nextLine();
                                        cs.buy(row, col);
                                        System.out.print("Seat number : ");
                                        System.out.println(cs);
                                        String sale = "\nDo you want more?\n"
                                                + "Press 0 : No \n"
                                                + "Press 1 : Yes \n"
                                                + "Press: ";
                                        System.out.print(sale);
                                        selectMore = sc.nextInt();
                                        System.out.println("");
                                    } while (selectMore == 1);

                                    TicketMachine t1 = new TicketMachine();
                                    System.out.println("Number of ticket : " + t1.getTicket());
                                    System.out.println("Ticket Price : " + t1.getTicketPrice());
                                    System.out.println("Total prices : " + t1.getPrices());
                                    do {
                                        System.out.print("Enter your money : ");
                                        coin += sc.nextInt();
                                        t1.setCustomerCoins(coin);
                                        System.out.println("");
                                        System.out.print(cs);
                                        t1.sellTicketsToCustomer();
                                        System.out.println("\n" + t1 + "\n");
                                    }while(coin<t1.getPrices()); 
                                    ChangeSeatStatus.resetAmounts();
                                    break;

                                case 2:
                                    do {
                                        System.out.println(MovieDetails.movie[1]);
                                        System.out.print(MovieDetails.movie[1].seatsToString());
                                        System.out.print("Select your seat (row) : ");
                                        row = sc.nextInt();
                                        System.out.print("Select your seat (column) : ");
                                        col = sc.nextInt();
                                        System.out.println("");
                                        sc.nextLine();
                                        cs.buy(row, col);
                                        System.out.println(cs);
                                        String sale = "\nDo you want more?\n"
                                                + "Press 0 : No \n"
                                                + "Press 1 : Yes \n"
                                                + "Press: ";
                                        System.out.print(sale);
                                        selectMore = sc.nextInt();
                                        System.out.println("");
                                    } while (selectMore == 1);

                                    TicketMachine t2 = new TicketMachine();
                                    System.out.println("Number of ticket : " + t2.getTicket());
                                    System.out.println("Ticket Price : " + t2.getTicketPrice());
                                    System.out.println("Total prices : " + t2.getPrices());
                                    do {
                                        System.out.print("Enter your money : ");
                                        coin += sc.nextInt();
                                        t2.setCustomerCoins(coin);
                                        System.out.println("");
                                        System.out.print(cs);
                                        t2.sellTicketsToCustomer();
                                        System.out.println("\n" + t2 + "\n");
                                    }while(coin<t2.getPrices()); 
                                    ChangeSeatStatus.resetAmounts();
                                    break;

                                case 3:
                                    do {
                                        System.out.println(MovieDetails.movie[2]);
                                        System.out.print(MovieDetails.movie[2].seatsToString());
                                        System.out.print("Select your seat (row) : ");
                                        row = sc.nextInt();
                                        System.out.print("Select your seat (column) : ");
                                        col = sc.nextInt();
                                        System.out.println("");
                                        sc.nextLine();
                                        cs.buy(row, col);
                                        System.out.println(cs);
                                        String sale = "\nDo you want more?\n"
                                                + "Press 0 : No \n"
                                                + "Press 1 : Yes \n"
                                                + "Press: ";
                                        System.out.print(sale);
                                        selectMore = sc.nextInt();
                                        System.out.println("");
                                    } while (selectMore == 1);

                                    TicketMachine t3 = new TicketMachine();
                                    System.out.println("Number of ticket : " + t3.getTicket());
                                    System.out.println("Ticket Price : " + t3.getTicketPrice());
                                    System.out.println("Total prices : " + t3.getPrices());
                                    do {
                                        System.out.print("Enter your money : ");
                                        coin += sc.nextInt();
                                        t3.setCustomerCoins(coin);
                                        System.out.println("");
                                        System.out.print(cs);
                                        t3.sellTicketsToCustomer();
                                        System.out.println("\n" + t3 + "\n");
                                    }while(coin<t3.getPrices()); 
                                    ChangeSeatStatus.resetAmounts();
                                    break;

                                case 4:
                                    do {
                                        System.out.println(MovieDetails.movie[3]);
                                        System.out.print(MovieDetails.movie[3].seatsToString());
                                        System.out.print("Select your seat (row) : ");
                                        row = sc.nextInt();
                                        System.out.print("Select your seat (column) : ");
                                        col = sc.nextInt();
                                        System.out.println("");
                                        sc.nextLine();
                                        cs.buy(row, col);
                                        System.out.println(cs);
                                        String sale = "\nDo you want more?\n"
                                                + "Press 0 : No \n"
                                                + "Press 1 : Yes \n"
                                                + "Press: ";
                                        System.out.print(sale);
                                        selectMore = sc.nextInt();
                                        System.out.println("");
                                    } while (selectMore == 1);

                                    TicketMachine t4 = new TicketMachine();
                                    System.out.println("Number of ticket : " + t4.getTicket());
                                    System.out.println("Ticket Price : " + t4.getTicketPrice());
                                    System.out.println("Total prices : " + t4.getPrices());
                                    do {
                                        System.out.print("Enter your money : ");
                                        coin += sc.nextInt();
                                        t4.setCustomerCoins(coin);
                                        System.out.println("");
                                        System.out.print(cs);
                                        t4.sellTicketsToCustomer();
                                        System.out.println("\n" + t4 + "\n");
                                    }while(coin<t4.getPrices()); 
                                    ChangeSeatStatus.resetAmounts();
                                    break;

                                case 5:
                                    do {
                                        System.out.println(MovieDetails.movie[4]);
                                        System.out.print(MovieDetails.movie[4].seatsToString());
                                        System.out.print("Select your seat (row) : ");
                                        row = sc.nextInt();
                                        System.out.print("Select your seat (column) : ");
                                        col = sc.nextInt();
                                        System.out.println("");
                                        sc.nextLine();
                                        cs.buy(row, col);
                                        System.out.println(cs);
                                        String sale = "\nDo you want more?\n"
                                                + "Press 0 : No \n"
                                                + "Press 1 : Yes \n"
                                                + "Press: ";
                                        System.out.print(sale);
                                        selectMore = sc.nextInt();
                                        System.out.println("");
                                    } while (selectMore == 1);

                                    TicketMachine t5 = new TicketMachine();
                                    System.out.println("Number of ticket : " + t5.getTicket());
                                    System.out.println("Ticket Price : " + t5.getTicketPrice());
                                    System.out.println("Total prices : " + t5.getPrices());
                                    do {
                                        System.out.print("Enter your money : ");
                                        coin += sc.nextInt();
                                        t5.setCustomerCoins(coin);
                                        System.out.println("");
                                        System.out.print(cs);
                                        t5.sellTicketsToCustomer();
                                        System.out.println("\n" + t5 + "\n");
                                    }while(coin<t5.getPrices()); 
                                    ChangeSeatStatus.resetAmounts();
                                    break;

                            }
                            break;
                        }
                    case 0:
                        System.exit(0);
                        break;
                }

            } while (select != 0);

        } catch (Exception ex) {
            System.out.println("Input incorrect! Please do it again.");
            sc.reset();
            sc.next();
            StartApp();
        }
    }

}
