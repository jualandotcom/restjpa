package com.restjpa.db.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the tb_master_login database table.
 * 
 */
@Entity
@Table(name="tb_master_login")
@NamedQuery(name="TbMasterLogin.findAll", query="SELECT t FROM TbMasterLogin t")
public class TbMasterLogin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tbml_id")
	private Integer tbmlId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tbml_create_date")
	private Date tbmlCreateDate;

	@Column(name="tbml_create_id")
	private Integer tbmlCreateId;

	@Column(name="tbml_password")
	private String tbmlPassword;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tbml_update_date")
	private Date tbmlUpdateDate;

	@Column(name="tbml_update_id")
	private Integer tbmlUpdateId;

	@Column(name="tbml_userid")
	private String tbmlUserid;

	//bi-directional many-to-one association to TbMasterMember
	@ManyToOne
	@JoinColumn(name="tbmm_id")
	private TbMasterMember tbMasterMember;

	public TbMasterLogin() {
	}

	public Integer getTbmlId() {
		return this.tbmlId;
	}

	public void setTbmlId(Integer tbmlId) {
		this.tbmlId = tbmlId;
	}

	public Date getTbmlCreateDate() {
		return this.tbmlCreateDate;
	}

	public void setTbmlCreateDate(Date tbmlCreateDate) {
		this.tbmlCreateDate = tbmlCreateDate;
	}

	public Integer getTbmlCreateId() {
		return this.tbmlCreateId;
	}

	public void setTbmlCreateId(Integer tbmlCreateId) {
		this.tbmlCreateId = tbmlCreateId;
	}

	public String getTbmlPassword() {
		return this.tbmlPassword;
	}

	public void setTbmlPassword(String tbmlPassword) {
		this.tbmlPassword = tbmlPassword;
	}

	public Date getTbmlUpdateDate() {
		return this.tbmlUpdateDate;
	}

	public void setTbmlUpdateDate(Date tbmlUpdateDate) {
		this.tbmlUpdateDate = tbmlUpdateDate;
	}

	public Integer getTbmlUpdateId() {
		return this.tbmlUpdateId;
	}

	public void setTbmlUpdateId(Integer tbmlUpdateId) {
		this.tbmlUpdateId = tbmlUpdateId;
	}

	public String getTbmlUserid() {
		return this.tbmlUserid;
	}

	public void setTbmlUserid(String tbmlUserid) {
		this.tbmlUserid = tbmlUserid;
	}

	public TbMasterMember getTbMasterMember() {
		return this.tbMasterMember;
	}

	public void setTbMasterMember(TbMasterMember tbMasterMember) {
		this.tbMasterMember = tbMasterMember;
	}

}