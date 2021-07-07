package com.company.LinkedLists;

import com.company.DS_Algorithms.LinkedList;

import java.util.Vector;

//check if the list is palindrome or not.
public class Problem9 {

    //Naive : T - O(N+N) S-(N)
    public void method1(LinkedList.Link l)
    {
        Vector<Integer> arr = new Vector<>();
        LinkedList.Link d = l;
        while (d!=null)
        {
            arr.add((Integer)d.getData());
            d=d.next;
        }
        int n = arr.size();
        int mid = (n%2==0)?(n/2)-1:(n/2);
        int lastInd = n-1;
        int i;
        for (i = 0; i <= mid ; i++) {
            if(arr.get(i)!=arr.get(lastInd))
            {
                break;
            }
            lastInd--;
        }
        if (i>mid)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }

    //Optimized : T - O(N/2 + N/2 + N/2) S - O(1)
    public void method2(LinkedList<Integer>.Link first) {

        LinkedList.Link slow= first;
        LinkedList.Link fast = first;

        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast = fast.next.next;
            if(fast==null)
                break;
        }
        LinkedList.Link d = slow.next;
        Problem1 pb1 = new Problem1();
        LinkedList.Link newHead= pb1.method1(d);
        d=first;
        while (newHead!=null)
        {
            if(newHead.getData() != d.getData())
            {
                break;
            }
            d=d.next;
            newHead=newHead.next;
        }

        if(newHead==null)
        {
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }
    }
}
