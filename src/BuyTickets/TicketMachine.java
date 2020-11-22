package BuyTickets;

import Seats.ChangeSeatStatus;
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
public class TicketMachine {

    private final int ticketPrice = 120;
    private int numberOfTicket;
    private int numberOfCoins;
    private int customerCoins;
    private int price;
    private int change;

    public TicketMachine() {
        this.numberOfTicket = Seats.rows * Seats.columns;
    }

    public double getPrices() {
        return ChangeSeatStatus.ticketAmounts * ticketPrice;
    }

    public int getTicket() {
        return ChangeSeatStatus.ticketAmounts;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public int getNumberOfTicket() {
        return numberOfTicket;
    }

    public int getNumberOfCoines() {
        return numberOfCoins;
    }

    public int getCustomerCoins() {
        return customerCoins;
    }

    public int getChanges() {
        return this.change;
    }
    
    /** Returns change of this object.*/

    public void setCustomerCoins(int coins) {
        this.customerCoins = coins;
    }

    public void receiveTicketsFromAdmin(int tickets) {
        this.numberOfTicket += tickets;
    }

    public int giveAllCoinsToAdmin() {
        int a = numberOfCoins;
        this.numberOfCoins = 0;
        return a;
    }

    public void receiveCoinsFromCustomer(int coins) {
        this.customerCoins += coins;
    }

    public String sellTicketsToCustomer() {
        int tickets = ChangeSeatStatus.ticketAmounts;
        int coins = customerCoins;
        int prices = tickets * ticketPrice;
        this.price = prices;

        if (tickets >= numberOfTicket) {
            return "The tickets are not enough.";
        } else if (tickets <= numberOfTicket && prices > customerCoins) {
              int sure;
              Scanner sc = new Scanner(System.in);
            System.out.println("\nIncomplete without paying another " + (prices - coins) + " Bath\n");
            
            
        } else if (tickets <= numberOfTicket && prices <= customerCoins) {
            this.numberOfCoins += Math.ceil(prices);
            this.numberOfTicket -= tickets;
            coins -= Math.ceil(prices);
            this.change = coins;
            return "Your change : " + this.change;
        }
        return "Error";
    }

    public int returnCoinsToCustomer() {
        int a = customerCoins;
        this.customerCoins = 0;
        return a;
    }

    public void resetsCustomerCoin() {
        this.customerCoins = 0;
    }

    @Override
    public String toString() {
        return "Number of Tickets : " + ChangeSeatStatus.ticketAmounts
                + "\nTicket Price : " + ticketPrice + " baht."
                + "\nTotal Prices : " + price + " baht."
                + "\nThe money you put in : " + customerCoins + " baht."
                + "\n" + sellTicketsToCustomer();
    }

}
