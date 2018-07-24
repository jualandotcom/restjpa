package com.restjpa.db.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the tb_master_member_address database table.
 * 
 */
@Entity
@Table(name="tb_master_member_address")
@NamedQuery(name="TbMasterMemberAddress.findAll", query="SELECT t FROM TbMasterMemberAddress t")
public class TbMasterMemberAddress implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="tbmma_id")
	private Integer tbmmaId;

	@Column(name="tbmma_address")
	private String tbmmaAddress;

	@Column(name="tbmma_city")
	private String tbmmaCity;

	@Column(name="tbmma_name")
	private String tbmmaName;

	@Column(name="tbmma_phone")
	private String tbmmaPhone;

	@Column(name="tbmma_poscode")
	private String tbmmaPoscode;

	@Column(name="tbmma_province")
	private String tbmmaProvince;

	@Column(name="tbmma_subdistrict")
	private String tbmmaSubdistrict;

	@Column(name="tbmma_urban")
	private String tbmmaUrban;

	//bi-directional many-to-one association to TbMasterStatus
	@ManyToOne
	@JoinColumn(name="tbmma_status")
	private TbMasterStatus tbMasterStatus;

	public TbMasterMemberAddress() {
	}

	public Integer getTbmmaId() {
		return this.tbmmaId;
	}

	public void setTbmmaId(Integer tbmmaId) {
		this.tbmmaId = tbmmaId;
	}

	public String getTbmmaAddress() {
		return this.tbmmaAddress;
	}

	public void setTbmmaAddress(String tbmmaAddress) {
		this.tbmmaAddress = tbmmaAddress;
	}

	public String getTbmmaCity() {
		return this.tbmmaCity;
	}

	public void setTbmmaCity(String tbmmaCity) {
		this.tbmmaCity = tbmmaCity;
	}

	public String getTbmmaName() {
		return this.tbmmaName;
	}

	public void setTbmmaName(String tbmmaName) {
		this.tbmmaName = tbmmaName;
	}

	public String getTbmmaPhone() {
		return this.tbmmaPhone;
	}

	public void setTbmmaPhone(String tbmmaPhone) {
		this.tbmmaPhone = tbmmaPhone;
	}

	public String getTbmmaPoscode() {
		return this.tbmmaPoscode;
	}

	public void setTbmmaPoscode(String tbmmaPoscode) {
		this.tbmmaPoscode = tbmmaPoscode;
	}

	public String getTbmmaProvince() {
		return this.tbmmaProvince;
	}

	public void setTbmmaProvince(String tbmmaProvince) {
		this.tbmmaProvince = tbmmaProvince;
	}

	public String getTbmmaSubdistrict() {
		return this.tbmmaSubdistrict;
	}

	public void setTbmmaSubdistrict(String tbmmaSubdistrict) {
		this.tbmmaSubdistrict = tbmmaSubdistrict;
	}

	public String getTbmmaUrban() {
		return this.tbmmaUrban;
	}

	public void setTbmmaUrban(String tbmmaUrban) {
		this.tbmmaUrban = tbmmaUrban;
	}

	public TbMasterStatus getTbMasterStatus() {
		return this.tbMasterStatus;
	}

	public void setTbMasterStatus(TbMasterStatus tbMasterStatus) {
		this.tbMasterStatus = tbMasterStatus;
	}

}