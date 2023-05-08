package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		String[] nomi = {"cibo","giocattolo","ombrellone","scatola","forbice"};
		Integer[] prezzi = {5,6,51,24,12};
		Prodotto[] prodotti = new Prodotto[5];
		
		for (int i = 0; i < 5; i++) {
			
			Prodotto newProdotto = new Prodotto(rnd.nextInt(1,100),nomi[i],"bla bla bla",prezzi[i],22);
			
			
			prodotti[i] = newProdotto;
			
			System.out.println(prodotti[i]);
			System.out.println(prodotti[i].getCodicePadLeft());
		}
		
		System.out.println(prodotti[0].getPrezzo());
		
		System.out.println(prodotti[0].getPrezzoIva());
		
//		System.out.println(Arrays.asList(prodotti));
		
	}
}
