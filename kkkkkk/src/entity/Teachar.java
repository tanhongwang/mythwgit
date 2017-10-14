package entity;

import java.util.List;

public class Teachar {
	private int tid;
	private String tname;
	private List<Students>  stulist;
	
	
	public Teachar() {
		super();
	}
	public Teachar(int tid, String tname, List<Students> stulist) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.stulist = stulist;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public List<Students> getStulist() {
		return stulist;
	}
	public void setStulist(List<Students> stulist) {
		this.stulist = stulist;
	}
	
}
