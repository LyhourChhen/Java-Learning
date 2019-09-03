/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lyhourchhen
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
         System.out.println(" -------------------- ");
        System.out.println("| Hello ArrayList <3 |");
        System.out.println(" -------------------- ");
        //Array here 
        ArrayList arr = new ArrayList();
        
        //Initialize the variebles 
        String confirm;
        int i=0;
        while(true){
        System.out.println("1:add\n2:insert\n3:delete\n4:search(Index of)\n5:update\n6:sort\n7:display\n8:Exit Program");
        System.out.print("input value: ");
        int values=input.nextInt();
        switch(values){
            case 1 : 
                do {
                System.out.println("===> ADD");
                System.out.print("Please add array value :");
                int arrAdd = input.nextInt();
                arr.add(arrAdd);
                System.out.print("Do you want to repeat ? y/n :");
                confirm = input.next();
                if(confirm.equalsIgnoreCase("y")){   
                } 
                else if(confirm.equalsIgnoreCase("n")){
                    break;
                } 
                }while(true);
                break;
            case 2 : 
                do {
                System.out.println("===> Insert");
                System.out.print("Please Insert index of array :");
                int arrIndex = input.nextInt();
                System.out.print("Please Insert value of index :");
                int arrValues = input.nextInt();
                arr.add(arrIndex, arrValues);
                System.out.print("Do you want to repeat ? y/n :");
                confirm = input.next();
                if(confirm.equalsIgnoreCase("y")){   
                } 
                else if(confirm.equalsIgnoreCase("n")){
                    break;
                } 
                }while(true);
                break;
            case 3 : 
                do {
                System.out.println("===> Delete");
                System.out.print("Delete array value :");
                int indexx = input.nextInt();
                arr.remove(indexx);
                System.out.print("Do you want to repeat ? y/n :");
                confirm = input.next();
                if(confirm.equalsIgnoreCase("y")){   
                } 
                else if(confirm.equalsIgnoreCase("n")){
                    break;
                } 
                }while(true);
                break;
                
            case 7 :
                 System.out.println("===> Display <===");
                 System.out.println(arr);
                 break;
        }
        
        
        }
    }
    
}
