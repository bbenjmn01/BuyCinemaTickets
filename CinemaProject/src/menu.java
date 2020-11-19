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
public class menu {
    public static void main(String[] args) {
        int select;
        int select2;
        Movie m = new Movie(2);
        m.creatMovie("conan", "12.00");
         m.creatMovie("conan", "16.00");
        
        String menuStr = "1. Select Movies \n"
        +"0. exit \n";
         Scanner scn = new Scanner(System.in);
       
        System.out.println(menuStr);         
        
        do {
            System.out.print("Select menu : ");
            select = scn.nextInt();
            scn.nextLine();
            switch(select){
            case 1:
                System.out.println(m);
                 System.out.print("Select movie : ");
                  select2 = scn.nextInt();
                scn.nextLine();
                if(select2<=Movie.round&&select2>0){
                    
                }
            }
                
    }
        while(select != 0);
        }
}
        
    


