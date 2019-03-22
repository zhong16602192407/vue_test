SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for zk_user
-- ----------------------------
DROP TABLE IF EXISTS `wzlist`;
CREATE TABLE `wzlist` (
  `wid` int(11) NOT NULL AUTO_INCREMENT,
  `wname` varchar(255) NOT NULL,
  `wprice` int(11) NOT NULL,
  `wfz` int(11) NOT NULL,
  `wtime` date ,
  PRIMARY KEY (`wid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;