package com.company.LinkedLists;

import com.company.DS_Algorithms.LinkedList;

import java.util.HashSet;

//get the intersection point in 2 linked lists.
public class Problem7 {

    //Brute Force Method: T- O(M*N)
    public void method1(LinkedList.Link l1, LinkedList.Link l2)
    {
        LinkedList.Link d1=l1;
        LinkedList.Link d2=l2;

        while(d2!=null)
        {
            d1=l1;
            while(d1!=null)
            {
                if(d1==d2)
                {
                    break;
                }
                else {
                    d1 = d1.next;
                }
            }
            if(d1==null)
                d2 = d2.next;
            else break;
        }

        if(d2!=null)
        {
            System.out.println("\n"+d2.getData());
        }
        else {
            System.out.println("\nNo Intersection");
        }
    }

    //better approach: T - O(M+N) S- O(M) bcz hashing
    public void method2(LinkedList.Link l1, LinkedList.Link l2)
    {
        HashSet<LinkedList.Link> hash = new HashSet<>();
        LinkedList.Link d1 = l1;
        LinkedList.Link d2 = l2;
        while (d1!=null)
        {
            hash.add(d1);
            d1=d1.next;
        }
        while (d2!=null)
        {
            if(hash.contains(d2))
            {
                break;
            }
            d2= d2.next;
        }
        if(d2!=null)
        {
            System.out.println("\n"+d2.getData());
        }
        else {
            System.out.println("\nNo Intersection");
        }
    }

    //Best Approach but lengthy, T - O(2M) S- O(1)
    public void method3(LinkedList<Integer>.Link l1, LinkedList<Integer>.Link l2) {

        int c1 = 0;
        int c2 = 0;
        LinkedList.Link d1 = l1;
        LinkedList.Link d2 = l2;

        while (d1!=null || d2!=null)
        {
            if(d1!=null)
            {
                c1++;
                d1=d1.next;
            }
            if(d2!=null)
            {
                c2++;
                d2=d2.next;
            }
        }
        //System.out.println(" "+c1+" "+c2);
        d1=l1;
        d2=l2;
        int diff = Math.abs(c1-c2);
        if(c1>c2)
        {
            while((diff-1)!=0)
            {
                diff--;
                d1=d1.next;
            }
        }
        else {
            while((diff)!=0)
            {
                diff--;
                d2=d2.next;
            }
        }
        //System.out.println(" "+d1.getData()+" "+d2.getData());
        while (d1!=d2)
        {
            d1=d1.next;
            d2=d2.next;
        }
        if(d2!=null)
        {
            System.out.println("\n"+d2.getData());
        }
        else {
            System.out.println("\nNo Intersection");
        }
    }


    public void method4(LinkedList<Integer>.Link l1, LinkedList<Integer>.Link l2) {
        LinkedList.Link d1 = l1;
        LinkedList.Link d2 = l2;

        while (d1!=d2)
        {
            d1 = (d1==null)?l2:d1.next;
            d2 = (d2==null)?l1:d2.next;
        }

        if(d2!=null)
        {
            System.out.println("\n"+d2.getData());
        }
        else {
            System.out.println("\nNo Intersection");
        }
    }
}
