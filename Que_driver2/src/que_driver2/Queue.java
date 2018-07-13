/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package que_driver2;

/**
 *
 * @author M.Ahsan
 */
public class Queue {

    private int maxsize;
    private int[] que;
    private int front;
    private int rear;

    public Queue(int size) {
        this.maxsize = size;//array is larger than 1
        this.que = new int[size];
        this.front = 0;
        this.rear = -1;
    }

    public int displayfront() {
        if ((front == 0) && (rear == -1)) {

            return que[front];
        } else {
            return this.que[front];
        }
    }

    public int displayrear() {
        if ((front != 0) && (rear != -1)) {
            return que[front];
        } else {
            return this.que[rear];
        }
    }

    public void enque(int number) {
        if (rear == maxsize - 1) {

            System.out.println("que is full");
        } else {
            que[++rear] = number;
        }
    }

    public int deque() {
        if ((front == 0) && (rear == -1)) {
            return que[front];
        } else {
            return que[++front];
        }
    }

    public boolean isEmpty() {
        while ((front == 0) && (rear == -1)) {

            return true;

        }
        return false;
    }

    public void isFull() {
        if (rear == maxsize - 1) {
            System.out.println("Que is Full");
        }else
        {System.out.println("que empty");}
    }

    public String displayque() {
        String result = "";
        if ((que[front] == 0) && (que[rear] == 0)) {
            result += "QUe is Empty";

        } else {

            System.out.println("Que:");

            for (int i = front; i <= rear; i++) {

                result += que[i]+" ";
            }
        }

        return result;
    }
};
