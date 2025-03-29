// https://leetcode.com/problems/number-of-recent-calls/description/?envType=study-plan-v2&envId=leetcode-75



// Method 1 to solve the problem

// import java.util.ArrayList;
// import java.util.List;

// class RecentCounter {
//     List<Integer> list;
//     int i;

//     public RecentCounter() {
//         list = new ArrayList();
//         i =0;
//     }
    
//     public int ping(int t) {
//         list.add(t);
//         while (t-3000 > list.get(i) ) {
//             i++;
//         }
//         return list.size()-i;
//     }
// }

// Method second 

import java.util.LinkedList;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList();
    }
    
    public int ping(int t) {
        queue.add(t);
        while(!queue.isEmpty() && t - 3000 > queue.peek()){
            queue.poll();
        }
        return queue.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */