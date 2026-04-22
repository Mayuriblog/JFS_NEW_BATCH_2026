import java.util.*;

class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr = {2,1,2,4,3};
        int[] res = nextGreater(arr);

        for(int x : res)
            System.out.print(x + " ");
    }

    static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {

            // Remove smaller or equal elements
            while(!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // Assign result
            res[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current element
            stack.push(arr[i]);
        }

        return res;
    }
}