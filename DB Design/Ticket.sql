
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Ticket`
--

CREATE TABLE `Ticket` (
  `id` int(16) NOT NULL,
  `title` varchar(64) NOT NULL,
  `description` text NOT NULL,
  `createdBy` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


--
-- Indices de la tabla `Ticket`
--
ALTER TABLE `Ticket`
  ADD PRIMARY KEY (`id`);


--
-- AUTO_INCREMENT de la tabla `Ticket`
--
ALTER TABLE `Ticket`
  MODIFY `id` int(16) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;COMMIT;

