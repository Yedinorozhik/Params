package ru.netology.javaqa;

public class FreelanceService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int balance = 0;
        for (int month = 0; month < 12; month++) {
            if (balance >= threshold) {
                count++;
                balance -= expenses;
                balance /= 3;
            } else {
                balance += income;
                balance -= expenses;
            }
        }
        return count;
    }
}
