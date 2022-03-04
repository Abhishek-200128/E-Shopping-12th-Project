/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Computers;

import java.util.Scanner;

/**
 *
 * @author Abhishek
 */

public class NewClass{
    static int suv(int km){
        int price=0;
        if(km<=5){
            price=100;
        }
        else if(km<=20){
            price=100+15*(km-5);
        }
        else{
            price=325+12*(km-20);
        }
        return price;
}
    
static int sedan(int km){
        int price=0;
        if(km<=5){
            price=80;
        }
        else if(km<=20){
            price=80+12*(km-5);
        }
        else if(km>100){
            price=10*km;
        }
        else{
            price=260+10*(km-20);
        }
        return price;
}

static int mini(int km){
        int price=0;
        if(km<=3){
            price=50;
        }
        else if(km<=18){
            price=50+10*(km-3);
        }
        else if(km>75){
            price=8*km;
        }
        else{
            price=200+8*(km-18);
        }
        return price;
}
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in); 
        int km=sc.nextInt();
        int mini=mini(km);
        int suv=suv(km);
        int sedan = sedan(km);
        System.out.println("Mini - Rs."+mini+", Sedan - Rs."+sedan+", SUV - Rs."+suv);
    }
    
}
