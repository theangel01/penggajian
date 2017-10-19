package penggajian;

import java.util.Scanner;

public class programUtama {

	public static void main(String[] args) {
		String Nama;
		int kehadiran;
		Scanner apa =new Scanner (System.in);
		Scanner jumlah = new Scanner (System.in);
		staf s1 = new staf();
		System.out.print("Masukkan Nama : ");
		Nama = apa.nextLine();
		s1.setNama(Nama);
		
		System.out.print("Masukkan jumlah Kehadiran : ");
		kehadiran = jumlah.nextInt();
		s1.setKehadiran(kehadiran);
		
		System.out.println("==============================");
		dosen d1 = new dosen ();
		System.out.print("Masukkan Nama : ");
		Nama = apa.nextLine();
		d1.setNama(Nama);
		
		System.out.print("Masukkan jumlah SKS : ");
		kehadiran = jumlah.nextInt();
		d1.setSKS(kehadiran);
		System.out.println("==============================");
		
		pegawai p1 = new pegawai();
		System.out.print("Masukkan Nama : ");
		Nama = apa.nextLine();
		p1.setNama(Nama);
		
		System.out.println("==============================");
		DaftarGaji daftar_gaji = new DaftarGaji(3);
		daftar_gaji.addPegawai(s1);
		daftar_gaji.addPegawai(d1);
		daftar_gaji.addPegawai(p1);
		daftar_gaji.printSemuaGaji();
		
		

	}

}
