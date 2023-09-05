-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 23-Maio-2023 às 15:06
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `registro`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `clientes`
--

CREATE TABLE `clientes` (
  `idCliente` int(11) NOT NULL,
  `nomeCliente` varchar(100) DEFAULT NULL,
  `emailCliente` varchar(100) DEFAULT NULL,
  `senhaCliente` varchar(100) DEFAULT NULL,
  `enderecoCliente` varchar(100) DEFAULT NULL,
  `telefoneCliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `clientes`
--

INSERT INTO `clientes` (`idCliente`, `nomeCliente`, `emailCliente`, `senhaCliente`, `enderecoCliente`, `telefoneCliente`) VALUES
(1, '1111111', '111111111@gmail.com', '1111111', '1111111', 11111111);

-- --------------------------------------------------------

--
-- Estrutura da tabela `funcionarios`
--

CREATE TABLE `funcionarios` (
  `idFuncionario` int(11) NOT NULL,
  `nomeFuncionario` varchar(100) NOT NULL,
  `emailFuncionario` varchar(100) NOT NULL,
  `senhaFuncionario` varchar(100) NOT NULL,
  `telefoneFuncionario` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `funcionarios`
--

INSERT INTO `funcionarios` (`idFuncionario`, `nomeFuncionario`, `emailFuncionario`, `senhaFuncionario`, `telefoneFuncionario`) VALUES
(3, 'Lumiére ', 'lumiere@gmail.com', 'lumiere', 2147483647);

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtos`
--

CREATE TABLE `produtos` (
  `idProduto` int(11) NOT NULL,
  `nomeProduto` varchar(100) NOT NULL,
  `volume` int(11) NOT NULL,
  `preco` varchar(100) NOT NULL,
  `tipoProduto` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `produtos`
--

INSERT INTO `produtos` (`idProduto`, `nomeProduto`, `volume`, `preco`, `tipoProduto`) VALUES
(7, 'Vela Aroma Jasmin e laranja 100mL', 10, 'R$ 85,00', 'Fragância de Jasmin e laranja'),
(8, 'Vela Aroma Lima e Pêssego 100mL', 10, 'R$ 80,00', 'Fragância de Lima e pessêgo'),
(9, 'Vela Aroma Hortelã 100mL', 15, 'R$ 75,00', 'Fragância de hortelã'),
(10, 'Vela Aroma Baunilha 100mL', 5, 'R$ 78,00', 'Fragância de baunilha'),
(11, 'Vela Aroma Rosa Vermelha 100mL', 21, 'R$ 75,00', 'Fragância de rosas'),
(12, 'Sabonete 100g', 9, 'R$ 54,00', 'Sabonete de tamanho grande'),
(13, 'Sabonete 60g', 20, 'R$ 46,00', 'sabonete de tamanho médio'),
(14, 'Sabonete 30g', 1, 'R$ 30,00', 'Sabonete de tamanho médio-pequeno'),
(15, 'Sabonete 15g', 8, 'R$ 18,00', 'Sabonete de tamanho pequeno'),
(17, 'sabonete azul', 200, '50', 'sabonete'),
(18, 'vela222', 0, '50', 'vela'),
(19, 'vela222', 0, '50', 'vela'),
(20, 'vela222', 67, '50', ''),
(21, 'vela333', 7878, '12345', 'velaaaaaaa'),
(22, 'vela44444', 897654, '7386', 'niubguy'),
(23, 'saboneteee', 1213, '2143', 'blub'),
(24, 'slips', 12, '1213', 'vela'),
(25, 'sliptz', 100, '100', 'azuuuuuuuuuuuuuuuuuul'),
(26, 'mesa', 1, '1', 'mesa'),
(27, 'mesa', 1, '1', 'mesaaaaaaaaaaaaa'),
(28, 'azuuuuuuuuuuuuuuuuuuuuuls', 1, '1', 'vela'),
(29, 'kyuuuuuuuuuu', 1, '50', 'ERDTFGHJU'),
(30, '22222222222222', 222, '22222222222', '222222222');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idCliente`);

--
-- Índices para tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  ADD PRIMARY KEY (`idFuncionario`);

--
-- Índices para tabela `produtos`
--
ALTER TABLE `produtos`
  ADD PRIMARY KEY (`idProduto`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idCliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `funcionarios`
--
ALTER TABLE `funcionarios`
  MODIFY `idFuncionario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `produtos`
--
ALTER TABLE `produtos`
  MODIFY `idProduto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
