package com.jdp.domain;
/** 
 *  Created by 2015112137 Cha
 */
public class UserTaskVO {

	private String uid;
	private int tno;
	private int tdoneflag;
	
	public UserTaskVO(String uid, int tno, int tdoneflag) {
		super();
		this.uid = uid;
		this.tno = tno;
		this.tdoneflag = tdoneflag;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public int getTdoneflag() {
		return tdoneflag;
	}
	public void setTdoneflag(int tdoneflag) {
		this.tdoneflag = tdoneflag;
	}

	@Override
	public String toString() {
		return "UserTaskVO [uid=" + uid + ", tno=" + tno + ", tdoneflag=" + tdoneflag + "]";
	}
}
