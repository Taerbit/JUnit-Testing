/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 * A stack data structure for integers
 * @author finntorbet
 */
public class Stack {
    int size;
    Shelf top;
    
    public Stack() {
        //sets size to 0 on initalise, Stack is empty
        size = 0;
        top = null;
    }
    
    public boolean isEmpty() {
        if(size == 0) {
            return true;
        } else {
            return false;
        }
    }
    
    public void push(int x) {
        Shelf s = new Shelf(x, top);
        size++;
        top = s;
    }
    
    public int pop() {
        if(top == null) {
            System.out.println("Pop failed: Stack already Empty");
            return -9999; //Default error message, open to error if the object being popped is also -9999
        } else {
            int old = top.data;
            top = top.below;
            size--;
            return old;
        }
    }
    
    public int top() {
        if(top != null){
            return top.data;
        } else {
            return -9999;
        }
    }
    
}
