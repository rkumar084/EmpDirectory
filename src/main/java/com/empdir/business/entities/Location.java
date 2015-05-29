/**
 * 
 */
package com.empdir.business.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author sthatiparthi
 *
 */
@Entity
@Table(name = "location")
public class Location implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4642428626175775443L;

	@Id
	@GeneratedValue(generator = "locIdsequence", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "locIdsequence", sequenceName = "loc_id_seq", allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Basic
	@Column(name = "address")
	private String address;

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
