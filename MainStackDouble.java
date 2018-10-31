
public class MainStackDouble {

	public static void main(String[] args) {
		StackDouble stack =new StackDouble();
		stack.push(4.6);
		stack.cetak();
		stack.push(4.7);
		
		stack.cetak();
		
		double d0=stack.pop();
		System.out.println(d0);
		double d1=stack.pop();
		System.out.println(d1);
		stack.cetak();
		double d2=stack.pop();
		System.out.println("kosong ki kodong");
	}

}
