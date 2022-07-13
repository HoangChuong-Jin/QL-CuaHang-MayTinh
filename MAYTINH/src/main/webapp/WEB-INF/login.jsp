<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
  	<title>Đăng nhập</title>
	<link href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.min.css" rel="stylesheet"> 
  	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
	<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" ></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" ></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" ></script>
	<style>
		body{
			background-color: #83b9f2;
		}
		.slidee {
			animation: slidee;
			-webkit-animation-name: slidee;
			animation-duration: 1.5s;
			-webkit-animation-duration: 1.5s;
			visibility: visible;
		}

		@keyframes slidee {
			0% {
				opacity: 0;
				transform: translateY(70%);
			}
			100% {
				opacity: 1;
				transform: translateY(0%);
			}
		}
		@-webkit-keyframes slidee {
			0% {
				opacity: 0;
				transform: translateY(70%);
			}
			100% {
				opacity: 1;
				transform: translateY(0%);
			}
		}
	</style>
</head>
<body>
		<nav class="navbar navbar-light bg-light sticky-top">
			<div class="container">
				<a class="navbar-brand" href="#">
					<img src="./img/logo2.jpg" width="100" height="40" class="d-inline-block align-top" alt="" /> &nbsp;
				</a>
			</div>
		</nav>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-sm-3">
			</div>
			<div class="col-sm-6 slidee">
				<div class="card">
					<h4 class="card-header">ĐĂNG NHẬP</h4>
					<div class="card-body">
					
					<form action="loginUser" method="POST">
						<div class="form-group">
							<label for="Tên đăng nhập" >Tên đăng nhập</label>
							
							<input type="text" class="form-control" id="email" name="tendangnhap" required>
							
						</div>
						<div class="form-group">
							<label for="inputPassword3">Mật khẩu</label>
							<input type="password" class="form-control" id="matkhau" name="matkhau" required>	
						</div>
						
						<div class="form-group row">
							<div class="col-sm-6">
								<label for="">Bạn chưa có tài khoản?|
									<a href="DangKy">Đăng ký</a> 
								</label>
							</div>
							<div class="col-sm-6 ">
								<button type="submit" class="btn btn-block btn-primary">Đăng nhập</button>
							</div>
						</div>
						</form>
						
					</div>
				</div>

			</div>
		</div>
	</div>
	 <s:if test="hasActionMessages()">
        <div class="welcome">
            <s:actionmessage /> 
        </div>
    </s:if>
</body>
</html>