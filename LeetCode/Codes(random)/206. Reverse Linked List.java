// https://leetcode.com/problems/reverse-linked-list/?envType=study-plan-v2&envId=leetcode-75

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

 
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode prev = null;
//         ListNode cur_value = head;

//         while(cur_value != null){
//             ListNode next_node = cur_value.next;
//             cur_value.next = prev;
//             prev = cur_value;
//             cur_value = next_node;
//         }
//         return prev;
//     }
// }