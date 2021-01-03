/**
 * 
 */
package com.remote.merchant.ia.manager;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * @author vahidmousaei
 *
 */
public class MerchantBean implements Serializable {
		 
	    private static final long serialVersionUID = -3760445487636086034L;
	    private String firstName;
	    private String lastName;
	    private String siretCode;
	    private LocalDate startDate;
	 
	    public MerchantBean(String firstName, String lastName, String siretCode, LocalDate startDate) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.siretCode = siretCode;
			this.startDate = startDate;
		}

		public LocalDate getStartDate() {
			return startDate;
		}

		public void setStartDate(LocalDate startDate) {
			this.startDate = startDate;
		}

		public MerchantBean() {
	    }
	 
	    public MerchantBean(String firstName, String lastName, LocalDate startDate) {
	        this.firstName = firstName;
	        this.setLastName(lastName);
	        this.startDate = startDate;
	    }
	 
	    public String getFirstName() {
	        return firstName;
	    }
	 
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }

		public String getSiretCode() {
			return siretCode;
		}

		public void setSiretCode(String siretCode) {
			this.siretCode = siretCode;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
	 
	    //  additional getters/setters
	 
	}
