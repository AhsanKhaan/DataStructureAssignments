/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trie;

import java.util.HashMap;

/**
 *
 * @author Ramish
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
Dictionary d=new Dictionary();
d.insert("anas");
d.insert("antik");
d.insert("sana");
d.insert("danial");
d.insert("bilal");
d.insert("danmark");
boolean i=d.search("danial");
        System.out.println(i);
        
                
        


        // TODO code application logic here
    }
    
}
