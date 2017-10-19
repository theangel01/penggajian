package penggajian;

public class DaftarGaji {
	private pegawai[] listPegawai;
	private int jumlahPegawaiSekarang = 0;
	
	public DaftarGaji (int jumlah_pegawai){
		listPegawai = new pegawai[jumlah_pegawai];
	}
	public void addPegawai (pegawai p){
		listPegawai[jumlahPegawaiSekarang]=p;
		jumlahPegawaiSekarang++;
	}
	public void printSemuaGaji (){
		for (int i=0; i<jumlahPegawaiSekarang; i++){
			System.out.print(listPegawai[i].getNama()+" mendapat Gaji ");
			System.out.println(listPegawai[i].getGaji());
		}
	}
}
