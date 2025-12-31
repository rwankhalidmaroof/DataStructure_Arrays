package Assignment;

public class SearchDoubly {// Question 12

        static boolean search(DNode head, int key) {
            while (head != null) {
                if (head.data == key)
                    return true;
                head = head.next;
            }
            return false;
        }
    }


