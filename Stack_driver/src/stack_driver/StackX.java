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
public class StackX {

    private int maxsize;
    private char[] stackarray;
    private int top;

    public StackX(int maxSize) {
        this.maxsize = maxSize;
        this.stackarray = new char[(maxSize)];
        this.top = -1;

    }

    public void push(char value) {
        this.stackarray[++top] = value;//we use pre-increment because after pushing top=-1
    }                                   //become top=0 points second index 

    public char pop() {
        return ((this.stackarray[top--]));

    }                       //we use post increment because top=1 points 3rd index
    //after [t0p--] the value becomes top=0points 2nd index

    public char peak() {
        if (top != -1) {
         return   (this.stackarray[top]);
        }
        return ('E');
    }

    public boolean Isempty() {
        return (top == -1);
    }

    public boolean Isfull() {
        return (top == maxsize - 1);
    }
    public int Size(){
    return (top);
    }

    @Override
    public String toString() {
       

        String result = "";
        if (top == -1) {
            result = "Stack is emphty";
        } else {
            for (int i = 0; i <stackarray.length ; i++) {
                
                result += stackarray[i]+"\t";
                
            }
        }
        return result;
    }

};
