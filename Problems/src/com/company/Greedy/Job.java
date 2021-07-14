package com.company.Greedy;

public class Job {
    int id;
    int profit;
    int deadline;

    public Job(int id, int profit, int deadline) {
        this.id = id;
        this.profit = profit;
        this.deadline = deadline;
    }

    public int getId() {
        return id;
    }

    public int getProfit() {
        return profit;
    }

    public int getDeadline() {
        return deadline;
    }
}
