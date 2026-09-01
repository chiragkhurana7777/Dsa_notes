import java.util.*;

public class merge2sortedlist {

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode current = head;

        while (list1 != null && list2 != null) {

            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            }
            else {
                current.next = list2;
                list2 = list2.next;
            }

            current = current.next;
        }

        if (list1 != null) {
            current.next = list1;
        }
        else {
            current.next = list2;
        }

        return head.next;
    }

    // Create linked list from array
    public static ListNode createList(int[] arr) {

        ListNode head = null;
        ListNode current = null;

        for (int value : arr) {

            ListNode newNode = new ListNode(value);

            if (head == null) {
                head = newNode;
                current = head;
            }
            else {
                current.next = newNode;
                current = current.next;
            }
        }

        return head;
    }

    // Print linked list
    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first list: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first sorted list:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second list: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second sorted list:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);

        ListNode result = mergeTwoLists(list1, list2);

        System.out.println("Merged list:");
        printList(result);

        sc.close();
    }
}