package com.restjpa.db.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the tb_master_member database table.
 * 
 */
@Entity
@Table(name="tb_master_member")
@NamedQuery(name="TbMasterMember.findAll", query="SELECT t FROM TbMasterMember t")
public class TbMasterMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tbmm_id")
	private Integer tbmmId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tbmm_create_date")
	private Date tbmmCreateDate;

	@Column(name="tbmm_create_id")
	private Integer tbmmCreateId;

	@Temporal(TemporalType.DATE)
	@Column(name="tbmm_dob")
	private Date tbmmDob;

	@Column(name="tbmm_first_name")
	private String tbmmFirstName;

	@Column(name="tbmm_identification_no")
	private String tbmmIdentificationNo;

	@Column(name="tbmm_last_name")
	private String tbmmLastName;

	@Column(name="tbmm_pob")
	private String tbmmPob;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="tbmm_update_date")
	private Date tbmmUpdateDate;

	@Column(name="tbmm_update_id")
	private Integer tbmmUpdateId;

	//bi-directional many-to-one association to TbMasterLogin
	@OneToMany(mappedBy="tbMasterMember")
	private List<TbMasterLogin> tbMasterLogins;

	//bi-directional many-to-one association to TbMasterStatus
	@ManyToOne
	@JoinColumn(name="tbmm_identification")
	private TbMasterStatus tbMasterStatus1;

	//bi-directional many-to-one association to TbMasterStatus
	@ManyToOne
	@JoinColumn(name="tbmm_status")
	private TbMasterStatus tbMasterStatus2;

	public TbMasterMember() {
	}

	public Integer getTbmmId() {
		return this.tbmmId;
	}

	public void setTbmmId(Integer tbmmId) {
		this.tbmmId = tbmmId;
	}

	public Date getTbmmCreateDate() {
		return this.tbmmCreateDate;
	}

	public void setTbmmCreateDate(Date tbmmCreateDate) {
		this.tbmmCreateDate = tbmmCreateDate;
	}

	public Integer getTbmmCreateId() {
		return this.tbmmCreateId;
	}

	public void setTbmmCreateId(Integer tbmmCreateId) {
		this.tbmmCreateId = tbmmCreateId;
	}

	public Date getTbmmDob() {
		return this.tbmmDob;
	}

	public void setTbmmDob(Date tbmmDob) {
		this.tbmmDob = tbmmDob;
	}

	public String getTbmmFirstName() {
		return this.tbmmFirstName;
	}

	public void setTbmmFirstName(String tbmmFirstName) {
		this.tbmmFirstName = tbmmFirstName;
	}

	public String getTbmmIdentificationNo() {
		return this.tbmmIdentificationNo;
	}

	public void setTbmmIdentificationNo(String tbmmIdentificationNo) {
		this.tbmmIdentificationNo = tbmmIdentificationNo;
	}

	public String getTbmmLastName() {
		return this.tbmmLastName;
	}

	public void setTbmmLastName(String tbmmLastName) {
		this.tbmmLastName = tbmmLastName;
	}

	public String getTbmmPob() {
		return this.tbmmPob;
	}

	public void setTbmmPob(String tbmmPob) {
		this.tbmmPob = tbmmPob;
	}

	public Date getTbmmUpdateDate() {
		return this.tbmmUpdateDate;
	}

	public void setTbmmUpdateDate(Date tbmmUpdateDate) {
		this.tbmmUpdateDate = tbmmUpdateDate;
	}

	public Integer getTbmmUpdateId() {
		return this.tbmmUpdateId;
	}

	public void setTbmmUpdateId(Integer tbmmUpdateId) {
		this.tbmmUpdateId = tbmmUpdateId;
	}

	public List<TbMasterLogin> getTbMasterLogins() {
		return this.tbMasterLogins;
	}

	public void setTbMasterLogins(List<TbMasterLogin> tbMasterLogins) {
		this.tbMasterLogins = tbMasterLogins;
	}

	public TbMasterLogin addTbMasterLogin(TbMasterLogin tbMasterLogin) {
		getTbMasterLogins().add(tbMasterLogin);
		tbMasterLogin.setTbMasterMember(this);

		return tbMasterLogin;
	}

	public TbMasterLogin removeTbMasterLogin(TbMasterLogin tbMasterLogin) {
		getTbMasterLogins().remove(tbMasterLogin);
		tbMasterLogin.setTbMasterMember(null);

		return tbMasterLogin;
	}

	public TbMasterStatus getTbMasterStatus1() {
		return this.tbMasterStatus1;
	}

	public void setTbMasterStatus1(TbMasterStatus tbMasterStatus1) {
		this.tbMasterStatus1 = tbMasterStatus1;
	}

	public TbMasterStatus getTbMasterStatus2() {
		return this.tbMasterStatus2;
	}

	public void setTbMasterStatus2(TbMasterStatus tbMasterStatus2) {
		this.tbMasterStatus2 = tbMasterStatus2;
	}

}