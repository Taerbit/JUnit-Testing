/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author finntorbet
 */
public class StackTest {
    Stack s;
    int compare;
    
    public StackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        s = new Stack();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testIsEmpty() {
        boolean empty = s.isEmpty();
        assertTrue("Stack is empty", empty);
    }
    
    @Test
    public void testPushSingle() {
        s.push(1);
        boolean empty = s.isEmpty();
        assertFalse("Stack is not empty, push successful", empty);
    }
    
    @Test
    public void testPopSingle() {
        s.push(54321);
        s.pop();
        boolean empty = s.isEmpty();
        assertTrue("Stack is empty", empty);
    }
    
    @Test
    public void testCorrectPopSingle() {
        s.push(404);
        compare = s.pop();
        assertEquals(404, compare);
    }
    
    @Test
    public void testCorrectPopTriple() {
        s.push(1);
        s.push(2);
        s.push(3);
        for(int i=3; i != 0; i--) {
            compare = s.pop();
            assertEquals(i, compare);
        }
    }
    
    @Test
    public void testPopEmptyStack() {
        compare = s.pop();
        assertEquals(compare, -9999);
    }
    
    @Test
    public void testTopSingle() {
        s.push(1);
        s.top();
        boolean empty = s.isEmpty();
        assertFalse("Stack is not empty, push successful", empty);
    }
    
    @Test
    public void testTopReturnSingle() {
        s.push(10);
        compare = s.top();
        assertEquals(compare, 10);
    }
    
    @Test
    public void testTopReturnTriple() {
        s.push(55);
        s.push(56);
        s.push(57);
        compare = s.top();
        assertEquals(compare, 57);
    }
    
    @Test
    public void testMultipleTop() {
        s.push(404);
        for(int i = 0; i < 5; i++) {
            compare = s.top();
            assertEquals(compare, 404);
        } 
    }
    
    @Test
    public void testTopEmptyStack() {
        compare = s.top();
        assertEquals(compare, -9999);
    }
    
    @Test
    public void testNullPush() {
        // Java won't accept null as a parameter making this test redundant
    }
    
}
