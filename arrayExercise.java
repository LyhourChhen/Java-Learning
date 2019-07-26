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
        System.out.println(" -------------------------");
        System.out.println("|Java Exercise with Array !|");
        System.out.println(" -------------------------");
        
        //Attempt to say Yes or No 
        int i = 0; 
        String confirm;
        int index = 0; 
        
        int[][] score={};

        
        do 
        {
            System.out.println("student "+ (i+1));
            System.out.print("Yes or No :");
            confirm=input.nextLine();
            if(confirm.equalsIgnoreCase("Yes")){
                System.out.println(" -------------------------");
                    System.out.print("C#:");
                    int cSharp = input.nextInt();
                    System.out.print("Java:");
                    int Java = input.nextInt();
                    System.out.print("Web:");
                    int Web = input.nextInt();
                    int Total = cSharp + Java + Web;
                    int avg = Total/ 3;
              
                    score[index][0]=input.nextInt();
                    score[index][1]=Total;
                    score[index][2]=avg;
                    index = i+1;
                System.out.println(" -------------------------");
                i++;
            }
            if(confirm.equalsIgnoreCase("No")){
                break;
            } 
        }while(i<i+1);
        
        System.out.println(" -------------------------");
        System.out.println("Std ID\t\tTotal\t\tAvg");
        System.out.println(score[1][0]+"\t\t"+score[1][1]+"\t\t"+score[1][2]);
    }
}
    
