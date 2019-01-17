/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dundee;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author finntorbet
 */
public class ListTest {
    List l;
    
    public ListTest() {
    }
    
    @Before
    public void setUp() {
        l = new List();
    }
    
    @Test
    public void testIsEmpty() {
        boolean empty = l.isEmpty();
        assertTrue("List is not empty", empty);
    }
    
    @Test
    public void testAddElement() {
        l.add(1234);
        assertNotNull("Element not added", l.start);
        assertEquals(l.start.data, 1234);
    }
    
    @Test
    public void testPrint() {
        l.add(1);
        l.add(2);
        l.print();
    }
}
