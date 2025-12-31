package SinglyLinkedList;

public class main {
    public static void main(String[] args) {

        SinglyLinkedList<Integer>list=new SinglyLinkedList<Integer>();
        list.addlast(10);
        list.addlast(20);
        list.addlast(30);
        list.addlast(40);
        list.addlast(50);
      //  list.removelast();
        list.removefirst();
        list.display();
        practice p=new practice();
        int []x={1,2,3,4,5};
        System.out.println("Before");
       p.reverse(x);

        }
    }

