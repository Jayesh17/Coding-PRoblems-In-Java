package com.company.StackAndQueue;

import java.util.LinkedList;

//implement queue using stack.
//Optimal : T(1) - amortised because few number of times we have O(n) , S(2N)
public class Problem2 {
    LinkedList<Integer> input = new LinkedList<>();
    LinkedList<Integer> output = new LinkedList<>();

    public void push(Integer n)
    {
        input.addLast(n);
    }
    public Integer pop()
    {
        if(output.isEmpty())
        {
            while (!input.isEmpty()) {
                output.addLast(input.removeLast());

            }
        }
        return output.removeLast();
    }
    public Integer top()
    {
        if(output.isEmpty())
        {
            while (!input.isEmpty()){
                output.addLast(input.removeLast());
            }
        }
        return output.getLast();
    }
}
