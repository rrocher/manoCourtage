--liquibase formatted sql
--changeset rrocher:initial-amount-payments
INSERT INTO `loan_psbl_amount_payment`(`loan_psbl_amount`,`loan_psbl_duration`, `loan_psbl_payment`, `nb_payments`,`interest_rate`,
 `file_fee`,`total_payment`,`payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='THIRD'), 
(select id from loan_psbl_duration where code='3M'), 
(select id from loan_psbl_payments where code='WEEKLY'),
12,
30.00,
50.00,
380.00,
31.67,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_psbl_amount`,`loan_psbl_duration`, `loan_psbl_payment`, `nb_payments`,`interest_rate`,
 `file_fee`,`total_payment`,`payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='THIRD'), 
(select id from loan_psbl_duration where code='3M'), 
(select id from loan_psbl_payments where code='BIWEEKLY'),
6,
30.00,
50.00,
380.00,
63.30,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_psbl_amount`,`loan_psbl_duration`, `loan_psbl_payment`, `nb_payments`,`interest_rate`,
 `file_fee`,`total_payment`,`payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='THIRD'), 
(select id from loan_psbl_duration where code='3M'), 
(select id from loan_psbl_payments where code='4WEEK'),
3,
30.00,
50.00,
380.00,
126.67,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_psbl_amount`,`loan_psbl_duration`, `loan_psbl_payment`, `nb_payments`,`interest_rate`,
 `file_fee`,`total_payment`,`payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='THIRD'), 
(select id from loan_psbl_duration where code='3M'), 
(select id from loan_psbl_payments where code='BIMONTHLY'),
6,
30.00,
50.00,
380.00,
63.30,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_psbl_amount`,`loan_psbl_duration`, `loan_psbl_payment`, `nb_payments`,`interest_rate`,
 `file_fee`,`total_payment`,`payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='THIRD'), 
(select id from loan_psbl_duration where code='3M'), 
(select id from loan_psbl_payments where code='MONTHLY'),
3,
30.00,
50.00,
380.00,
126.67,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());