/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50710
Source Host           : localhost:3306
Source Database       : hotel

Target Server Type    : MYSQL
Target Server Version : 50710
File Encoding         : 65001

Date: 2016-01-30 13:40:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for room2
-- ----------------------------
DROP TABLE IF EXISTS `room2`;
CREATE TABLE `room2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `type` varchar(255) NOT NULL,
  `view` varchar(255) NOT NULL,
  `service` varchar(255) NOT NULL,
  `checkin` varchar(255) NOT NULL,
  `date` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of room2
-- ----------------------------
INSERT INTO `room2` VALUES ('15', 'Άκης Παπαδόπουλος', 'Μονοκλυνο', 'null', 'OK', 'OK', '12/01/2016-13/01/2016');
INSERT INTO `room2` VALUES ('16', 'Μάνος Γεωργίου', 'Δίκλυνο', 'OK', 'OK', 'null', '12/01/2016-15/01/2016');
INSERT INTO `room2` VALUES ('17', 'Μάνος Αποστόλου', 'Μονοκλυνο', 'null', 'OK', 'null', '20/01/2016-22/01/2016');
INSERT INTO `room2` VALUES ('18', 'Στράτος Διονυσίου', 'Δίκλυνο', 'null', 'OK', 'OK', '20/01/2016-22/01/2016');
INSERT INTO `room2` VALUES ('19', 'Μάρκος Βαμβακάρης', 'Τετράκλυνο', 'null', 'null', 'null', '22/01/2016-24/01/2016');
INSERT INTO `room2` VALUES ('20', 'Βασίλης Τσιτσάνης', 'Δίκλυνο', 'OK', 'null', 'null', '23/01/2016-24/01/2016');
INSERT INTO `room2` VALUES ('21', 'Ιωάννης Λεμονής', 'Μονοκλυνο', 'OK', 'null', 'OK', '23/01/2016-27/01/2016');
INSERT INTO `room2` VALUES ('22', 'Ιωάννης Παππαιωάννου', 'Δίκλυνο', 'null', 'null', 'OK', '21/01/2016-27/01/2016');
INSERT INTO `room2` VALUES ('23', 'Γιώργος Ζαμπέτας', 'Τετράκλυνο', 'OK', 'OK', 'OK', '12/02/2016-23/02/2016');
