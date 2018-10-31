import java.util.ArrayList;
public class ArrayListInteger {
	public static void main(String[] args) {
		 ArrayList<Integer> deret = new ArrayList<Integer>();

	        System.out.println("Panjang deret awal: "+deret.size());

	        for (int i = 0; i < 10; i++){
	            deret.add(i * 10);
	        }

	        System.out.println("\nPanjang deret setelah ditambah elemen: "+deret.size());

	        for (int i = 0; i < deret.size(); i++){
	            System.out.println("elemen ke - " + i + " : " + deret.get(i));
	        }

	        System.out.println("\nMenghapus suatu nilai di dalam array list: ");
	        deret.remove(6);    
	        deret.remove(6);    
	        deret.remove(6);    

	        System.out.println("\nPanjang deret setelah menghapus beberapa elemen: "+deret.size());

	        for (int i = 0; i < deret.size(); i++){
	            System.out.println("elemen ke - " + i + " : " + deret.get(i));
	        }
	    }
	}
	