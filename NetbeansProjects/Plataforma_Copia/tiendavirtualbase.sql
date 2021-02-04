/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.7.17-log : Database - tiendavirtual
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`tiendavirtual` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `tiendavirtual`;

/*Table structure for table `articulo` */

DROP TABLE IF EXISTS `articulo`;

CREATE TABLE `articulo` (
  `idArticulo` int(11) NOT NULL AUTO_INCREMENT,
  `categoria` varchar(100) NOT NULL,
  `marca` varchar(100) NOT NULL,
  `titulo` varchar(100) DEFAULT NULL,
  `tipoprecio` varchar(70) NOT NULL,
  `descricion` text,
  `nuevo` tinyint(1) NOT NULL,
  `usado` tinyint(1) NOT NULL,
  `precio` int(10) NOT NULL,
  `Persona_idPersona` int(11) NOT NULL,
  PRIMARY KEY (`idArticulo`,`Persona_idPersona`),
  KEY `fk_Articulo_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_Articulo_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `user` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `articulo` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `idPersona` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(70) NOT NULL,
  `apellido` varchar(70) NOT NULL,
  `correo` varchar(70) NOT NULL,
  `fechanacimiento` varchar(10) NOT NULL,
  `contrasenia` varchar(90) NOT NULL,
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`idPersona`,`nombre`,`apellido`,`correo`,`fechanacimiento`,`contrasenia`) values (6,'Leslie','Diaz','lmdiaz36@gmail.com','06/11/1997','95f31b770d0669237a93abc9c45d226e'),(7,'Traecy','Diaz','traecy@gmail.com','14/02/1999','95f31b770d0669237a93abc9c45d226e');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
