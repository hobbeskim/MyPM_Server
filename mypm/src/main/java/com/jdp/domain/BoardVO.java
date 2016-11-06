package com.jdp.domain;
/** 
 *  Created by 2015112137 차시황
 */
public class BoardVO {

	private int bno;
	private String uid;
	private int pno;
	private String btitle;
	private String bcontent;
	private String bwritedate;
	private int rcount;
	
	public BoardVO(int bno, String uid, int pno, String btitle, String bcontent, String bwritedate, int rcount) {
		super();
		this.bno = bno;
		this.uid = uid;
		this.pno = pno;
		this.btitle = btitle;
		this.bcontent = bcontent;
		this.bwritedate = bwritedate;
		this.rcount = rcount;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
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
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBcontent() {
		return bcontent;
	}
	public void setBcontent(String bcontent) {
		this.bcontent = bcontent;
	}
	public String getBwritedate() {
		return bwritedate;
	}
	public void setBwritedate(String bwritedate) {
		this.bwritedate = bwritedate;
	}

	public int getRcount() {
		return rcount;
	}

	public void setRcount(int rcount) {
		this.rcount = rcount;
	}

	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", uid=" + uid + ", pno=" + pno + ", btitle=" + btitle + ", bcontent=" + bcontent
				+ ", bwritedate=" + bwritedate + ", rcount=" + rcount + "]";
	}	
	

}
