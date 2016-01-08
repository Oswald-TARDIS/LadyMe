/*
Navicat MySQL Data Transfer

Source Server         : Mysql
Source Server Version : 50021
Source Host           : localhost:3306
Source Database       : ladyme

Target Server Type    : MYSQL
Target Server Version : 50021
File Encoding         : 65001

Date: 2016-01-08 09:13:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for co_news
-- ----------------------------
DROP TABLE IF EXISTS `co_news`;
CREATE TABLE `co_news` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `auther` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of co_news
-- ----------------------------
INSERT INTO `co_news` VALUES ('1', '1-11月铁路货物运输完成情况', '2015-12-30 10:33:15', '马哲');
INSERT INTO `co_news` VALUES ('2', '2015：公路货运为每个中国人运货22吨', '2015-12-30 10:33:44', '马哲');
INSERT INTO `co_news` VALUES ('3', '铁路运输已成为西藏主要货运渠道', '2015-12-30 10:34:08', '马哲');
INSERT INTO `co_news` VALUES ('4', '一篇看透物流“进化史”', '2015-12-30 10:34:45', '马哲');
INSERT INTO `co_news` VALUES ('5', '2015双11 那些不能错过的物流数字', '2015-12-30 10:37:31', '马哲');

-- ----------------------------
-- Table structure for cp_user
-- ----------------------------
DROP TABLE IF EXISTS `cp_user`;
CREATE TABLE `cp_user` (
  `id` varchar(255) NOT NULL,
  `sex` varchar(255) default NULL,
  `photo` varchar(255) default NULL,
  `IDphoto` varchar(255) default NULL,
  `IDnumber` varchar(255) default NULL,
  `phone` varchar(255) default NULL,
  `car_type` varchar(255) default NULL,
  `plate_num` varchar(255) default NULL,
  `load_weight` float default NULL,
  `car_length` float default NULL,
  `origin_place` varchar(255) default NULL,
  `DrivingLicense` varchar(255) default NULL,
  `DriverLicense` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cp_user
-- ----------------------------
INSERT INTO `cp_user` VALUES ('C10000', '男', '没有', '没有', '411081199508179256', '15738896847', null, null, null, null, '没有', null, null);
INSERT INTO `cp_user` VALUES ('C10001', '男', '没有', '没有', '没有', '没有', null, null, null, null, '没有', null, null);

-- ----------------------------
-- Table structure for c_user
-- ----------------------------
DROP TABLE IF EXISTS `c_user`;
CREATE TABLE `c_user` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `passwd` varchar(16) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of c_user
-- ----------------------------
INSERT INTO `c_user` VALUES ('C10000', '嘛圈圈', '123456');
INSERT INTO `c_user` VALUES ('C10001', '不是马哲', '123456');

-- ----------------------------
-- Table structure for hp_user
-- ----------------------------
DROP TABLE IF EXISTS `hp_user`;
CREATE TABLE `hp_user` (
  `id` varchar(255) NOT NULL,
  `sex` varchar(255) default NULL,
  `photo` varchar(255) default NULL,
  `IDphoto` varchar(255) default NULL,
  `IDnumber` varchar(255) default NULL,
  `phone` varchar(255) default NULL,
  `origin_place` varchar(255) default NULL,
  `OperateLicense` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hp_user
-- ----------------------------

-- ----------------------------
-- Table structure for h_user
-- ----------------------------
DROP TABLE IF EXISTS `h_user`;
CREATE TABLE `h_user` (
  `id` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `passwd` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of h_user
-- ----------------------------
INSERT INTO `h_user` VALUES ('H10000', '马哲', '123456');
INSERT INTO `h_user` VALUES ('H10001', '夏媛媛', '123456');
INSERT INTO `h_user` VALUES ('H10002', '夏二蛋', '123456');
INSERT INTO `h_user` VALUES ('H10003', '夏一', '123456');
INSERT INTO `h_user` VALUES ('H10004', '夏一一一', '123456');
INSERT INTO `h_user` VALUES ('H10005', '夏二二', '123456');
INSERT INTO `h_user` VALUES ('H10006', '马哲二号', '123456');
INSERT INTO `h_user` VALUES ('H10007', '下雨', '123456');

-- ----------------------------
-- Table structure for in_news
-- ----------------------------
DROP TABLE IF EXISTS `in_news`;
CREATE TABLE `in_news` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(255) NOT NULL,
  `time` datetime NOT NULL,
  `auther` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of in_news
-- ----------------------------
INSERT INTO `in_news` VALUES ('1', '1-11月铁路货物运输完成情况', '2015-12-30 00:00:00', '马哲');
INSERT INTO `in_news` VALUES ('2', '2015：公路货运为每个中国人运货22吨', '2015-12-30 00:00:00', '马哲');
INSERT INTO `in_news` VALUES ('3', '铁路运输已成为西藏主要货运渠道', '2015-12-30 00:00:00', '马哲');
INSERT INTO `in_news` VALUES ('4', '一篇看透物流“进化史”', '2015-12-30 00:00:00', '马哲');
INSERT INTO `in_news` VALUES ('5', '2015双11 那些不能错过的物流数字', '2015-12-31 00:00:00', '马哲');

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` int(11) NOT NULL auto_increment,
  `Hid` varchar(11) NOT NULL,
  `Cid` varchar(11) NOT NULL,
  `Hphone` varchar(255) NOT NULL,
  `Cphone` varchar(255) NOT NULL,
  `origin_place` varchar(255) NOT NULL,
  `destination` varchar(255) NOT NULL,
  `time` date NOT NULL,
  `flag` int(255) NOT NULL default '0' COMMENT '未确认',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('20130106', 'H10000', 'C10000', '15738896847', '15738896847', '河北石家庄', '河北石家庄', '2016-01-07', '3');
INSERT INTO `orders` VALUES ('20130107', 'H10000', 'C10001', '15738896847', '没有', '重庆万州', '重庆万州', '2016-01-07', '3');

-- ----------------------------
-- Table structure for send_good
-- ----------------------------
DROP TABLE IF EXISTS `send_good`;
CREATE TABLE `send_good` (
  `id` int(11) unsigned NOT NULL auto_increment,
  `userID` varchar(255) NOT NULL,
  `origin_place` varchar(255) NOT NULL,
  `destination` varchar(255) NOT NULL,
  `phone` varchar(255) NOT NULL,
  `good_type` varchar(255) NOT NULL,
  `good_weight` float NOT NULL,
  `car_type` varchar(255) NOT NULL,
  `car_length` float NOT NULL,
  `price` float NOT NULL,
  `message` varchar(255) default NULL,
  `time` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of send_good
-- ----------------------------

-- ----------------------------
-- Table structure for send_vehicle
-- ----------------------------
DROP TABLE IF EXISTS `send_vehicle`;
CREATE TABLE `send_vehicle` (
  `id` int(11) NOT NULL auto_increment,
  `userID` varchar(255) NOT NULL,
  `origin_place` varchar(255) NOT NULL,
  `destination` varchar(255) NOT NULL,
  `plate_num` varchar(255) NOT NULL,
  `load_weight` float NOT NULL,
  `car_length` float NOT NULL,
  `phone` varchar(255) NOT NULL,
  `car_type` varchar(255) NOT NULL,
  `message` varchar(255) NOT NULL,
  `time` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of send_vehicle
-- ----------------------------
INSERT INTO `send_vehicle` VALUES ('5', 'C10000', '浙江杭州', '黑龙江哈尔滨', '豫A-88888', '100', '7', '15738896847', '小货车', '请随意', '2016-01-07 17:11');
INSERT INTO `send_vehicle` VALUES ('6', 'C10001', '天津和平', '重庆万州', '123132123', '10', '5', '15738896847', '大货车', '爱晕不晕', '2016-01-07 17:22');
