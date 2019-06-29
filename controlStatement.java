/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main.java;

import java.util.Scanner;
/**
 *
 * @author lyhourchhen
 */
public class main.java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        // TODO code application logic here
        System.out.println("Exercise 2");
        String color;
        System.out.print("Enter your color :");
        color=cin.nextLine();

        int amount;
        System.out.print("Enter amount of car :");
        amount=cin.nextInt();
        int eva;
        int total;
        int totalRed;
        int totalGold;
        int tax;


        if(color.equalsIgnoreCase("White")){
            System.out.print("You successfully purchase White color.");
            eva=amount * 20000;
            tax=eva*10/100;
            total=eva+tax;
            System.out.println("\nTotal: "+total);}

        else if(color.equalsIgnoreCase("Red")){
            System.out.print("You successfully purchase Red color.");
            eva=amount * 18000;
            tax=eva*10/100;
            totalRed=eva+tax;
            System.out.println("\nTotal: "+totalRed);}

        else if(color.equalsIgnoreCase("Gold")){
            System.out.print("You successfully purchase Gold color.");
            eva=amount * 19000;
            tax=eva*10/100;
            totalGold=eva+tax;
            System.out.println("\nTotal: "+totalGold);}

        else{
            System.out.print("Unknow Color");
        }
    }

}
