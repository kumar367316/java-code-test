package com.core.program;

import java.util.*;

public class BitSetExample {

    public static void main(String[] args) {
        // Constructors of BitSet class
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet(6);

        /* set is BitSet class method
           explained in next articles */

        for(int i=0;i<5;i++)
            bs1.set(i);

        bs1.clear(2);

        // assign values to bs2
        bs2.set(4);
        bs2.set(6);
        bs2.set(5);
        bs2.set(1);
        bs2.set(12);
        bs2.set(3);
        bs2.set(13);
        bs2.set(7);

        // Printing the 2 Bitsets
        System.out.println("bs1  : " + bs1);
        System.out.println("bs2  : " + bs2);
    }
}
