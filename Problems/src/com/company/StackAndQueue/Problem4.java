package com.company.StackAndQueue;

import java.util.Stack;

//Next greater Element in the array. circularly.
public class Problem4 {

    public void printArray(int[] arr)
    {
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    //T - O(2N+2N) S - O(N)
    public void method1(int[] arr)
    {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[n];
        for(int i=(2*n)-1;i>=0;i--)
        {
            while (!stack.isEmpty() && stack.peek()<=arr[i%n])
            {
                stack.pop();
            }

            if(i<n)
            {
                if(stack.isEmpty()) result[i]=-1;
                else result[i] = stack.peek();
            }
            stack.push(arr[i%n]);
        }

        printArray(arr);
        printArray(result);
    }
}
