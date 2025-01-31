package Action.Admin;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import DAO.DonHangDAO;
import DAO.SanPhamDAO;
import DAO.UserDAO;
import Model.DonHang;
import Model.SanPham;
import Model.User;

public class DonHangAction extends ActionSupport implements SessionAware {

 
	private List<DonHang> donhanglist;
	private DonHang donhang;
	
	int id;
	int nguoidung_id;
	int sanpham_id;
	int soluong;
	float giaban;
	Date ngay;
	float tongtien;
	String ghichu;
	String trangthai;
	
	
	
	private String message;
	
	private Map<String, Object> session;
	
	@Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Map<String, Object> getSession() {
        return session;
    }
	    
    
    public String getMessage() {
		return message;
	}

	

	public List<DonHang> getDonhanglist() {
		return donhanglist;
	}

	public void setDonhanglist(List<DonHang> donhanglist) {
		this.donhanglist = donhanglist;
	}

	public DonHang getDonhang() {
		return donhang;
	}

	public void setDonhang(DonHang donhang) {
		this.donhang = donhang;
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

	public void setMessage(String message) {
		this.message = message;
	}

	public String create() {
        System.out.println("Create Food");        		
        return SUCCESS;
	}
	
	
	public String edit() {
        System.out.println("Edit Food");
        
        donhang=new DonHangDAO().getDonHangByID(id);
        
        return SUCCESS;
	}
	
	public String list() {
        System.out.println("SanPham list");
        donhanglist=new DonHangDAO().getList();		
        return SUCCESS;
    }
	
	public String list2() {
        System.out.println("SanPham list");
        donhanglist=new DonHangDAO().getList2();		
        return SUCCESS;
    }
	
	public String update() {
        System.out.println("Update Don Hang");
        DonHangDAO donhangDAO=new DonHangDAO();
       
        donhangDAO.update(id,trangthai);
        
        message="Cập nhật thành công";
        //foodlist=foodDAO.getList();
        return "list";
	}

	public String delete() {
        System.out.println("Delete Don Hang");
        DonHangDAO donhangDAO=new DonHangDAO();
        donhangDAO.delete(id);
        message="Xóa thành công";
        donhanglist=donhangDAO.getList();
        return "list";    
	}
	
    
}
