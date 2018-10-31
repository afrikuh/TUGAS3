import java.util.ArrayList;


public class QueueDouble {
	ArrayList<Double> informatika = new ArrayList<Double>();
	int afriandi = -1;

	public void insert(Double value) {
		afriandi++;
		informatika.add(afriandi,value);
	}
	public Double get() {
		Double value = (double) 0.1f;
		if(afriandi>-1) {
			value = informatika.get(0);
			informatika.remove(0);
			afriandi--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("Step : "+afriandi+" > VARIABLE: "+informatika.toString());
	}
}

	
