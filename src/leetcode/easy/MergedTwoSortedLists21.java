package leetcode.easy;

public class MergedTwoSortedLists21 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }

        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String args[]){
        //1->2->4,
        //1->3->4

        ListNode first, second;

        ListNode l1 = new ListNode(1);
        ListNode l11 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        first = l1;
        l1.next = l2;
        l2.next = l4;

        second = l11;
        l11.next = l3;
        l3.next = l4;

        ListNode retNode = mergeTwoLists(first, second);

        while(true){
            System.out.println(retNode.val);
            retNode = retNode.next;
            if (retNode.next==null){
                System.out.println(retNode.val);
                break;
            }
        }
    }

}
