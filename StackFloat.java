import java.util.ArrayList;


public class StackFloat {
	ArrayList<Float> kotak =new ArrayList<Float>();
	public int afri = -1;
	
	public void push(float value){
		afri++;
		kotak.add(afri,value);
	}
	public float pop(){
		float value = afri;
		if (afri>-1){
			value = kotak.get(afri);
			kotak.remove(afri);
			afri--;
		}
		return value;}
		public void cetak(){
	System.out.println(kotak.toString());
		}
}
