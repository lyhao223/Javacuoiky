-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: managerjava
-- ------------------------------------------------------
-- Server version	8.0.23

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `nhacungcap`
--

DROP TABLE IF EXISTS `nhacungcap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhacungcap` (
  `maNCC` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `tenNCC` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `quocgiaNCC` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `dcNCC` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `emailNCC` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `sdtNCC` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`maNCC`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhacungcap`
--

LOCK TABLES `nhacungcap` WRITE;
/*!40000 ALTER TABLE `nhacungcap` DISABLE KEYS */;
INSERT INTO `nhacungcap` VALUES ('NCC01','Panasonic','Mỹ','Florida','pana@pana.com','19002023'),('NCC02','Philip','Trung Quốc','Thượng Hải','philip@philip.com','19002025'),('NCC03','Toshiba','Nhật','Tokyo','toshi@toshiba.com','19002026');
/*!40000 ALTER TABLE `nhacungcap` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-02 23:54:39
