--liquibase formatted sql
--changeset rrocher:initial-amount-payments
INSERT INTO `loan_interest_rate_payment`(`loan_psbl_amount`,`code`,`loan_psbl_duration`, 
`interest_rate`,
 `file_fee`,
 `total_payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='FIRST'),
'FIRST3M',
(select id from loan_psbl_duration where code='3M'), 
22.50,
50.00,
372.50,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_interest_rate_payment`(`loan_psbl_amount`,`code`,`loan_psbl_duration`, 
`interest_rate`,
 `file_fee`,`total_payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='FIRST'), 
'FIRST4M',
(select id from loan_psbl_duration where code='4M'), 
30.00,
50.00,
380.00,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_interest_rate_payment`(`loan_psbl_amount`,`code`,`loan_psbl_duration`, 
`interest_rate`,
 `file_fee`,
 `total_payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='SECOND'),
'SECOND3M', 
(select id from loan_psbl_duration where code='3M'), 
37.50,
100.00,
637.50,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_interest_rate_payment`(`loan_psbl_amount`,`code`,`loan_psbl_duration`, 
`interest_rate`,
 `file_fee`,`total_payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='SECOND'),
'SECOND4M', 
(select id from loan_psbl_duration where code='4M'), 
50.00,
100.00,
650.00,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());



INSERT INTO `loan_interest_rate_payment`(`loan_psbl_amount`,`code`,`loan_psbl_duration`, 
`interest_rate`,
 `file_fee`,
 `total_payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='THIRD'),
'THIRD3M',  
(select id from loan_psbl_duration where code='3M'), 
56.25,
150.00,
956.25,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_interest_rate_payment`(`loan_psbl_amount`,`code`,`loan_psbl_duration`, 
`interest_rate`,
 `file_fee`,`total_payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='THIRD'),
'THIRD4M',  
(select id from loan_psbl_duration where code='4M'), 
75.00,
150.00,
975.00,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_interest_rate_payment`(`loan_psbl_amount`,`code`,`loan_psbl_duration`, 
`interest_rate`,
 `file_fee`,
 `total_payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='FOURTH'), 
'FOURTH3M', 
(select id from loan_psbl_duration where code='3M'), 
75.00,
200.00,
1275.50,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_interest_rate_payment`(`loan_psbl_amount`,`code`,`loan_psbl_duration`, 
`interest_rate`,
 `file_fee`,`total_payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_psbl_amount where code='FOURTH'), 
'FOURTH4M', 
(select id from loan_psbl_duration where code='4M'), 
100.00,
200.00,
1300.00,
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());
