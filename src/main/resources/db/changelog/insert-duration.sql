--liquibase formatted sql
--changeset rrocher:initial-duration
INSERT INTO `loan_psbl_duration`
(`loan_type`,`nb_days`,`nb_weeks`,`nb_months`,`code`,`text`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_type where code='STEP_BY_STEP'),84,12,3,'3M','3 Mois',(select `id` from `user` where `first_name`='root'),now(),(select `id` from `user` where `first_name`='root'),now());

INSERT INTO `loan_psbl_duration`
(`loan_type`,`nb_days`,`nb_weeks`,`nb_months`,`code`,`text`,`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_type where code='STEP_BY_STEP'),84,12,3,'4M','4 Mois',(select `id` from `user` where `first_name`='root'),now(),(select `id` from `user` where `first_name`='root'),now());

