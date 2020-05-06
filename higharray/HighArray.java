/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package higharray;
import java.util.Arrays;
import java.util.*;
/**
 *
 * @author TylerP
 */

// highArray.java // demonstrates array class with high-level interface 
// to run this program: C>java HighArrayApp 
//////////////////////////////////////////////////////////////// 
class HighArray { 
    private long[] a; //ref to array a 
    private int nElems; // number of data items 
//----------------------------------------------------------
public HighArray(int max)         
// constructor 
{ 
a = new long[max]; // create the array
nElems = 0;     // no items yet
}                 

//----------------------------------------------------------
public boolean find(long searchKey) 
{                              // find specified value 
int j; 
for(j=0; j<nElems; j++)            // for each element, 
    if(a[j] == searchKey)           // found item?
        break;                       // exit loop before end 
    if(j == nElems)                    // gone to end? 
       return false;                   // yes, can’t find it 
    else
        return true;                    // no, found it 
    }  // end find() 
//----------------------------------------------------------
public void insert(long value)    // put element into array
{
a[nElems] = value;             // insert 
nElems++;                      // increment size
//----------------------------------------------------------
}
public boolean delete(long value) 
{
int j; 
for(j=0; j<nElems; j++)        // look for it if( value == a[j] ) 
if( value == a[j] ) 
    break; 
if(j == nElems)                  // can’t find it 
    return false; 
else                           // found it 
{ 
        for(int k=j; k<nElems; k++) // move higher ones down
        a[k] = a[k+1]; 
        nElems--;                   // decrement size 
        return true; 
    } //end delete()
}

public String toString(int arr[])
{
  String StringArray = ""; 
  for (int i = 0; i < arr[i-1]; i++)
  {
      StringArray += Integer.toString(i);
  }
 //String StrArray = Arrays.toString(arr);
 return StringArray;
}
}

  
//----------------------------------------------------------


