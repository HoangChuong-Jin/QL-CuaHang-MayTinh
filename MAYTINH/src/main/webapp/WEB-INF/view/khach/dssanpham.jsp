<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
  
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TWELVE</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.6.1/font/bootstrap-icons.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" ></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" ></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" ></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://cdn.datatables.net/1.10.24/css/dataTables.bootstrap4.min.css" />
    <style>
        
        body {
            background: #eef8fc;
            min-height: 100vh;
            overflow-x: hidden;
        }
        
        nav{
        	background-color:rgb(26,148,255);
        }
        
        nav a{
        	color: white!important;
        }
        
        nav .dropdown-item{
        	color:black!important;
        }
        
        .slideanim{visibility: hidden;}
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
		
		#card .card .p-2{
		  overflow: hidden;
		}
		
		#card .card img{
		  width: 100%;
		  transition: all 1s;
		}
		
		
		#card .card img:hover{
	      opacity: 0.8;
	      -webkit-transform: scale(1.2);
	      transform: scale(1.2);
	        /*box-shadow: 0 4px 8px 0 rgba(7, 7, 7, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
	        transform:scale(1.015);*/
	    }
	    
	    /************ ************/
		::-webkit-scrollbar {
	    	width: 13px;
		}
		  
	
		::-webkit-scrollbar-track { /* bóng của thanh cuộn */
		    box-shadow: inset 0 0 5px #5BB1FF; 
		    border-radius: 10px;
		}
		   
	
		::-webkit-scrollbar-thumb { /* chưa lick chuột */
		    background: #0078E6;
		    border-radius: 10px;
		}
		  
		::-webkit-scrollbar-thumb:hover { /* đưa chuột vào chuột */
		    background: #1A94FF;
		}
    </style>   
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light sticky-top">
		<div class="container">
			<a class="navbar-brand" href="homeKhachAction">
				<img src="./img/logo.jpg" width="100" height="40" class="d-inline-block align-top" alt="" />
			</a>
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
	              <li class="nav-item active"><a class="nav-link" href="homeKhachAction"><i class="bi bi-house-fill"></i> Trang chủ</a></li>
	              <li class="nav-item dropdown active">
	                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown"> Danh mục</a>
	                    <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	                      <!--<s:iterator var="danhmuc" value="danhmuclist" >
	                        <a class="dropdown-item" href="groupdanhmuc?iddanhmuc=<s:property value="iddanhmuc"/>"><s:property value="tendanhmuc"/></a>
	                      </s:iterator>-->
	                      <a class="dropdown-item" href="laptopAction">Laptop</a>
	                      <a class="dropdown-item" href="maybanAction">Destop</a>
	                      <a class="dropdown-item" href="khacAction">khác</a>
	                    </div>
	              </li>
	              
	        </ul>
	        <s:form action="TimKiem" method="GET" class="col-sm-5"> 
                
                <div class="input-group mb-0">
                        <input type="search" required class="form-control" name="tukhoa" style="width=300px;" placeholder="Tìm sản phẩm ..." aria-label="Recipient's username" aria-describedby="button-addon2">
                    <div class="input-group-append">
                        <button class="btn btn-primary" type="submit"><i class="bi bi-search  text-white"></i></button>
                    </div>
                </div>
            </s:form>
			<ul class="navbar-nav ml-auto">
			<li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink" data-toggle="dropdown">
                    <i class="bi bi-person-fill"></i><s:property value="hoten"/>
                </a>
                <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
                    <a class="dropdown-item" href="#" data-target="#fdoimatkhau" data-toggle="modal"><i class="fa fa-lock"></i> Đổi mật khẩu</a>
                    <a class="dropdown-item" href="#" data-target="#fcapnhathoso" data-toggle="modal"><i class="fa fa-id-card"></i> Cập nhật hồ sơ</a>
                    <a class="dropdown-item" href=""><i class="fa fa-history"></i> Lịch sử mua hàng</a>
                    <a class="dropdown-item" href="#" data-toggle="modal" data-target="#fdangxuat" ><i class="fa fa-sign-out"></i> Đăng xuất</a>
                </div>
             </li>
			<li class="nav-item "><a class="nav-link" href="#" data-toggle="modal" data-target="#fdangxuat"><i class="fa fa-sign-out"></i> Đăng xuất</a></li>
			</ul>
			</div>
		</div>
	</nav>
<!-- Nội Dung -->
<div class="container">
	<div class="container-fluid" id="car">
	  <table style="margin-left: 10%;">
	    <tr>
	      <th style="padding-right:5px">
	        <div id="carouselExampleCaptions" class="carousel slide carousel-fade" data-ride="carousel">
	          <ol class="carousel-indicators">
	            <li data-target="#carouselExampleCaptions" data-slide-to="0" class="active"></li>
	            <li data-target="#carouselExampleCaptions" data-slide-to="1"></li>
	            <li data-target="#carouselExampleCaptions" data-slide-to="2"></li>
	            <li data-target="#carouselExampleCaptions" data-slide-to="3"></li>
	          </ol>
	          <div class="carousel-inner">
	            <div class="carousel-item active">
	              <img src="./img/c1.jpg" class="" alt="...">
	            </div>
	            <div class="carousel-item ">
	              <img src="./img/c2.jpg" class="" alt="...">
	            </div>
	            <div class="carousel-item">
	              <img src="./img/c3.jpg" class="" alt="...">
	            </div>
	            <div class="carousel-item">
	              <img src="./img/c4.jpg" class="" alt="...">
	            </div>
	          </div>
	          <a class="carousel-control-prev" href="#carouselExampleCaptions" role="button" data-slide="prev">
	            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
	            <span class="sr-only">Previous</span>
	          </a>
	          <a class="carousel-control-next" href="#carouselExampleCaptions" role="button" data-slide="next">
	            <span class="carousel-control-next-icon" aria-hidden="true"></span>
	            <span class="sr-only">Next</span>
	          </a>
	        </div>
	      </th>
	    </tr>  
	  </table>
	</div>
</div>



<!-- san pham -->
<s:if test="hasActionMessages()"> 
          <div class="alert alert-success alert-dismissible fade show mb-0" role="alert">
            <h6 > <s:actionmessage /></h6>
		</div>
    </s:if>
    <div class="page-content p-3" id="content">
        <div class="container">
        	<h3>SẢN PHẨM</h3>
       		<div class="row">
			    <s:iterator var="sanpham" value="sanphamlist" >
			    
			   	
			    	<div id="card" class="col-sm-3 px-2 p-2 slideanim" >
						<div class="card h-100" >
							<div class="card p-2">
								<a href="orderAction?idsanpham=<s:property value="id"/>">
									<img class="card-img-top" src="./img/<s:property value="hinhanh"/>" height="250" alt="">
								</a>
							</div>
							
						   <div class="text-center mt-2">
						      <h6 ><a class="card-title" href="orderAction?idsanpham=<s:property value="id"/>" ><s:property value="tensanpham"/></a></h6>
						      <h6 class="card-subtitle mb-2 text-danger"><s:property value="%{getText('{0,number,###,##0đ}', {giaban})}"/></h6>
						      <p class="card-text text-justify">
						         
						      </p>
						      
						      
						   </div>
						</div>
					</div>
			    	
		    	</s:iterator>
		    	
	    	</div>
    	</div>
                
    </div>

<!-- Kết thúc Nội Dung -->
<!--Bắt đầu đăng xuất-->
	<div class="modal fade" id="fdangxuat" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title">Đăng xuất</h3>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
                
            </div>
            <div class="modal-body">
                <form method="post" enctype="multipart/form-data">
                    
                    <div class="form-group">
                        <label>Bạn chắn chắn muốn đăng xuất?</label>
                    </div>
                    
                </form>
            </div>
            <div class="modal-footer">
              <a href="logOut" class="btn btn-success" type="button" >Đồng ý</a>
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
            </div>
        </div>
    </div>
</div>
<!--Bắt đầu đổi mật khẩu-->
<div class="modal fade" id="fdoimatkhau" role="dialog">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title">Đổi mật khẩu</h3>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
                
            </div>
            <div class="modal-body">
                 <s:form action="doiMatKhau" method="POST"> 
                    
                    <div class="form-group">
                        <label>Mật khẩu mới</label>
                        <input class="form-control" type="password" name="matkhaumoi"
                        placeholder="Nhập mật khẩu mới" required>
                    </div>
                    
                    <div class="form-group">
                        <input class="btn btn-primary" type="submit" value="Lưu">
                        <input class="btn btn-warning" type="reset" value="Hủy">
                    </div>
                </s:form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<!--Kết thúc đổi mật khẩu-->
<!--cập nhật thông tin người dùng-->
<div class="modal fade" id="fcapnhathoso" role="dialog" data-backdrop="static">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h3 class="modal-title">Hồ sơ cá nhân</h3>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true">&times;</span>
                </button>
                
            </div>
            <div class="modal-body">
            	
                <s:form action="capnhatHoSo" method="POST"> 
                    
                    <div class="form-group">
                        <label>Email</label>
                        <input class="form-control" type="email" name="email"
                        placeholder="Email" value="<s:property value="email"/>"
                        >
                    </div>
                    <div class="form-group">
                        <label>Số điện thoại</label>
                        <input class="form-control" type="number" name="sodienthoai"
                        placeholder="Email" value="<s:property value="sodienthoai"/>"
                        >
                    </div>
                    <div class="form-group">
                        <label>Họ tên</label>
                        <input class="form-control" type="text" name="hoten"
                        placeholder="Họ tên" value="<s:property value="hoten"/>"
                        required>
                    </div>
                    
                    <div class="form-group">
                        
                        <input class="btn btn-success" type="submit" value="Lưu">
                        
                    </div>
                </s:form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            </div>
        </div>
    </div>
</div>
<br>
<footer class="text-center" style="background-color: rgb(26,148,255);">
 <br>
  <h2><a href="homeKhachAction"><img src="./img/logo2.jpg" width="100" height="40" class="d-inline-block align-top" alt="" /></a></h2>
  
  <h6>&copy;Bản quyền thuộc về DH19TH1</h6>
    <h6>18 Ung Văn Khiêm, Đông Xuyên, TP Long Xuyên</h6>
    <br>
</footer>
<script>
	$(document).ready(function(){
		$(window).scroll(function(){
			$(".slideanim").each(function(){
				var pos = $(this).offset().top;
				var wintop = $(window).scrollTop();
					if(pos<wintop+500){
						$(this).addClass("slidee");
				}
			});
		});
	});
</script>


</body>
</html>