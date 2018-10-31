
public class MainStackFloat {
	public static void main(String[] args) {
		StackFloat kotak =new StackFloat();
		kotak.push(1.2f);
		kotak.push(2.3f);
		kotak.push(3.4f);
		kotak.cetak();
		float d0=kotak.pop();
		System.out.println(d0);
		kotak.cetak();

	}

}
