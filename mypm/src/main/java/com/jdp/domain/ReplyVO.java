package com.jdp.domain;
/** 
 *  Created by 2015112137 Cha
 */
public class ReplyVO {

	private int rno;
	private String uid;
	private int bno;
	private String rcontent;
	private String rwritedate;
	
	public ReplyVO(int rno, String uid, int bno, String rcontent, String rwritedate) {
		super();
		this.rno = rno;
		this.uid = uid;
		this.bno = bno;
		this.rcontent = rcontent;
		this.rwritedate = rwritedate;
	}
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getRcontent() {
		return rcontent;
	}
	public void setRcontent(String rcontent) {
		this.rcontent = rcontent;
	}
	public String getRwritedate() {
		return rwritedate;
	}
	public void setRwritedate(String rwritedate) {
		this.rwritedate = rwritedate;
	}

	@Override
	public String toString() {
		return "ReplyVO [rno=" + rno + ", uid=" + uid + ", bno=" + bno + ", rcontent=" + rcontent + ", rwritedate="
				+ rwritedate + "]";
	}
}
