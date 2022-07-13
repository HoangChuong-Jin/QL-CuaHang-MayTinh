package Model;

import java.sql.Date;

public class DonHang {
	int id;
	int nguoidung_id;
	int sanpham_id;
	int soluong;
	float giaban;
	Date ngay;
	float tongtien;
	String ghichu;
	String trangthai;
	public DonHang(int id, int nguoidung_id, int sanpham_id, int soluong, float giaban, Date ngay, float tongtien,
			String ghichu, String trangthai) {
		super();
		this.id = id;
		this.nguoidung_id = nguoidung_id;
		this.sanpham_id = sanpham_id;
		this.soluong = soluong;
		this.giaban = giaban;
		this.ngay = ngay;
		this.tongtien = tongtien;
		this.ghichu = ghichu;
		this.trangthai = trangthai;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNguoidung_id() {
		return nguoidung_id;
	}
	public void setNguoidung_id(int nguoidung_id) {
		this.nguoidung_id = nguoidung_id;
	}
	public int getSanpham_id() {
		return sanpham_id;
	}
	public void setSanpham_id(int sanpham_id) {
		this.sanpham_id = sanpham_id;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public float getGiaban() {
		return giaban;
	}
	public void setGiaban(float giaban) {
		this.giaban = giaban;
	}
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}
	public float getTongtien() {
		return tongtien;
	}
	public void setTongtien(float tongtien) {
		this.tongtien = tongtien;
	}
	public String getGhichu() {
		return ghichu;
	}
	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}
	public String getTrangthai() {		
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	
	
	
}