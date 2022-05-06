-- MySQL dump 10.13  Distrib 8.0.27, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: big_bazaar
-- ------------------------------------------------------
-- Server version	8.0.27

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
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `shopper_id` int DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `city` varchar(100) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (100,'Arvind Devgan','Kanpur','9456548099','C/O sagar sahi anarwala'),(101,'Harsh Beniwal','Lucknow','8650017068','cidbag vijay colony'),(102,'Amit Chaurasia','Allahabad','9410506257','garhi cantt'),(103,'Amit Badhana','Varanasi','7867779563','Ganga Ghat'),(104,'Badri','Raipur','9897412697','Barahganj');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `employee_id` int NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `dateofbirth` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `Education` varchar(45) DEFAULT NULL,
  `Salary` varchar(45) DEFAULT NULL,
  `Qualification` varchar(45) DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `PhoneNum` varchar(45) DEFAULT NULL,
  `Post` varchar(45) DEFAULT NULL,
  `Joiningdate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (50,'Bhanupriya Aatif','09-03-1984','Male','UG','22000','B.Sc','13, Chhaya Society, Hinjewadi Hyderabad','0602 2492529','Executive','02-03-2022'),(51,'Narayan Varty','22-08-1992','Male','PG','30000','MSC','35, Borivali, Indore ','38 70976809','Accounts Head','10-04-2022'),(52,'Gayatri Basu','14-05-1990','Female','UG','27000','BSc','29, Vikhroli, Nagpur','0160 7698598','Admin','04-01-2022');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `item`
--

DROP TABLE IF EXISTS `item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `item` (
  `item_id` int DEFAULT NULL,
  `item_name` varchar(100) DEFAULT NULL,
  `description` varchar(1000) DEFAULT NULL,
  `PRICE` float(11,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `item`
--

LOCK TABLES `item` WRITE;
/*!40000 ALTER TABLE `item` DISABLE KEYS */;
INSERT INTO `item` VALUES (100,'SHOE\"S','NIVA',850.00),(101,'TRACK SUIT','SHIV NARESH',1500.50),(103,'BAT','REEBOK',650.00),(104,'Microwave Oven','Samsung',15000.00),(105,'LG 1.5 Ton A/C','LG',40000.00),(106,'Sweat Shirt','Lee Cooper',600.00),(107,'Maggi Noodles','Nestle',200.00),(108,'Lakme Lip Gloss','Lakme',250.00),(109,'Pizza Bread','Mr. Brown',300.00),(110,'R/C Car Toy','Matchbox Toys',600.00),(111,'Nike Runner','Nike',2000.00);
/*!40000 ALTER TABLE `item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orderitem`
--

DROP TABLE IF EXISTS `orderitem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orderitem` (
  `orderno` varchar(100) DEFAULT NULL,
  `orderDate` date DEFAULT NULL,
  `item_id` int DEFAULT NULL,
  `shopkeeper_id` varchar(100) DEFAULT NULL,
  `quantity` int DEFAULT NULL,
  `price` float(11,2) DEFAULT NULL,
  `discount` float(11,2) DEFAULT NULL,
  `amount` float(11,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orderitem`
--

LOCK TABLES `orderitem` WRITE;
/*!40000 ALTER TABLE `orderitem` DISABLE KEYS */;
INSERT INTO `orderitem` VALUES ('01','2017-11-18',100,'100',1,850.00,5.00,807.50),('02','2017-12-30',101,'101',1,1500.50,0.00,1500.50),('03','2018-01-08',103,'102',1,650.00,8.00,598.00);
/*!40000 ALTER TABLE `orderitem` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shop`
--

DROP TABLE IF EXISTS `shop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `shop` (
  `shop_id` int NOT NULL,
  `floornum` int DEFAULT NULL,
  `shopnum` varchar(45) DEFAULT NULL,
  `Rent` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `Bonus` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`shop_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shop`
--

LOCK TABLES `shop` WRITE;
/*!40000 ALTER TABLE `shop` DISABLE KEYS */;
INSERT INTO `shop` VALUES (10,8,'h63','15000','Occupied','1000'),(11,9,'f35','12000','Non-Occupied','2000'),(12,10,'g34','10000','Occupied','3000'),(13,4,'r35','28000','Occupied','2500');
/*!40000 ALTER TABLE `shop` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-01 22:45:03
