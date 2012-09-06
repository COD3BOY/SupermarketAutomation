/*
SQLyog Ultimate v8.55 
MySQL - 5.0.15-nt : Database - customerdetails
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`customerdetails` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `customerdetails`;

/*Table structure for table `customer_details` */

DROP TABLE IF EXISTS `customer_details`;

CREATE TABLE `customer_details` (
  `ID` int(11) NOT NULL auto_increment,
  `Name` varchar(100) default NULL,
  `AddressLine1` varchar(100) default NULL,
  `AddressLine2` varchar(100) default NULL,
  `AddressLine3` varchar(100) default NULL,
  `PhoneNum` int(11) default NULL,
  `Type` varchar(100) default NULL,
  `TotalPurchase` float default NULL,
  PRIMARY KEY  (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer_details` */

insert  into `customer_details`(`ID`,`Name`,`AddressLine1`,`AddressLine2`,`AddressLine3`,`PhoneNum`,`Type`,`TotalPurchase`) values (1,'fgfd','gfdg','dfgfdgf','dgfdg',546464,'ORDINARY',0),(3,'fdgfdgdfgdfgdfg','dfgfd','gdfgd','gdgdg',8567867,'ORDINARY',0),(4,'gsdfgdg','sd','dddddddddd','sfdsfd',77777,'ORDINARY',0);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
