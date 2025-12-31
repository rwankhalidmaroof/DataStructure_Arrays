package SinglyLinkedList;

public class practice {
       public static  void reverse(int[]a){
           int i=0, j=a.length-1;
           while (i<j){
               int tmp =a[i];
               a[i]=a[j];
               a[j]=tmp;
               i++;
               j--;


           }
           for (int x:a){
               System.out.print(x+" ");

           }
       }

}
