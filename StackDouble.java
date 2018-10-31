import java.util.ArrayList;


public class StackDouble {
	ArrayList<Double> kotak =new ArrayList<Double>();
	public int afri = -1;
	
		public void push(Double value){
			afri++;
			kotak.add(afri,value);
		}
		
			public double pop() {
				double value=afri;
			if (afri>-1){				
				value = kotak.get(afri);
				kotak.remove(afri);
				afri--;
			}
			return value;
			}
			public void cetak(){
				System.out.println(kotak.toString());
			}
}
