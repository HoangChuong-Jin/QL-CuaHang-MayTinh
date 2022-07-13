package Model;

public class NguoiDung {
	int id;
	String hoten;
	String sodienthoai;
	String tendangnhap;
	String matkhau;
	String loaiquyen;
	String hinhanh;
	public NguoiDung(int id, String hoten, String sodienthoai, String tendangnhap, String matkhau, String loaiquyen, String hinhanh) {
		super();
		this.id = id;
		this.hoten = hoten;
		this.sodienthoai = sodienthoai;
		this.tendangnhap = tendangnhap;
		this.matkhau = matkhau;
		this.loaiquyen = loaiquyen;
		this.hinhanh = hinhanh;
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
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	public String getLoaiquyen() {
		return loaiquyen;
	}
	public void setLoaiquyen(String loaiquyen) {
		this.loaiquyen = loaiquyen;
	}
	
	public String getHinhanh() {
		return hinhanh;
	}
	public void setHinhanh(String hinhanh) {
		this.hinhanh = hinhanh;
	}
	
}