package ASD3;

import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> kelase = new ArrayList<Float>();
	int alief = -1;

	public void insert(Float value) {
		alief++;
		kelase.add(alief,value);
	}
	public Float get() {
		Float value = 0.1f;
		if(alief>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			alief--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+alief+" > VARIABLE: "+kelase.toString());
	}
}
