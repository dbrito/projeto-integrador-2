-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 09-Dez-2017 às 21:23
-- Versão do servidor: 5.6.15-log
-- PHP Version: 5.5.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `projeto_integrador`
--
CREATE DATABASE IF NOT EXISTS `projeto_integrador` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `projeto_integrador`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cpf` varchar(45) NOT NULL,
  `nome` varchar(255) NOT NULL,
  `data_nascimento` date NOT NULL,
  `endereco` varchar(255) NOT NULL,
  `numero` int(11) DEFAULT NULL,
  `bairro` varchar(45) NOT NULL,
  `cep` varchar(45) NOT NULL,
  `cidade` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `enabled` bit(1) NOT NULL,
  `complemento` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `item_venda`
--

CREATE TABLE IF NOT EXISTS `item_venda` (
  `id_item_venda` int(11) NOT NULL AUTO_INCREMENT,
  `id_produto` int(11) NOT NULL,
  `quantidade` int(11) NOT NULL,
  `id_venda` int(11) NOT NULL,
  PRIMARY KEY (`id_item_venda`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=13 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE IF NOT EXISTS `produto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(45) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `marca` varchar(45) DEFAULT NULL,
  `preco` double NOT NULL,
  `quantidade` int(11) NOT NULL,
  `categoria` varchar(45) DEFAULT NULL,
  `descricao` longtext,
  `enabled` bit(1) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_produto_UNIQUE` (`id`),
  UNIQUE KEY `codigo_UNIQUE` (`codigo`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=26 ;

-- --------------------------------------------------------

--
-- Estrutura da tabela `venda`
--

CREATE TABLE IF NOT EXISTS `venda` (
  `id_venda` int(11) NOT NULL AUTO_INCREMENT,
  `data_venda` date NOT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_venda`),
  UNIQUE KEY `id_venda_UNIQUE` (`id_venda`),
  KEY `fk_cliente_idx` (`id_cliente`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=17 ;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `venda`
--
ALTER TABLE `venda`
  ADD CONSTRAINT `fk_cliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION;
