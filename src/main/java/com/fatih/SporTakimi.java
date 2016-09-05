package com.fatih;

public class SporTakimi {
	
	public static enum SporTuru{
		
		FUTBOL,BASKETBOL,HENTBOL,TENNİS
	}
	
	private SporTuru tur;
	private String takimAdi;
	private int kurulus;
	/**
	 * @return the tur
	 */
	public SporTuru getTur() {
		return tur;
	}
	/**
	 * @param tur the tur to set
	 */
	public void setTur(SporTuru tur) {
		this.tur = tur;
	}
	/**
	 * @return the takimAdi
	 */
	public String getTakimAdi() {
		return takimAdi;
	}
	/**
	 * @param takimAdi the takimAdi to set
	 */
	public void setTakimAdi(String takimAdi) {
		this.takimAdi = takimAdi;
	}
	/**
	 * @return the kurulus
	 */
	public int getKurulus() {
		return kurulus;
	}
	/**
	 * @param kurulus the kurulus to set
	 */
	public void setKurulus(int kurulus) {
		this.kurulus = kurulus;
	}
	
	@Override
	public String toString() {
		return "SporTakimi [tur=" + tur + ", takimAdi=" + takimAdi + ", kurulus=" + kurulus + "]";
	}
	
	
	
	


}
