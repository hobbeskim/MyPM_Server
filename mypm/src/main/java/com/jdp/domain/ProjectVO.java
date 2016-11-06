package com.jdp.domain;
/** 
 *  Created by 2015112137 차시황
 */
public class ProjectVO {

	private int pno;
	private String pname;
	private String pstartdate;
	private String penddate;
	private String pdescription;
	public ProjectVO(int pno, String pname, String pstartdate, String penddate, String pdescription) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.pstartdate = pstartdate;
		this.penddate = penddate;
		this.pdescription = pdescription;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPstartdate() {
		return pstartdate;
	}
	public void setPstartdate(String pstartdate) {
		this.pstartdate = pstartdate;
	}
	public String getPenddate() {
		return penddate;
	}
	public void setPenddate(String penddate) {
		this.penddate = penddate;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	@Override
	public String toString() {
		return "ProjectVO [pno=" + pno + ", pname=" + pname + ", pstartdate=" + pstartdate + ", penddate=" + penddate
				+ ", pdescription=" + pdescription + "]";
	}
}
