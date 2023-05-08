package org.lessons.java.shop;

public class Prodotto {
	
	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	
	public Prodotto(int codice, String nome, String descrizione, float prezzo, int iva) {
		
		this.codice = codice;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
		
		
	}
	
	public int getCode() {
		return this.codice;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return this.descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public float getPrezzo() {
		return this.prezzo;
	}
	
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	
	public int getIva() {
		return this.iva;
	}
	
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	
	public float getPrezzoNoIva() {
		return this.prezzo;
	}
	
	public float getPrezzoIva() {
		
		float prezzoIva = this.prezzo * 1.22f;
		
		return prezzoIva;
	}
	
	public String getNomeCompleto() {
		
		String nomeCompleto = this.codice + this.nome;
		
		return nomeCompleto;
		
	}
	
	public String getCodicePadLeft() {
		
		int contatore = 0;
		String nuovoCodice = null;
		int codice = this.codice;
		
		
		while(codice != 0) {
			codice /= 10;
			++contatore;
		}
		
		if(contatore < 8) {
			
			
			nuovoCodice = String.format("%08d" , this.codice);
			
			
		}
		
		
		
		return nuovoCodice;
		
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "codice : " + getCode() + " nome : " + getNome();
	}
	
}
