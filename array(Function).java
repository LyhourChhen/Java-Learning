
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lyhourchhen
 */
public class AArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin=new Scanner(System.in);
        int i = 0,k=0,index=0;
        int[] x=new int[66];
        boolean exit=true;
        int c;
        while(exit)
        {

            System.out.println("\n1.Add\n2.Insert\n3.Update\n4.Delete\n5.Display\n6.Sort\n7.Search\n8.Exit\nChoice");

            c=cin.nextInt();
            
            switch(c)
            {
                case 1:
                        
                        System.out.print("x["+i+"]:");
                        x[i]=cin.nextInt();
                        i++;
                        k++;
                        break;
                case 2:
                       System.out.print("Input Index:"); 
                       index=cin.nextInt();
                       k++;
                       for(int j=k;j>index;j--)
                       {
                           x[j]=x[j-1];
                       }
                       System.out.print("Input x["+index+"]:");
                       x[index]=cin.nextInt();
                       System.out.println("--------------------");
                       for(i=0;i<k;i++)
                       {
                           
                          System.out.println("Input x["+i+"]:"+x[i]); 
                       }
                       break;
                case 3:
                         System.out.println("1.Update by Index :\n2.Update by Value:"); 
                         int updatechoice=cin.nextInt();
                         if (updatechoice==1)
                         {
                            System.out.print("Input Index u want to update:");
                            System.out.print("Input x["+index+"]:");
                            x[index]=cin.nextInt();
                            
                            System.out.println("--------------------");
                            for(i=0;i<k;i++)
                               {

                             System.out.println("Input x["+i+"]:"+x[i]);
                                break;
                               }
                         }
                         if (updatechoice==2){
                            System.out.print("Input number u want to update:");
                            int search=cin.nextInt();
                            k++;
                            for(i=index;i<k;i++)
                            {
                                x[1]=x[i+1];
                            }
                            System.out.print("Update");
                            break;
                         }
                         break;
                            
                case 4:
                        System.out.println("1.Delete by Index :\n2.Delete by Value:"); 
                        System.out.print("Choice:");
                        int ch=cin.nextInt();
                        if(ch==1)
                        {
                            System.out.print("Input Index:"); 
                            index=cin.nextInt();
                            k--;
                            for(i=index;i<k;i++)
                            {
                                x[i]=x[i+1];
                            }
                            System.out.print(" Deleted:");
                        }
                        if(ch==2)
                        {
                            boolean t=false;
                            System.out.print("Input Value:");
                            int search=cin.nextInt();
                            for(i=0;i<k;i++)
                            {
                                if(search==x[i])
                                {
                                   k--;
                                   for(int j=i;j<k;j++)
                                    {
                                        x[j]=x[j+1];
                                    } 
                                   System.out.print(" Deleted:");
                                   t=true;
                                   break;
                                }

                            }
                            if(t==false)
                            {
                                System.out.print(" not Found");
                            }
                        
                        }
                        break;       
                case 5:
                        
                        for(i=0;i<k;i++)
                       {
                          System.out.print(x[i]+"\t");  
                       }
                        break;
                case 6:
                        int temp=0;
                        for(i=0;i<k;i++)
                        {
                            for(int j=i+1;j<=3
                                    ;j++)
                            {
                                if(x[i]<x[j])
                                {
                                    temp=x[i];
                                    x[i]=x[j];
                                    x[j]=temp;    
                                }      
                            }
                            System.out.print(x[i]+"\t");  
                        }
                        break;
                case 7:
                        boolean t=false;
                        System.out.print("Input the Value to Seacrh:"); 
                        int search=cin.nextInt();
                        for(i=0;i<k;i++)
                        {
                            if(search==x[i]
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lyhourchhen
 */
public class AArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner cin=new Scanner(System.in);
        int i = 0,k=0,index=0;
        int[] x=new int[66];
        boolean exit=true;
        int c;
        while(exit)
        {

            System.out.println("\n1.Add\n2.Insert\n3.Update\n4.Delete\n5.Display\n6.Sort\n7.Search\n8.Exit\nChoice");

            c=cin.nextInt();
            
            switch(c)
            {
                case 1:
                        
                        System.out.print("x["+i+"]:");
                        x[i]=cin.nextInt();
                        i++;
                        k++;
                        break;
                case 2:
                       System.out.print("Input Index:"); 
                       index=cin.nextInt();
                       k++;
                       for(int j=k;j>index;j--)
                       {
                           x[j]=x[j-1];
                       }
                       System.out.print("Input x["+index+"]:");
                       x[index]=cin.nextInt();
                       System.out.println("--------------------");
                       for(i=0;i<k;i++)
                       {
                           
                          System.out.println("Input x["+i+"]:"+x[i]); 
                       }
                       break;
                case 3:
                         System.out.println("1.Update by Index :\n2.Update by Value:"); 
                         int updatechoice=cin.nextInt();
                         if (updatechoice==1)
                         {
                            System.out.print("Input Index u want to update:");
                            System.out.print("Input x["+index+"]:");
                            x[index]=cin.nextInt();
                            
                            System.out.println("--------------------");
                            for(i=0;i<k;i++)
                               {

                             System.out.println("Input x["+i+"]:"+x[i]);
                                break;
                               }
                         }
                         if (updatechoice==2){
                            System.out.print("Input number u want to update:");
                            int search=cin.nextInt();
                            k++;
                            for(i=index;i<k;i++)
                            {
                                x[1]=x[i+1];
                            }
                            System.out.print("Update");
                            break;
                         }
                         break;
                            
                case 4:
                        System.out.println("1.Delete by Index :\n2.Delete by Value:"); 
                        System.out.print("Choice:");
                        int ch=cin.nextInt();
                        if(ch==1)
                        {
                            System.out.print("Input Index:"); 
                            index=cin.nextInt();
                            k--;
                            for(i=index;i<k;i++)
                            {
                                x[i]=x[i+1];
                            }
                            System.out.print(" Deleted:");
                        }
                        if(ch==2)
                        {
                            boolean t=false;
                            System.out.print("Input Value:");
                            int search=cin.nextInt();
                            for(i=0;i<k;i++)
                            {
                                if(search==x[i])
                                {
                                   k--;
                                   for(int j=i;j<k;j++)
                                    {
                                        x[j]=x[j+1];
                                    } 
                                   System.out.print(" Deleted:");
                                   t=true;
                                   break;
                                }

                            }
                            if(t==false)
                            {
                                System.out.print(" not Found");
                            }
                        
                        }
                        break;       
                case 5:
                        
                        for(i=0;i<k;i++)
                       {
                          System.out.print(x[i]+"\t");  
                       }
                        break;
                case 6:
                        int temp=0;
                        for(i=0;i<k;i++)
                        {
                            for(int j=i+1;j<=3
                                    ;j++)
                            {
                                if(x[i]<x[j])
                                {
                                    temp=x[i];
                                    x[i]=x[j];
                                    x[j]=temp;    
                                }      
                            }
                            System.out.print(x[i]+"\t");  
                        }
                        break;
                case 7:
                        boolean t=false;
                        System.out.print("Input the Value to Seacrh:"); 
                        int search=cin.nextInt();
                        for(i=0;i<k;i++)
                        {
                            if(search==x[i])
                            {
                                System.out.print("data search is in Index:"+i); 
                                t=true;
                                break;
                            }
                        }
                        if(t==false)
                        {
                            System.out.print("Not Found 404"); 
                        }
                        break;
                case 8:
                        exit=false;
                        break;
                        
            }
        }
     }
    
})
                            {
                                System.out.print("data search is in Index:"+i); 
                                t=true;
                                break;
                            }
                        }
                        if(t==false)
                        {
                            System.out.print("Not Found 404"); 
                        }
                        break;
                case 8:
                        exit=false;
                        break;
                        
            }
        }
     }
    
}
