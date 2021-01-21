package 华为机试;

import java.util.Scanner;


public class HW_18_自己思考写_链表的第k个节点 {

    private static Node head;

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Node p = null;

        for (int i = 0; i < num; i++){
            int value = scanner.nextInt();
            if (i == 0){
                head = new Node(value);
                p = head;
            } else {
                Node node = new Node(value);
                p.next = node;
                p = p.next;
            }
        }

        int k = scanner.nextInt();

        Node temp = head;
        int count = 0;
        while (temp != null){
            if (count == num-k){
                System.out.println(temp.value);
            }
            count++;
            temp = temp.next;
        }
    }



}

class Node{
    Node next;
    int value;
    public Node(int value){
        this.value = value;
    }
}