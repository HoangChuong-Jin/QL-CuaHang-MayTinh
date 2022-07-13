<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thực đơn</title>
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
	<h1>Food list</h1>	
	<p><a href="logOut">Đăng xuất</a></p>

	
	  <s:if test="hasActionMessages()">
        <p>
            <s:actionmessage /> 
        </p>
    </s:if>
    
	<table >
	<tr>
	<th>Tên món ăn</th>
	<th>Hình ảnh</th>
	<th>Giá</th>
	<th></th>
	</tr>
	<s:iterator var="food" value="foodlist" >
	<tr>
		<td><s:property value="ten"/></td>
		<td><img width='80' src='./img/<s:property value="hinh"/>'/></td>
		<td><s:property value="gia"/></td>
		<td><a href='orderAction?idmonan=<s:property value="id"/>'>Đặt món</a></td>
	</tr>
	</s:iterator>
	</table>
</body>
</html>