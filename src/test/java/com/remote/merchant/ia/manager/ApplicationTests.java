package com.remote.merchant.ia.manager;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	private String[] departOrderedCoteNumber={"6", "8", "5"};
	private String[] departOrderedCote={"3", "5", "6"};
	
	private String[] arrivalOrderedCote={"17", "32", "3"};
	private String[] arrivalOrderedNumber={"4", "15", "8"};
	
	private String[] departOrderedPronosticNumber= {"6", "8", "5"};
	private String[] departOrderedPronosticCote= {"3", "5", "6"};
	
	private String[][] caseFirstPositionCote = new String[10][3];
	private String[][] caseFirstPositionNumber = new String[10][3];
	
	public int calculateCoteFirstPositionByArrival(String[] arrivalCoteNumber) {
		int somme=0;
		int median=0;
		int actualIndMax=0;
		
		    // Initialisation du tableau
		    for (int i = 0 ; i < 10 ; i++)
		    {
		    	somme = somme + Integer.parseInt(arrivalCoteNumber[i]);
		    	if(Integer.parseInt(arrivalCoteNumber[i])==0)
		    		actualIndMax =i;
		    }

		median = somme/actualIndMax;
		return median;
	}

	/**
	 * @return the departOrderedCoteNumber
	 */
	public String[] getDepartOrderedCoteNumber() {
		return departOrderedCoteNumber;
	}

	/**
	 * @param departOrderedCoteNumber the departOrderedCoteNumber to set
	 */
	public void setDepartOrderedCoteNumber(String[] departOrderedCoteNumber) {
		this.departOrderedCoteNumber = departOrderedCoteNumber;
	}

	/**
	 * @return the departOrderedCote
	 */
	public String[] getDepartOrderedCote() {
		return departOrderedCote;
	}

	/**
	 * @param departOrderedCote the departOrderedCote to set
	 */
	public void setDepartOrderedCote(String[] departOrderedCote) {
		this.departOrderedCote = departOrderedCote;
	}

	/**
	 * @return the arrivalOrderedCote
	 */
	public String[] getArrivalOrderedCote() {
		return arrivalOrderedCote;
	}

	/**
	 * @param arrivalOrderedCote the arrivalOrderedCote to set
	 */
	public void setArrivalOrderedCote(String[] arrivalOrderedCote) {
		this.arrivalOrderedCote = arrivalOrderedCote;
	}

	/**
	 * @return the arrivalOrderedNumber
	 */
	public String[] getArrivalOrderedNumber() {
		return arrivalOrderedNumber;
	}

	/**
	 * @param arrivalOrderedNumber the arrivalOrderedNumber to set
	 */
	public void setArrivalOrderedNumber(String[] arrivalOrderedNumber) {
		this.arrivalOrderedNumber = arrivalOrderedNumber;
	}

	/**
	 * @return the departOrderedPronosticNumber
	 */
	public String[] getDepartOrderedPronosticNumber() {
		return departOrderedPronosticNumber;
	}

	/**
	 * @param departOrderedPronosticNumber the departOrderedPronosticNumber to set
	 */
	public void setDepartOrderedPronosticNumber(String[] departOrderedPronosticNumber) {
		this.departOrderedPronosticNumber = departOrderedPronosticNumber;
	}

	/**
	 * @return the departOrderedPronosticCote
	 */
	public String[] getDepartOrderedPronosticCote() {
		return departOrderedPronosticCote;
	}

	/**
	 * @param departOrderedPronosticCote the departOrderedPronosticCote to set
	 */
	public void setDepartOrderedPronosticCote(String[] departOrderedPronosticCote) {
		this.departOrderedPronosticCote = departOrderedPronosticCote;
	}

	/**
	 * @return the caseFirstPositionCote
	 */
	public String[][] getCaseFirstPositionCote() {
		return caseFirstPositionCote;
	}

	/**
	 * @param caseFirstPositionCote the caseFirstPositionCote to set
	 */
	public void setCaseFirstPositionCote(String[][] caseFirstPositionCote) {
		this.caseFirstPositionCote = caseFirstPositionCote;
	}

	/**
	 * @return the caseFirstPositionNumber
	 */
	public String[][] getCaseFirstPositionNumber() {
		return caseFirstPositionNumber;
	}

	/**
	 * @param caseFirstPositionNumber the caseFirstPositionNumber to set
	 */
	public void setCaseFirstPositionNumber(String[][] caseFirstPositionNumber) {
		this.caseFirstPositionNumber = caseFirstPositionNumber;
	}

	@Override
	public String toString() {
		final int maxLen = 10;
		return "ApplicationTests [departOrderedCoteNumber=" + (departOrderedCoteNumber != null ? Arrays
				.asList(departOrderedCoteNumber).subList(0, Math.min(departOrderedCoteNumber.length, maxLen)) : null)
				+ ", departOrderedCote="
				+ (departOrderedCote != null ? Arrays
						.asList(departOrderedCote).subList(0, Math.min(departOrderedCote.length, maxLen)) : null)
				+ ", arrivalOrderedCote="
				+ (arrivalOrderedCote != null ? Arrays
						.asList(arrivalOrderedCote).subList(0, Math.min(arrivalOrderedCote.length, maxLen)) : null)
				+ ", arrivalOrderedNumber="
				+ (arrivalOrderedNumber != null ? Arrays.asList(arrivalOrderedNumber)
						.subList(0, Math.min(arrivalOrderedNumber.length, maxLen)) : null)
				+ ", departOrderedPronosticNumber="
				+ (departOrderedPronosticNumber != null ? Arrays.asList(departOrderedPronosticNumber)
						.subList(0, Math.min(departOrderedPronosticNumber.length, maxLen)) : null)
				+ ", departOrderedPronosticCote="
				+ (departOrderedPronosticCote != null ? Arrays.asList(departOrderedPronosticCote)
						.subList(0, Math.min(departOrderedPronosticCote.length, maxLen)) : null)
				+ ", caseFirstPositionCote="
				+ (caseFirstPositionCote != null ? Arrays.asList(caseFirstPositionCote).subList(0,
						Math.min(caseFirstPositionCote.length, maxLen)) : null)
				+ ", caseFirstPositionNumber="
				+ (caseFirstPositionNumber != null ? Arrays.asList(caseFirstPositionNumber).subList(0,
						Math.min(caseFirstPositionNumber.length, maxLen)) : null)
				+ "]";
	}

	/**
	 * @param departOrderedCoteNumber
	 * @param departOrderedCote
	 * @param arrivalOrderedCote
	 * @param arrivalOrderedNumber
	 * @param departOrderedPronosticNumber
	 * @param departOrderedPronosticCote
	 * @param caseFirstPositionCote
	 * @param caseFirstPositionNumber
	 */
	public ApplicationTests(String[] departOrderedCoteNumber, String[] departOrderedCote, String[] arrivalOrderedCote,
			String[] arrivalOrderedNumber, String[] departOrderedPronosticNumber, String[] departOrderedPronosticCote,
			String[][] caseFirstPositionCote, String[][] caseFirstPositionNumber) {
		super();
		this.departOrderedCoteNumber = departOrderedCoteNumber;
		this.departOrderedCote = departOrderedCote;
		this.arrivalOrderedCote = arrivalOrderedCote;
		this.arrivalOrderedNumber = arrivalOrderedNumber;
		this.departOrderedPronosticNumber = departOrderedPronosticNumber;
		this.departOrderedPronosticCote = departOrderedPronosticCote;
		this.caseFirstPositionCote = caseFirstPositionCote;
		this.caseFirstPositionNumber = caseFirstPositionNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arrivalOrderedCote);
		result = prime * result + Arrays.hashCode(arrivalOrderedNumber);
		result = prime * result + Arrays.deepHashCode(caseFirstPositionCote);
		result = prime * result + Arrays.deepHashCode(caseFirstPositionNumber);
		result = prime * result + Arrays.hashCode(departOrderedCote);
		result = prime * result + Arrays.hashCode(departOrderedCoteNumber);
		result = prime * result + Arrays.hashCode(departOrderedPronosticCote);
		result = prime * result + Arrays.hashCode(departOrderedPronosticNumber);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ApplicationTests)) {
			return false;
		}
		ApplicationTests other = (ApplicationTests) obj;
		return Arrays.equals(arrivalOrderedCote, other.arrivalOrderedCote)
				&& Arrays.equals(arrivalOrderedNumber, other.arrivalOrderedNumber)
				&& Arrays.deepEquals(caseFirstPositionCote, other.caseFirstPositionCote)
				&& Arrays.deepEquals(caseFirstPositionNumber, other.caseFirstPositionNumber)
				&& Arrays.equals(departOrderedCote, other.departOrderedCote)
				&& Arrays.equals(departOrderedCoteNumber, other.departOrderedCoteNumber)
				&& Arrays.equals(departOrderedPronosticCote, other.departOrderedPronosticCote)
				&& Arrays.equals(departOrderedPronosticNumber, other.departOrderedPronosticNumber);
	}
	
	

	
	
}
