package penggajian;

public class dosen extends pegawai {
	private int jumlahSKS;
	private final int TARIF_SKS = 120000;
	
	public dosen (){
		
	}
	public dosen (String nip, String nama, String alamat){
		super (nip, nama, alamat);
	}
	public void setSKS(int SKS){
		this.jumlahSKS = SKS;
	}
	@Override
	public int getGaji(){
		int total_gaji = jumlahSKS*TARIF_SKS;
		return total_gaji+super.getGaji();
	}
}
