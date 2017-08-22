--liquibase formatted sql
--changeset rrocher:initial-users
SET foreign_key_checks = 0;

INSERT INTO user (id, first_name,last_name,address,email,password,personnal_phone,
city,province,id_user_insert,ts_insert,id_user_update,ts_update)
VALUES (101, 'root','root','1710 Hartenstein','root@manocourtage.com','test','514-123-4567',
'Montreal','QC', 101,now(),101,now());

INSERT INTO user (first_name,last_name,address,email,password,personnal_phone,enabled,
city,province,id_user_insert,ts_insert,id_user_update,ts_update)
VALUES ('Rimte','Rocher','1710 Hartenstein','rocher.rimte@gmail.com','$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi'
,'514-123-4567',1,
'Montreal','QC', 101,now(),101,now());

INSERT INTO user (first_name,last_name,address,email,password,personnal_phone,enabled,
city,province,id_user_insert,ts_insert,id_user_update,ts_update)
VALUES ('Disabled','Test','1710 Hartenstein','disabled@gmail.com','$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi'
,'514-123-4567',1,
'Montreal','QC', 101,now(),101,now());

INSERT INTO `role`
(`code`,`name`,`comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('ROLE_USER','ROLE_USER','ROLE_USER',101,now(),101, now());

INSERT INTO `role`
(`code`,`name`,`comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('ROLE_ADMIN','ROLE_ADMIN','ROLE_ADMIN',101,now(),101, now());

INSERT INTO `role`
(`code`,`name`,`comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('ROLE_SUPER_USER','ROLE_SUPER_USER','ROLE_SUPER_USER',101,now(),101, now());

INSERT INTO `privilege`
(`code`,`name`,`comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('LOAN','LOAN','LOAN',101,now(),101, now());

INSERT INTO `privilege`
(`code`,`name`,`comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('ADMIN','ADMIN','ADMIN',101,now(),101, now());

INSERT INTO `privilege`
(`code`,`name`,`comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('SUPER_USER','SUPER_USER','SUPER_USER',101,now(),101, now());

INSERT INTO `role_privilege`
(`role`,
`privilege`, `comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from role where code='ROLE_ADMIN'),
(select id from privilege where code='ADMIN'),'ROLE_ADMIN',101,now(),101, now());

INSERT INTO `role_privilege`
(`role`,
`privilege`, `comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from role where code='ROLE_USER'),
(select id from privilege where code='LOAN'),'ROLE_USER',101,now(),101, now());

INSERT INTO `role_privilege`
(`role`,
`privilege`, `comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from role where code='ROLE_SUPER_USER'),
(select id from privilege where code='ADMIN'),'ROLE_SUPER_USER',101,now(),101, now());

INSERT INTO `role_privilege`
(`role`,
`privilege`, `comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from role where code='ROLE_SUPER_USER'),
(select id from privilege where code='SUPER_USER'),'ROLE_SUPER_USER',101,now(),101, now());


INSERT INTO `user_role`
(`user`, `role`, `comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from user where email='rocher.rimte@gmail.com'),
(select id from role where code='ROLE_ADMIN'),'ROLE_ADMIN',101,now(),101, now());


INSERT INTO `user_role`
(`user`, `role`, `comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from user where email='root@manocourtage.com'),
(select id from role where code='ROLE_SUPER_USER'),'ROLE_SUPER_USER',101,now(),101, now());

SET foreign_key_checks = 1;