package Assignment;

public class DNode {// Question 10

        int data;
        DNode prev, next;
    }

    class Q10_RemoveDuplicates {
        static void removeDuplicates(DNode head) {
            DNode curr = head;
            while (curr != null) {
                DNode temp = curr.next;
                while (temp != null && temp.data == curr.data) {
                    temp = temp.next;
                }
                curr.next = temp;
                if (temp != null)
                    temp.prev = curr;
                curr = curr.next;
            }
        }
    }


