package com.remote.merchant.ia.manager;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	private String[] departOrderedCoteNumber={"6", "8", "5"};
	private String[] departOrderedCote={"3", "5", "6"};
	
	private String[] arrivalCoteNumber={"17", "32", "3"};
	private String[] arrivalNumber={"4", "15", "8"};
	
	private String[] departRankPronostic= {"6", "8", "5"};
	private String[] departCotePronostic= {"3", "5", "6"};
	
	private String[][] caseCoteFirstPosition = new String[10][3];
	private String[][] casePronosticFirstPosition = new String[10][3];
	
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
	 * @return the casePronosticFirstPosition
	 */
	public String[][] getCasePronosticFirstPosition() {
		return casePronosticFirstPosition;
	}

	/**
	 * @param casePronosticFirstPosition the casePronosticFirstPosition to set
	 */
	public void setCasePronosticFirstPosition(String[][] casePronosticFirstPosition) {
		this.casePronosticFirstPosition = casePronosticFirstPosition;
	}

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
	 * @param caseCoteFirstPosition the caseCoteFirstPosition to set
	 */
	public void setCaseCoteFirstPosition(String[][] caseCoteFirstPosition) {
		this.caseCoteFirstPosition = caseCoteFirstPosition;
	}

	

	public ApplicationTests() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

	/**
	 * @return the arrivalNumber
	 */
	public String[] getArrivalNumber() {
		return arrivalNumber;
	}

	/**
	 * @param arrivalNumber the arrivalNumber to set
	 */
	public void setArrivalNumber(String[] arrivalNumber) {
		this.arrivalNumber = arrivalNumber;
	}

	/**
	 * @return the departCotePronostic
	 */
	public String[] getDepartCotePronostic() {
		return departCotePronostic;
	}

	/**
	 * @param departCotePronostic the departCotePronostic to set
	 */
	public void setDepartCotePronostic(String[] departCotePronostic) {
		this.departCotePronostic = departCotePronostic;
	}

	
	

	public String[] getArrivalCoteNumber() {
		return arrivalCoteNumber;
	}

	public void setArrivalCoteNumber(String[] arrivalCoteNumber) {
		this.arrivalCoteNumber = arrivalCoteNumber;
	}

	public String[] getDepartRankPronostic() {
		return departRankPronostic;
	}

	public void setDepartRankPronostic(String[] departRankPronostic) {
		this.departRankPronostic = departRankPronostic;
	}


	
	/**
	 * @return the caseCoteFirstPosition
	 */
	public String[][] getCaseCoteFirstPosition() {
		return caseCoteFirstPosition;
	}

	


	@Override
	public String toString() {
		return "ApplicationTests [departOrderedCoteNumber=" + Arrays.toString(departOrderedCoteNumber)
				+ ", departOrderedCote=" + Arrays.toString(departOrderedCote) + ", arrivalCoteNumber="
				+ Arrays.toString(arrivalCoteNumber) + ", arrivalNumber=" + Arrays.toString(arrivalNumber)
				+ ", departRankPronostic=" + Arrays.toString(departRankPronostic) + ", departCotePronostic="
				+ Arrays.toString(departCotePronostic) + ", caseCoteFirstPosition="
				+ Arrays.toString(caseCoteFirstPosition) + ", casePronosticFirstPosition="
				+ Arrays.toString(casePronosticFirstPosition) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arrivalCoteNumber);
		result = prime * result + Arrays.hashCode(arrivalNumber);
		result = prime * result + Arrays.deepHashCode(caseCoteFirstPosition);
		result = prime * result + Arrays.deepHashCode(casePronosticFirstPosition);
		result = prime * result + Arrays.hashCode(departCotePronostic);
		result = prime * result + Arrays.hashCode(departOrderedCote);
		result = prime * result + Arrays.hashCode(departOrderedCoteNumber);
		result = prime * result + Arrays.hashCode(departRankPronostic);
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
		return Arrays.equals(arrivalCoteNumber, other.arrivalCoteNumber)
				&& Arrays.equals(arrivalNumber, other.arrivalNumber)
				&& Arrays.deepEquals(caseCoteFirstPosition, other.caseCoteFirstPosition)
				&& Arrays.deepEquals(casePronosticFirstPosition, other.casePronosticFirstPosition)
				&& Arrays.equals(departCotePronostic, other.departCotePronostic)
				&& Arrays.equals(departOrderedCote, other.departOrderedCote)
				&& Arrays.equals(departOrderedCoteNumber, other.departOrderedCoteNumber)
				&& Arrays.equals(departRankPronostic, other.departRankPronostic);
	}

	@Test
	void contextLoads() {
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

	
}
