package com.restjpa.db;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the tb_master_status database table.
 * 
 */
@Entity
@Table(name = "tb_master_status")
@NamedQuery(name = "TbMasterStatus.findAll", query = "SELECT t FROM TbMasterStatus t")
public class TbMasterStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "tbms_id")
	private Integer tbmsId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "tbms_create_date")
	private Date tbmsCreateDate;

	@Column(name = "tbms_create_id")
	private Integer tbmsCreateId;

	@Column(name = "tbms_id_parent")
	private Integer tbmsIdParent;

	@Column(name = "tbms_name")
	private String tbmsName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "tbms_update_date")
	private Date tbmsUpdateDate;

	@Column(name = "tbms_update_id")
	private Integer tbmsUpdateId;

	// bi-directional many-to-one association to TbMasterMember
	@OneToMany(mappedBy = "tbMasterStatus1")
	private List<TbMasterMember> tbMasterMembers1;

	// bi-directional many-to-one association to TbMasterMember
	@OneToMany(mappedBy = "tbMasterStatus2")
	private List<TbMasterMember> tbMasterMembers2;

	public TbMasterStatus() {
	}

	public Integer getTbmsId() {
		return this.tbmsId;
	}

	public void setTbmsId(Integer tbmsId) {
		this.tbmsId = tbmsId;
	}

	public Date getTbmsCreateDate() {
		return this.tbmsCreateDate;
	}

	public void setTbmsCreateDate(Date tbmsCreateDate) {
		this.tbmsCreateDate = tbmsCreateDate;
	}

	public Integer getTbmsCreateId() {
		return this.tbmsCreateId;
	}

	public void setTbmsCreateId(Integer tbmsCreateId) {
		this.tbmsCreateId = tbmsCreateId;
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

	public Date getTbmsUpdateDate() {
		return this.tbmsUpdateDate;
	}

	public void setTbmsUpdateDate(Date tbmsUpdateDate) {
		this.tbmsUpdateDate = tbmsUpdateDate;
	}

	public Integer getTbmsUpdateId() {
		return this.tbmsUpdateId;
	}

	public void setTbmsUpdateId(Integer tbmsUpdateId) {
		this.tbmsUpdateId = tbmsUpdateId;
	}

	public List<TbMasterMember> getTbMasterMembers1() {
		return this.tbMasterMembers1;
	}

	public void setTbMasterMembers1(List<TbMasterMember> tbMasterMembers1) {
		this.tbMasterMembers1 = tbMasterMembers1;
	}

	public TbMasterMember addTbMasterMembers1(TbMasterMember tbMasterMembers1) {
		getTbMasterMembers1().add(tbMasterMembers1);
		tbMasterMembers1.setTbMasterStatus1(this);

		return tbMasterMembers1;
	}

	public TbMasterMember removeTbMasterMembers1(TbMasterMember tbMasterMembers1) {
		getTbMasterMembers1().remove(tbMasterMembers1);
		tbMasterMembers1.setTbMasterStatus1(null);

		return tbMasterMembers1;
	}

	public List<TbMasterMember> getTbMasterMembers2() {
		return this.tbMasterMembers2;
	}

	public void setTbMasterMembers2(List<TbMasterMember> tbMasterMembers2) {
		this.tbMasterMembers2 = tbMasterMembers2;
	}

	public TbMasterMember addTbMasterMembers2(TbMasterMember tbMasterMembers2) {
		getTbMasterMembers2().add(tbMasterMembers2);
		tbMasterMembers2.setTbMasterStatus2(this);

		return tbMasterMembers2;
	}

	public TbMasterMember removeTbMasterMembers2(TbMasterMember tbMasterMembers2) {
		getTbMasterMembers2().remove(tbMasterMembers2);
		tbMasterMembers2.setTbMasterStatus2(null);

		return tbMasterMembers2;
	}

}