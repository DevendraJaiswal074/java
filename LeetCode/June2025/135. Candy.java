/*
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;

        int[] L2R = new int[n];
        int[] R2L = new int[n];

        Arrays.fill(L2R, 1);
        Arrays.fill(R2L, 1);

        //First comparing with only left neighbour
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                L2R[i] = Math.max(L2R[i], L2R[i - 1] + 1);
            }
        }

        //Then comparing with only right neighbour
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                R2L[i] = Math.max(R2L[i], R2L[i + 1] + 1);
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            result += Math.max(L2R[i], R2L[i]);
        }

        return result;
    }
}


//Approach-2 
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] count = new int[n];
        Arrays.fill(count, 1);

        //First comparing with only left neighbour
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                count[i] = Math.max(count[i], count[i - 1] + 1);
            }
        }

        //Then comparing with only right neighbour
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                count[i] = Math.max(count[i], count[i + 1] + 1);
            }
        }

        int result = 0;
        for (int num : count) {
            result += num;
        }

        return result;
    }
}

//Approach-3,
class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int candy = n; //Each person given one candy

        int i = 1;
        while (i < n) {

            if (ratings[i] == ratings[i - 1]) {
                i++;
                continue;
            }

            //For increasing slope
            int peak = 0;
            while (i < n && ratings[i] > ratings[i - 1]) {
                peak++;
                candy += peak;
                i++;
            }

            //For decreasing slope
            int valley = 0;
            while (i < n && ratings[i] < ratings[i - 1]) {
                valley++;
                candy += valley;
                i++;
            }

            //Note that we added candies coming from left to Peak and coming from right to Peak
            //But, we need to consider only max from both of them for the Peak.
            //So, remove the min candy from Peak.
            candy -= Math.min(peak, valley);
        }

        return candy;
    }
}

*/