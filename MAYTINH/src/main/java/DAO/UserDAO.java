package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.User;
public class UserDAO {
	public User login(String tendangnhap, String matkhau)
	{
		User nd=null;
		DBService db=new DBService();
		PreparedStatement statement;
		try {
			
			statement = db.getConn().prepareStatement("SELECT * from nguoidung WHERE tendangnhap = ? AND matkhau=?");
			
			
			statement.setString(1, tendangnhap);
			statement.setString(2, MD5.getMd5(matkhau) );
			
			ResultSet rs=db.executeQuery(statement);
			if(rs!=null)
			{ 
				while(rs.next())
				{
					nd=new User(rs.getInt("id"),
					rs.getString("hoten"),
					rs.getString("sodienthoai"),
					rs.getString("tendangnhap"),
					rs.getString("loaiquyen"));
				}
			}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nd;
	}
	/*Đăng kí tài khoản*/
	public void store(String tendangnhap, String matkhau,String hoten, String sodienthoai)
	{
		DBService db=new DBService();
		PreparedStatement statement;
		try {
			statement = db.getConn().prepareStatement("INSERT INTO	nguoidung(tendangnhap,matkhau,hoten,sodienthoai) values(?,?,?,?)");
			statement.setString(1, tendangnhap);
			statement.setString(2, MD5.getMd5(matkhau));
			statement.setString(3, hoten);
			statement.setString(4, sodienthoai);
			db.executeUpdate(statement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public User kiemtratontaitendangnhap(String tendangnhap)
	{
		User nd=null;
		DBService db=new DBService();
		PreparedStatement statement;
		try {
			
			statement = db.getConn().prepareStatement("SELECT * from nguoidung WHERE tendangnhap = ?");
			
			
			statement.setString(1, tendangnhap);
			
			
			ResultSet rs=db.executeQuery(statement);
			if(rs!=null)
			{ 
				while(rs.next())
				{					
					nd=new User(rs.getInt("id"),
							rs.getString("hoten"),
							rs.getString("sodienthoai"),
							rs.getString("tendangnhap"),
							rs.getString("loaiquyen"));
				}
			}
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return nd;
		
	}
}
