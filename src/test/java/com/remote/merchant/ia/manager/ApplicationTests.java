package com.remote.merchant.ia.manager;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	private String[] departOrderedCoteNumber={"6", "8", "5"};
	private String[] departCote={"3", "5", "6"};
	
	private String[] arrivalCoteNumber={"17", "32", "3"};
	private String[] arrivalNumber={"4", "15", "8"};
	
	private String[] departRankPronostic= {"6", "8", "5"};
	private String[] departCotePronostic= {"3", "5", "6"};
	
	private String[][] caseCoteFirstPosition = new String[10][3];
	private String[][] caseRankPronosticFirstPosition = new String[10][3];
	
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

	/**
	 * @param caseRankPronosticFirstPosition the caseRankPronosticFirstPosition to set
	 */
	public void setCaseRankPronosticFirstPosition(String[][] caseRankPronosticFirstPosition) {
		this.caseRankPronosticFirstPosition = caseRankPronosticFirstPosition;
	}

	public ApplicationTests() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ApplicationTests [departCoteNumber=" + Arrays.toString(departOrderedCoteNumber) + ", departCote="
				+ Arrays.toString(departCote) + ", arrivalCoteNumber=" + Arrays.toString(arrivalCoteNumber)
				+ ", arrivalNumber=" + Arrays.toString(arrivalNumber) + ", departRankPronostic="
				+ Arrays.toString(departRankPronostic) + ", departCotePronostic=" + Arrays.toString(departCotePronostic)
				+ ", caseCoteFirstPosition=" + Arrays.toString(caseCoteFirstPosition)
				+ ", caseRankPronosticFirstPosition=" + Arrays.toString(caseRankPronosticFirstPosition) + "]";
	}

	
	/**
	 * @return the departCote
	 */
	public String[] getDepartCote() {
		return departCote;
	}

	/**
	 * @param departCote the departCote to set
	 */
	public void setDepartCote(String[] departCote) {
		this.departCote = departCote;
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

	/**
	 * @return the caseRankPronosticFirstPosition
	 */
	public String[][] getCaseRankPronosticFirstPosition() {
		return caseRankPronosticFirstPosition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arrivalCoteNumber);
		result = prime * result + Arrays.hashCode(arrivalNumber);
		result = prime * result + Arrays.hashCode(caseCoteFirstPosition);
		result = prime * result + Arrays.hashCode(caseRankPronosticFirstPosition);
		result = prime * result + Arrays.hashCode(departCote);
		result = prime * result + Arrays.hashCode(departOrderedCoteNumber);
		result = prime * result + Arrays.hashCode(departCotePronostic);
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
				&& Arrays.equals(caseCoteFirstPosition, other.caseCoteFirstPosition)
				&& Arrays.equals(caseRankPronosticFirstPosition, other.caseRankPronosticFirstPosition)
				&& Arrays.equals(departCote, other.departCote)
				&& Arrays.equals(departOrderedCoteNumber, other.departOrderedCoteNumber)
				&& Arrays.equals(departCotePronostic, other.departCotePronostic)
				&& Arrays.equals(departRankPronostic, other.departRankPronostic);
	}

	@Test
	void contextLoads() {
	}
	
	
}
