package Menu;

import BuyTickets.BuyTickets;
import Seats.Seats;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Benjamin
 */
public class Menu {

    public static void main(String[] args) {
        Seats s1 = new Seats(10, 10);
        
        BuyTickets b1 = new BuyTickets();
        b1.buy(1,1);
        b1.buy(9,9);
        b1.buy(9,9);
        b1.buy(1,1);
        b1.buy(9,9);
        b1.buy(9,9);
        System.out.println(b1.toString());
        System.out.println(s1);
    }

}
