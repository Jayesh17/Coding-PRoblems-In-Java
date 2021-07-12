package com.company.LinkedLists;

import com.company.DS_Algorithms.LinkedList;

//Rotate linked list.
public class Problem13 {

    //Optimal : T - O(N) S- O(1)
    public LinkedList.Link method1(LinkedList.Link head,Integer rotations)
    {
        LinkedList.Link temp = head;
        int cnt = 1;
       while (temp.next !=null)
       {
           cnt++;
           temp=temp.next;
       }

        //System.out.println(cnt);
        int k = rotations % cnt;
        temp.next = head;
        temp = head;
        k = cnt - k;
        k--;
        while (k!=0)
        {
            k--;
            temp=temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }
}
