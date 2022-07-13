<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Danh sách đơn hàng</title>
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
	<h1>Danh sách đơn hàng</h1>
	
	 <s:if test="hasActionMessages()">
	      <p>
	          <s:actionmessage /> 
	      </p>
	  </s:if>
	<a href="homeAdminAction">Trang chủ</a></p>
	<table >
	<tr>
	<th>Người dùng</th>
	<th>Sản phẩm</th>
	<th>Số lượng</th>
	<th>Giá bán</th>
	<th>Ngày</th>
	<th>Tổng tiền</th>
	<th>Ghi chú</th>
	<th>Trạng thái</th>
	<th>Sửa</th>
	<th>Xoá</th>
	</tr>

	
	<s:iterator var="donhang" value="donhanglist" >
	<tr>
		<td><s:property value="nguoidung_id"/></td>
		<td><s:property value="sanpham_id"/></td>
		<td><s:property value="soluong"/></td>
		<td><s:property value="giaban"/></td>
		<td><s:property value="ngay"/></td>
		<td><s:property value="tongtien"/></td>
		<td><s:property value="ghichu"/></td>
		<td><s:property value="trangthai"/></td>

		<td><a href='editDonHangAction?id=<s:property value="id"/>'>Chỉnh sửa</a></td>
		<td><a href='deleteDonHangAction?id=<s:property value="id"/>' onclick="return confirm('Bạn chắc chắn xóa?')">Xóa</a></td>
	</tr>
	</s:iterator>
	
	</table>
</body>
</html>