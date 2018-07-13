/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author M.Ahsan
 */
public class Stack_driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException,ArrayIndexOutOfBoundsException{
        // TODO code application logic here
       
String in;
char out =' ';
        while (true) {
            System.out.println("Enter infix");
            in=getString();
            if (in.equals("")) {
                break;
            }
          IntoPost trans=new IntoPost(in);
          out=trans.translate();
            System.out.println("Post fix is"+out);
          
        }//end while
          
          
    }

    public static String getString() throws IOException {
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s=br.readLine();
        return s;

    }

}
