public class Mahasiswa {
	String nama,nim,alamat;
	char kelas;
	
	public Mahasiswa (String nama, String nim, char kelas, String alamat) {
		this.nama = nama;
		this.nim = nim;
		this.kelas = kelas;
		this.alamat = alamat;
	}
	public String getnama(){
		return nama;
	}
	public String getnim(){
		return nim;
	}
	public char getkelas(){
		return kelas;
	}
	public String getalamat(){
		return alamat;
	}
}






