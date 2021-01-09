-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: singularagil
-- ------------------------------------------------------
-- Server version	8.0.21

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
-- Table structure for table `bitacora`
--

DROP TABLE IF EXISTS `bitacora`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `bitacora` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `id_estudiante` bigint NOT NULL,
  `id_tema` int NOT NULL,
  `fecha_registro` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_estudiante` (`id_estudiante`),
  KEY `id_tema` (`id_tema`),
  CONSTRAINT `bitacora_ibfk_1` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id`),
  CONSTRAINT `bitacora_ibfk_2` FOREIGN KEY (`id_tema`) REFERENCES `temas` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bitacora`
--

LOCK TABLES `bitacora` WRITE;
/*!40000 ALTER TABLE `bitacora` DISABLE KEYS */;
INSERT INTO `bitacora` VALUES (4,1,1,'2021-01-05 13:21:57'),(5,1,2,'2021-01-05 13:22:15'),(6,1,3,'2021-01-05 13:22:31'),(7,2,3,'2021-01-05 13:22:58'),(8,2,6,'2021-01-05 13:23:05'),(9,2,7,'2021-01-05 13:23:14'),(10,3,1,'2021-01-05 13:23:28'),(11,3,3,'2021-01-05 13:23:35'),(12,3,10,'2021-01-05 13:23:44'),(13,3,8,'2021-01-05 13:23:53'),(14,3,9,'2021-01-05 13:24:11'),(21,1,4,'2021-01-07 22:54:51'),(22,1,4,'2021-01-07 05:07:24'),(23,1,4,'2021-01-07 17:11:53'),(24,3,9,'2021-01-08 14:59:39'),(25,3,7,'2021-01-08 17:40:48'),(26,3,5,'2021-01-08 17:40:53');
/*!40000 ALTER TABLE `bitacora` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estudiante`
--

DROP TABLE IF EXISTS `estudiante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estudiante` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `matricula` varchar(20) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `apellido` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estudiante`
--

LOCK TABLES `estudiante` WRITE;
/*!40000 ALTER TABLE `estudiante` DISABLE KEYS */;
INSERT INTO `estudiante` VALUES (1,'1234','Giovanna','Moreno','gio@gmail.com','5512121212'),(2,'0987','Sergio','Cabrera','sergio@hotmail.com','5544444444'),(3,'5678','Olivia','Juarez','olivia@gmail.com','557777777'),(4,'1111','Jaime','Cruz','jaime@hotmail.com','5523232323');
/*!40000 ALTER TABLE `estudiante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `temas`
--

DROP TABLE IF EXISTS `temas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `temas` (
  `id` int NOT NULL AUTO_INCREMENT,
  `titulo` varchar(200) DEFAULT NULL,
  `contenido` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `temas`
--

LOCK TABLES `temas` WRITE;
/*!40000 ALTER TABLE `temas` DISABLE KEYS */;
INSERT INTO `temas` VALUES (1,'Definición de agilidad','Contenido tema 1'),(2,'Porque usar agilidad','Contenido tema 2'),(3,'Complejidad de los proyectos','Contenido tema 3'),(4,'Agilidad y el entorno VUCA','Contenido tema 4'),(5,'Marcos de trabajo ágiles','Contenido tema 5'),(6,'Manifiesto ágil','Contenido tema 6'),(7,'Valores ágiles','Contenido tema 7'),(8,'Principios ágiles','Contenido tema 8'),(9,'Diferencia entre proyectos en cascada y ágiles','Contenido tema 9'),(10,'Mindset ágil','Contenido tema 10'),(11,'Otro Contenido Editado','Otro Contenido Editado Otro Contenido Otro Contenido Editado');
/*!40000 ALTER TABLE `temas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'admin','$2a$10$slYQmyNdGzTn7ZLBXBChFOC9f6kFjAqPhccnP6DxlWXx2lPk1C3G6'),(3,'gio','$2a$10$poztWItY4/8ya9Ac6nWDJOUQKQ//k0uT3TVr2znn.SlTlIOof3DtO'),(5,'alexa','$2a$10$OCz0an8qU65VZZE2wB5ukO5SS7bDeD9A15oMb6h1Zl2/8sUePr4QK');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'singularagil'
--
/*!50003 DROP PROCEDURE IF EXISTS `GET_LAST_COURSE` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `GET_LAST_COURSE`(IN registrationnumber VARCHAR(20))
BEGIN
    select	
		e.id as 'id_estudiante',
		e.matricula,
		e.nombre,
		e.apellido,
		e.email,
		e.telefono,
		t.id as 'id_ultimotema',
		t.titulo as 'titulo_ultimotema'
	from estudiante as e
	left join bitacora as b on b.id_estudiante = e.id
	left join temas as t on t.id = b.id_tema
	where e.matricula = registrationnumber
	order by b.fecha_registro desc
	LIMIT 1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `GET_REMAINING_TOPICS` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `GET_REMAINING_TOPICS`(IN param_id_estudiante bigint)
BEGIN
	DECLARE totalContenidosRevisados int default null;

	select count(DISTINCT bitacora.id_tema) into totalContenidosRevisados  from bitacora where bitacora.id_estudiante = param_id_estudiante ; 
	
    IF totalContenidosRevisados > 6 THEN
        select * from temas where temas.id not in (select  bitacora.id_tema  from bitacora where bitacora.id_estudiante = param_id_estudiante) ;
	ELSE
		select * from temas;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-08 18:18:59
