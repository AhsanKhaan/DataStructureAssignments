/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hasharray_sep_chain;

/**
 *
 * @author prompt
 */
public class HashArray_sep_chain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ht_sepchain_str.HashTable ht=new ht_sepchain_str.HashTable(10);
//    node n=new node();
  //  ht.insert(n.getdata());
           ht.insert("ahsan");
    ht.find("ahsan");
        System.out.println(ht.find("ahsan"));
        ht.display();
        // TODO code application logic here
    }
    
}
