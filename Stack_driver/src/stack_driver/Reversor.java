/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_driver;

/**
 *
 * @author M.Ahsan
 */
public class Reversor {

    private String input;
    private String output;

    public Reversor(String in) {
        this.input = in;
        this.output = "";

    }

    public String DoRev() {
        int Stacksize = input.length();//taking a length of stack from input stream
        StackX stack = new StackX(Stacksize);
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);//taking char from input
            stack.push(ch);//push char from input()
        }
        while (!stack.Isempty()) {//untill stack is not emphty pop the value and saved in string output
            char ch = stack.pop();//pop the char
            this.output = this.output + ch;//append(khury rehna)out put py

        }
        return this.output;
    }
}
