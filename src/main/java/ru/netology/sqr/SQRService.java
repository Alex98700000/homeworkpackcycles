package ru.netology.sqr;

public class SQRService {
    public int calculate(int min, int max) {
        int counter = 0;
        if (min <= max) { //проверка, max>=min
            for (int i = 10; i <= 99; i++) {
                int sqr = i * i;
                if (sqr > max) {
                    i = i + 100; // сброс цикла
                } else if (min <= sqr && sqr <= max) {
                    counter++;
                }
            }
        }
        return counter;
    }
}
