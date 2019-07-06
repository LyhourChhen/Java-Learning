/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whileloopp;
import java.util.Scanner;
/**
 *


/**
 *
 * @author lyhourchhen
 */
public class Whileloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter n:");
        Scanner input = new Scanner(System.in);
        int inputt;
        inputt = input.nextInt();
        while (inputt>9) {
            inputt = inputt -9;
        }
        System.out.println(inputt);        
    }
}
