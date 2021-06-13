-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
-- --
-- Host: 127.0.0.1
-- Generation Time: Jul 18, 2020 at 05:10 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shovice`
--

-- --------------------------------------------------------

--
-- Table structure for table `request`
--

CREATE TABLE `request` (
  `id` int(11) NOT NULL,
  `req_name` text NOT NULL,
  `scope` text NOT NULL,
  `type` text NOT NULL,
  `price` text NOT NULL,
  `location` text NOT NULL,
  `description` text NOT NULL,
  `requestee` text,
  `stats` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `request`
--

INSERT INTO `request` (`id`, `req_name`, `scope`, `type`, `price`, `location`, `description`, `requestee`, `stats`) VALUES
(1, 'Johny Travalaw', 'Cleaning bathroom', 'Cleaning', 'RM 50', 'KTHO L21', 'Help needed cleaning L21 male bathroom', NULL, 'OPEN'),
(2, 'Siti Nur Nabila', 'Fix laptop', 'Repair', 'RM 30 - 50', 'KTDI K08', 'Help needed!!! need help to fix my laptop.', 'Johny Travalaw', 'TAKEN'),
(3, 'Johny Travalaw', 'Fix windows', 'Repair', 'RM 300.56', 'KDOJ XD1', 'Please..need help repairing my windows. Damn monkey!', NULL, 'OPEN'),
(4, 'Siti Nur Nabila', 'Fix laptop', 'Repair', 'RM 30 - 190', 'KTDI K08', 'Help needed!!! need help to fix my laptop.', 'Johny Travalaw', 'COMPLETED'),
(5, 'Siti Nur Nabila', 'Fix Monkey', 'Repair', 'RM 30 - 190', 'KTDI K08', 'Help needed!!! need help to fix my monkey.', 'Johny Travalaw', 'TAKEN'),
(6, 'Diego Brando', 'Help working on assignment', 'Peer help', 'RM 15', 'PRZS', 'Need help working on my assignment', NULL, 'OPEN'),
(7, 'Diego Brando', 'Volunteer Needed', 'Voluntary', 'RM 0 - 10', 'Mosque Sultan Ismail', 'Volunteer needed in mosques ASAP. Voluntary only.', NULL, 'OPEN');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` text NOT NULL,
  `matric` text NOT NULL,
  `phone` text NOT NULL,
  `email` text NOT NULL,
  `gender` text NOT NULL,
  `address` text NOT NULL,
  `faculty` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `name`, `matric`, `phone`, `email`, `gender`, `address`, `faculty`, `password`) VALUES
(1, 'Johny Travalaw', 'A19BA0045', '016709755', 'johny@email.com', 'male', 'Whale Street', 'Faculty of Science', '12345'),
(2, 'Siti Nur Nabila', 'B16CS0098', '0177896544', 'nur@email.com', 'female', 'Dragon Street', 'Faculty of Science', '12345'),
(3, 'Diego Brando', 'A17CS0269', '0123456789', 'adim@gmail.com', 'Male', 'KTHO', 'Faculty Engineering', '12345'),
(4, 'Nur Hayati', 'A19MM0078', '0123456789', 'nur@gmail.com', 'Female', 'KDSE', 'Faculty of Social Science and Huminities', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `request`
--
ALTER TABLE `request`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `request`
--
ALTER TABLE `request`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
