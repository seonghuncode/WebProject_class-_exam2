//spl에 작성 한 코드

//#DB생성
DROP DATABASE IF EXISTS demo;
CREATE DATABASE demo;
USE demo;



//#회원테이블 생성
CREATE TABLE `user`(
    id BIGINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    reg_date DATETIME NOT NULL,
    update_date DATETIME NOT NULL,
    email VARCHAR(100) NOT NULL,
    `password` VARCHAR(150) NOT NULL, #password는 용량이 크다
    `name` CHAR(50) NOT NULL #char은 varchar보다 빠른 대신 용량이 더 크다
);

SHOW TABLES;

//#회원데이터 생성
INSERT INTO `user`
SET reg_date = NOW(),
update_date = NOW(),
email = 'user1@test.com',
`password` = '1234',
`name` = '유저1';

INSERT INTO `user`
SET reg_date = NOW(),
update_date = NOW(),
email = 'user2@test.com',
`password` = '1234',
`name` = '유저2';

INSERT INTO `user`
SET reg_date = NOW(),
update_date = NOW(),
email = 'user3@test.com',
`password` = '1234',
`name` = '유저3';

SELECT * FROM `user`;