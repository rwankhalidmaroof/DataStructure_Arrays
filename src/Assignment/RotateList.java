package Assignment;

// Question 6
class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }
public class RotateList {
        static Node rotate(Node head, int k) {
            if (head == null) return head;

            Node curr = head;
            int len = 1;
            while (curr.next != null) {
                curr = curr.next;
                len++;
            }

            curr.next = head;
            k = k % len;
            int steps = len - k;

            while (steps-- > 0) {
                curr = curr.next;
            }

            head = curr.next;
            curr.next = null;
            return head;
        }
    }


