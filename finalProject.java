/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayList;
import java.util.*;

/**
 *
 * @author lyhourchhen
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(" -------------------- ");
        System.out.println("| Hello ArrayList <3 |");
        System.out.println(" -------------------- ");
        Scanner input=new Scanner(System.in);
        //initialize an array 
        java.util.ArrayList arr = new java.util.ArrayList();
        
        do{
            System.out.println("1:add\n2:insert\n3:delete\n4:search(Index of)\n5:sort\n6:update\n7:display\n8:Exit Program");
            System.out.print("Enter your options : ");
            int options = input.nextByte();
            switch(options)
            {
                case 1:
                    System.out.println("--> ADD <--");
                    System.out.print("Add array value : ");
                    int addArray = input.nextInt();
                    arr.add(addArray);
                    break;
                case 2: 
                    System.out.println("--> Insert <--");
                    if(arr.isEmpty()){
                        System.out.println("Please add any array value !");
                    } else {
                        System.out.print("Enter index of array you want to insert : ");
                        int arrIndex = input.nextByte();
                        System.out.print("Enter value of array you want to insert : ");
                        int arrValue = input.nextInt();
                        arr.add(arrIndex, arrValue);
                        System.out.println("Insert successfully!");
                    }
                
                    break;
                case 3:
                    System.out.println("--> Delete <--");
                    if(arr.isEmpty()){
                        System.out.println("Please add any array value !");
                    } else {
                        System.out.print("Enter index of array you want to insert : ");
                        int deleteIndex = input.nextByte();
                        arr.remove(deleteIndex);
                        System.out.println("Delete successfully!");
                    }
                    break;
                case 4:
                    System.out.println("--> Serch by index <--");
                    if(arr.isEmpty()){
                        System.out.println("Please add any array value !");
                    } else {
                        System.out.print("Enter index of array you want to search : ");
                        int searchIndex = input.nextByte();
                        System.out.println("Index of" + searchIndex +" = "+ arr.get(searchIndex));         
                    }
                    break;
                case 5:
                    if(arr.isEmpty()){
                        System.out.println("Please add any array value !");
                    } else {
                        System.out.println("--> sort <--");
                        System.out.print("\n1.Ascending Sorting\n2.Descending Sorting\n");
                        System.out.print("Choice:");
                        int ch = input.nextByte();
                        if(ch == 1){
                            Collections.sort(arr);
                            System.out.println(arr);
                        }
                        if(ch == 2){
                            Collections.reverse(arr);
                            System.out.println(arr);
                        }    
                    }
                    break;
                case 6:
                    if(arr.isEmpty()){
                        System.out.println("Please add any array value !");
                    } else {
                        System.out.println("--> Update <--");
                        System.out.print("Enter index of array you want to update: ");
                        int update = input.nextByte();
                        System.out.println("Old value of this index : "+ arr.get(update));
                        System.out.print("Enter value :");
                        int value = input.nextInt();
                        arr.set(update, value);
                    }
                    break;
                case 7:
                    System.out.println("This is the result => " + arr);
                    break;
                case 8:
                    System.out.println("Program terminated....");
                    System.exit(0);
                default:
                    System.out.println("Your options is invalid :(");
            }
            
        } while(true);
    }
    
}
