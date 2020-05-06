/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;
import java.util.Scanner;
import java.util.Random;
import linkedlist.Node;
/**
 *
 * @author TylerP
 */
public class StudentLink {
Scanner scan = new Scanner(System.in);
Random rand = new Random();
public String name;
public int idnum;

    /**
     * @param args the command line arguments
     */
   public StudentLink(String name, int idnum)
   {
     this.name = name;
     this.idnum = idnum;
    
    }

    StudentLink(Node newNode) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getName()
    {
        return name;
    }
    public int getID()
    {
        return idnum;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setId(int idnum)
    {
        this.idnum = idnum;
    }
    
    @Override
   public String toString(){
        return "Name: " + this.name + " Id number is: " +
                this.idnum;
    }
}
