package penggajian;

public class staf extends pegawai {
	private int jumlah_kehadiran;
	private final int TARIF_HARIAN = 5000;
	
	public staf(){
		
	}
	public staf(String nip, String nama, String alamat){
		super(nip, nama, alamat);
	}
	public void setKehadiran(int jumlah_kehadiran){
		this.jumlah_kehadiran = jumlah_kehadiran;
	}
	@Override
	public int getGaji(){
		int total_gaji  = jumlah_kehadiran*TARIF_HARIAN;
		return total_gaji+super.getGaji();
		
	}
	public void setHitungNilai (){
		
	}
}
