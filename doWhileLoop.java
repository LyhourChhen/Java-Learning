/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloop;
import java.util.Scanner;
/**
 *
 * @author lyhourchhen
 */
public class DoWhileLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int i;
        String confirm;
        
        i=0;
        do 
        {
            System.out.println("student "+ (i+1));
            System.out.println("Yes or No :");
            confirm=input.nextLine();
            if(confirm.equalsIgnoreCase("Yes")){
                i++;
            }
            if(confirm.equalsIgnoreCase("No")){
                break;
            } 
            else{
                System.out.println("student "+ (i+1));
            }
        }while(i<i+1);
    }
    
}
