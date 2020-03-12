/*
 Navicat Premium Data Transfer

 Source Server         : zhou
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : 114.55.92.111
 Source Database       : zxl

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : utf-8

 Date: 03/08/2020 16:29:26 PM
*/
use zxl;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Records of `account`
-- ----------------------------
BEGIN;
INSERT INTO `account` VALUES ('1', '2');
COMMIT;

-- ----------------------------
--  Table structure for `uk_user`
-- ----------------------------
DROP TABLE IF EXISTS `uk_user`;
CREATE TABLE `uk_user` (
  `ID` varchar(32) NOT NULL COMMENT '主键ID',
  `LANGUAGE` varchar(255) DEFAULT NULL COMMENT '语言',
  `USERNAME` varchar(255) DEFAULT NULL COMMENT '用户名',
  `PASSWORD` varchar(255) DEFAULT NULL COMMENT '密码',
  `AVATAR` varchar(255) DEFAULT NULL COMMENT '头像',
  `SECURECONF` varchar(255) DEFAULT NULL COMMENT '安全级别',
  `EMAIL` varchar(255) DEFAULT NULL COMMENT '邮件',
  `FIRSTNAME` varchar(255) DEFAULT NULL COMMENT '姓',
  `MIDNAME` varchar(255) DEFAULT NULL COMMENT '名',
  `LASTNAME` varchar(255) DEFAULT NULL COMMENT '名',
  `JOBTITLE` varchar(255) DEFAULT NULL COMMENT '职位',
  `DEPARTMENT` varchar(255) DEFAULT NULL COMMENT '部门',
  `GENDER` varchar(255) DEFAULT NULL COMMENT '性别',
  `BIRTHDAY` varchar(255) DEFAULT NULL COMMENT '生日',
  `NICKNAME` varchar(255) DEFAULT NULL COMMENT '昵称',
  `USERTYPE` varchar(255) DEFAULT NULL COMMENT '用户类型',
  `RULENAME` varchar(255) DEFAULT NULL COMMENT '角色',
  `SEARCHPROJECTID` varchar(255) DEFAULT NULL COMMENT '备用',
  `ORGI` varchar(32) DEFAULT NULL COMMENT '租户ID',
  `ORGID` varchar(32) DEFAULT NULL COMMENT '企业ID',
  `CREATER` varchar(32) DEFAULT NULL COMMENT '创建人',
  `CREATETIME` datetime DEFAULT NULL COMMENT '创建时间',
  `MEMO` varchar(255) DEFAULT NULL COMMENT '备注',
  `UPDATETIME` datetime DEFAULT NULL COMMENT '更新时间',
  `ORGAN` varchar(32) DEFAULT NULL COMMENT '部门',
  `MOBILE` varchar(32) DEFAULT NULL COMMENT '手机号',
  `passupdatetime` datetime DEFAULT NULL COMMENT '最后 一次密码修改时间',
  `sign` text COMMENT '签名',
  `del` tinyint(4) DEFAULT '0' COMMENT '是否已删除',
  `uname` varchar(100) DEFAULT NULL COMMENT '姓名',
  `musteditpassword` tinyint(4) DEFAULT NULL COMMENT '登录修改密码',
  `AGENT` tinyint(4) DEFAULT NULL COMMENT '工号',
  `SKILL` varchar(32) DEFAULT NULL COMMENT '技能组',
  `province` varchar(50) DEFAULT NULL COMMENT '省份',
  `city` varchar(50) DEFAULT NULL COMMENT '城市',
  `fans` int(11) DEFAULT NULL COMMENT '关注人数',
  `follows` int(11) DEFAULT NULL COMMENT '被关注次数',
  `integral` int(11) DEFAULT NULL COMMENT '积分',
  `lastlogintime` datetime DEFAULT NULL COMMENT '最后登录时间',
  `status` varchar(10) DEFAULT NULL COMMENT '状态',
  `deactivetime` datetime DEFAULT NULL COMMENT '离线时间',
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `DATASTATUS` tinyint(4) DEFAULT NULL COMMENT '数据状态',
  `callcenter` tinyint(4) DEFAULT NULL COMMENT '启用呼叫中心坐席',
  `sipaccount` varchar(50) DEFAULT NULL COMMENT 'sip地址',
  `SUPERUSER` tinyint(4) DEFAULT NULL COMMENT '是否超级管理员',
  `maxuser` int(11) DEFAULT '0' COMMENT '最大接入访客数量',
  `ordertype` varchar(20) DEFAULT NULL COMMENT '默认排序方式',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 ROW_FORMAT=COMPACT COMMENT='用户表';

-- ----------------------------
--  Records of `uk_user`
-- ----------------------------
BEGIN;
INSERT INTO `uk_user` VALUES ('2c9f908d6d20496e016d20569d3405b7', null, 'asen', 'e10adc3949ba59abbe56e057f20f883e', null, '5', 'asen@qq.com', null, null, null, null, null, null, null, null, null, null, null, 'asen', 'asen', null, '2019-09-11 20:40:10', null, '2019-09-11 20:40:10', '2c9f908d6d20496e016d2057691705cd', '13888888888', '2019-09-11 20:40:10', null, '0', 'asen', null, '1', '1', null, null, '0', '0', '0', '2019-09-12 14:15:41', null, null, null, '0', '0', null, '0', '0', null), ('2c9f908d6d250965016d254286eb0751', null, 'daguang', 'e10adc3949ba59abbe56e057f20f883e', null, '5', 'daguang@daguang.daguang', null, null, null, null, null, null, null, null, '0', null, null, 'daguang', 'daguang', null, '2019-09-12 19:36:19', null, '2019-09-12 19:36:19', null, '18888888881', '2019-09-12 19:36:19', null, '0', '大光', null, '1', '1', null, null, '0', '0', '0', '2019-09-12 20:50:51', null, null, null, '0', '0', null, '0', '0', null), ('2c9f908d6d250965016d2547014e079f', null, 'wayne', 'e10adc3949ba59abbe56e057f20f883e', null, '5', 'wayne@wayne.wayne', null, null, null, null, null, null, null, null, null, null, null, 'wayne', 'wayne', null, '2019-09-12 19:41:13', null, '2019-09-19 13:54:32', null, '18888888882', '2019-09-12 19:41:13', null, '0', '韦恩', null, '1', '1', null, null, '0', '0', '0', '2019-12-21 14:39:10', null, null, null, '0', '0', null, '0', '0', null), ('2c9f908d6d250965016d2547aba107ae', null, 'abo', 'e10adc3949ba59abbe56e057f20f883e', null, '5', 'abo@abo.abo', null, null, null, null, null, null, null, null, null, null, null, 'abo', 'abo', null, '2019-09-12 19:41:56', null, '2019-09-19 13:54:18', null, '18888888883', '2019-09-12 19:41:56', null, '0', '阿波', null, '1', '1', null, null, '0', '0', '0', '2019-09-17 10:15:49', null, null, null, '0', '0', null, '0', '0', null), ('2c9f908d6d250965016d25489ebb07c1', null, 'luoser', 'e10adc3949ba59abbe56e057f20f883e', null, '5', 'luoser@luoser.luoser', null, null, null, null, null, null, null, null, '0', null, null, 'luoser', 'luoser', null, '2019-09-12 19:42:59', null, '2019-09-12 19:42:59', null, '18888888884', '2019-09-12 19:42:59', null, '0', '罗sir', null, '1', '1', null, null, '0', '0', '0', '2019-09-19 13:53:06', null, null, null, '0', '0', null, '0', '0', null), ('2c9f908d6d339e9d016d3cf7756637bf', null, 'xiaolin', 'e10adc3949ba59abbe56e057f20f883e', null, '5', '623873075@qq.com', null, null, null, null, null, null, null, null, null, null, null, 'xiaolin', 'xiaolin', null, '2019-09-17 10:05:13', null, '2019-09-19 13:23:08', null, '13959727582', '2019-09-17 10:05:13', null, '0', '林', null, '1', '1', null, null, '0', '0', '0', '2019-09-19 13:19:46', null, null, null, '1', '0', null, '0', '0', null), ('2c9f908d6d4791e6016d47fdd3ae1038', null, 'xiaolin', 'e10adc3949ba59abbe56e057f20f883e', null, '5', '623873075@qq.com', null, null, null, null, null, null, null, null, '0', null, null, 'xiaolin', 'xiaolin', null, '2019-09-19 13:27:58', null, '2019-09-19 13:27:58', null, '13959727582', '2019-09-19 13:27:58', null, '0', '小林', null, '1', '1', null, null, '0', '0', '0', '2019-09-26 13:11:06', null, null, null, '0', '0', null, '0', '0', null), ('402880f56ef8d339016ef8eb34d10726', null, 'zhou', 'c21170f4a8bdf85d111efa82e9798a39', '4', '5', '742042932@qq.com', null, null, null, null, null, null, null, null, '0', null, null, 'zhou', 'zhou', null, '2019-12-12 15:03:14', null, '2019-12-13 16:04:12', null, '15608183354', '2019-12-12 15:03:14', null, '0', '周希来', null, '1', null, null, null, '0', '0', '0', '2019-12-21 15:22:08', null, null, null, '0', '0', null, '0', '0', null), ('4028cac3614cd2f901614cf8be1f0324', null, 'admin', 'e10adc3949ba59abbe56e057f20f883e', null, '5', 'admin@cc.com', null, null, null, null, null, '0', null, null, '0', null, null, 'cskefu', 'cskefu', null, '2017-03-16 13:56:34', '北京', '2018-07-31 08:24:13', '4028811b63b028dc0163b032c3ed0590', '18888888888', null, null, '0', '系统管理员', '0', '1', '1', '北京', '北京', '2', '1', '0', '2019-12-21 10:14:55', null, null, null, '0', '0', null, '1', '0', null);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
