package avsha.my_datastructures;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

public class MyStackTest {

    @Test
    public void testStackCreation() throws Exception {
        new MyStack<>(0);
    }

    @Test(expected = MyStack.StackFull.class)
    public void testExceptionWhenPushEmptyStack() throws Exception {
        MyStack<Integer> myStack = new MyStack<>(0);
        myStack.push(1);
    }

    @Test
    public void testAllowPushToNonFullStack() throws Exception {
        MyStack<Integer> myStack = new MyStack<>(1);
        myStack.push(2);
    }

    @Test(expected = MyStack.StackEmpty.class)
    public void testThrowExceptionWhenPopEmptyStack() throws Exception {
        MyStack<Integer> myStack = new MyStack<>(0);
        myStack.pop();
    }


    @Test
    public void testSinglePopLastPushedItem() throws Exception {
        MyStack<Integer> myStack = new MyStack<>(1);
        myStack.push(5);
        Assert.assertThat(myStack.pop(), is(5));
    }

    @Test
    public void testPushMultipleValsPopMultiple() throws Exception {
        MyStack<Integer> myStack = new MyStack<>(10);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        Assert.assertThat(myStack.pop(), is(4));
        Assert.assertThat(myStack.pop(), is(3));
        Assert.assertThat(myStack.pop(), is(2));
    }

    @Test(expected = MyStack.StackFull.class)
    public void testExceptionOnStackFull() throws Exception {
        MyStack<Object> myStack = new MyStack<>(2);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
    }


    @Test(expected = MyStack.StackEmpty.class)
    public void testThrowExceptionWhenNoMoreItems() throws Exception {
        MyStack<Integer> myStack = new MyStack<>(2);
        myStack.push(6);
        myStack.push(7);
        myStack.pop();
        myStack.pop();
        myStack.pop();
    }
}
