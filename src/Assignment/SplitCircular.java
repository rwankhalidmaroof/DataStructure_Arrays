package Assignment;

public class SplitCircular {// Question 16

        static void split(CNode head) {
            CNode slow = head, fast = head;

            while (fast.next != head && fast.next.next != head) {
                slow = slow.next;
                fast = fast.next.next;
            }

            CNode head1 = head;
            CNode head2 = slow.next;

            slow.next = head1;
            fast.next = head2;
        }
    }


