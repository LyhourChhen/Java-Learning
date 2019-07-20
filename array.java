/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaarray;

import java.util.Scanner;

/**
 *
 * @author lyhourchhen
 */
public class JavaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student score :");
        //Array to scope the score 
       int i;
       String confirm;
       i=0;
       int index=0;
        do 
        {
            System.out.println("student "+ (i+1));
            System.out.println("Yes or No :");
            confirm=input.nextLine();
            if(confirm.equalsIgnoreCase("Yes")){
                i++;
                    System.out.print("C#:");
                    int cSharp = input.nextInt();
                    System.out.print("Java:");
                    int Java = input.nextInt();
                    System.out.print("Web:");
                    int Web = input.nextInt();
                    int Total = cSharp + Java + Web;
                    int avg = Total/ 3;
                    int[] x=new int[2];
                    x[0]=Total;
                    x[1]=avg;
                    index = i+1;
            }
            if(confirm.equalsIgnoreCase("No")){
                System.out.println("------------------");
                System.out.println("Student\t\tTotal\tAversge");
                System.out.println(index);
                
                break;
            } 
            else{
                System.out.println("student "+ (i+1));
            }
        }while(i<i+1);
    }
        
        
        
}
    
