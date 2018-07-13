/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author M.Ahsan
 */
public class Sorting {
int in;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    sortingmethods ms=new sortingmethods(4);
    
        for (int i = 0; i <ms.getmaxsize() ; i++) {
        //ms=new Mergesort(4);

        int ar=getInt(); 
       ms.getlist()[i]=ar;
            
        }
        ms.displaylist();
    
    
    };
  public static int getInt() throws IOException{
  
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
 int in=Integer.parseInt(br.readLine());
 return in;
  }  
};
