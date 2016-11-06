package com.jdp.domain;
/** 
 *  Created by 2015112137 차시황
 */
public class task {

	private int tno;
	private int pno;
	private String tname;
	private String tstartdate;
	private String tenddate;
	private int ucount;
	private int donecount;
	
	public task(int tno, int pno, String tname, String tstartdate, String tenddate, int ucount, int donecount) {
		super();
		this.tno = tno;
		this.pno = pno;
		this.tname = tname;
		this.tstartdate = tstartdate;
		this.tenddate = tenddate;
		this.ucount = ucount;
		this.donecount = donecount;
	}
	
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public int getPno() {
		return pno;
	}
	public void setPno(int pno) {
		this.pno = pno;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTstartdate() {
		return tstartdate;
	}
	public void setTstartdate(String tstartdate) {
		this.tstartdate = tstartdate;
	}
	public String getTenddate() {
		return tenddate;
	}
	public void setTenddate(String tenddate) {
		this.tenddate = tenddate;
	}
	public int getUcount() {
		return ucount;
	}
	public void setUcount(int ucount) {
		this.ucount = ucount;
	}
	public int getDonecount() {
		return donecount;
	}
	public void setDonecount(int donecount) {
		this.donecount = donecount;
	}

	@Override
	public String toString() {
		return "task [tno=" + tno + ", pno=" + pno + ", tname=" + tname + ", tstartdate=" + tstartdate + ", tenddate="
				+ tenddate + ", ucount=" + ucount + ", donecount=" + donecount + "]";
	}
}
