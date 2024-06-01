-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 01, 2024 at 04:36 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `lonan_zoo`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_zoo`
--

CREATE TABLE `data_zoo` (
  `kode` int(11) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `habitat` varchar(255) NOT NULL,
  `jenis` varchar(255) NOT NULL,
  `asal` varchar(255) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `kategori` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_zoo`
--

INSERT INTO `data_zoo` (`kode`, `nama`, `habitat`, `jenis`, `asal`, `jumlah`, `kategori`) VALUES
(12, 'Piton', 'Darat', 'Daging', 'Afrika', 3, 'reptil'),
(7, 'cheetah', 'darat', 'daging', 'mesir', 9, 'mamalia'),
(32, 'Gajah', 'Darat', 'Tumbuhan', 'Afrika', 13, 'mamalia'),
(2, 'Merak', 'Darat', 'Tumbuhan', 'India', 6, 'reptil');

-- --------------------------------------------------------

--
-- Table structure for table `komentar`
--

CREATE TABLE `komentar` (
  `kritik` varchar(255) NOT NULL,
  `saran` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `komentar`
--

INSERT INTO `komentar` (`kritik`, `saran`) VALUES
('ad', ''),
('ada', 'ada'),
('BAGUS', 'MALAS'),
('kandang harimau kurang bersih', 'jangan malas');

-- --------------------------------------------------------

--
-- Table structure for table `user_akun`
--

CREATE TABLE `user_akun` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user_akun`
--

INSERT INTO `user_akun` (`id`, `username`, `password`) VALUES
(1, 'a', 'a'),
(2, 'cinta', 'kasih');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_akun`
--
ALTER TABLE `user_akun`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user_akun`
--
ALTER TABLE `user_akun`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
