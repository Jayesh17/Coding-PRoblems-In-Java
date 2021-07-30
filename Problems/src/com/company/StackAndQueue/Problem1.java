package com.company.StackAndQueue;

import java.util.*;

//implement stack using queue
public class Problem1 {

    LinkedList<Integer> q1 = new LinkedList<>();
    //
    public void push(int n)
    {
        q1.addLast(n);
        for (int i = 0; i < q1.size()-1; i++) {
            q1.addLast(q1.removeFirst());
        }
    }
    public int pop()
    {
        return q1.removeFirst();
    }
    public int top()
    {
        return q1.getFirst();
    }
}
