package Model;

public class User {
	int id;
	String hoten;
	String sodienthoai;
	String tendangnhap,loaiquyen;
	public User(int id, String hoten, String sodienthoai, String tendangnhap, String loaiquyen) {
		super();
		this.id = id;
		this.hoten = hoten;
		this.sodienthoai = sodienthoai;
		this.tendangnhap = tendangnhap;
		this.loaiquyen = loaiquyen;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public String getSodienthoai() {
		return sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		this.sodienthoai = sodienthoai;
	}
	public String getTendangnhap() {
		return tendangnhap;
	}
	public void setTendangnhap(String tendangnhap) {
		this.tendangnhap = tendangnhap;
	}
	public String getLoaiquyen() {
		return loaiquyen;
	}
	public void setLoaiquyen(String loaiquyen) {
		this.loaiquyen = loaiquyen;
	}
	

	
}
