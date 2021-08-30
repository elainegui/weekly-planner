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




ALTER TABLE `weekly_planner`.`task` 
DROP FOREIGN KEY `id`;
ALTER TABLE `weekly_planner`.`task` 
CHANGE COLUMN `startDateTime` `start_date_time` DATETIME NOT NULL ,
CHANGE COLUMN `finishDateTime` `finish_date_time` DATETIME NOT NULL ,
CHANGE COLUMN `priorityId` `priority_id` INT(11) NOT NULL ;
ALTER TABLE `weekly_planner`.`task` 
ADD CONSTRAINT `id`
  FOREIGN KEY (`priority_id`)
  REFERENCES `weekly_planner`.`priority` (`id`);
  
  
  
ALTER TABLE `weekly_planner`.`priority` 
CHANGE COLUMN `uiStyle` `ui_style` VARCHAR(45) NOT NULL COMMENT 'This field defines a value to allow the UI to apply the corresponding graphical features to each priority.' ;


ALTER TABLE `weekly_planner`.`task` 
DROP FOREIGN KEY `id`;
ALTER TABLE `weekly_planner`.`task` 
CHANGE COLUMN `priority_id` `id_priority` INT(11) NOT NULL ;
ALTER TABLE `weekly_planner`.`task` 
ADD CONSTRAINT `id`
  FOREIGN KEY (`id_priority`)
  REFERENCES `weekly_planner`.`priority` (`id`);
