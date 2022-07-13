package Action.Khach;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import DAO.SanPhamDAO;
import Model.SanPham;
import Model.User;

public class KhachAction extends ActionSupport implements SessionAware {
	
	private static final long serialVersionUID = -4813671982160371972L;
	
	private List<SanPham> sanphamlist;
	
	private SanPham sanpham;
	
	private int idsanpham;
	private int soluong;
	private float giaban;
	private float thanhtien;
	private Map<String, Object> session;
	private String tukhoa;
	
	public String getTukhoa() {
		return tukhoa;
	}

	public void setTukhoa(String tukhoa) {
		this.tukhoa = tukhoa;
	}

	public List<SanPham> getSanphamlist() {
		return sanphamlist;
	}

	public void setSanphamlist(List<SanPham> sanphamlist) {
		this.sanphamlist = sanphamlist;
	}

	public SanPham getSanpham() {
		sanpham=new SanPhamDAO().getSanPhamByID(idsanpham);
		return sanpham;
	}

	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}

	public int getIdsanpham() {
		return idsanpham;
	}

	public void setIdsanpham(int idsanpham) {
		this.idsanpham = idsanpham;
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

	public float getThanhtien() {
		return thanhtien;
	}

	public void setThanhtien(float thanhtien) {
		this.thanhtien = thanhtien;
	}

	public Map<String, Object> getSession() {
		return session;
	}	

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}
	

	public String home()
	{
		
		System.out.println("Welcome KHACH home");
	    sanphamlist=new SanPhamDAO().getList();
		
		return "success";
	}
	
	public String laptop()
	{
		
		System.out.println("Welcome KHACH home");
	    sanphamlist=new SanPhamDAO().getList2();
		
		return "success";
	}
	
	public String mayban()
	{
		
		System.out.println("Welcome KHACH home");
	    sanphamlist=new SanPhamDAO().getList3();
		
		return "success";
	}
	
	public String khac()
	{
		
		System.out.println("Welcome KHACH home");
	    sanphamlist=new SanPhamDAO().getList4();
		
		return "success";
	}
	
	public String order() {
        System.out.println("Order");     
        return SUCCESS;
    }

	public String submitorder() {
        System.out.println("Submit Order");

        User nd = (User) session.get("nguoidung");       
		
		new SanPhamDAO().Order(nd.getId(),
		idsanpham,
		soluong,
		giaban,
		thanhtien);        
      
		
		addActionMessage("Đặt hàng thành công!");		
		
        return home();
    }	
	
	public String TimKiem() {
        System.out.println("Tim kiem"); 
       
        sanphamlist=new SanPhamDAO().timkiemsptheoten(tukhoa);
       
    	addActionMessage("Kết quả tìm kiếm cho từ khoá `"+tukhoa+"`");		
    	return "success";
        
       
    }
}