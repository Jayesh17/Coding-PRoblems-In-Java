package com.company.Hashing;

import java.util.HashMap;

//Find the number of subarrays which has XOR equal to target.
public class Problem5 {

    Integer[] arr = {4,2,2,6,4};
    public void method2(int target)
    {
        int xor=0;
        int cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            int xorr = 0;
            for (int j = i; j < arr.length; j++) {

                xorr^=arr[j];
                if(xorr==target)
                {
                   cnt++;
                }
            }
        }

        System.out.println("Number of subarray : "+cnt);

    }
    //Time : O(N), space: O(N)
    public void method1(int target)
    {
        HashMap<Integer,Integer> hash = new HashMap<>();
        int xor = 0;
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i];
            if(xor==target)
                cnt++;
            if(hash.containsKey(xor ^ target))
                cnt+=hash.get(xor^target);


            if(hash.containsKey(xor^target))
                hash.put(xor^target,hash.get(xor^target)+1);
            else
                hash.put(xor^target,1);
        }

        System.out.println("Number of subarray : "+cnt);
    }
}
