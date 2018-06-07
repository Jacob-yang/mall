/*
Navicat MySQL Data Transfer

Source Server         : 192.168.1.146
Source Server Version : 50616
Source Host           : 192.168.1.146:3306
Source Database       : djfy_travel_dev

Target Server Type    : MYSQL
Target Server Version : 50616
File Encoding         : 65001

Date: 2018-05-26 19:37:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `login_name` varchar(255) NOT NULL COMMENT '登录名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '状态 默认1：正常 2：封禁',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='系统用户表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'djfy', 'e1adc3949ba59abbe56e057f2f883e', '1');
INSERT INTO `user` VALUES ('2', 'test1', 'e1adc3949ba59abbe56e057f2f883e', '1');
INSERT INTO `user` VALUES ('3', 'gys3', 'e1adc3949ba59abbe56e057f2f883e', '1');
INSERT INTO `user` VALUES ('4', 'gys1', 'e1adc3949ba59abbe56e057f2f883e', '1');
INSERT INTO `user` VALUES ('5', 'gys2', 'e1adc3949ba59abbe56e057f2f883e', '1');
