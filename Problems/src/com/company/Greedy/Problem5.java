package com.company.Greedy;

import java.util.*;

//fractional knapsak problem
// take maximum weight.
public class Problem5 {

    private class Item
    {
        int values;
        int weights;

        public Item(int values, int weights) {
            this.values = values;
            this.weights = weights;
        }

        public int getValues() {
            return values;
        }

        public int getWeights() {
            return weights;
        }
    }
    //optimal T-O(NlogN+N) S-O(1)
    public void method1(int[] values, int[] weights,int capacity)
    {
        ArrayList<Item> items = new ArrayList<>();
        for (int i = 0; i < values.length; i++) {
            Item item = new Item(values[i],weights[i]);
            items.add(item);
        }

        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                int cost1 = o1.getValues()/o1.getWeights();
                int cost2 = o2.getValues()/ o2.getWeights();

                if(cost1<cost2)
                {
                    return 1;
                }
                return 0;
            }
        });

        Iterator<Item> it = items.iterator();
        int maxValue = 0;
        while (it.hasNext())
        {
            if(capacity==0)
                break;
            Item item = it.next();
            if(item.getWeights()<=capacity)
            {
                maxValue+=item.getValues();
                capacity-=item.getWeights();
            }
            else {
                int cost = item.getValues()/item.getWeights();
                maxValue+= (capacity*cost);
                capacity = 0;
            }
        }

        System.out.println("Max value : "+maxValue);
    }
}
