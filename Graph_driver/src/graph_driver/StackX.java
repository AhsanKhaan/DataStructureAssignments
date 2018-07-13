/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graph_driver;

/**
 *
 * @author M.Ahsan
 */
public class StackX {

    private int[] st;
    private final int size;
    private int top;

    public StackX() {
        this.size = 20;
        this.top = -1;
        this.st = new int[this.size];
    }

    public void push(int val) {
        this.st[++this.top] = val;
    }

    public int peek() {
        return this.st[top];
    }

    public int pop() {
        return this.st[top--];
    }

    public boolean isEmphty() throws NullPointerException{
        return (this.top == -1);
    }
    public int gettop(){
    return this.top;
    }
      
};
