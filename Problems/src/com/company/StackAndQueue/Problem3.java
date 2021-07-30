package com.company.StackAndQueue;

import java.util.HashMap;
import java.util.Stack;

//Ballance Parancthasis
public class Problem3 {

    Stack<Character> stack = new Stack<>();
    HashMap<Character,Character> brackets = new HashMap<>();

    //optimal : O(N), O(N)
    public void method1(String str)
    {
        brackets.put(')','(');
        brackets.put('}','{');
        brackets.put(']','[');
        for (int i = 0; i < str.length(); i++) {
            if(brackets.containsValue(str.charAt(i)))
            {
                stack.push(str.charAt(i));
            }
            else {
                if(stack.isEmpty()){
                    System.out.println("Not Balanced");
                    return;
                }
                Character b = stack.pop();
                if(brackets.get(str.charAt(i))!=b)
                {
                    System.out.println("Not Balanced");
                    return;
                }
            }
        }
        if(stack.isEmpty())
        {
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not Balanced");
        }
    }
}
