SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for zk_user
-- ----------------------------
DROP TABLE IF EXISTS `jszlist`;
CREATE TABLE `jszlist` (
  `jid` int(11) NOT NULL AUTO_INCREMENT,
  `jname` varchar(255) NOT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `oneCity` varchar(255) DEFAULT NULL,
  `twoCity` varchar(255) DEFAULT NULL,
  `thereCity` varchar(255) DEFAULT NULL,
  `time` date ,
  PRIMARY KEY (`jid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;