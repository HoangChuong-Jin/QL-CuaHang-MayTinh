-- phpMyAdmin SQL Dump
-- version 4.9.5deb2
-- https://www.phpmyadmin.net/
--
-- Máy chủ: localhost:3306
-- Thời gian đã tạo: Th1 06, 2022 lúc 07:31 PM
-- Phiên bản máy phục vụ: 8.0.27-0ubuntu0.20.04.1
-- Phiên bản PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `shop`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `donhang`
--

CREATE TABLE `donhang` (
  `id` int NOT NULL,
  `nguoidung_id` int NOT NULL,
  `sanpham_id` int DEFAULT NULL,
  `soluong` int NOT NULL,
  `giaban` float NOT NULL,
  `ngay` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `tongtien` float NOT NULL DEFAULT '0',
  `ghichu` varchar(255) DEFAULT NULL,
  `trangthai` tinyint NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Đang đổ dữ liệu cho bảng `donhang`
--

INSERT INTO `donhang` (`id`, `nguoidung_id`, `sanpham_id`, `soluong`, `giaban`, `ngay`, `tongtien`, `ghichu`, `trangthai`) VALUES
(17, 29, 33, 1, 11000000, '2022-01-04 22:26:53', 11000000, 'Mới', 0),
(18, 29, 33, 20, 11000000, '2022-01-04 22:30:36', 11000000, '', 0);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `nguoidung`
--

CREATE TABLE `nguoidung` (
  `id` int NOT NULL,
  `hoten` varchar(255) NOT NULL,
  `sodienthoai` varchar(10) NOT NULL,
  `tendangnhap` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `matkhau` varchar(255) NOT NULL,
  `loaiquyen` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '3',
  `trangthai` tinyint NOT NULL DEFAULT '1',
  `hinhanh` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Đang đổ dữ liệu cho bảng `nguoidung`
--

INSERT INTO `nguoidung` (`id`, `hoten`, `sodienthoai`, `tendangnhap`, `matkhau`, `loaiquyen`, `trangthai`, `hinhanh`) VALUES
(29, 'Khách', '012346578', 'khach', 'c4ca4238a0b923820dcc509a6f75849b', 'KHACH', 1, NULL),
(30, 'Admin', '012345678', 'admin', 'c4ca4238a0b923820dcc509a6f75849b', 'ADMIN', 1, NULL),
(32, 'Oai', '0123465798', 'oai', '334097dfd2880a11efc114859531d188', 'KHACH', 0, 'laptopasus.jpg');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `sanpham`
--

CREATE TABLE `sanpham` (
  `id` int NOT NULL,
  `tensanpham` varchar(255) NOT NULL,
  `mota` text,
  `giagoc` float NOT NULL DEFAULT '0',
  `giaban` float NOT NULL DEFAULT '0',
  `soluongton` int NOT NULL DEFAULT '0',
  `hinhanh` varchar(255) DEFAULT NULL,
  `luotxem` int NOT NULL DEFAULT '0',
  `luotmua` int NOT NULL DEFAULT '0',
  `danhmuc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `thuonghieu` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

--
-- Đang đổ dữ liệu cho bảng `sanpham`
--

INSERT INTO `sanpham` (`id`, `tensanpham`, `mota`, `giagoc`, `giaban`, `soluongton`, `hinhanh`, `luotxem`, `luotmua`, `danhmuc`, `thuonghieu`) VALUES
(33, 'Máy Dell', 'Máy mạnh lắm', 10000000, 15000000, 100, 'maytinhdell.jpg', 100, 10, 'Laptop', 'Dell'),
(34, 'Máy tính hp', 'Máy này mạnh vừa', 11000000, 12000000, 10, 'maytinhhp.jpg', 0, 0, 'Laptop', 'HP');

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `donhang`
--
ALTER TABLE `donhang`
  ADD PRIMARY KEY (`id`),
  ADD KEY `nguoidung_id` (`nguoidung_id`),
  ADD KEY `diachi_id` (`sanpham_id`);

--
-- Chỉ mục cho bảng `nguoidung`
--
ALTER TABLE `nguoidung`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  ADD PRIMARY KEY (`id`),
  ADD KEY `loaisanpham_id` (`danhmuc`),
  ADD KEY `thuonghieu_id` (`thuonghieu`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `donhang`
--
ALTER TABLE `donhang`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT cho bảng `nguoidung`
--
ALTER TABLE `nguoidung`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT cho bảng `sanpham`
--
ALTER TABLE `sanpham`
  MODIFY `id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=36;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `donhang`
--
ALTER TABLE `donhang`
  ADD CONSTRAINT `donhang_ibfk_1` FOREIGN KEY (`nguoidung_id`) REFERENCES `nguoidung` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `donhang_ibfk_2` FOREIGN KEY (`sanpham_id`) REFERENCES `sanpham` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
