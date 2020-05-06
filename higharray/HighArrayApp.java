/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package higharray;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author TylerP
 * CS3810 Data Structures and Algorithms
 * Fall 2017
 * Assignment 1 (Java application class)
 * 10/09/2017
 */
public class HighArrayApp 
{
    public static void main(String[] args)
    {
        
        Scanner scan = new Scanner(System.in);
        int maxsize;   //initialize array size
        System.out.println("What is the max size of the array");  //prompt for size of the array
        maxsize = scan.nextInt();   // maxsize is set to chosen number
        HighArray arr;   //reference to HighArray
        arr = new HighArray(maxsize);   //set array to size chosen
        
        int option;    //initialize menu option
        System.out.println("Choose a menu option: 1 for insert, 2 for remove, 3 for search, 4 for display, 5 for quit");   //prompt for a menu option
        option = scan.nextInt();   //take in input
        
        boolean state = true;  
        while (state == true){  //loop while quit isn't selected
        ///////////////////////////////////////
        switch(option){   
            case 1 :
                int insertElem;    //initialize insertElem
                System.out.println("Which element do you want to insert?");    //prompt for element to insert
                insertElem = scan.nextInt();  //take in input
                arr.insert(insertElem);   //call insert method and insert element
                System.out.println("Choose a menu option: 1 for insert, 2 for remove, 3 for search, 4 for display, 5 for quit");   //prompt for a menu option
                option = scan.nextInt();   //take in input
                break;
                ////////////////////
            case 2 :
                int removeElem;         //initialize removeElem
                System.out.println("Which element do you want to remove?");  //prompt for element to remove
                removeElem = scan.nextInt();  //take in input
                arr.delete(removeElem);     //call delete method and remove element
                System.out.println("Choose a menu option: 1 for insert, 2 for remove, 3 for search, 4 for display, 5 for quit");   //prompt for a menu option
                option = scan.nextInt();   //take in input
                break;
                ///////////////////
            case 3 :
                int searchElem;         //initialize searchElem
                System.out.println("Which element do you want to search?");    //prompt for element to search
                searchElem = scan.nextInt();  //take in input
                if ( arr.find(searchElem))    //if element found is true
                    System.out.println("Found " + searchElem);   //confirm element was found
                else
                    System.out.println("Can't find " + searchElem);  //decofirm element was found
                System.out.println("Choose a menu option: 1 for insert, 2 for remove, 3 for search, 4 for display, 5 for quit");   //prompt for a menu option
                option = scan.nextInt();   //take in input
                break;
                /////////////////
            case 4 :
                System.out.println("Displaying array..."); 
                String StrArray = arr.toString();    //display array
                System.out.println(StrArray); 
                System.out.println("Choose a menu option: 1 for insert, 2 for remove, 3 for search, 4 for display, 5 for quit");   //prompt for a menu option
                option = scan.nextInt();   //take in input
                break;
                ////////////////////////////
            case 5 :
                System.out.println("Quitting application...");  
                state = false;
                break;   //quit application
                /////////////////////
            default :
                System.out.println("Try again");  
                System.out.println("Choose a menu option: 1 for insert, 2 for remove, 3 for search, 4 for display, 5 for quit");   //prompt for a menu option
                option = scan.nextInt();   //take in input
                break; //retries
                /////////////////////////////////////
                
        }
    }
}
}