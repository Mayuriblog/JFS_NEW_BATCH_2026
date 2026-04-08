import java.util.*;

public class Stack_AllOps {
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);

        System.out.println(st.peek());

        st.pop();

        System.out.println(st.search(10));

        System.out.println(st);
    }
}