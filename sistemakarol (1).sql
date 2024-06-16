-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-06-2024 a las 06:37:57
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `sistemakarol`
--

DELIMITER $$
--
-- Procedimientos
--
CREATE DEFINER=`` PROCEDURE `BuscarClientePorID` (IN `clienteID` VARCHAR(255))   BEGIN
    SELECT * FROM cliente
    WHERE id = clienteID;
END$$

CREATE DEFINER=`` PROCEDURE `BuscarProductoPorCodigo` (IN `codigoProducto` VARCHAR(255))   BEGIN
    SELECT p.codigoProducto, p.nombreProducto, p.cantidad, p.precio, pr.nombre AS nombre_proveedor
    FROM producto p
    INNER JOIN proveedor pr ON p.id_proveedor = pr.id
    WHERE p.codigo = codigoProducto;
END$$

CREATE DEFINER=`` PROCEDURE `BuscarProveedorPorID` (IN `proveedorID` INT)   BEGIN
    SELECT *
    FROM proveedor
    WHERE id = proveedorID;
END$$

CREATE DEFINER=`` PROCEDURE `EliminarClientePorID` (IN `clienteID` VARCHAR(255))   BEGIN
    DELETE FROM cliente
    WHERE id = clienteID;
END$$

CREATE DEFINER=`` PROCEDURE `EliminarProductoPorCodigo` (IN `codigoProducto` VARCHAR(255))   BEGIN
    DELETE FROM producto WHERE codigo = codigoProducto;
END$$

CREATE DEFINER=`` PROCEDURE `EliminarProveedorPorID` (IN `proveedorID` INT)   BEGIN
    DELETE FROM proveedor
    WHERE id = proveedorID;
END$$

CREATE DEFINER=`` PROCEDURE `InsertarCliente` (IN `dniCliente` VARCHAR(255), IN `nombreCliente` VARCHAR(255), IN `telefonoCliente` VARCHAR(255), IN `direccionCliente` VARCHAR(255))   BEGIN
    INSERT INTO cliente (dni, nombre, telefono, direccion)
    VALUES (dniCliente, nombreCliente, telefonoCliente, direccionCliente);
END$$

CREATE DEFINER=`` PROCEDURE `InsertarDetalleVenta` (IN `p_idVenta` INT, IN `p_dniCliente` VARCHAR(15), IN `p_nombreCliente` VARCHAR(100), IN `p_fecha` DATE, IN `p_total` DOUBLE, IN `p_nombreAdministrador` VARCHAR(100))   BEGIN
    INSERT INTO detalle_ventas (idVenta, dniCliente, nombreCliente, fecha, total, nombreAdministrador)
    VALUES (p_idVenta, p_dniCliente, p_nombreCliente, p_fecha, p_total, p_nombreAdministrador);
END$$

CREATE DEFINER=`` PROCEDURE `InsertarProducto` (IN `codigoProducto` VARCHAR(255), IN `nombreProducto` VARCHAR(255), IN `cantidadProducto` INT, IN `precioProducto` DOUBLE, IN `proveedorNombre` VARCHAR(255))   BEGIN
    DECLARE proveedorId INT;
    -- Buscar el ID del proveedor por su nombre
    SELECT id INTO proveedorId FROM proveedor WHERE nombre = proveedorNombre;
    -- Insertar el producto con el ID del proveedor
    INSERT INTO producto (codigo, nombre, cantidad, precio, proveedor_id)
    VALUES (codigoProducto, nombreProducto, cantidadProducto, precioProducto, proveedorId);
END$$

CREATE DEFINER=`` PROCEDURE `InsertarProveedor` (IN `rucProveedor` VARCHAR(255), IN `nombreProveedor` VARCHAR(255), IN `telefonoProveedor` VARCHAR(255), IN `direccionProveedor` VARCHAR(255), IN `razonSocialProveedor` VARCHAR(255))   BEGIN
    INSERT INTO proveedor (ruc, nombre, telefono, direccion, razon_social)
    VALUES (rucProveedor, nombreProveedor, telefonoProveedor, direccionProveedor, razonSocialProveedor);
END$$

CREATE DEFINER=`` PROCEDURE `InsertarVenta` (IN `p_codigoProducto` VARCHAR(50), IN `p_nombreProducto` VARCHAR(100), IN `p_cantidad` INT, IN `p_precio` DOUBLE)   BEGIN
    INSERT INTO ventas (codigoProducto, nombreProducto, cantidad, precio)
    VALUES (p_codigoProducto, p_nombreProducto, p_cantidad, p_precio);
END$$

CREATE DEFINER=`` PROCEDURE `ModificarCliente` (IN `clienteID` VARCHAR(255), IN `nuevoDNI` VARCHAR(255), IN `nuevoNombre` VARCHAR(255), IN `nuevoTelefono` VARCHAR(255), IN `nuevaDireccion` VARCHAR(255))   BEGIN
    UPDATE cliente
    SET dni = nuevoDNI, nombre = nuevoNombre, telefono = nuevoTelefono, direccion = nuevaDireccion
    WHERE id = clienteID;
END$$

CREATE DEFINER=`` PROCEDURE `ModificarProducto` (IN `codigoProducto` VARCHAR(255), IN `nuevoNombre` VARCHAR(255), IN `nuevaCantidad` INT, IN `nuevoPrecio` DOUBLE, IN `nuevoProveedor` VARCHAR(255))   BEGIN
    UPDATE producto
    SET nombre = nuevoNombre, cantidad = nuevaCantidad, precio = nuevoPrecio, id_proveedor = (SELECT id FROM proveedor WHERE nombre = nuevoProveedor)
    WHERE codigo = codigoProducto;
END$$

CREATE DEFINER=`` PROCEDURE `ModificarProveedor` (IN `proveedorID` INT, IN `nuevoRuc` VARCHAR(255), IN `nuevoNombre` VARCHAR(255), IN `nuevoTelefono` VARCHAR(255), IN `nuevaDireccion` VARCHAR(255), IN `nuevaRazonSocial` VARCHAR(255))   BEGIN
    UPDATE proveedor
    SET ruc = nuevoRuc,
        nombre = nuevoNombre,
        telefono = nuevoTelefono,
        direccion = nuevaDireccion,
        razon_social = nuevaRazonSocial
    WHERE id = proveedorID;
END$$

CREATE DEFINER=`` PROCEDURE `ObtenerReporteVentas` (IN `fechaInicio` DATE, IN `fechaFin` DATE)   BEGIN
    SELECT v.idVenta, v.codigoProducto, v.nombreProducto, v.cantidad, v.precio,
           d.dniCliente, d.nombreCliente, d.fecha, d.total, d.nombreAdministrador
    FROM ventas v
    JOIN detalle_ventas d ON v.idVenta = d.idVenta
    WHERE d.fecha BETWEEN fechaInicio AND fechaFin;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `id_cliente` int(11) NOT NULL,
  `dni` int(11) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `telefono` char(9) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`id_cliente`, `dni`, `nombre`, `telefono`, `direccion`) VALUES
(1, 74299835, 'XIMENA GAVIDIA', '945343409', 'LOS OLIVOS.'),
(2, 7237293, 'VANIA TORREZ', '995503400', 'SMP'),
(4, 74568909, 'JULIO MIRANDA', '923828301', 'INDEPENDENCIA'),
(6, 73274832, 'FABRICIO GUTIERREZ', '972732390', 'INDEPENDENCIA'),
(7, 8293289, 'HUGO APAZA', '7283293', 'LOS OLIVOS'),
(9, 7293280, 'JUAN SANCHEZ', '7283290', 'SMP'),
(10, 72932812, 'MARIA TORRES', '7283290', 'SJL'),
(11, 72932810, 'JOSE LUIS GUTIERREZ', '7283290', 'SMP'),
(12, 72932818, 'MARIALUISA', '7283290', 'INDEPENDENCIA'),
(13, 72932888, 'MARISOL PALACIOS', '7283290', 'INDEPENDENCIA'),
(14, 728323, 'CARLOS RAMIREZ', '998233920', 'SMP');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_ventas`
--

CREATE TABLE `detalle_ventas` (
  `idDetalleVenta` int(11) NOT NULL,
  `idVenta` int(11) DEFAULT NULL,
  `dniCliente` varchar(15) DEFAULT NULL,
  `nombreCliente` varchar(100) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `total` double DEFAULT NULL,
  `nombreAdministrador` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `detalle_ventas`
--

INSERT INTO `detalle_ventas` (`idDetalleVenta`, `idVenta`, `dniCliente`, `nombreCliente`, `fecha`, `total`, `nombreAdministrador`) VALUES
(7, 2, '74299835', 'XIMENA GAVIDIA', '2024-06-13', 207, 'Karol Fernandez'),
(8, 1, '74299835', 'XIMENA GAVIDIA', '2024-06-13', 12, 'Karol Fernandez');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pago`
--

CREATE TABLE `pago` (
  `id` int(11) NOT NULL,
  `total` double NOT NULL,
  `tipo_pago` varchar(50) NOT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `codigoProducto` varchar(50) NOT NULL,
  `nombreProducto` varchar(100) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `precio` decimal(10,2) DEFAULT NULL,
  `proveedor_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`codigoProducto`, `nombreProducto`, `cantidad`, `precio`, `proveedor_id`) VALUES
('1011', 'LAMPARA', 3, 69.00, 1),
('2000', 'HOJAS BOND', 4, 7.00, 7),
('3000', 'LAPICES DE COLORES KIT', 10, 5.00, 9),
('4000', 'LAMPARAS KIT', 3, 30.00, 10),
('5000', 'MOCHILA KIT', 4, 15.00, 11),
('5001', 'KIT MAQUILLAJE', 3, 10.00, 6),
('5600', 'CARTERAS', 2, 36.00, 6),
('70003', 'SET MOCHILA', 1, 30.00, 6),
('8000', 'LONCHERA', 2, 23.00, 6),
('892893', 'KIT SOMBRAS DE OJOS', 3, 15.00, 1),
('9000', 'BORRADORES SET', 10, 6.00, 12);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `proveedor`
--

CREATE TABLE `proveedor` (
  `id` int(11) NOT NULL,
  `ruc` varchar(11) NOT NULL,
  `nombre` varchar(100) NOT NULL,
  `telefono` char(9) NOT NULL,
  `direccion` varchar(255) NOT NULL,
  `razon_social` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `proveedor`
--

INSERT INTO `proveedor` (`id`, `ruc`, `nombre`, `telefono`, `direccion`, `razon_social`) VALUES
(1, '92932983', 'MAYORISTA LIZETH', '923829300', 'INDEPENDENCIA', 'VENTAS JR S.L'),
(2, '829839239', 'MAYORISTA DAYA', '928392338', 'AV. GRAU', 'MAYORISTA D.Y'),
(6, '719293', 'VENTAS JULIO', '953644000', 'SMP', 'VENTAS J.'),
(7, '823823', 'MAYORISTA JP', '988023801', 'LOS OLIVOS', 'VENTAS JP.'),
(9, '2832983', 'MAYORISTA LUP.', '293982930', 'LOS OLIVOS', 'MAYORISTA L.'),
(10, '7238823', 'VENTAS FERNANDO', '927323901', 'LOS OLIVOS', 'VENTAS F.'),
(11, '283982', 'VENTAS HUGO', '927323909', 'INDEPENDENCIA', 'VENTAS H..'),
(12, '7239823', 'MAYORISTA YUMI', '927323901', 'SMP', 'VENTAS YM.'),
(13, '72398289', 'MAYORISTA CARLOS', '927323902', 'SMP', 'VENTAS CL.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `UsuarioID` int(11) NOT NULL,
  `NombreUsuario` varchar(50) NOT NULL,
  `Contraseña` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`UsuarioID`, `NombreUsuario`, `Contraseña`) VALUES
(0, 'karolf', 'sistema123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ventas`
--

CREATE TABLE `ventas` (
  `idVenta` int(11) NOT NULL,
  `codigoProducto` varchar(50) NOT NULL,
  `nombreProducto` varchar(100) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ventas`
--

INSERT INTO `ventas` (`idVenta`, `codigoProducto`, `nombreProducto`, `cantidad`, `precio`) VALUES
(1, '9000', 'BORRADORES SET', 2, 6),
(2, '1011', 'LAMPARA', 3, 69),
(3, '2000', 'HOJAS BOND', 1, 7),
(4, '9000', 'BORRADORES SET', 2, 6);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  ADD PRIMARY KEY (`idDetalleVenta`),
  ADD KEY `idVenta` (`idVenta`);

--
-- Indices de la tabla `pago`
--
ALTER TABLE `pago`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`codigoProducto`),
  ADD KEY `proveedor_id` (`proveedor_id`);

--
-- Indices de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`UsuarioID`);

--
-- Indices de la tabla `ventas`
--
ALTER TABLE `ventas`
  ADD PRIMARY KEY (`idVenta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  MODIFY `idDetalleVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `pago`
--
ALTER TABLE `pago`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `proveedor`
--
ALTER TABLE `proveedor`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `ventas`
--
ALTER TABLE `ventas`
  MODIFY `idVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_ventas`
--
ALTER TABLE `detalle_ventas`
  ADD CONSTRAINT `detalle_ventas_ibfk_1` FOREIGN KEY (`idVenta`) REFERENCES `ventas` (`idVenta`);

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`proveedor_id`) REFERENCES `proveedor` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
