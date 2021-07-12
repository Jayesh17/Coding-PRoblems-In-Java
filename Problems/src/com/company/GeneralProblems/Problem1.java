package com.company.GeneralProblems;

import com.company.ArrayProblems.Problem18;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

// Find all the possible numbers that can be made from the given Binary String
// ex: 110
// 1 - 1, 0 - 0, 11-3, 10 - 2, 110 - 6: ans - 0,1,2,3,6
public class Problem1 {


    public int findDecimal(String s)
    {
        int ans = 0;
        int size = s.length();
        int ptr = s.length()-1;
        while (ptr>=0)
        {
            if(s.charAt(ptr)=='1')
            {
                ans+=power(2,(size-ptr)-1);
            }
            ptr--;
        }
        return ans;
    }

    private int power(int x, int n) {
        int pow = 1;
        while (n!=0)
        {
            if(n%2==0)
            {
                x = x*x;
                n = n/2;
            }
            else {
                pow = pow * x;
                n--;
            }
        }
        return pow;
    }

    public List<Integer> findNumbers(String str)
    {
        List<Integer> result = new ArrayList<>();
        Problem18 pb18 = new Problem18();
        List<String> seq = pb18.method1(str);
        ListIterator<String> it = seq.listIterator();
        while (it.hasNext())
        {
            String s = it.next();
            int decimal = findDecimal(s);
            if(!result.contains(decimal))
            {
                result.add(decimal);
            }
        }
        return result;
    }
}
