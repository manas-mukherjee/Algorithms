package leetcode.top_interview;

public class RemoveNthFromList19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head, fast = head;

        for (int i = 0; i < n-1; i++) {
            fast = fast.next;
        }
        System.out.println("fast - " + fast.val);
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        System.out.println("slow - " + slow.val);
        System.out.println("fast - " + fast.val);
        slow.next = slow.next.next;
        return head;
    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {

        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for (int i = 1; i <= n + 1; i++) {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }

    public static void main(String args[]) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        /*TreeNode l3 = new TreeNode(3);
        TreeNode l4 = new TreeNode(4);
        TreeNode l5 = new TreeNode(5);*/

        l1.next = l2;
        /*l2.next = l3;
        l3.next = l4;
        l4.next = l5;*/

        RemoveNthFromList19 obj = new RemoveNthFromList19();
        ListNode head = obj.removeNthFromEnd(l1, 2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}

