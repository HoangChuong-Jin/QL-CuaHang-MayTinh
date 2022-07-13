package Action.Admin;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import DAO.NguoiDungDAO;
import DAO.SanPhamDAO;
import DAO.UserDAO;
import Model.NguoiDung;
import Model.SanPham;
import Model.User;

public class NguoiDungAction extends ActionSupport implements SessionAware {

 
	private List<NguoiDung> nguoidunglist;
	private NguoiDung nguoidung;
	
	int id;
	String hoten;
	String sodienthoai;
	String tendangnhap;
	String matkhau;
	String loaiquyen;
	
	
	private File hinh;
	private String hinhContentType;
	private String hinhFileName;
	
	
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

	

	public List<NguoiDung> getNguoidunglist() {
		return nguoidunglist;
	}

	public void setNguoidunglist(List<NguoiDung> nguoidunglist) {
		this.nguoidunglist = nguoidunglist;
	}

	public NguoiDung getNguoidung() {
		return nguoidung;
	}

	public void setNguoidung(NguoiDung nguoidung) {
		this.nguoidung = nguoidung;
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

	public void setMessage(String message) {
		this.message = message;
	}

	public File getHinh() {
		return hinh;
	}

	public void setHinh(File hinh) {
		this.hinh = hinh;
	}

	public String getHinhContentType() {
		return hinhContentType;
	}

	public void setHinhContentType(String hinhContentType) {
		this.hinhContentType = hinhContentType;
	}

	public String getHinhFileName() {
		return hinhFileName;
	}

	public void setHinhFileName(String hinhFileName) {
		this.hinhFileName = hinhFileName;
	}

	public String create() {
        System.out.println("Create Food");        		
        return SUCCESS;
	}
	
	public String store() {
        System.out.println("Store Người Dùng");
      
        String path = ServletActionContext.getServletContext().getRealPath("./img");
		System.out.println("Image Location:" + path);
		System.out.println(hinhFileName);
		 if(hinhFileName!=null)
		 {
			// handling the file
			File file = new File(path, hinhFileName);
			
			try {
				
				FileUtils.copyFile(hinh, file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }

        
        NguoiDungDAO nguoidungDAO=new NguoiDungDAO();
        nguoidungDAO.store(hoten,sodienthoai,tendangnhap,matkhau,loaiquyen,hinhFileName);
      
        addActionMessage("Thêm thành công!");		
        //foodlist=foodDAO.getList();
        return "list";
	}
	
	public String edit() {
        System.out.println("Edit Người dùng");
        
        nguoidung=new NguoiDungDAO().getNguoiDungByID(id);
        
        return SUCCESS;
	}
	
	
	public String update() {
        System.out.println("Update người dùng");
        NguoiDungDAO nguoidungDAO=new NguoiDungDAO();
        String path = ServletActionContext.getServletContext().getRealPath("./img");
		System.out.println("Image Location:" + path);
		System.out.println(hinh);
		
		 if(hinhFileName!=null)
		 {
			// handling the file
			File file = new File(path, hinhFileName);
			
			try {
				
				FileUtils.copyFile(hinh, file);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		 else
		 {
		        nguoidung= nguoidungDAO.getNguoiDungByID(id);
		        hinhFileName=nguoidung.getHinhanh();			 
		 }
        
        nguoidungDAO.update(id,hoten,sodienthoai,tendangnhap,loaiquyen,hinhFileName);
        
        message="Cập nhật thành công";
        //foodlist=foodDAO.getList();
        return "list";
	}

	public String delete() {
        System.out.println("Delete Nguoi dùng");
        NguoiDungDAO nguoidungDAO=new NguoiDungDAO();
        nguoidungDAO.delete(id);
        message="Xóa thành công";
        nguoidunglist=nguoidungDAO.getList();
        return "list";    
	}
	
	public String list() {
        System.out.println("NguoiDung list");
        nguoidunglist=new NguoiDungDAO().getList();		
        return SUCCESS;
    }
	
	public String list2() {
        System.out.println("NguoiDung list");
        nguoidunglist=new NguoiDungDAO().getList2();		
        return SUCCESS;
    }
    
}
