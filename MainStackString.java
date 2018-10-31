import java.util.Stack;


public class MainStackString {

	public static void main(String[] args) {
StackString stack= new StackString();
		
		stack.push("afri");
    stack.push("andi");
		stack.push("cinta");
		stack.push("sejati");
		
		String d0=stack.pop();
		System.out.println(d0);
		stack.cetak();
		
						
	}

}
