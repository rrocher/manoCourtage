--liquibase formatted sql
--changeset rrocher:initial-payments
INSERT INTO `loan_psbl_payments`(`interval_days`,`interval_weeks`,`interval_months`,`text`,`code`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
(7,1,0,'Toutes Les Semaines','WEEKLY',(select id from user where first_name='root'),now(),(select id from user where first_name='root'),now());

INSERT INTO `loan_psbl_payments`(`interval_days`,`interval_weeks`,`interval_months`,`text`,`code`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
(14,2,0,'Toutes Les Deux Semaines','BIWEEKLY',(select id from user where first_name='root'),now(),(select id from user where first_name='root'),now());

INSERT INTO `loan_psbl_payments`(`interval_days`,`interval_weeks`,`interval_months`,`text`,`code`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
(28,4,0,'Tous les Quatre Semaines','4WEEK',(select id from user where first_name='root'),now(),(select id from user where first_name='root'),now());

INSERT INTO `loan_psbl_payments`(`interval_days`,`interval_weeks`,`interval_months`,`text`,`code`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
(15,2,1,'Deux Fois Par Mois','BIMONTHLY',(select id from user where first_name='root'),now(),(select id from user where first_name='root'),now());

INSERT INTO `loan_psbl_payments`(`interval_days`,`interval_weeks`,`interval_months`,`text`,`code`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
(30,4,1,'Tous les Mois','MONTHLY',(select id from user where first_name='root'),now(),(select id from user where first_name='root'),now());
