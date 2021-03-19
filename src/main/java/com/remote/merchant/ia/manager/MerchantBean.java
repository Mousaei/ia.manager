/**
 * 
 */
package com.remote.merchant.ia.manager;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonGetter;

/**
 * @author vahidmousaei
 *
 */
@Entity
public class MerchantBean implements Serializable {
		 
	    private static final long serialVersionUID = -3760445487636086034L;
	    @Id
	    @GeneratedValue
	    private Long id;
	    public Long getId() {
	        return this.id;
	      }
	    
	    public void setId(Long id) {
	        this.id = id;
	      }

	    @Column(name="MERCHANT_FNAME", length=50, nullable=false, unique=false)
	    private String firstName;
	    @Column(name="MERCHANT_LNAME", length=50, nullable=false, unique=false)
	    private String lastName;
	    private String siretCode;
	    private LocalDate startDate;
	    
	    private String adresse;
	    private String avecOuSansPhoto;
	    private String nomFruitLegume;
	 
	    /**
		 * @return the adresse
		 */
		public String getAdresse() {
			return adresse;
		}

		/**
		 * @param adresse the adresse to set
		 */
		public void setAdresse(String adresse) {
			this.adresse = adresse;
		}

		/**
		 * @return the avecOuSansPhoto
		 */
		public String getAvecOuSansPhoto() {
			return avecOuSansPhoto;
		}

		/**
		 * @param avecOuSansPhoto the avecOuSansPhoto to set
		 */
		public void setAvecOuSansPhoto(String avecOuSansPhoto) {
			this.avecOuSansPhoto = avecOuSansPhoto;
		}

		/**
		 * @return the nomFruitLegume
		 */
		public String getNomFruitLegume() {
			return nomFruitLegume;
		}

		/**
		 * @param nomFruitLegume the nomFruitLegume to set
		 */
		public void setNomFruitLegume(String nomFruitLegume) {
			this.nomFruitLegume = nomFruitLegume;
		}

		/**
		 * @return the serialversionuid
		 */
		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public int hashCode() {
			return Objects.hash(adresse, avecOuSansPhoto, firstName, id, lastName, nomFruitLegume, siretCode,
					startDate);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			}
			if (!(obj instanceof MerchantBean)) {
				return false;
			}
			MerchantBean other = (MerchantBean) obj;
			return Objects.equals(adresse, other.adresse) && Objects.equals(avecOuSansPhoto, other.avecOuSansPhoto)
					&& Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
					&& Objects.equals(lastName, other.lastName) && Objects.equals(nomFruitLegume, other.nomFruitLegume)
					&& Objects.equals(siretCode, other.siretCode) && Objects.equals(startDate, other.startDate);
		}

		@Override
		public String toString() {
			return "MerchantBean [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", siretCode="
					+ siretCode + ", startDate=" + startDate + ", adresse=" + adresse + ", avecOuSansPhoto="
					+ avecOuSansPhoto + ", nomFruitLegume=" + nomFruitLegume + "]";
		}

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
	 
	    @JsonGetter("firstName")
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

		 @JsonGetter("lastName")
		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public MerchantBean orElseThrow(Object object) {
			// TODO Auto-generated method stub
			return null;
		}

	 //  additional getters/setters
}
