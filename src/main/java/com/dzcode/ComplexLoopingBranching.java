package com.dzcode;

public class ComplexLoopingBranching {
    public static void main(String[] args) {
        System.out.println("/** Nesting loops and if-else **/");
        // placing one construct within another
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println("is even");
                evenCount++;
            } else 
                System.out.println("is odd");
        }

        int iVal = 1;
        if (iVal < 5)
            do
                System.out.println("iVal = " + iVal++);
            while(iVal < 5);
        else   
            System.out.println("iVal is not less than 5");

        System.out.println("/** Nesting for loops **/");
        // one loop contained within another
        // the outer loop contains the inner loop
        int[][] multi = {{200, 105, 110},
                        {200, 205, 210},
                        {300, 305, 310}};
        
        for (int i = 0; i < multi.length; i++) 
            for (int j = 0; j < multi[i].length; j++) 
                System.out.println(multi[i][j]);

        for (int[] simple : multi) 
            for (int value : simple) 
                System.out.println(value);

        System.out.println("/** Branching **/");
        // alters standard code flow
        // the continue statement
        // skips remainder of current loop iteration
        // the break statement
        // terminates innermost switch or loop

        iVal = 0;
        while (iVal < 10) {
            iVal++;
            if(iVal % 2 == 0) 
                continue; // terminate the current iteration
            System.out.println(iVal);
        }

        int iValStart = 1;
        while(iValStart < 4) {
            System.out.println("iValStart = " + iValStart);
            int sum = 0;
            iVal = iValStart;
            while (iVal < 10) {
                sum += iVal;
                System.out.println("iVal=" + iVal + " sum=" + sum);
                if (sum > 5)
                    break; // terminate the inner loop
                iVal++;
            }
            iValStart++;
        }

        // the return statement
        // exits current method
        // terminates all switches or loops within that method
        System.out.println("Before method call");
        methodWithLoops();
        System.out.println("After method call");

        System.out.println("/** Infinite loops **/");
        // a loop that will repeatedly execute without ever terminating
        // sometimes created intentionally
        // generally rely on some external event to terminate the loop
        // commonly created inadvertenly
        // loop processing never causes the control condition to become false
        
        // while (true) System.out.println("Looping");
        // for (;;) System.out.println("Looping");

        // avoid overly specific control conditions
        // check for infinite loop condition befaore start

        iVal = 1;
        while (iVal <= 4) {//while (iVal != 4) {
            System.out.println("iVal = " + iVal);
            iVal += 2;
        }

        int stepVal = -1;
        if (stepVal > 0) // check step positive
            for (iVal = 1; iVal < 10; iVal += stepVal) {
                System.out.println("iVal = " + iVal);
            }
        else 
            System.out.println("Ivalid stepVal : " + stepVal);
    }

    private static void methodWithLoops() {
        for (int iValStart = 1; iValStart < 4; iValStart++) {
            System.out.println("iValStart = " + iValStart);
            for (int iVal = iValStart; iVal < 10; iVal++) {
                System.out.println("iVal = " + iVal);
                if (iVal == 3) return;
            }
        }
    }
}
