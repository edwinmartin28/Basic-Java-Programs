//Java program for implemention of Doubly linked list
import java.util.Scanner;

class DLL {
    Node head = null;

    class Node {
        int data;
        Node next, prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void insert(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
        } else {
            Node ptr = head;
            while (ptr.next != null) {
                ptr = ptr.next;
            }
            ptr.next = temp;
            temp.prev = ptr;
        }
        System.out.print("Data enterd is : " + data);
    }

    public void delete(int x) {
        Node temp = new Node(1);
        if (head == null) {
            System.out.print("List is empty");
        } else {
            temp = head;
            while (temp != null && temp.data != x)
                temp = temp.next;
            if (temp == null)
                System.out.println("Not found");
            else {
                int data = temp.data;
                if (temp.next == null && temp.prev == null) {
                    temp = null;
                    head = null;
                } else if (temp.next == null)
                    temp.prev.next = null;
                else if (temp.prev == null) {
                    head = temp.next;
                    temp.next.prev = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.print("Data deleted is : " + data);
            }
        }
    }

    public void display() {
        Node temp = head;
        if (head == null) {
            System.out.print("List is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
}

public class Doubly_Linked_List {
    public static void main(String args[]) {
        DLL dll = new DLL();
        int opt;
        do {
            System.out.println("\n1. Insert at end 2. Delete a element 3. Display linked list 4. Exit");
            System.out.print("Enter your choice : ");
            Scanner sc = new Scanner(System.in);
            opt = sc.nextInt();
            switch (opt) 
            {
                case 1: {
                    System.out.print("Enter the element : ");
                    int data = sc.nextInt();
                    dll.insert(data);
                    break;
                }
                case 2: {
                    System.out.println("Enter element to be deleted : ");
                    int x = sc.nextInt();
                    dll.delete(x);
                    break;
                }
                case 3: {
                    dll.display();
                    break;
                }
                case 4: {
                    break;
                }
                default: {
                    System.out.print("Invalid choice");
                    break;
                }
            }sc.close();
        } while (opt != 4); 
       
    }
}