package BuyTickets;

import Seats.ChangeSeatStatus;
import Seats.Seats;

/*
 * <h1>TicketMachine class</h1>
 *a TicketMachine class contains six attributes, ticketPrice
 *numberOfTicket, numberOfCoins, customerCoins, price and change.
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
    /**
    *
    */
    public TicketMachine() {
        this.numberOfTicket = Seats.rows * Seats.columns;
    }
    /** Returns Prices of Tickets. 
     *
     * @return prices from calculating ticketAmount and ticketPrices
	 * @see #getPrices 
    */
    public double getPrices() {
        return ChangeSeatStatus.ticketAmounts * ticketPrice;
    }
    /** Returns Amount of Tickets. 
     *
     * @return Amount of Tickets from ChangeSeatStatus Class. 
	 * @see #getTicket 
    */
    public int getTicket() {
        return ChangeSeatStatus.ticketAmounts;
    }
    /** Returns Prices of one Ticket. 
     *
     * @return Prices of one Ticket. 
     * @see #getTicketPrice 
    */
    public int getTicketPrice() {
        return ticketPrice;
    }
    /** Returns Number of Ticket. 
     *
     * @return Number of Ticket. 
     * @see #getNumberOfTicket 
    */
    public int getNumberOfTicket() {
        return numberOfTicket;
    }
    /** Returns Number of Coins. 
     *
     * @return Number of Coins. 
     * @see #getNumberOfCoines 
    */
    public int getNumberOfCoines() {
        return numberOfCoins;
    }
    /** Returns Coins of Customer. 
     *
     * @return Coins of Customer. 
     * @see #getCustomerCoins 
    */
    public int getCustomerCoins() {
        return customerCoins;
    }
    /** Returns Changes money. 
     *
     * @return Changes money to customer. 
     * @see #getChanges
    */
    public int getChanges() {
        return this.change;
    }
    /**Set the customer's coins
     *@param coins the coins from customer
     @see #setCustomerCoins
    */
    public void setCustomerCoins(int coins) {
        this.customerCoins = coins;
    }
    /**Receive the ticket 
     *@param tickets the tickets that customer want to buy
    *@see #receiveTicketsFromAdmin
    */
    public void receiveTicketsFromAdmin(int tickets) {
        this.numberOfTicket += tickets;
    }
    /**Returns coins to Admin. 
     *
     * @return Number of coins. 
     * @see #giveAllCoinsToAdmin
    */
    public int giveAllCoinsToAdmin() {
        int a = numberOfCoins;
        this.numberOfCoins = 0;
        return a;
    }
    /**Receive the coins from customer 
     *@param coins the coins from customer
     *@see #receiveCoinsFromCustomer
    */
    public void receiveCoinsFromCustomer(int coins) {
        this.customerCoins += coins;
    }
    /**Returns Prices of Tickets and Changes. 
     *
     * @return Changes to Customer.
     * @see #sellTicketsToCustomer
    */
    public String sellTicketsToCustomer() {
        int tickets = ChangeSeatStatus.ticketAmounts;
        int coins = customerCoins;
        int prices = tickets * ticketPrice;
        this.price = prices;

        if (tickets >= numberOfTicket) {
            return "The tickets are not enough.";
        } else if (tickets <= numberOfTicket && prices > customerCoins) {
            return "Incomplete without paying another " + (prices - coins) + " Bath";
        } else if (tickets <= numberOfTicket && prices <= customerCoins) {
            this.numberOfCoins += Math.ceil(prices);
            this.numberOfTicket -= tickets;
            coins -= Math.ceil(prices);
            this.change = coins;
            return "Your change : " + this.change;
        }
        return "Error";
    }
    /**Returns Coins to Customer. 
     *
     * @return Coins to Customer.
     * @see #returnCoinsToCustomer
    */
    public int returnCoinsToCustomer() {
        int a = customerCoins;
        this.customerCoins = 0;
        return a;
    }
    /**Reset customer coins to zero
    */
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