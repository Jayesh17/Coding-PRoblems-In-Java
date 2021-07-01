package com.company.Hashing;

import java.util.HashMap;

//Maximum subarray size which has some 0.
public class Problem4 {

    Integer[] arr = {1,-1,3,2,-2,-8,1,7,10,-1,-9,23};

    //brute-force, Take all arrays and check for the sum
    //O(N3)
    public void method1()
    {
        int maxSize=0;
        int curr_sum = 0;

        for(int i=0;i<arr.length;i++)
        {
            curr_sum=0;
            int maxi=0;
            for (int j = i; j < arr.length; j++) {

                curr_sum+=arr[j];
                if(curr_sum==0)
                {
                    maxi = j-i+1;
                    if(maxSize < maxi)
                    {
                        maxSize = maxi;
                    }
                }
            }
        }
        System.out.println("max sum is :"+maxSize);
    }

    //Time : O(NlogN)
    //space: O(N)
    public void method2()
    {
        int s = 0;
        int max=0;
        int maxtemp = 0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            s+=arr[i];
            if(s==0)
            {
                max=i+1;
            }
            else {
                if(hash.containsKey(s))
                {
                    max = Math.max(s,i-hash.get(s));
                }
                else {
                    hash.put(s,i);
                }
            }
        }
        System.out.println("Result is : "+max);
    }
}
