package entity;

public class Students {
	private int sid;
	private String sname;
	private String ssex;
	private int sage;
	private String saddress;
	private Teachar teachar;
	
	
	
	
	public Students() {
		super();
	}
	public Students(int sid, String sname, String ssex, int sage,
			String saddress, Teachar teachar) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.ssex = ssex;
		this.sage = sage;
		this.saddress = saddress;
		this.teachar = teachar;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSsex() {
		return ssex;
	}
	public void setSsex(String ssex) {
		this.ssex = ssex;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public Teachar getTeachar() {
		return teachar;
	}
	public void setTeachar(Teachar teachar) {
		this.teachar = teachar;
	}
	@Override
	public String toString() {
		return "Students [sid=" + sid + ", sname=" + sname + ", ssex=" + ssex
				+ ", sage=" + sage + ", saddress=" + saddress + ", teachar="
				+ teachar + "]";
	}
	
}
