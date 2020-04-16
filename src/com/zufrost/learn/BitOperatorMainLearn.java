package com.zufrost.learn;

public class BitOperatorMainLearn {
    public static void main(String[] args) {
        //В случае сдвига вправо со знаком новые биты принимают значение старшего (самого левого)
        // бита перед сдвигом: 0 для положительных чисел, 1 - для отрицательных.
        // В случае сдвига влево и беззнакового сдвига вправо > новые биты просто устанавливаются в ноль.

        int x = -112;
        System.out.println(x + " = " + Integer.toBinaryString(x));
        x = x >>> 5;
        System.out.println(x + " = " + Integer.toBinaryString(x));

        x = 112;
        System.out.println(x + " = " + Integer.toBinaryString(x));
        x = x >>> 5;
        System.out.println(x + " = " + Integer.toBinaryString(x));

    }
}
