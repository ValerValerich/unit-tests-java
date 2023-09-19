package org.example;

public class Sem01 {
    public static void main(String[] args) {
        //assertConditionB();
        summator(999999999, 999999999);
    }

    private static int summator(int a, int b) {
        assert (Integer.MAX_VALUE < a + b) : "значение вышло за предел";
        return a + b;
    }

    private static void assertConditionB() {
        int x = -1;
        assert x < 0;
    }

}
