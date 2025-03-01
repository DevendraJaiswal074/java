package Interviewbit;
/* Given two integer arrays A and B of size N. There are N gas stations along a circular route, where the amount of gas at station i is A[i].

You have a car with an unlimited gas tank and it costs B[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

Return the minimum starting gas station's index if you can travel around the circuit once, otherwise return -1.

You can only travel in one direction. i to i+1, i+2, ... n-1, 0, 1, 2.. Completing the circuit means starting at i and ending up at i again. */

public class Interviewbit_Gas_participation {
    public int canCompleteCircuit(final int[] A, final int[] B) {
        int N = A.length;
        int total_gas = 0;
        int total_cost = 0;
        int tank = 0;
        int start = 0;

        for (int i = 0; i < N; i++) {
            total_gas += A[i];
            total_cost += B[i];
            tank += A[i] - B[i];
            if (tank < 0) {
                start = i + 1;
                tank = 0;
            }
        }

        if (total_gas < total_cost) {
            return -1;
        } else {
            return start;
        }
    }
}