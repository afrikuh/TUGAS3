import java.util.ArrayList;


public class StackString {
	ArrayList<String>kotak = new ArrayList<String>();
	int afri = -1;
	
	public void push(String value){
		afri++;
		kotak.add(afri,value);
	}
	public String pop(){
		String value = "KOSONG";
		if (afri>-1){
		value = kotak.get(afri);
		kotak.remove(afri);
		afri--;}
		return value;
		}
	
	public void cetak (){
		System.out.println("afri : " +afri+ " # namanya : "+kotak.toString());
	}
}



