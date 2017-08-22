--liquibase formatted sql
--changeset rrocher:initial-amounts
INSERT INTO `loan_psbl_amount`
(`code`,`amount`,`currency`,`text`,`comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('FIRST',300,'CAD$','300.00 $CAD','first',(select `id` from `user` where `first_name`='root'),now(),(select `id` from `user` where `first_name`='root'),now());

INSERT INTO `loan_psbl_amount`
(`code`,`amount`,`currency`,`text`,`comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('SECOND',500,'CAD$','500.00 $CAD','second',(select `id` from `user` where `first_name`='root'),now(),(select `id` from `user` where `first_name`='root'),now());

INSERT INTO `loan_psbl_amount`
(`code`,`amount`,`currency`,`text`,`comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('THIRD',750,'CAD$','750.00 $CAD','third',(select `id` from `user` where `first_name`='root'),now(),(select `id` from `user` where `first_name`='root'),now());

INSERT INTO `loan_psbl_amount`
(`code`,`amount`,`currency`,`text`,`comments`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('FOURTH',1000,'CAD$','1000.00 $CAD','fourth',(select `id` from `user` where `first_name`='root'),now(),(select `id` from `user` where `first_name`='root'),now());
