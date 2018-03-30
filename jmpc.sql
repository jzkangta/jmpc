-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.0.34-MariaDB-0ubuntu0.16.04.1 - Ubuntu 16.04
-- 服务器操作系统:                      debian-linux-gnu
-- HeidiSQL 版本:                  9.5.0.5196
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 jmpc 的数据库结构
CREATE DATABASE IF NOT EXISTS `jmpc` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `jmpc`;

-- 导出  表 jmpc.driver_order_info 结构
CREATE TABLE IF NOT EXISTS `driver_order_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) NOT NULL COMMENT '车主ID',
  `trip_id` int(11) NOT NULL DEFAULT '0' COMMENT '车主行程ID',
  `order_price` int(11) NOT NULL DEFAULT '0' COMMENT '乘客费用，单位：分',
  `order_status` int(11) NOT NULL DEFAULT '0' COMMENT '订单状态。0-待支付。1-已支付。2-已取消',
  `passengers_trip_id` int(11) NOT NULL DEFAULT '0' COMMENT '乘客行程ID',
  `passengers_end_place` varchar(50) NOT NULL DEFAULT '0' COMMENT '乘客下车地点',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '订单创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='车主行程订单表';

-- 数据导出被取消选择。
-- 导出  表 jmpc.driver_trip_info 结构
CREATE TABLE IF NOT EXISTS `driver_trip_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `route_id` int(11) DEFAULT NULL COMMENT '路线ID',
  `trip_date` date DEFAULT NULL COMMENT '行程日期',
  `trip_time` time DEFAULT NULL COMMENT '出发时间',
  `seat_count` int(11) DEFAULT NULL COMMENT '座位数',
  `way_tags_id` varchar(50) DEFAULT NULL COMMENT '途径地点ID',
  `trip_status` int(1) DEFAULT NULL COMMENT '行程状态，0-已发布，1-已成交，2-已取消 ',
  `trip_price` int(11) DEFAULT NULL COMMENT '座位单价，单位：元',
  `trip_distance` int(11) DEFAULT NULL COMMENT '行程距离，单位：米',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='车主发布行程表';

-- 数据导出被取消选择。
-- 导出  表 jmpc.passengers_order_info 结构
CREATE TABLE IF NOT EXISTS `passengers_order_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '乘客ID',
  `trip_id` int(11) DEFAULT NULL COMMENT '行程ID',
  `order_price` int(11) DEFAULT NULL COMMENT '费用，单位：分',
  `order_status` int(11) DEFAULT NULL COMMENT '订单状态。0-待支付，1-已支付，2-已取消',
  `driver_trip_id` int(11) DEFAULT NULL COMMENT '车主行程ID',
  `create_time` timestamp NULL DEFAULT NULL COMMENT '订单创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='乘客行程订单表';

-- 数据导出被取消选择。
-- 导出  表 jmpc.passengers_trip_info 结构
CREATE TABLE IF NOT EXISTS `passengers_trip_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `route_id` int(11) DEFAULT NULL COMMENT '路线ID',
  `trip_date` date DEFAULT NULL COMMENT '出发日期',
  `trip_time` time DEFAULT NULL COMMENT '出发时间',
  `person_count` int(1) DEFAULT NULL COMMENT '乘客人数',
  `place_tags_id` varchar(50) DEFAULT NULL COMMENT '中途下车点ID',
  `trip_status` int(1) DEFAULT NULL COMMENT '0-已发布，1-已成交，2-已取消 ',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `trip_distance` int(11) DEFAULT NULL COMMENT '路线距离，单位：米',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='乘客发布行程表';

-- 数据导出被取消选择。
-- 导出  表 jmpc.place_tag_info 结构
CREATE TABLE IF NOT EXISTS `place_tag_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `city_id` int(11) DEFAULT '1' COMMENT '城市ID，1为广州',
  `area_id` int(11) DEFAULT '1' COMMENT '区域ID，city_id为1时：1-天河，2-珠江新城，3-科学城，4-黄埔',
  `tag_name` varchar(100) DEFAULT '' COMMENT '地点名称',
  `tag_status` int(1) DEFAULT '1' COMMENT '0-删除 1-正常',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `tag_longitude` varchar(100) DEFAULT '' COMMENT '经度',
  `tag_latitude` varchar(100) DEFAULT '' COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='热门关注地点';

-- 数据导出被取消选择。
-- 导出  表 jmpc.user_base_info 结构
CREATE TABLE IF NOT EXISTS `user_base_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nick_name` varchar(200) DEFAULT NULL,
  `head_image_url` varchar(255) DEFAULT NULL COMMENT '头像地址',
  `sex` int(1) DEFAULT '3' COMMENT '性别，0-女 1-男，3-未知',
  `age` int(3) DEFAULT '0' COMMENT '年龄',
  `open_id` varchar(255) DEFAULT NULL COMMENT 'open_id',
  `cell_phone` varchar(50) DEFAULT NULL COMMENT '手机号',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `user_status` int(1) DEFAULT '1' COMMENT '0-失效，1-有效',
  `user_city_id` int(10) DEFAULT '1' COMMENT '1-广州',
  `real_name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `id_card` varchar(50) DEFAULT NULL COMMENT '身份证号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户基础信息表';

-- 数据导出被取消选择。
-- 导出  表 jmpc.user_car_info 结构
CREATE TABLE IF NOT EXISTS `user_car_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT '0',
  `car_brand` varchar(50) DEFAULT NULL COMMENT '汽车品牌',
  `car_number` varchar(50) DEFAULT NULL COMMENT '车牌号码',
  `care_color` varchar(50) DEFAULT NULL COMMENT '颜色',
  `seat_count` int(1) DEFAULT NULL COMMENT '座位数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户车辆信息表';

-- 数据导出被取消选择。
-- 导出  表 jmpc.user_focus_place 结构
CREATE TABLE IF NOT EXISTS `user_focus_place` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL COMMENT '用户ID',
  `fp_tag_id` int(11) DEFAULT NULL COMMENT '地点TagID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户关注的地点标签';

-- 数据导出被取消选择。
-- 导出  表 jmpc.user_route_info 结构
CREATE TABLE IF NOT EXISTS `user_route_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT '0' COMMENT '用户ID',
  `start_place` varchar(50) DEFAULT NULL COMMENT '起点名',
  `start_longitude` varchar(100) DEFAULT NULL COMMENT '起点经度',
  `start_latitude` varchar(100) DEFAULT NULL COMMENT '起点维度',
  `start_time` time DEFAULT '00:00:00' COMMENT '出发时间',
  `end_place` varchar(50) DEFAULT NULL COMMENT '终点地址',
  `end_longitude` varchar(100) DEFAULT NULL COMMENT '终点经度',
  `end_latitude` varchar(100) DEFAULT NULL COMMENT '终点纬度',
  `route_status` int(1) DEFAULT '1' COMMENT '0-失效，1-有效',
  `route_type` int(1) DEFAULT '1' COMMENT '1-上班，2-下班，3-临时',
  `start_place_desc` varchar(100) DEFAULT NULL COMMENT '起点地点描述',
  `end_palsce_desc` varchar(100) DEFAULT NULL COMMENT '终点地点描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户路线信息';

-- 数据导出被取消选择。
-- 导出  表 jmpc.user_wallet_info 结构
CREATE TABLE IF NOT EXISTS `user_wallet_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT '0' COMMENT '用户ID',
  `oper_detail` int(11) DEFAULT '0' COMMENT '钱包细项，1-行程退款；2-支付车费；3-收款；4-体现',
  `oper_money` int(11) DEFAULT '0' COMMENT '金额',
  `oper_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户钱包表';

-- 数据导出被取消选择。
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
