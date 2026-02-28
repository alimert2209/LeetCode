public class Easy_21 {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // TODO
        return null;
    }

    // ---------------- TEST RUNNER ----------------

    private static void runTest(int[] arr1, int[] arr2, int[] expected) {
        Easy_21 sol = new Easy_21();

        ListNode l1 = buildList(arr1);
        ListNode l2 = buildList(arr2);

        ListNode result = sol.mergeTwoLists(l1, l2);

        if (compareLists(result, buildList(expected))) {
            System.out.println("✅ PASS");
        } else {
            System.out.println("❌ FAIL");
            System.out.println("List1:    " + arrayToString(arr1));
            System.out.println("List2:    " + arrayToString(arr2));
            System.out.println("Expected: " + arrayToString(expected));
            System.out.print("Got:      ");
            printList(result);
        }

        System.out.println("----------------------------------");
    }

    // ---------------- HELPER METHODS ----------------

    private static ListNode buildList(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }

    private static boolean compareLists(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val) return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    private static String arrayToString(int[] arr) {
        if (arr == null) return "null";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    // ---------------- MAIN ----------------

    public static void main(String[] args) {

        runTest(
                new int[]{1,2,4},
                new int[]{1,3,4},
                new int[]{1,1,2,3,4,4}
        );

        runTest(
                new int[]{},
                new int[]{},
                new int[]{}
        );

        runTest(
                new int[]{},
                new int[]{0},
                new int[]{0}
        );

        runTest(
                new int[]{2,5,7},
                new int[]{1,3,6,8},
                new int[]{1,2,3,5,6,7,8}
        );
    }
}