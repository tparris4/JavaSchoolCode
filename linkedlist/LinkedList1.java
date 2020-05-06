/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TylerP
 */
public class LinkedList1 {
    // linkList.java 
// demonstrates linked list
    // to run this program: C>java LinkListApp 
    //////////////////////////////////////////////////////////////// 
    
        public static void main(String[] args) 
        { 
          
     Scanner scan = new Scanner(System.in);
     Random rand = new Random();
      
     
     int option;
     System.out.print("Enter a option: 1 to add, 2 to remove, 3 to search, 4 to display, 5 to quit");
     option = scan.nextInt();
     
     //Switch statement is used to go through options
     boolean state = true;
     while (state == true)
     {
         switch(option){
             case 1:
                 
                 System.out.print("Type your first and last name separated by a dash: ");
                 String name = scan.nextLine(); 
                 
                System.out.print("Generating id...");
                int idnum = rand.nextInt(999) + 0;
                StudentLink newLink = new StudentLink(node);
                add(Node);
                System.out.print("Enter a option: 1 to add, 2 to remove, 3 to search, 4 to display, 5 to quit");  //prompt for a menu option
                option = scan.nextInt();   //take in input
                 break;
                 //////////////////////////
             case 2:
                 int key;
                 System.out.print("What id to remove");
                 key = scan.nextInt();
                 LinkList3.remove(key);
               System.out.print("Enter a option: 1 to add, 2 to remove, 3 to search, 4 to display, 5 to quit");   //prompt for a menu option
                option = scan.nextInt();   //take in input
                 break;
                 //////////////////////////////
                         
             case 3:
                 int key2;
                 System.out.print("What is the id you want to search");
                 LinkList3.search(key2);
                System.out.print("Enter a option: 1 to add, 2 to remove, 3 to search, 4 to display, 5 to quit");   //prompt for a menu option
                option = scan.nextInt();   //take in input
                break;
                 ////////////////////////////////////
   
             case 4:
                System.out.print("Displaying Link");
                LinkList3.toString();
                
               System.out.print("Enter a option: 1 to add, 2 to remove, 3 to search, 4 to display, 5 to quit");   //prompt for a menu option
                option = scan.nextInt();   //take in input
                break;
                ///////////////////////////////////////
             case 5:
                System.out.println("Quitting application...");  
                state = false;
                break;
            ////////////////////////////////////////
             default :
                System.out.println("Try again");  
                System.out.print("Enter a option: 1 to add, 2 to remove, 3 to search, 4 to display, 5 to quit");   //prompt for a menu option
                option = scan.nextInt();   //take in input
                break; //retries
         }
         
         
     }

     
     
     
     public static String getString() throws IOException
     {
         InputStreamReader isr = new InputStreamReader(System.in);
         BufferedReader br = new BufferedReader(isr);
         String s = br.readLine();
         return s;
      //end getString()


      // end class Link ////////////////////////////////////////////////////////////////
    }
}}

