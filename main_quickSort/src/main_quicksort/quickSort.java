/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main_quicksort;

import static sun.nio.cs.Surrogate.high;

/**
 *
 * @author Ramish
 */
public class quickSort {
   private int[] array;
    private int nItems;
    
public quickSort(){

}
    public quickSort( int nItems) {
        this.array = new int[nItems];
        this.nItems = 0;
    }

    
    public void insert(){
    array= new int[]{4,5,1,2,6,7};
    nItems=6;
    }
    public void display(){
        int ch=nItems;
        for (int i = 0; i < ch; i++) {
        System.out.println(" item is"+ array[i]);
        
    }
    }
    public void QuickSorted(){
    recquicksort(0,nItems-1);
 
    }
    public void recquicksort(int left,int right){
        
        if(right-left<=0){
            System.out.println("SORTED.....");
        return;
        }
        else{
            int pivot=array[right];
            //int partition=partitioned(left,right,pivot);
            int partition=part(left,right);
            recquicksort(left, partition-1); // sort left side
System.out.println("//////"+array[partition]);
            recquicksort(partition+1, right); // sort right side

        
        }
        
    }

//    public int partitioned(int left, int right, int pivot)
//{
//int leftPtr = left-1; // left (after ++)
//int rightPtr = right; // right-1 (after --)
//while(true)
//{ // find bigger item
//while( array[++leftPtr] < pivot ); // (nop)
//// find smaller item
//while(rightPtr > 0 && array[--rightPtr] > pivot); // (nop)
//if(leftPtr >= rightPtr) // if pointers cross,
//break; // partition done
//else // not crossed, so
//swap(leftPtr, rightPtr); // swap elements
//} // end while(true)
//swap(leftPtr, right); // restore pivot
//System.out.println("on index of leftptr"+array[leftPtr]);
//return leftPtr; // return pivot location
//} // end partitionIt()
    public void swap(int dex1, int dex2) // swap two elements
{
int temp = array[dex1]; // A into temp
array[dex1] = array[dex2]; // B into A
array[dex2] = temp; // temp into B
} // end swap(

  public int part(int low,int high){
      System.out.println("in part, low is "+low+"high is "+high);
      int p=array[high];
      System.out.println(" pivot is "+p);
  int i=low-1;
      for (int j = low; j < high-1; j++) {
          System.out.println("in for loop");
          if(array[j]<=p){
              System.out.println("in if condition:"+array[j]+"pivot is"+p);
              
              i++;
              swap(i,j);
              System.out.println("after swap 1:"+array[i]+","+array[j]);
                      
          }
      
          swap(i++,high);
          
              System.out.println("after swap 1:"+array[i]+","+array[high]);
      }
      return i+1;
      }
   
  }





  

    
    
