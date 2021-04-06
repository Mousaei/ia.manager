package com.remote.merchant.ia.manager;


import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class AllDocumentTests {
	
	MerchantBean merchant;
	

	private int seuil = 2;
	
	private String[] SelectingNumber = new String[3]; 
	
	void contextLoads() {
	}
	
	

	/**
	 * @return the seuil
	 */
	public int getSeuil() {
		return seuil;
	}



	/**
	 * @param seuil the seuil to set
	 */
	public void setSeuil(int seuil) {
		this.seuil = seuil;
	}



	/**
	 * @return the selectingNumber
	 */
	public String[] getSelectingNumber() {
		return SelectingNumber;
	}



	/**
	 * @param selectingNumber the selectingNumber to set
	 */
	public void setSelectingNumber(String[] selectingNumber) {
		SelectingNumber = selectingNumber;
	}

	
	AllDocumentTests(){
		super();
	
		merchant = new MerchantBean("Vahid", "Mousaei", "001", LocalDate.of(2020, 12, 31));
	}
	 


	
	public int lerningFromDataByActivatingArtificialNeurone() {
		
		final String[] winerPresse = {"7", "3", "2", "1", "10"};
		final String[] winerEquidia = {"2", "3", "7", "10", "12"};
		final String[] highestCote = {"3", "7", "2", "6","1"};
		
		final String[] presseWeight =  {"1",   "1", "0.5", "0", "0"};
		final String[] equidiaWeight = {"0.5", "1", "1",   "0", "0"};
		final String[] coteWeight =    {"1",   "1", "0.5", "0", "0"};
		
		final String[] addingAndActivate = {"2.5", "3", "2.5", "0", "0"};
		
		
		for(int j = 0; j<presseWeight.length; j++) {
			if (Integer.valueOf(presseWeight[j]) > seuil ) {
				SelectingNumber[j] = winerPresse[j];
				
			}
			
		}
		
		for(int j = 0; j<equidiaWeight.length; j++) {
			if (Integer.valueOf(equidiaWeight[j]) > seuil ) {
				SelectingNumber[j] = winerEquidia[j];
				
			}
			
		}
		
		for(int j = 0; j<coteWeight.length; j++) {
			if (Integer.valueOf(coteWeight[j]) > seuil ) {
				SelectingNumber[j] = highestCote[j];
				
			}
			
		}
		
		
		for(int j = 0; j<SelectingNumber.length; j++) {
			System.out.println("Actual Selecting Number is: " + SelectingNumber[j]);
			
		}
		
		 MerchantBean merchant = new MerchantBean("Vahid", "Mousaei", "001", LocalDate.of(2020, 12, 31));
	     merchant.getFirstName();
		
		Assert.assertNotNull(merchant);
		return 1;
	}
	
	@Test
	public void getAllMockedDocumentMockedObject() {
		    MerchantBean merchant = new MerchantBean("Vahid", "Mousaei", "001", LocalDate.of(2020, 12, 31));
	        merchant.getFirstName();
	        Assert.assertNotNull(merchant);
	 }
	
	 
}
