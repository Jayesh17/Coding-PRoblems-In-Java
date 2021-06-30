package com.company.Hashing;

import java.util.HashMap;

//2 Sum Problem
//check if total of any 2 indices matches the target
public class Problem1 {
    int[] arr = {3,2,4,-6,1};
    int target = -2;

    //Method-1 : Brute force , Linearly travrse and check for every pair, Time: O(N2)
    // just use hash table, Time:O(N), space : O(N)
    public void method2()
    {
        int i1 = -1,i2=-1;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(hash.containsKey((target-arr[i])))
            {
                i1 = i;
                i2 = hash.get(target-arr[i]);
                break;
            }
            hash.put(arr[i],i);
        }

        System.out.println("pair ("+i1+","+i2+") will add up to the target");
    }
}
