/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ht_sepchain_str;

/**
 *
 * @author M.Ahsan
 */
public class Hashset {
    public static void main(String[] args) {
    HashTable ht=new HashTable(10);
//    node n=new node();
  //  ht.insert(n.getdata());
           
    ht.find("ahsan");
        System.out.println(ht.find("ahsan"));
        ht.display();
    }
    
};
