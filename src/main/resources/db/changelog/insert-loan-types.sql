--liquibase formatted sql
--changeset rrocher:initial-types
INSERT INTO `loan_type`
(`code`,`text`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('NEXTPAY'	,'Rembourser avec mon prochain salaire',(select `id` from `user` where `first_name`='root'),now(),(select `id` from `user` where `first_name`='root'),now());

INSERT INTO `loan_type`
(`code`,`text`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
('STEP_BY_STEP'	,'Repartir les remboursements sur une periode',(select `id` from `user` where `first_name`='root'),now(),(select `id` from `user` where `first_name`='root'),now());
