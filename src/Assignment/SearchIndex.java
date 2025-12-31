package Assignment;

public class SearchIndex {

        static int findIndex(Node head, int value) {
            int index = 0;
            while (head != null) {
                if (head.data == value)
                    return index;
                head = head.next;
                index++;
            }
            return -1;
        }
    }


