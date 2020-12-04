package org.ifunpas.kpl.kode;

import java.util.ArrayList;
import java.util.List;

public class Tim {
	//andkjas
	private String nama;
	private List<Pemain> pemainInti = new ArrayList<Pemain>();
	
	public Tim() {
		nama = "";
	}
	public Tim(String nama) {
		this.nama = nama;
	}
	
	public boolean tambahPemainInti(Pemain pemain) {
		if(pemainInti.size() < 11) {
			pemainInti.add(pemain);
			System.out.println(pemain.getNama()+" berhasil ditambahkan sebagai pemain Inti.");
			return true;
		}else {
			System.out.println(pemain.getNama()+ " tidak berhasil ditambahkan sebagai pemain Inti.");
			return false;
		}
	}

	public void tampilPemainInti() {
		for(int i = 0; i < pemainInti.size(); i++) {
			Pemain p =  pemainInti.get(i);
			System.out.println(p.getNoPunggung() + " # " + p.getNama());
		}
	}

	

}
