class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int first = -1, last = -1, min = Integer.MAX_VALUE;
        int pos = 1;

        ListNode prev = head, curr = head.next;

        while (curr.next != null) {
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                if (first != -1)
                    min = Math.min(min, pos - last);
                else
                    first = pos;

                last = pos;
            }

            prev = curr;
            curr = curr.next;
            pos++;
        }

        return first == last
            ? new int[]{-1, -1}
            : new int[]{min, last - first};
    }
}