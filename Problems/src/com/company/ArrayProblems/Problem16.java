package com.company.ArrayProblems;

import java.util.HashMap;

//Majority elements : n/3
public class Problem16 {
    int[] arr = {1,2,3,3,1,2,3,1,2,3};

    //boyer moore voting algorithm
    public void method1()
    {
        int e1=-1;
        int e2 = -1;
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(e1 == arr[i])
                cnt1++;
            else if(e2 == arr[i])
                cnt2++;
            else if(cnt1 == 0)
            {
                e1 = arr[i];
                cnt1 = 1;
            }
            else if(cnt2 == 0){
                e2= arr[i];
                cnt2 = 1;
            }
            else {
                cnt1--;
                cnt2--;
            }
        }

        int c1=0;
        int c2=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == e1)
            {
              c1++;
            }
            else if(arr[i]==e2)
            {
                c2++;
            }
        }

        if(c1 > (arr.length/3))
        {
            System.out.print(e1+" ");
        }
        if(c2 > (arr.length/3))
        {
            System.out.print(e2+" ");
        }
    }

    //With using Hashmap, Time : O(NlogN), space: O(N)
    public void method2()
    {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int cnd = arr.length/3;
        int e1=-1,e2=-1;

        for (int i = 0; i < arr.length; i++) {
            if(hash.containsKey(arr[i]))
                hash.put(arr[i],hash.get(arr[i])+1);
            else
                hash.put(arr[i],1);

            if(hash.get(arr[i]) > cnd)
            {
                if(e1 == -1)
                {
                    e1 = arr[i];
                }
                else {
                    e2 = arr[i];
                }
            }
        }

        System.out.println(e1+" "+e2);
    }
}
