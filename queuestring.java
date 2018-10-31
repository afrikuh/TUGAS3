	import java.util.ArrayList;

	public class QueueString {
		ArrayList<String> informatika = new ArrayList<String>();
		int afriandi = -1;

		public void insert(String value) {
			afriandi++;
			informatika.add(afriandi,value);
		}
		public String get() {
			String value = "LO'BANG";
			if(afriandi>-1) {
				value = informatika.get(0);
				informatika.remove(0);
				afriandi--;
			}
			return value;
			
		}
		public void cetak() {
			System.out.println("STEP : "+afriandi+" > KELAS E: "+informatika.toString());
		}
	}


