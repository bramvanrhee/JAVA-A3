-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Gegenereerd op: 7 oktober 2019 om 14:23
-- Serverversie: 10.3.16-MariaDB
-- PHP-versie: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `contactlijst`
--

-- --------------------------------------------------------

--
-- Tabelstructuur voor tabel `naam`
--

CREATE TABLE `naam` (
  `ID` int(11) NOT NULL,
  `Voornaam` varchar(50) NOT NULL,
  `Achternaam` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Gegevens worden geëxporteerd voor tabel `naam`
--

INSERT INTO `naam` (`ID`, `Voornaam`, `Achternaam`) VALUES
(1, 'Bram', 'van Rhee'),
(2, 'Jesper', 'Borst'),
(9, 'Charlotte', 'Prak'),
(10, 'Kevin', 'Koster'),
--
-- Indexen voor geëxporteerde tabellen
--

--
-- Indexen voor tabel `naam`
--
ALTER TABLE `naam`
  ADD PRIMARY KEY (`ID`);`

--
-- AUTO_INCREMENT voor geëxporteerde tabellen
--

--
-- AUTO_INCREMENT voor een tabel `naam`
--
ALTER TABLE `naam`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;