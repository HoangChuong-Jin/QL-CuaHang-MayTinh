<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Trang quản trị</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.6.1/font/bootstrap-icons.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" ></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" ></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" ></script>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        .vertical-nav {
            min-width: 17rem;
            width: 17rem;
            height: 100vh;
            position: fixed;
            top: 0;
            left: 0;
            box-shadow: 3px 3px 10px rgba(61, 162, 230, 0.685);
            transition: all 0.9s;
        }
        .page-content {
            width: calc(100% - 17rem);
            margin-left: 17rem;
            transition: all 0.9s;
        }
          
        /* for toggle behavior */
          
        #sidebar.active {
            margin-left: -17rem;
        }
          
        #content.active {
            width: 100%;
            margin: 0;
        }
          
        @media (max-width: 768px) {
            #sidebar {
                margin-left: -17rem;
            }
            #sidebar.active {
                margin-left: 0;
            }
            #content {
                width: 100%;
                margin: 0;
            }
            #content.active {
                margin-left: 17rem;
                width: calc(100% - 17rem);
            }
        }
        body {
            background: #eef8fc;
            min-height: 100vh;
            overflow-x: hidden;
        }
          
        .separator {
            background:black;
            margin: 3rem 0;
            border-bottom: 1px dashed #fff;
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
    <script>
        $(function() {
            // Sidebar toggle behavior
            $('#sidebarCollapse').on('click', function() {
              $('#sidebar, #content').toggleClass('active');
            });
          });
    </script>
    
</head>
<body>

<!-- menu -->
    <div class="vertical-nav bg-white" id="sidebar">
      <div class="py-3 px-3 mb-4 text-white" style="background-color:rgb(26,148,255);">
        <div class="media d-flex align-items-center">
            <img class="" src="./img/logo.jpg"  width="100px">
        </div>
      </div>

        <p class="text-gray font-weight-bold text-uppercase px-3 small pb-4 mb-0">
          QUẢN LÝ
        </p>

        <ul class="nav flex-column mb-0">
            <li class="nav-item">
                <a href="homeAdminAction" class="nav-link text-primary font-italic bg-white">
                    <i class="fa fa-th-large mr-3 text-primary fa-fw"></i>
                    Bảng điều khiển
                </a>
            </li>
            <li class="nav-item">
                <a href="listSanPhamAction" class="nav-link text-dark font-italic">
                    <i class="fa fa-leaf mr-3 text-primary fa-fw"></i>
                    Quản lý sản phẩm
                </a>
            </li>
            <li class="nav-item">
                <a href="listDonHangAction" class="nav-link text-dark font-italic">
                    <i class="fa fa-bars mr-3 text-primary fa-fw"></i>
                    Quản lý đơn hàng
                </a>
            </li>
            <li class="nav-item">
            <a href="listNguoiDungAction" class="nav-link text-dark font-italic">
                        <i class="fa fa-users mr-3 text-primary fa-fw"></i>
                        Quản lý người dùng
                    </a>
            </li>
         </ul>

        <p class="text-gray font-weight-bold text-uppercase px-3 small pb-2 py-3 mb-0">TÀI KHOẢN</p>
        <ul class="nav flex-column bg-white mb-0">
            <li class="nav-item">
                <a href="#" data-toggle="modal" data-target="#fcapnhatthongtin" class="nav-link text-dark font-italic">
                    <i class="fa fa-address-card mr-3 text-primary fa-fw"></i>
                    Hồ sơ cá nhân
                </a>
            </li>
            <li class="nav-item">
                <a href="#" data-toggle="modal" data-target="#fdoimatkhau" class="nav-link text-dark font-italic">
                    <i class="fa fa-lock mr-3 text-primary fa-fw"></i>
                    Đổi mật khẩu
                </a>
            </li>
            <li class="nav-item">
	            <a href="#" class="nav-link text-dark font-italic" data-toggle="modal" data-target="#fdangxuat">
	                <i class="fa fa-power-off mr-3 fa-fw" style="color: #FD5961;"></i>
	                Thoát
	            </a>
	        </li>
            
        </ul>
    </div>

<!--cập nhật thông tin người dùng-->
    <div class="modal fade" id="fcapnhatthongtin" role="dialog" data-backdrop="static">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h3 class="modal-title">Hồ sơ cá nhân</h3>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                      <span aria-hidden="true">&times;</span>
                    </button>
                    
                </div>
                <div class="modal-body">
                    <form method="post" action="index.php" enctype="multipart/form-data">
                        <div class="text-center">
                            <img class="img-circle" src=""  width="100px">

                        </div>
                        <div class="form-group">
                            <label>Email</label>
                            <input class="form-control" type="email" name="txtemail"
                            placeholder="Email" value=""
                            >
                        </div>
                        <div class="form-group">
                            <label>Số điện thoại</label>
                            <input class="form-control" type="number" name="txtdienthoai"
                            placeholder="Email" value=""
                            >
                        </div>
                        <div class="form-group">
                            <label>Họ tên</label>
                            <input class="form-control" type="text" name="txthoten"
                            placeholder="Họ tên" value=""
                            required>
                        </div>
                        <div class="form-group">
                            <label>Đổi hình đại diện</label>
                            <input type="file" name="fhinh">
                        </div>
                        <div class="form-group">
                            <input type="hidden" name="txtid" value="" >
                            <input type="hidden" name="txthinhanh" value="" >
                            <input type="hidden" name="action" value="capnhat" >
                            <input class="btn btn-primary" type="submit" value="Lưu">
                            
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
<!--kết thúc cập nhật thông tin người dùng-->

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
                    <form method="post" enctype="multipart/form-data">
                        
                        <div class="form-group">
                            <label>Mật khẩu mới</label>
                            <input class="form-control" type="password" name="txtmatkhaumoi"
                            placeholder="Nhập mật khẩu mới" required>
                        </div>
                        
                        <div class="form-group">
                            <input type="hidden" name="txtemail" value="" >
                            <input type="hidden" name="action" value="doimatkhau" >
                            <input class="btn btn-primary" type="submit" value="Lưu">
                            <input class="btn btn-warning" type="reset" value="Hủy">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                </div>
            </div>
        </div>
    </div>
<!--Kết thúc đổi mật khẩu-->

<!-- Nội Dung -->
    <div class="page-content p-3" id="content">
    <!-- Toggle button -->
        &nbsp;&nbsp;&nbsp;&nbsp;
        <button id="sidebarCollapse" type="button" class="btn btn-light bg-white shadow-sm px-4 mb-4">
            <i class="fa fa-bars text-primary mr-1"></i>
        </button>

        <div class="container">
            <h2 class="display-4 text-dark">Trang quản trị shop TWELVE.</h2>
            <br>
            <div class="row">
                <div class="col-sm-4">
                    <div class="card mb-3" style="max-width: 22rem;">
                        <div class="card-body text-white bg-info">
                            <img style="float: left" src="./img/shopping.jpg" alt="">
                            <h1 class="card-text text-right"></h1>
                            <h5 class="card-title text-right">Đơn hàng mới</h5>
                        </div>
                        <div class="card-footer text-right bg-transparent border-info">
                            <a href="list2DonHangAction">Xem chi tiết<i class="bi bi-chevron-double-right"></i></a>
                        </div>
                    </div>
                </div>

                <div class="col-sm-4">          
                    <div class="card mb-3" style="max-width: 22rem;">
                        <div class="card-body text-white bg-danger">
                            <img style="float: left" src="./img/ht.jpg" width="70" alt="">
                            <h1 class="card-text text-right"></h1>
                            <h5 class="card-title text-right">Sản phẩm hết hàng</h5>
                        </div>
                        <div class="card-footer text-right bg-transparent border-danger">
                            <a href="list2SanPhamAction">Xem chi tiết<i class="bi bi-chevron-double-right"></i></a>
                        </div>
                    </div>
                </div>  

                <div class="col-sm-4">
                    <div class="card mb-3" style="max-width: 22rem;">
                        <div class="card-body text-white bg-warning ">
                            <img style="float: left" src="./img/kh.jpg" width="60" alt="">
                            <h1 class="card-text text-right"></h1>
                            <h5 class="card-title text-right">Người dùng</h5>
                        </div>
                        <div class="card-footer text-right bg-transparent border-warning">
                            <a href="list2NguoiDungAction">Xem chi tiết<i class="bi bi-chevron-double-right"></i></a>
                        </div>
                    </div>
                </div>
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
              <a href="logOut" class="btn btn-primary" type="button" >Đồng ý</a>
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Đóng</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>