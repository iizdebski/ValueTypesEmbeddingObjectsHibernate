#DROP DATABASE IF EXISTS test3;
CREATE DATABASE IF NOT EXISTS test3 CHARACTER SET utf8 COLLATE utf8_general_ci;

USE test3;

DROP TABLE IF EXISTS employee_table;

CREATE TABLE employee_table
(
  employee_id INTEGER NOT NULL
    AUTO_INCREMENT PRIMARY KEY,
  date_of_joining DATETIME,
  email VARCHAR(255),
  employee_name VARCHAR(100) NOT NULL,
  salary DOUBLE PRECISION,
  CONSTRAINT employee_id_UNIQUE
    UNIQUE (employee_id)
)
  ENGINE = innoDB
  DEFAULT CHARACTER SET = utf8
;