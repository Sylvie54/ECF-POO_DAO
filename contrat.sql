-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 13 fév. 2020 à 05:58
-- Version du serveur :  5.7.23
-- Version de PHP :  7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `ecfpoo`
--

-- --------------------------------------------------------

--
-- Structure de la table `contrat`
--

DROP TABLE IF EXISTS `contrat`;
CREATE TABLE IF NOT EXISTS `contrat` (
  `idcontrat` int(11) NOT NULL AUTO_INCREMENT,
  `idclient` int(11) NOT NULL,
  `libellecontrat` varchar(50) NOT NULL,
  `montantcontrat` decimal(10,0) NOT NULL,
  `datedebcontrat` date NOT NULL,
  `datefincontrat` date NOT NULL,
  PRIMARY KEY (`idcontrat`),
  KEY `fk_client_id` (`idclient`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `contrat`
--

INSERT INTO `contrat` (`idcontrat`, `idclient`, `libellecontrat`, `montantcontrat`, `datedebcontrat`, `datefincontrat`) VALUES
(1, 1, 'tradiction manuel utilisateur', '1236', '2020-02-01', '2020-02-29'),
(2, 1, 'tradiction manuel technique', '3601', '2020-02-13', '2020-03-15');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
