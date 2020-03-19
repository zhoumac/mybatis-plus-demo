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

 Date: 03/08/2020 16:29:07 PM
*/

CREATE DATABASE `zxl` CHARACTER SET 'utf8mb4';

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

SET FOREIGN_KEY_CHECKS = 1;
