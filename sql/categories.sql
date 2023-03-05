/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : note2

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 05/03/2023 01:04:38
 
 	由于存在emoji字符，需要使用utfmb4编码，有的数据库版本不支持排序规则utf8_general_ai_ci，修改为utf8mb4_bin（后者大小写敏感）
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for categories
-- ----------------------------
DROP TABLE IF EXISTS `categories`;
CREATE TABLE `categories`  (
  `category` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of categories
-- ----------------------------
INSERT INTO `categories` VALUES ('JAVA');
INSERT INTO `categories` VALUES ('MySQL');
INSERT INTO `categories` VALUES ('Redis');
INSERT INTO `categories` VALUES ('算法');
INSERT INTO `categories` VALUES ('Linux');

SET FOREIGN_KEY_CHECKS = 1;
