/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author WIN10PRO
 */
public class TicketMachine {

    private int ticketPrice = 120;
    private int numberOfTicket;
    private int numberOfCoins;
    private int customerCoins;
    private int p;
    private int change;

    public TicketMachine() {
        this.numberOfTicket = Seats.rows * Seats.columns;

    }

    public double getPrices() {
        return Seats.amounts * ticketPrice;
    }

    public int getTicket() {
        return Seats.amounts;
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

    public void setCustomerCoins(int coins) {
        this.customerCoins = coins;
    }

    @Override
    public String toString() {
        return " ticketPrice: " + ticketPrice
                + "\n numberOfTicket: " + Seats.amounts
                + "\n total: " + p
                + "\n customerCoins: " + customerCoins
                + "\n change: " + sellTicketsToCustomer();
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
        int tickets = Seats.amounts;
        int a = customerCoins;
        int prices;
        prices = tickets * ticketPrice;
        this.p = prices;

        if (tickets <= numberOfTicket && prices > customerCoins) {
            return "Error";
        } else if (tickets <= numberOfTicket && prices <= customerCoins) {
            this.numberOfCoins += Math.ceil(prices);;
            this.numberOfTicket -= tickets;
            a -= Math.ceil(prices);
            this.change = a;
            return " " + this.change;
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

}
