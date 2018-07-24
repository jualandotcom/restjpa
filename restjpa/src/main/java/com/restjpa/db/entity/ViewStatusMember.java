package com.restjpa.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the view_status_member database table.
 * 
 */
@Entity
@Table(name="view_status_member")
@NamedQuery(name="ViewStatusMember.findAll", query="SELECT v FROM ViewStatusMember v")
public class ViewStatusMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="tbmm_first_name")
	private String tbmmFirstName;

	@Column(name="tbms_id")
	private Integer tbmsId;

	@Column(name="tbms_id_parent")
	private Integer tbmsIdParent;

	@Column(name="tbms_name")
	private String tbmsName;

	@Id
	private String uuid;

	public ViewStatusMember() {
	}

	public String getTbmmFirstName() {
		return this.tbmmFirstName;
	}

	public void setTbmmFirstName(String tbmmFirstName) {
		this.tbmmFirstName = tbmmFirstName;
	}

	public Integer getTbmsId() {
		return this.tbmsId;
	}

	public void setTbmsId(Integer tbmsId) {
		this.tbmsId = tbmsId;
	}

	public Integer getTbmsIdParent() {
		return this.tbmsIdParent;
	}

	public void setTbmsIdParent(Integer tbmsIdParent) {
		this.tbmsIdParent = tbmsIdParent;
	}

	public String getTbmsName() {
		return this.tbmsName;
	}

	public void setTbmsName(String tbmsName) {
		this.tbmsName = tbmsName;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

}