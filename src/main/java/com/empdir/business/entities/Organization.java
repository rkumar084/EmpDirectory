/**
 * 
 */
package com.empdir.business.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author sthatiparthi
 *
 */
public class Organization implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -70400600256802914L;

	@Id
	@GeneratedValue(generator = "orgIdsequence", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "orgIdsequence", sequenceName = "org_id_seq", allocationSize = 1)
	@Column(name = "id")
	private Integer id;

	@Basic
	@Column(name = "name")
	private String name;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
