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
        
        System.out.println("Enter stID:");
        int id = input.nextInt();
        
        System.out.println("Enter a Name: ");
        String n = input.next();
        //String with space [Name input]
        n+=input.next();
        
        System.out.println("Enter age:");
        int age = input.nextInt();
        
        System.out.println("Major : \n1:MIS\n2:BIT\n3:Design");
        
        System.out.println("Enter Major: ");
        String major = input.next();
        
        //String Format
        String idd = String.format("%03d",id);
        
        
        switch(major){
            case "MIS" : System.out.println("-------------------------------------");
                         System.out.println("StID    Name    Age    Major    Price");
                         System.out.println(idd +"\t"+ n +"\t"+ age +"\t"+ "MIS" +"\t"+ "780");
                         break;
            case "BIT" : System.out.println("-------------------------------------");
                         System.out.println("StID    Name    Age    Major    Price");
                         System.out.println(idd +"\t"+ n +"\t"+ age +"\t"+ "BIT" +"\t"+ "780");
                         break;
            case "Design" : System.out.println("-------------------------------------");
                         System.out.println("StID    Name    Age    Major    Price");
                         System.out.println(idd +"\t"+ n +"\t"+ age +"\t"+ "Design" +"\t"+ "1080");
                         break;    
            default:
                System.out.println("You choose invalid option!");
                break;
        }
    }
    
}
