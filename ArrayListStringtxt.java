import java.util.ArrayList;
public class ArrayListString {
	public static void main(String[] args) {
		ArrayList<String> TugasArray = new ArrayList<String>();
		
		TugasArray.add("A"); TugasArray.add("F");
		TugasArray.add("R"); TugasArray.add("I");
		TugasArray.add("A"); TugasArray.add("N");
		TugasArray.add("D"); TugasArray.add("I");
		
		TugasArray.remove(0);
		TugasArray.remove(6);
		
		if(TugasArray.contains("I")){
			System.out.println("Ada jhi I nert");
		}
			System.out.println("Banyak Huruf: "+TugasArray.size());
			
		System.out.println(TugasArray);
	}

}
