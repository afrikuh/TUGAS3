import java.util.ArrayList;
public class ArrayListDouble {
	public static void main(String[] args) {
		ArrayList<Double> Double = new ArrayList<Double>();
		
		Double.add(1.5);
		Double.add(2.5);
		Double.add(3.5);
		Double.add(4.5);
		Double.add(5.5);
		
		System.out.println("Banyak angka sebelum ada yg dihapus: "+Double.size());
		System.out.println(Double);
		
        System.out.println("\nMenghapus suatu angka didalam array list: ");
        Double.remove(0);    
        Double.remove(2);    
              
		System.out.println("Banyak angka setelah ada yg dihapus: "+Double.size());
		//menampilkan angka koma
		System.out.println(Double);
	}

}
