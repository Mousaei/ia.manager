package com.remote.merchant.ia.manager;

class ApplicationTests {
	
	
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

}