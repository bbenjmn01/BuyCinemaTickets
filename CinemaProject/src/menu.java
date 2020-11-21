/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author WIN10PRO
 */
public class Menu {
    public static void main(String[] args) {
        int select;
        int select2;
        int row;
        int column;
        int select3;
        int coi;
        
        Movie m = new Movie(2);
        
        m.creatMovie("conan", "12.00");
         m.creatMovie("conan", "16.00");
        
        String menuStr = "1. Select Movies \n"
        +"0. exit \n";
         Scanner scn = new Scanner(System.in);
 
        do {
            System.out.println(menuStr);  
            System.out.print("Select menu : ");
            select = scn.nextInt();
            scn.nextLine();
            switch(select){
            case 1:
                System.out.println(m);
                 System.out.print("Select movie : ");
                  select2 = scn.nextInt();
                scn.nextLine();
                if(select2<=Movie.movieRound&&select2>0){
                    Seats s = new Seats();
                    System.out.println(s);
                     do{
                        System.out.print("Select your seat (row) : ");
                        row = scn.nextInt();
                        System.out.print("Select your seat (column) : ");
                        column = scn.nextInt();
                        scn.nextLine();
                        s.buy(row, column);
                        String Sele3 = "Do you want more?\n"
                        +"Press 0 = No \n"
                        +"Press 1 = Yes \n"
                        +"Press : = ";
                        System.out.print(Sele3);
                        select3 = scn.nextInt();
                        }
                        while(select3 == 1);
                     System.out.println(s);
                     
                     TicketMachine t = new TicketMachine();
                     System.out.println("TicketPrice : " + t.getTicketPrice());
                     System.out.println("Ticket: " + t.getTicket());
                     System.out.println(t.getPrices());
                     System.out.println("Enter you coins: ");
                     coi = scn.nextInt();
                     t.setCustomerCoins(coi);
                     t.sellTicketsToCustomer();

                     System.out.println("\n"+t+"\n");
                     Seats.resetAmounts();
                    
                }
            }
                
    }
        while(select != 0);
        }
}
        
    


