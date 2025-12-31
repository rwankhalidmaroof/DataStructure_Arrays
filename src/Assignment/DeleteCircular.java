package Assignment;

class CNode {// Question 14
        int data;
        CNode next;
    }

class DeleteCircular {
        static CNode deleteAtPosition(CNode head, int pos) {
            if (head == null) return null;

            CNode curr = head;
            if (pos == 0) {
                while (curr.next != head)
                    curr = curr.next;
                curr.next = head.next;
                return head.next;
            }

            for (int i = 0; i < pos - 1; i++)
                curr = curr.next;

            curr.next = curr.next.next;
            return head;
        }
    }


