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
	public void tampilPemainInti() {
		for(int i = 0; i < pemainInti.size(); i++) {
			Pemain p =  pemainInti.get(i);
			System.out.println(p.getNoPunggung() + " # " + p.getNama());
		}
	}
	
}
