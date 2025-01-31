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

import DAO.SanPhamDAO;
import DAO.UserDAO;
import Model.SanPham;
import Model.User;

public class SanPhamAction extends ActionSupport implements SessionAware {

 
	private List<SanPham> sanphamlist;
	private SanPham sanpham;
	
	int id;
	String tensanpham;
	String mota;
	float giagoc;
	float giaban;
	int soluongton;
	int luotxem;
	int luotmua;
	String danhmuc;
	String thuonghieu;
	
	
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

	
	public List<SanPham> getSanphamlist() {
		return sanphamlist;
	}

	public void setSanphamlist(List<SanPham> sanphamlist) {
		this.sanphamlist = sanphamlist;
	}

	public SanPham getSanpham() {
		return sanpham;
	}

	public void setSanpham(SanPham sanpham) {
		this.sanpham = sanpham;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTensanpham() {
		return tensanpham;
	}

	public void setTensanpham(String tensanpham) {
		this.tensanpham = tensanpham;
	}

	public String getMota() {
		return mota;
	}

	public void setMota(String mota) {
		this.mota = mota;
	}

	public float getGiagoc() {
		return giagoc;
	}

	public void setGiagoc(float giagoc) {
		this.giagoc = giagoc;
	}

	public float getGiaban() {
		return giaban;
	}

	public void setGiaban(float giaban) {
		this.giaban = giaban;
	}

	public int getSoluongton() {
		return soluongton;
	}

	public void setSoluongton(int soluongton) {
		this.soluongton = soluongton;
	}

	public int getLuotxem() {
		return luotxem;
	}

	public void setLuotxem(int luotxem) {
		this.luotxem = luotxem;
	}

	public int getLuotmua() {
		return luotmua;
	}

	public void setLuotmua(int luotmua) {
		this.luotmua = luotmua;
	}

	public String getDanhmuc() {
		return danhmuc;
	}

	public void setDanhmuc(String danhmuc) {
		this.danhmuc = danhmuc;
	}

	public String getThuonghieu() {
		return thuonghieu;
	}

	public void setThuonghieu(String thuonghieu) {
		this.thuonghieu = thuonghieu;
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
        System.out.println("Store Sản Phẩm");
      
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

        
        SanPhamDAO sanphamDAO=new SanPhamDAO();
        sanphamDAO.store(tensanpham,mota,giagoc,giaban,soluongton,hinhFileName,danhmuc,thuonghieu);
      
        addActionMessage("Thêm thành công!");		
        //foodlist=foodDAO.getList();
        return "list";
	}
	
	public String edit() {
        System.out.println("Edit Food");
        
        sanpham=new SanPhamDAO().getSanPhamByID(id);
        
        return SUCCESS;
	}
	
	
	public String update() {
        System.out.println("Update Sản Phẩm");
        SanPhamDAO sanphamDAO=new SanPhamDAO();
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
		        sanpham= sanphamDAO.getSanPhamByID(id);
		        hinhFileName=sanpham.getHinhanh();			 
		 }
        
        sanphamDAO.update(id,tensanpham,mota,giagoc,giaban,soluongton,hinhFileName,danhmuc,thuonghieu);
        
        message="Cập nhật thành công";
        //foodlist=foodDAO.getList();
        return "list";
	}

	public String delete() {
        System.out.println("Delete Food");
        SanPhamDAO sanphamDAO=new SanPhamDAO();
        sanphamDAO.delete(id);
        message="Xóa thành công";
        sanphamlist=sanphamDAO.getList();
        return "list";    
	}
	
	public String list() {
        System.out.println("SanPham list222");
        sanphamlist=new SanPhamDAO().getList();		
        return SUCCESS;
    }
	
	public String list2() {
        System.out.println("SanPham list2");
        sanphamlist=new SanPhamDAO().getList5();		
        return SUCCESS;
    }
    
}
