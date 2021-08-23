CREATE SCHEMA `weekly_planner` DEFAULT CHARACTER SET utf8mb4 ;

CREATE TABLE `weekly_planner`.`priority` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(100) NOT NULL,
  `uiStyle` VARCHAR(45) NOT NULL COMMENT 'This field defines a value to allow the UI to apply the corresponding graphical features to each priority.',
  PRIMARY KEY (`id`));

CREATE TABLE `weekly_planner`.`task` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `description` VARCHAR(1000) NOT NULL,
  `startDateTime` DATETIME NOT NULL,
  `finishDateTime` DATETIME NOT NULL,
  `priorityId` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `id_idx` (`priorityId` ASC) VISIBLE,
  CONSTRAINT `id`
    FOREIGN KEY (`priorityId`)
    REFERENCES `weekly_planner`.`priority` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
COMMENT = 'Table for tasks';
