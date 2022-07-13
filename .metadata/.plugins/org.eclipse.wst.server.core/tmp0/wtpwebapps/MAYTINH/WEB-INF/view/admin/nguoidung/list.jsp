<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách người dùng</title>
<style>
	table,td,tr,th
	{
		border: 1px solid;
	}
	table
	{
		width:100%;
	}
</style>
</head>
<body>
	<h1>Danh sách người dùng</h1>
	
	 <s:if test="hasActionMessages()">
	      <p>
	          <s:actionmessage /> 
	      </p>
	  </s:if>
	<p><a href="createNguoiDungAction">Thêm mới</a>  <a href="homeAdminAction">Trang chủ</a></p>
	
	<table >
	<tr>
	<th>Họ tên</th>
	<th>Số điện thoại</th>
	<th>Tên đăng nhập</th>
	<th>Loại quyền</th>
	<th>Hình ảnh</th>
	<th>Sửa</th>
	<th>Xoá</th>
	</tr>

	
	<s:iterator var="nguoidung" value="nguoidunglist" >
	<tr>
		<td><s:property value="hoten"/></td>
		<td><s:property value="sodienthoai"/></td>
		<td><s:property value="tendangnhap"/></td>
		<td><s:property value="loaiquyen"/></td>
		<td><img width='80' src='./img/<s:property value="hinhanh"/>'/></td>
		
		<td><a href='editNguoiDungAction?id=<s:property value="id"/>'>Chỉnh sửa</a></td>
		<td><a href='deleteNguoiDungAction?id=<s:property value="id"/>' onclick="return confirm('Bạn chắc chắn xóa?')">Xóa</a></td>
	</tr>
	</s:iterator>
	
	</table>
</body>
</html>