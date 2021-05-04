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
-- Table structure for table `chitietkm`
--

DROP TABLE IF EXISTS `chitietkm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `chitietkm` (
  `maKM` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `maSP` varchar(45) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `phantramKM` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  KEY `maKM_idx` (`maKM`),
  KEY `maSP_4_idx` (`maSP`),
  CONSTRAINT `maKM` FOREIGN KEY (`maKM`) REFERENCES `khuyenmai` (`maKM`),
  CONSTRAINT `maSP_4` FOREIGN KEY (`maSP`) REFERENCES `sanpham` (`maSP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chitietkm`
--

LOCK TABLES `chitietkm` WRITE;
/*!40000 ALTER TABLE `chitietkm` DISABLE KEYS */;
INSERT INTO `chitietkm` VALUES ('KM01','SP06','3'),('KM01','SP03','3'),('KM02','SP03','3'),('KM03','SP04','6'),('KM02','SP01','5'),('KM02','SP01','5');
/*!40000 ALTER TABLE `chitietkm` ENABLE KEYS */;
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
