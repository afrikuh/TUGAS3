import java.util.ArrayList;


public class QueueFloat {
	ArrayList<Float> informatika = new ArrayList<Float>();
	int afriandi = -1;

	public void insert(Float value) {
		afriandi++;
		informatika.add(afriandi,value);
	}
	public Float get() {
		Float value = 0.1f;
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


