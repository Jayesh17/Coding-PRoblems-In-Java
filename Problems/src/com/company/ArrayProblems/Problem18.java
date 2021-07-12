package com.company.ArrayProblems;

import java.util.ArrayList;
import java.util.List;

//find all the subsequnces of String
public class Problem18 {

    static List<String> seq = new ArrayList<>();

    public void printAll()
    {
        seq.forEach(value->{
            System.out.println(value+" ");
        });
    }
    public List<String> method1(String str)
    {
        findSubsequences(str,"");
        return seq;
    }
    private void findSubsequences(String str, String ans) {

        if(str.length()==0)
        {
            seq.add(ans);
            return;
        }
        findSubsequences(str.substring(1),ans + str.charAt(0));

        findSubsequences(str.substring(1),ans);
    }
}
