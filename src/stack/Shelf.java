/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 * Node class for containing data elements of the stack
 * @author finntorbet
 */
public class Shelf {
    int data;
    Shelf below;
    
    public Shelf(int x, Shelf prevItem) {
        data = x;
        below = prevItem;
    }
}
