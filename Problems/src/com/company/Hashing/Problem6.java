package com.company.Hashing;

import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.HashSet;

//Longest substring length without repeating character.
public class Problem6 {

    String str = "abcdabcdefabcd";

    //Method1: by checking all the subarrays: O(N2)

    //Optimized approach: with left and right pointers.
    //Time : O(2N) , space: O(N)
    public void method1()
    {
        HashSet<Character> hash = new HashSet<>();
        int l = 0;
        int r = 0;
        int max = 0;
        int temp=0;
        int n = str.length();
        while(r!=n)
        {
            if(!hash.contains(str.charAt(r)))
            {
                temp = r-l+1;
            }
            else {
                while(hash.contains(str.charAt(l)))
                {
                    hash.remove(str.charAt(l));
                    l++;
                }
                temp = r-l+1;
            }
            max=Math.max(max,temp);
            hash.add(str.charAt(r));
            r++;
        }
        System.out.println("length : "+max);
    }

    //Optimal than method1: O(N),O(N)
    public void method2()
    {
        HashMap<Character,Integer> hash = new HashMap<>();
        int l=0;
        int r=0;
        int temp=0;
        int max=0;
        int n = str.length();
        while(r!=n)
        {
            char c = str.charAt(r);
            if(!hash.containsKey(c))
            {
                temp = r-l+1;
                hash.put(c,r);
            }
            else {
                int ind = hash.get(c);
                if(ind>=l && ind<=r)
                {
                    l = ind+1;
                }
                hash.replace(c,r);
                temp = r-l+1;
            }
            max=Math.max(max,temp);
            r++;
        }
        System.out.println("length : "+max);
    }
}
