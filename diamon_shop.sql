-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 11, 2021 at 05:15 AM
-- Server version: 8.0.26
-- PHP Version: 8.0.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `diamon_shop`
--

--
-- Dumping data for table `categorys`
--

INSERT INTO `categorys` (`id`, `name`, `description`) VALUES
(1, 'Đồng hồ', NULL),
(2, 'Vòng tay', NULL),
(3, 'Dây đeo tay', NULL),
(4, 'Dây chuyền', NULL),
(5, 'Nhẫn', 'Vàng\r\n');

--
-- Dumping data for table `colors`
--

INSERT INTO `colors` (`id`, `id_product`, `name`, `code`, `img`) VALUES
(1, 1, 'Vàng', '#FFFF00', 'a.jpg'),
(2, 1, 'Xanh', '#FFFF00', 'b.jpg'),
(3, 2, 'Vàng', '#FFFF00', 'c.jpg'),
(4, 2, 'Xanh', '#FFFF00', 'd.jpg'),
(5, 5, 'Vàng', '#FFFF00', 'e.jpg'),
(6, 6, 'Vàng', '#FFFF00', 'g.jpg'),
(7, 7, 'Vàng', '#FFFF00', 'h.jpg'),
(8, 8, 'Vàng', '#FFFF00', 'i.jpg'),
(9, 9, 'Vàng', '#FFFF00', 'b.jpg'),
(10, 10, 'Vàng', '#FFFF00', 'b.jpg'),
(11, 11, 'Vàng', '#FFFF00', 'b.jpg'),
(12, 12, 'Vàng', '#FFFF00', 'b.jpg'),
(13, 13, 'Vàng', '#FFFF00', 'b.jpg'),
(14, 14, 'Vàng', '#FFFF00', 'b.jpg'),
(15, 15, 'Vàng', '#FFFF00', 'b.jpg'),
(16, 16, 'Vàng', '#FFFF00', 'b.jpg'),
(17, 17, 'Vàng', '#FFFF00', 'b.jpg'),
(18, 18, 'Vàng', '#FFFF00', 'b.jpg'),
(19, 19, 'Vàng', '#FFFF00', 'b.jpg'),
(20, 20, 'Vàng', '#FFFF00', 'b.jpg'),
(21, 21, 'Vàng', '#FFFF00', 'b.jpg'),
(22, 22, 'Vàng', '#FFFF00', 'b.jpg'),
(23, 23, 'Vàng', '#FFFF00', 'b.jpg'),
(24, 24, 'Vàng', '#FFFF00', 'b.jpg'),
(25, 25, 'Vàng', '#FFFF00', 'b.jpg');

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`id`, `name`, `url`) VALUES
(1, 'Trang Chủ', 'trang-chu'),
(2, 'So Sánh', ''),
(3, 'Giỏ Hàng', 'AddCart'),
(4, 'Bài Viết', ''),
(5, 'Liên Hệ', 'lien-he'),
(6, 'Đăng Ký', 'dang-ki');

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `id_category`, `sizes`, `name`, `price`, `sale`, `title`, `highlight`, `new_product`, `details`, `created_at`, `updated_at`) VALUES
(1, 1, 'L,M,S', 'Manicure & Pedicure', 20000, 0, 'Nowadays the lingerie industry is one of the most successful business spheres. Nowadays the lingerie industry is one of ...', 1, 1, '<div class=\"tab-pane fade active in\" id=\"home\">\r\n			  <h4>Product Information</h4>\r\n                <table class=\"table table-striped\">\r\n				<tbody>\r\n				<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Color:</td><td class=\"techSpecTD2\">Black</td></tr>\r\n				<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Style:</td><td class=\"techSpecTD2\">Apparel,Sports</td></tr>\r\n				<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Season:</td><td class=\"techSpecTD2\">spring/summer</td></tr>\r\n				<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Usage:</td><td class=\"techSpecTD2\">fitness</td></tr>\r\n				<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Sport:</td><td class=\"techSpecTD2\">122855031</td></tr>\r\n				<tr class=\"techSpecRow\"><td class=\"techSpecTD1\">Brand:</td><td class=\"techSpecTD2\">Shock Absorber</td></tr>\r\n				</tbody>\r\n				</table>\r\n				<p>Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\r\n				<p>Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\r\n				<p>Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\r\n				<p>Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\r\n				<p>Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\r\n				<p>Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\r\n				<p>Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\r\n				<p>Raw denim you probably haven\'t heard of them jean shorts Austin. Nesciunt tofu stumptown aliqua, retro synth master cleanse. Mustache cliche tempor, williamsburg carles vegan helvetica. Reprehenderit butcher retro keffiyeh dreamcatcher synth. Cosby sweater eu banh mi, qui irure terry richardson ex squid. Aliquip placeat salvia cillum iphone. Seitan aliquip quis cardigan american apparel, butcher voluptate nisi qui.</p>\r\n\r\n			</div>', '2020-04-09', '2020-04-09'),
(2, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 1, 'details', '2020-04-09', '2020-04-09'),
(3, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 1, 'details', '2020-04-09', '2020-04-09'),
(4, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 1, 'details', '2020-04-09', '2020-04-09'),
(5, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(6, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(7, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(8, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(9, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(10, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 1, 'details', '2020-04-09', '2020-04-09'),
(11, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 1, 'details', '2020-04-09', '2020-04-09'),
(12, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(13, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(14, 1, 'L,S,M', 'Name', 200000, 1, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(15, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(16, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(17, 1, 'L,S,M', 'Name', 200000, 1, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(18, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(19, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 1, 'details', '2020-04-09', '2020-04-09'),
(20, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(21, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(22, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 1, 'details', '2020-04-09', '2020-04-09'),
(23, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(24, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(25, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(26, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(27, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(28, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 0, 'details', '2020-04-09', '2020-04-09'),
(29, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 1, 'details', '2020-04-09', '2020-04-09'),
(30, 1, 'L,S,M', 'Name', 200000, 1, 'tital', 1, 1, 'details', '2020-04-09', '2020-04-09'),
(31, 1, 'L,S,M', 'Name', 200000, 0, 'tital', 1, 1, 'details', '2020-04-09', '2020-04-09');

--
-- Dumping data for table `silde`
--

INSERT INTO `silde` (`id`, `img`, `caption`, `content`) VALUES
(10, 'bootstrap_free-ecommerce.png', 'Bootstrap shopping cart', 'Very clean simple to use'),
(11, 'carousel1.png', 'Discount 50%', 'Hàng bán chạy nhất hiện nay'),
(12, 'carousel3.png', 'caption test2', 'content test2');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
