SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `revveiculos` DEFAULT CHARACTER SET utf8 ;
USE `revveiculos` ;

-- -----------------------------------------------------
-- Table `revveiculos`.`veiculo`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `revveiculos`.`veiculo` (
  `idVeiculo` INT(11) NOT NULL AUTO_INCREMENT ,
  `placa` VARCHAR(6) NOT NULL ,
  `modelo` VARCHAR(45) NOT NULL ,
  `marca` VARCHAR(45) NOT NULL ,
  `cor` VARCHAR(45) NULL ,
  `status` VARCHAR(45) NULL ,
  `valor` DOUBLE NULL DEFAULT NULL ,
  `combustivel` VARCHAR(45) NULL ,
  `km` INT(11) NULL DEFAULT NULL ,
  `tipo` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`idVeiculo`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `revveiculos`.`carro`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `revveiculos`.`carro` (
  `idCarro` INT(11) NOT NULL ,
  `caracteristicasCarro` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`idCarro`) ,
  INDEX `fk_Carro_Veiculo1_idx` (`idCarro` ASC) ,
  CONSTRAINT `fk_Carro_Veiculo1`
    FOREIGN KEY (`idCarro` )
    REFERENCES `revveiculos`.`veiculo` (`idVeiculo` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `revveiculos`.`cliente`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `revveiculos`.`cliente` (
  `idCliente` INT(11) NOT NULL AUTO_INCREMENT ,
  `nome` VARCHAR(45) NOT NULL ,
  `email` VARCHAR(45) NULL DEFAULT NULL ,
  `endereco` VARCHAR(45) NULL DEFAULT NULL ,
  `telefone` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`idCliente`) )
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `revveiculos`.`vendedor`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `revveiculos`.`vendedor` (
  `idVendedor` INT(11) NOT NULL AUTO_INCREMENT ,
  `login` VARCHAR(45) NOT NULL ,
  `senha` VARCHAR(45) NOT NULL ,
  `nome` VARCHAR(45) NOT NULL ,
  `telefone` VARCHAR(45) NOT NULL ,
  `adm` TINYINT(1) NULL DEFAULT false ,
  `email` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`idVendedor`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `revveiculos`.`compra`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `revveiculos`.`compra` (
  `idCompra` INT(11) NOT NULL AUTO_INCREMENT ,
  `idVendedor` INT(11) NOT NULL ,
  `idCliente` INT(11) NOT NULL ,
  `IdVeiculo` INT(11) NOT NULL ,
  `data` DATE NOT NULL ,
  `total` DOUBLE NOT NULL ,
  PRIMARY KEY (`idCompra`) ,
  INDEX `fk_Compra_Cliente1_idx` (`idCliente` ASC) ,
  INDEX `fk_Compra_Vendedor1_idx` (`idVendedor` ASC) ,
  INDEX `fk_compra_veiculo1_idx` (`IdVeiculo` ASC) ,
  CONSTRAINT `fk_Compra_Cliente1`
    FOREIGN KEY (`idCliente` )
    REFERENCES `revveiculos`.`cliente` (`idCliente` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compra_Vendedor1`
    FOREIGN KEY (`idVendedor` )
    REFERENCES `revveiculos`.`vendedor` (`idVendedor` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_compra_veiculo1`
    FOREIGN KEY (`IdVeiculo` )
    REFERENCES `revveiculos`.`veiculo` (`idVeiculo` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `revveiculos`.`moto`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `revveiculos`.`moto` (
  `idMoto` INT(11) NOT NULL ,
  `caracteristicasMoto` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`idMoto`) ,
  CONSTRAINT `fk_Moto_Veiculo1`
    FOREIGN KEY (`idMoto` )
    REFERENCES `revveiculos`.`veiculo` (`idVeiculo` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

USE `revveiculos` ;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
