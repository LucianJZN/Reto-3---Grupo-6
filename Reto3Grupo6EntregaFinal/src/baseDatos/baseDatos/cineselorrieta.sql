-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-02-2024 a las 21:18:11
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cineselorrieta`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cine`
--

CREATE TABLE `cine` (
  `idCine` int(11) NOT NULL,
  `nombreCine` varchar(20) NOT NULL,
  `direccion` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `cine`
--

INSERT INTO `cine` (`idCine`, `nombreCine`, `direccion`) VALUES
(1, 'Cine Elorrieta', 'Agirre Lehendakariaren Etorb., 184, Deusto, 48015 Bilbo, Bizkaia'),
(2, 'Cine Yelmo Megapark', 'C.C. Megapark Avda. de la Rivera SN Barrio Ibarreta-Zuloko, 48903 Barakaldo, Biscay'),
(3, 'CINESA MAX OCIO', 'Max Ocio, Kareaga K., S/N, 48903 Barakaldo, Biscay'),
(4, 'Cines Artea', 'Peruri Auzoa, 33, S/N, Getxo, Biscay'),
(5, 'Cines Golem Alondiga', ' Arriquíbar Plaza, 4, Abando 48015 Bilbo, Bizkaia');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `DNI` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(100) NOT NULL,
  `sexo` varchar(30) NOT NULL,
  `contrasena` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`DNI`, `nombre`, `apellidos`, `sexo`, `contrasena`) VALUES
('12345678E', 'Lucian', 'Stelian', 'Hombre', '1234'),
('12345678L', 'Aby', 'Lopez', 'Mujer', '1234'),
('12345678M', 'Ekaitz', 'Aguilar', 'Hombre', '1234'),
('12345678Q', 'Jordy', 'Luna', 'Hombre', '1234'),
('12345678W', 'Julio', 'Cesar', 'Hombre', '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrada`
--

CREATE TABLE `entrada` (
  `idEntrada` int(11) NOT NULL,
  `idSesion` int(11) NOT NULL,
  `fechaCompra` datetime NOT NULL,
  `precioCompra` double NOT NULL,
  `DNI` varchar(9) NOT NULL
) ;

--
-- Volcado de datos para la tabla `entrada`
--

INSERT INTO `entrada` (`idEntrada`, `idSesion`, `fechaCompra`, `precioCompra`, `DNI`) VALUES
(1, 1, '2024-01-29 18:00:00', 6.99, '12345678E'),
(2, 2, '2024-01-29 19:00:00', 6.99, '12345678W'),
(3, 3, '2024-01-29 20:00:00', 6.99, '12345678Q'),
(4, 1, '2024-01-29 18:00:00', 6.99, '12345678E'),
(5, 2, '2024-01-29 19:00:00', 6.99, '12345678W'),
(6, 1, '2024-01-29 18:00:00', 6.99, '12345678E'),
(7, 2, '2024-01-29 19:00:00', 6.99, '12345678W'),
(8, 3, '2024-01-29 20:00:00', 6.99, '12345678Q'),
(9, 1, '2024-01-29 18:00:00', 6.99, '12345678E'),
(10, 2, '2024-01-29 19:00:00', 6.99, '12345678W'),
(11, 1, '2024-01-29 18:00:00', 6.99, '12345678E'),
(12, 2, '2024-01-29 19:00:00', 6.99, '12345678W'),
(13, 3, '2024-01-29 20:00:00', 6.99, '12345678Q'),
(14, 1, '2024-01-29 18:00:00', 6.99, '12345678E'),
(15, 2, '2024-01-29 19:00:00', 6.99, '12345678W'),
(16, 1, '2024-01-29 18:00:00', 6.99, '12345678E'),
(17, 2, '2024-01-29 19:00:00', 6.99, '12345678W'),
(18, 3, '2024-01-29 20:00:00', 6.99, '12345678Q'),
(19, 1, '2024-01-29 18:00:00', 6.99, '12345678E'),
(20, 2, '2024-01-29 19:00:00', 6.99, '12345678W'),
(21, 4, '2024-01-29 19:00:00', 6.99, '12345678M'),
(22, 5, '2024-01-29 19:00:00', 6.99, '12345678M'),
(23, 3, '2024-01-29 19:00:00', 6.99, '12345678W'),
(24, 4, '2024-01-29 19:00:00', 6.99, '12345678E'),
(25, 5, '2024-01-29 19:00:00', 6.99, '12345678W');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pelicula`
--

CREATE TABLE `pelicula` (
  `idPelicula` int(11) NOT NULL,
  `titulo` varchar(30) DEFAULT NULL,
  `duracion` int(11) NOT NULL,
  `genero` varchar(20) NOT NULL
) ;

--
-- Volcado de datos para la tabla `pelicula`
--

INSERT INTO `pelicula` (`idPelicula`, `titulo`, `duracion`, `genero`) VALUES
(1, 'Barbie', 1, 'Drama'),
(2, 'Avengers', 2, 'Ciencia ficción'),
(3, 'John Wick', 3, 'Acción'),
(4, 'The Boogeyman', 4, 'Terror'),
(5, 'La monja', 5, 'Terror');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala`
--

CREATE TABLE `sala` (
  `idCine` int(11) NOT NULL,
  `idSala` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `sala`
--

INSERT INTO `sala` (`idCine`, `idSala`, `nombre`) VALUES
(1, 1, 'Sala 1'),
(2, 2, 'Sala 1'),
(3, 3, 'Sala 1'),
(4, 4, 'Sala 1'),
(5, 5, 'Sala 1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sesion`
--

CREATE TABLE `sesion` (
  `idSesion` int(11) NOT NULL,
  `coste` double NOT NULL,
  `idCine` int(11) DEFAULT NULL,
  `idSala` int(11) DEFAULT NULL,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `idPelicula` int(11) NOT NULL
) ;

--
-- Volcado de datos para la tabla `sesion`
--

INSERT INTO `sesion` (`idSesion`, `coste`, `idCine`, `idSala`, `fecha`, `hora`, `idPelicula`) VALUES
(1, 8.99, 1, 1, '2024-01-30', '16:00:00', 1),
(2, 8.99, 2, 2, '2024-01-30', '17:00:00', 2),
(3, 8.99, 3, 3, '2024-01-30', '15:00:00', 3),
(4, 8.99, 4, 4, '2024-01-30', '15:00:00', 4),
(5, 8.99, 4, 4, '2024-01-30', '15:00:00', 5);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cine`
--
ALTER TABLE `cine`
  ADD PRIMARY KEY (`idCine`),
  ADD UNIQUE KEY `direccion` (`direccion`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD PRIMARY KEY (`idEntrada`),
  ADD KEY `fk_idSesion_entrada` (`idSesion`),
  ADD KEY `fk_DNI_entrada` (`DNI`);

--
-- Indices de la tabla `pelicula`
--
ALTER TABLE `pelicula`
  ADD PRIMARY KEY (`idPelicula`),
  ADD UNIQUE KEY `titulo` (`titulo`);

--
-- Indices de la tabla `sala`
--
ALTER TABLE `sala`
  ADD PRIMARY KEY (`idCine`,`idSala`);

--
-- Indices de la tabla `sesion`
--
ALTER TABLE `sesion`
  ADD PRIMARY KEY (`idSesion`),
  ADD KEY `fk_idCine_sesion` (`idCine`,`idSala`),
  ADD KEY `fk_idPelicula_sesion` (`idPelicula`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `entrada`
--
ALTER TABLE `entrada`
  MODIFY `idEntrada` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `entrada`
--
ALTER TABLE `entrada`
  ADD CONSTRAINT `fk_DNI_entrada` FOREIGN KEY (`DNI`) REFERENCES `cliente` (`DNI`),
  ADD CONSTRAINT `fk_idSesion_entrada` FOREIGN KEY (`idSesion`) REFERENCES `sesion` (`idSesion`);

--
-- Filtros para la tabla `sala`
--
ALTER TABLE `sala`
  ADD CONSTRAINT `fk_idCine_sala` FOREIGN KEY (`idCine`) REFERENCES `cine` (`idCine`) ON DELETE CASCADE;

--
-- Filtros para la tabla `sesion`
--
ALTER TABLE `sesion`
  ADD CONSTRAINT `fk_idCine_sesion` FOREIGN KEY (`idCine`,`idSala`) REFERENCES `sala` (`idCine`, `idSala`) ON DELETE SET NULL ON UPDATE CASCADE,
  ADD CONSTRAINT `fk_idPelicula_sesion` FOREIGN KEY (`idPelicula`) REFERENCES `pelicula` (`idPelicula`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
