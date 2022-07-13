<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Thêm sản phẩm</title>

</head>
<body>
	<h1>Thêm sản phẩm</h1>	
	
	<s:form action="storeSanPhamAction" method="POST" enctype="multipart/form-data" validate="true">
			
	    <s:textfield label="Tên sản phẩm" id="tenthuonghieu" name="tensanpham"  /> 
		<s:textfield id="mota" name="mota" label="Mô tả sản phẩm"  />
		<s:textfield id="giagoc" name="giagoc" label="Giá gốc"  />
		<s:textfield id="giaban" name="giaban" label="Giá bán"  />
		<s:textfield id="soluongton" name="soluongton" label="Số lượng tồn"  />		
		<s:file name="hinh" label="Chọn hình" accept="image/png, image/jpeg, image/gif"></s:file>
		
		<select id="danhmuc" name="danhmuc">
			<option value="">---</option>
	        <option value="Laptop">Laptop</option>
	        <option value="Máy bàn">Máy bàn</option>
	        <option value="Khác">Khác</option>
    	</select>
		<br>
		<select id="thuonghieu" name="thuonghieu">
			<option value="">---</option>
	        <option value="DELL">Dell</option>
	        <option value="HP">HP</option>
	        <option value="Lenovo">Lenovo</option>
	         <option value="Asus">Asus</option>
	        <option value="Aces">Aces</option>
	        <option value="Khác">Khác</option>
    	</select>
   		
		<s:submit/>
	</s:form>	
	
	
	<script>
	
	</script>
</body>
</html>