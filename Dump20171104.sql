CREATE DATABASE  IF NOT EXISTS `test` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `test`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: test
-- ------------------------------------------------------
-- Server version	8.0.3-rc-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `category_product`
--

DROP TABLE IF EXISTS `category_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category_product` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category_product`
--

LOCK TABLES `category_product` WRITE;
/*!40000 ALTER TABLE `category_product` DISABLE KEYS */;
INSERT INTO `category_product` VALUES (1,'Personal electronic'),(2,'Photo/Video'),(3,'Periphery'),(4,'Portative electronic');
/*!40000 ALTER TABLE `category_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `currencies`
--

DROP TABLE IF EXISTS `currencies`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `currencies` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `currencies`
--

LOCK TABLES `currencies` WRITE;
/*!40000 ALTER TABLE `currencies` DISABLE KEYS */;
INSERT INTO `currencies` VALUES (1,'usd'),(2,'euro');
/*!40000 ALTER TABLE `currencies` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `lastName` varchar(45) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  `groop_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKf5rstedundygjfga5oke6vdy9` (`status_id`),
  KEY `FK22qmfri167a035l22txa2bgu3` (`groop_id`),
  CONSTRAINT `FK22qmfri167a035l22txa2bgu3` FOREIGN KEY (`groop_id`) REFERENCES `groop` (`id`),
  CONSTRAINT `FKf5rstedundygjfga5oke6vdy9` FOREIGN KEY (`status_id`) REFERENCES `status` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'Ivan','Ivanov',1,2),(2,'Petr','Petrov',1,1),(3,'Sidor','Sidorov',1,2),(4,'Vasil','Vasiliev',1,1),(5,'Fedor','Fedorov',1,2),(6,'Nikolay','Nikolaev',4,1),(7,'Oleg','Olegov',3,2),(8,'Max','Maximov',1,1),(9,'Gleb','Glebov',2,2),(10,'Victor','Victorov',1,1);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `groop`
--

DROP TABLE IF EXISTS `groop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `groop` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `groop`
--

LOCK TABLES `groop` WRITE;
/*!40000 ALTER TABLE `groop` DISABLE KEYS */;
INSERT INTO `groop` VALUES (1,'accountant'),(2,'manager');
/*!40000 ALTER TABLE `groop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `price_product`
--

DROP TABLE IF EXISTS `price_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `price_product` (
  `id` int(11) NOT NULL,
  `price` double DEFAULT NULL,
  `product_id` int(11) NOT NULL,
  `currencie_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKfmehsb599uw0234garsuldvrg` (`currencie_id`),
  KEY `FKnjdlnm2pshroys2o1tskri0g` (`product_id`),
  CONSTRAINT `FKfmehsb599uw0234garsuldvrg` FOREIGN KEY (`currencie_id`) REFERENCES `currencies` (`id`),
  CONSTRAINT `FKnjdlnm2pshroys2o1tskri0g` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `price_product`
--

LOCK TABLES `price_product` WRITE;
/*!40000 ALTER TABLE `price_product` DISABLE KEYS */;
INSERT INTO `price_product` VALUES (1,300,1,1),(2,250,2,1),(3,150,3,1),(4,100,4,1),(5,50,5,1),(6,30,6,1),(7,20,7,1),(8,30,8,1),(9,40,9,1),(10,50,10,1),(11,250,1,2),(12,200,2,2),(13,130,3,2),(14,80,4,2),(15,40,5,2),(16,25,6,2),(17,15,7,2),(18,20,8,2),(19,30,9,2),(20,40,10,2);
/*!40000 ALTER TABLE `price_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `product` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `status_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKost67owd3gqs8mmqg971nx189` (`category_id`),
  KEY `FKfn5bxb3t7aubd466pn0a0jgau` (`status_id`),
  CONSTRAINT `FKfn5bxb3t7aubd466pn0a0jgau` FOREIGN KEY (`status_id`) REFERENCES `status_product` (`id`),
  CONSTRAINT `FKost67owd3gqs8mmqg971nx189` FOREIGN KEY (`category_id`) REFERENCES `category_product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES (1,'TV',1,1),(2,'Photocamera',2,2),(3,'Phone',4,2),(4,'Table',4,2),(5,'Laptop',4,2),(6,'Smartphone',4,2),(7,'Action camera',2,3),(8,'Motitor',1,2),(9,'PC',1,2),(10,'Printer',3,2);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status`
--

DROP TABLE IF EXISTS `status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `status` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status`
--

LOCK TABLES `status` WRITE;
/*!40000 ALTER TABLE `status` DISABLE KEYS */;
INSERT INTO `status` VALUES (1,'hired'),(2,'dismissed'),(3,'on_leave'),(4,'in_business_trip');
/*!40000 ALTER TABLE `status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `status_product`
--

DROP TABLE IF EXISTS `status_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `status_product` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `status_product`
--

LOCK TABLES `status_product` WRITE;
/*!40000 ALTER TABLE `status_product` DISABLE KEYS */;
INSERT INTO `status_product` VALUES (1,'On Sale'),(2,'On The Shelf'),(3,'EOL');
/*!40000 ALTER TABLE `status_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'test'
--

--
-- Dumping routines for database 'test'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-04 21:05:06
