package Action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import DAO.UserDAO;
import Model.User;


public class LoginAction extends ActionSupport implements SessionAware {

	private Map<String, Object> session;
	private String tendangnhap;
	private String matkhau;
	private String hoten;
	private String sodienthoai;
	
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

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}
	
	public String login() {    
    	User nd=new UserDAO().login(tendangnhap, matkhau);
    	if(nd!=null)
		{
    		session.put("nguoidung", nd);
    		System.out.println("Login success");
    		if(nd.getLoaiquyen().equals("ADMIN"))
			{
    			return "admin";
			}
    		else
    			return "khach";    			
                		
		}
    	else
    	{
    		 addActionMessage("Bạn nhập sai tên đang nhập hoặc mật khẩu");
             System.out.println("Login fail");
             return "login";
    	}
    }
	
	public String DangKyUser() {
        System.out.println("Store khach");
        User nd=new UserDAO().kiemtratontaitendangnhap(tendangnhap);
    	if(nd==null)
		{
    		UserDAO userDAO=new UserDAO();
            userDAO.store(tendangnhap, matkhau, hoten, sodienthoai);          
            addActionMessage("Đăng ký thành công!");	
            System.out.println("Dang ky thanh cong!");
            return "login";		
                		
		}
    	else
    	{
    		addActionMessage("Tên đăng nhập đã tồn tại trong hệ thống! Vui lòng nhập tên khác");
			System.out.println("Dang ky that bai!");
			return SUCCESS;
    	}
        
    }
	
	
	
	
	
	
	public String logOut() {
        System.out.println("LogOut");
        session.remove("nguoidung");        
        return SUCCESS;
    }

}