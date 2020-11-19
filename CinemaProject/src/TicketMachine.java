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
    private double ticketPrice = 120;
    private int numberOfTicket;
    private int numberOfCoins;
    private int customerCoins;
    
    public TicketMachine(){
        this.numberOfTicket=Seats.amounts;
        Seats.resetAmounts();
    }
    
    public int getNumberOfCoines(){
        return numberOfCoins;
    }
    
    public int getCustomerCoins(){
        return customerCoins;
    }

    @Override
    public String toString() {
        return "TicketMachine{" + "ticketPrice: " + ticketPrice + ", numberOfTicket: " + numberOfTicket + ", numberOfCoins: " + numberOfCoins + ", customerCoins: " + customerCoins + '}';
    }
    
    public void receiveTicketsFromAdmin(int tickets){
        this.numberOfTicket += tickets;
    }
    
    public int giveAllCoinsToAdmin(){
        int a = numberOfCoins;
        this.numberOfCoins=0;
        return a;
        
    }
    
    public void receiveCoinsFromCustomer(int coins){
        this.customerCoins += coins;
    }
    
    public int sellTicketsToCustomer(int tickets){
        int a = customerCoins;
        double prices; 
        prices = tickets * ticketPrice;
        if(tickets<=numberOfTicket&&prices>customerCoins){
            return -2;
        }
        
        else if(tickets<=numberOfTicket&&prices<=customerCoins){
            this.numberOfCoins += Math.ceil(prices);;
            this.numberOfTicket -= tickets;
            this.customerCoins = 0;
            return a -= Math.ceil(prices); 
        }
        return -1;
    }

    
    public int returnCoinsToCustomer(){
        int a = customerCoins;
        this.customerCoins=0;
        return a;
    }
}
