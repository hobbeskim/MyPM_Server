package com.jdp.domain;
/** 
 *  Created by 2015112137 차시황
 */
public class ReadBoardVO {
	
	private String uid;
	private int bno;
	private int ureadflag; // 0 : not yet, 1 : already read
	
	public ReadBoardVO(String uid, int bno, int ureadflag) {
		super();
		this.uid = uid;
		this.bno = bno;
		this.ureadflag = ureadflag;
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
	public int getUreadflag() {
		return ureadflag;
	}
	public void setUreadflag(int ureadflag) {
		this.ureadflag = ureadflag;
	}

	@Override
	public String toString() {
		return "ReadBoardVO [uid=" + uid + ", bno=" + bno + ", ureadflag=" + ureadflag + "]";
	}
	
	
}
