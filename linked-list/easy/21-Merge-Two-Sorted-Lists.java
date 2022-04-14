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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null) return null;
        ListNode current = new ListNode();
        ListNode merged = current;
        ListNode rest = null;

        while(list1 != null || list2 != null) {
            if(list1 == null)  {
                rest = list2;
                break;
            }

            if(list2 == null)  {
                rest = list1;
                break;
            }

            if(list1.val <= list2.val) {
                current.val = list1.val;
                list1 = list1.next;
            } else {
                current.val = list2.val;
                list2 = list2.next;
            }

            current.next = new ListNode();
            current = current.next;
            current.next = null;
        }

        while(rest != null) {
            current.val = rest.val;
            rest = rest.next;
            if(rest == null) {
                current.next = null;
                break;
            }
            current.next = new ListNode();
            current = current.next;
            current.next = null;
        }

        return merged;
    }

}
