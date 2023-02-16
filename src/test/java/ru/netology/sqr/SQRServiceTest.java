package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SQRServiceTest {
    @Test
    public void calcMatchesTestOne() {
        SQRService service = new SQRService();
        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMatchesTestTwo() {
        SQRService service = new SQRService();
        int actual = service.calculate(0, 500);
        int expected = 13;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calcMatchesTestThree() {
        SQRService service = new SQRService();
        int actual = service.calculate(-200, 1000);
        int expected = 22;

        Assertions.assertEquals(expected, actual);
    }
}