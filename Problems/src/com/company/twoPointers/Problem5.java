package com.company.twoPointers;

// Max Consecutive ones in binary array.
public class Problem5 {
    int arr[] = {0,1,0,1,1,1,0,1,1,1,1,1,1,1,0};

    public void method1()
    {
        int max = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i]==1 && i<arr.length)
            {
                temp++;
                i++;
            }
            if(temp>max)
            {
                max = temp;
                temp = 0;
            }
        }
        System.out.println(max);
    }
}
