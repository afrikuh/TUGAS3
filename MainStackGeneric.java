package ASD3;

public class MainStackGeneric {
	public static void main(String[] args) {
		StackGeneric<Integer> st = new StackGeneric<Integer>();
        st.push(2);
        st.push(1);
        st.push(2);
        st.cetak();
        System.out.println("Size: " + st.size());
        System.out.println(st.pop());
    }
}