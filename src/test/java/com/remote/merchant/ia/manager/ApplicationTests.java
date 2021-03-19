package com.remote.merchant.ia.manager;

import java.time.LocalDate;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({})
class ApplicationTests {
	
	private String[] departOrderedCoteNumber={"6", "8", "5"};
	private String[] departOrderedCote={"3", "5", "6"};
	
	private String[] arrivalOrderedCote={"17", "32", "3"};
	private String[] arrivalOrderedNumber={"4", "15", "8"};
	
	private String[] departOrderedPronosticNumber= {"6", "8", "5"};
	private String[] departOrderedPronosticCote= {"3", "5", "6"};
	
	private String[] departOrderedSynthesisPronosticNumber= {"6", "8", "5"};
	private String[] departOrderedSynthesisPronosticCote= {"3", "5", "6"};
	
	private String[] departOrderedExternalPronosticNumber= {"6", "8", "5"};
	private String[] departOrderedExternalPronosticCote= {"3", "5", "6"};
	
    private String[][] caseFirstPositionCote = new String[10][3];
	private String[][] caseFirstPositionNumber = new String[10][3];
	
	
	private int nextFirstPositionMaxIndex;
	private String[] competitionReturnOnInvestment = {"3", "5", "6"};
	
	
	private int learningByCote() {
		
		float firstPositionCoteAverage = 0;
		
		for(int i =0; i < caseFirstPositionCote.length ; i ++) {
			for(int j = 0 ; j < 3 ; j ++) {
				if(caseFirstPositionCote[i][j] != null)
				firstPositionCoteAverage = firstPositionCoteAverage + Integer.valueOf(caseFirstPositionCote[i][j]) ;
			}
			
			firstPositionCoteAverage = firstPositionCoteAverage / 3;
		}
		
		firstPositionCoteAverage = firstPositionCoteAverage / caseFirstPositionCote.length;
		
		for(int i =0; i < departOrderedCote.length ; i ++) {
			if ( Integer.valueOf(departOrderedCote[i]) > firstPositionCoteAverage )
				break;
			nextFirstPositionMaxIndex = i;
		}
		
		return nextFirstPositionMaxIndex;
	}
	
	/**
	 * @return the departOrderedSynthesisPronosticNumber
	 */
	public String[] getDepartOrderedSynthesisPronosticNumber() {
		return departOrderedSynthesisPronosticNumber;
	}

	/**
	 * @param departOrderedSynthesisPronosticNumber the departOrderedSynthesisPronosticNumber to set
	 */
	public void setDepartOrderedSynthesisPronosticNumber(String[] departOrderedSynthesisPronosticNumber) {
		this.departOrderedSynthesisPronosticNumber = departOrderedSynthesisPronosticNumber;
	}

	/**
	 * @return the departOrderedSynthesisPronosticCote
	 */
	public String[] getDepartOrderedSynthesisPronosticCote() {
		return departOrderedSynthesisPronosticCote;
	}

	/**
	 * @param departOrderedSynthesisPronosticCote the departOrderedSynthesisPronosticCote to set
	 */
	public void setDepartOrderedSynthesisPronosticCote(String[] departOrderedSynthesisPronosticCote) {
		this.departOrderedSynthesisPronosticCote = departOrderedSynthesisPronosticCote;
	}

	/**
	 * @return the departOrderedExternalPronosticNumber
	 */
	public String[] getDepartOrderedExternalPronosticNumber() {
		return departOrderedExternalPronosticNumber;
	}

	/**
	 * @param departOrderedExternalPronosticNumber the departOrderedExternalPronosticNumber to set
	 */
	public void setDepartOrderedExternalPronosticNumber(String[] departOrderedExternalPronosticNumber) {
		this.departOrderedExternalPronosticNumber = departOrderedExternalPronosticNumber;
	}

	/**
	 * @return the departOrderedExternalPronosticCote
	 */
	public String[] getDepartOrderedExternalPronosticCote() {
		return departOrderedExternalPronosticCote;
	}

	/**
	 * @param departOrderedExternalPronosticCote the departOrderedExternalPronosticCote to set
	 */
	public void setDepartOrderedExternalPronosticCote(String[] departOrderedExternalPronosticCote) {
		this.departOrderedExternalPronosticCote = departOrderedExternalPronosticCote;
	}

	/**
	 * @return the competitionReturnOnInvestment
	 */
	public String[] getCompetitionReturnOnInvestment() {
		return competitionReturnOnInvestment;
	}

	/**
	 * @param competitionReturnOnInvestment the competitionReturnOnInvestment to set
	 */
	public void setCompetitionReturnOnInvestment(String[] competitionReturnOnInvestment) {
		this.competitionReturnOnInvestment = competitionReturnOnInvestment;
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
		return "ApplicationTests [departOrderedCoteNumber=" + Arrays.toString(departOrderedCoteNumber)
				+ ", departOrderedCote=" + Arrays.toString(departOrderedCote) + ", arrivalOrderedCote="
				+ Arrays.toString(arrivalOrderedCote) + ", arrivalOrderedNumber="
				+ Arrays.toString(arrivalOrderedNumber) + ", departOrderedPronosticNumber="
				+ Arrays.toString(departOrderedPronosticNumber) + ", departOrderedPronosticCote="
				+ Arrays.toString(departOrderedPronosticCote) + ", departOrderedSynthesisPronosticNumber="
				+ Arrays.toString(departOrderedSynthesisPronosticNumber) + ", departOrderedSynthesisPronosticCote="
				+ Arrays.toString(departOrderedSynthesisPronosticCote) + ", departOrderedExternalPronosticNumber="
				+ Arrays.toString(departOrderedExternalPronosticNumber) + ", departOrderedExternalPronosticCote="
				+ Arrays.toString(departOrderedExternalPronosticCote) + ", caseFirstPositionCote="
				+ Arrays.toString(caseFirstPositionCote) + ", caseFirstPositionNumber="
				+ Arrays.toString(caseFirstPositionNumber) + ", competitionReturnOnInvestment="
				+ Arrays.toString(competitionReturnOnInvestment) + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(arrivalOrderedCote);
		result = prime * result + Arrays.hashCode(arrivalOrderedNumber);
		result = prime * result + Arrays.deepHashCode(caseFirstPositionCote);
		result = prime * result + Arrays.deepHashCode(caseFirstPositionNumber);
		result = prime * result + Arrays.hashCode(competitionReturnOnInvestment);
		result = prime * result + Arrays.hashCode(departOrderedCote);
		result = prime * result + Arrays.hashCode(departOrderedCoteNumber);
		result = prime * result + Arrays.hashCode(departOrderedExternalPronosticCote);
		result = prime * result + Arrays.hashCode(departOrderedExternalPronosticNumber);
		result = prime * result + Arrays.hashCode(departOrderedPronosticCote);
		result = prime * result + Arrays.hashCode(departOrderedPronosticNumber);
		result = prime * result + Arrays.hashCode(departOrderedSynthesisPronosticCote);
		result = prime * result + Arrays.hashCode(departOrderedSynthesisPronosticNumber);
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
				&& Arrays.equals(competitionReturnOnInvestment, other.competitionReturnOnInvestment)
				&& Arrays.equals(departOrderedCote, other.departOrderedCote)
				&& Arrays.equals(departOrderedCoteNumber, other.departOrderedCoteNumber)
				&& Arrays.equals(departOrderedExternalPronosticCote, other.departOrderedExternalPronosticCote)
				&& Arrays.equals(departOrderedExternalPronosticNumber, other.departOrderedExternalPronosticNumber)
				&& Arrays.equals(departOrderedPronosticCote, other.departOrderedPronosticCote)
				&& Arrays.equals(departOrderedPronosticNumber, other.departOrderedPronosticNumber)
				&& Arrays.equals(departOrderedSynthesisPronosticCote, other.departOrderedSynthesisPronosticCote)
				&& Arrays.equals(departOrderedSynthesisPronosticNumber, other.departOrderedSynthesisPronosticNumber);
	}
	
	@Test
	 public void learningByCoteTest() {
		 	MerchantBean merchant = new MerchantBean("Vahid", "Mousaei", "1", LocalDate.of(2020, 12, 31));
	        Assert.assertNotNull(merchant);
		 	learningByCote();
		 	System.out.println("nextFirstPositionMaxIndex Actuall is: " + nextFirstPositionMaxIndex);
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