package com.company.Greedy;

//find minimum coins required.
public class Problem4 {

    //optimal T - O(N) S-O(1)
    public void method1(int value)
    {
        int[] coin = {1,2,5,10,20,50,100,500,1000};
        int coinsNeeded=0;
        int rem = value;
        for (int i = coin.length - 1; i >= 0; i--) {
            if(rem==0)
            {
                break;
            }
            if(coin[i]<=rem)
            {
                coinsNeeded+=(rem/coin[i]);
                rem = rem % coin[i];
            }
        }

        System.out.println("coins needed to form "+value+" are : "+coinsNeeded);
    }
}
