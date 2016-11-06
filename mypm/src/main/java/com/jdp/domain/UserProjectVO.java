package com.jdp.domain;
/** 
 *  Created by 2015112137 차시황
 */
public class UserProjectVO {

	private String uid;
	private int pno;
	private int pmflag;
	private String department; // 맡은 분야 or 부서
	
	public UserProjectVO(String uid, int pno, int pmflag, String department) {
		super();
		this.uid = uid;
		this.pno = pno;
		this.pmflag = pmflag;
		this.department = department;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public int getPmflag() {
		return pmflag;
	}
	public void setPmflag(int pmflag) {
		this.pmflag = pmflag;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "UserProjectVO [uid=" + uid + ", pno=" + pno + ", pmflag=" + pmflag + ", department=" + department + "]";
	}
	
	
}
