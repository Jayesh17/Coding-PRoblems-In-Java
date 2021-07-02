package com.company.LinkedLists;

import com.company.DS_Algorithms.LinkedList;

import java.util.Scanner;

//delete node
public class Problem5 {

    public void method1(LinkedList<Integer> list)
    {
        int count=0;
        LinkedList.Link temp = list.getFirst();
        while(temp.next!=null)
        {
            count++;
            temp = temp.next;
        }
        temp=list.getFirst();
        System.out.println("\nWhich node do you want to delete: ");
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        if(n==count+1)
        {
            System.out.println("Last node can't be deleted by this method");
        }
        else {
            while((n-1)!=0)
            {
                temp=temp.next;
                n--;
            }
            list.deleteNodeExceptLast(temp);
        }
    }
}
