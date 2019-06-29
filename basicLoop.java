/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.pkgswitch;

import java.util.Scanner;
 /*
 * @author lyhourchhen
 */
public class ExerciseSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter n Time:");
        int time = input.nextInt();
        int i;
        int sumTotal = 0;
        for(i=1;time>=i;i++){
            
            System.out.print("\n\nProduct"+i);
            System.out.print("\nEnter price:");
            int price = input.nextInt();
            System.out.print("QTY :");
            int qty = input.nextInt();
            int total = price * qty;
            System.out.print("Total:"+total);
            sumTotal += total;
            }
        System.out.print("Enter your product type :");
        String productType = input.next();
        int tax;
        int TotalTotal;
        if(productType.equalsIgnoreCase("beer"))
        {
            tax = sumTotal*20/100;
            TotalTotal = sumTotal + tax;
        } else{
            
            tax = sumTotal*10/100;
            TotalTotal = sumTotal + tax;  
        }       
        System.out.print("\nsub-total:"+sumTotal);
        System.out.print("\nTotal tax:"+tax);
        System.out.print("\nOverall total:"+TotalTotal+"\n");
    }
}
