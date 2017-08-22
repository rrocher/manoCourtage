--liquibase formatted sql
--changeset rrocher:initial-amount-payments
INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FIRST3M'), 
(select id from loan_psbl_payments where code='WEEKLY'),
12,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FIRST3M') / 12)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FIRST3M'), 
(select id from loan_psbl_payments where code='BIWEEKLY'),
6,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FIRST3M') / 6)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FIRST3M'), 
(select id from loan_psbl_payments where code='MONTHLY'),
3,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FIRST3M') / 3)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FIRST3M'), 
(select id from loan_psbl_payments where code='4WEEK'),
3,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FIRST3M') / 3)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FIRST3M'), 
(select id from loan_psbl_payments where code='BIMONTHLY'),
6,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FIRST3M') / 6)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='SECOND3M'), 
(select id from loan_psbl_payments where code='WEEKLY'),
12,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='SECOND3M') / 12)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='SECOND3M'), 
(select id from loan_psbl_payments where code='BIWEEKLY'),
6,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='SECOND3M') / 6)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='SECOND3M'), 
(select id from loan_psbl_payments where code='MONTHLY'),
3,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='SECOND3M') / 3)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='SECOND3M'), 
(select id from loan_psbl_payments where code='4WEEK'),
3,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='SECOND3M') / 3)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='SECOND3M'), 
(select id from loan_psbl_payments where code='BIMONTHLY'),
6,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='SECOND3M') / 6)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='THIRD3M'), 
(select id from loan_psbl_payments where code='WEEKLY'),
12,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='THIRD3M') / 12)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='THIRD3M'), 
(select id from loan_psbl_payments where code='BIWEEKLY'),
6,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='THIRD3M') / 6)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='THIRD3M'), 
(select id from loan_psbl_payments where code='MONTHLY'),
3,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='THIRD3M') / 3)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='THIRD3M'), 
(select id from loan_psbl_payments where code='4WEEK'),
3,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='THIRD3M') / 3)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='THIRD3M'), 
(select id from loan_psbl_payments where code='BIMONTHLY'),
6,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='THIRD3M') / 6)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FOURTH3M'), 
(select id from loan_psbl_payments where code='WEEKLY'),
12,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FOURTH3M') / 12)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FOURTH3M'), 
(select id from loan_psbl_payments where code='BIWEEKLY'),
6,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FOURTH3M') / 6)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FOURTH3M'), 
(select id from loan_psbl_payments where code='MONTHLY'),
3,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FOURTH3M') / 3)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FOURTH3M'), 
(select id from loan_psbl_payments where code='4WEEK'),
3,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FOURTH3M') / 3)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FOURTH3M'), 
(select id from loan_psbl_payments where code='BIMONTHLY'),
6,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FOURTH3M') / 6)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FIRST4M'), 
(select id from loan_psbl_payments where code='WEEKLY'),
16,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FIRST4M') / 16)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FIRST4M'), 
(select id from loan_psbl_payments where code='BIWEEKLY'),
8,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FIRST4M') / 8)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FIRST4M'), 
(select id from loan_psbl_payments where code='MONTHLY'),
4,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FIRST4M') / 4)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FIRST4M'), 
(select id from loan_psbl_payments where code='4WEEK'),
4,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FIRST4M') / 4)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FIRST4M'), 
(select id from loan_psbl_payments where code='BIMONTHLY'),
8,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FIRST4M') / 8)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='SECOND4M'), 
(select id from loan_psbl_payments where code='WEEKLY'),
16,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='SECOND4M') / 16)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='SECOND4M'), 
(select id from loan_psbl_payments where code='BIWEEKLY'),
8,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='SECOND4M') / 8)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='SECOND4M'), 
(select id from loan_psbl_payments where code='MONTHLY'),
4,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='SECOND4M') / 4)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='SECOND4M'), 
(select id from loan_psbl_payments where code='4WEEK'),
4,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='SECOND4M') / 4)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='SECOND4M'), 
(select id from loan_psbl_payments where code='BIMONTHLY'),
8,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='SECOND4M') / 8)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='THIRD4M'), 
(select id from loan_psbl_payments where code='WEEKLY'),
16,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='THIRD4M') / 16)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='THIRD4M'), 
(select id from loan_psbl_payments where code='BIWEEKLY'),
8,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='THIRD4M') / 8)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='THIRD4M'), 
(select id from loan_psbl_payments where code='MONTHLY'),
4,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='THIRD4M') / 4)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='THIRD4M'), 
(select id from loan_psbl_payments where code='4WEEK'),
4,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='THIRD4M') / 4)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='THIRD4M'), 
(select id from loan_psbl_payments where code='BIMONTHLY'),
8,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='THIRD4M') / 8)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FOURTH4M'), 
(select id from loan_psbl_payments where code='WEEKLY'),
16,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FOURTH4M') / 16)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FOURTH4M'), 
(select id from loan_psbl_payments where code='BIWEEKLY'),
8,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FOURTH4M') / 8)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FOURTH4M'), 
(select id from loan_psbl_payments where code='MONTHLY'),
4,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FOURTH4M') / 4)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());

INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FOURTH4M'), 
(select id from loan_psbl_payments where code='4WEEK'),
4,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FOURTH4M') / 4)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());


INSERT INTO `loan_psbl_amount_payment`(`loan_interest_rate_payment`, `loan_psbl_payment`, `nb_payments`,
 `payment`,
`id_user_insert`,`ts_insert`,`id_user_update`,`ts_update`)
VALUES
((select id from loan_interest_rate_payment where code='FOURTH4M'), 
(select id from loan_psbl_payments where code='BIMONTHLY'),
8,
(select round((select (select(select total_payment from loan_interest_rate_payment where code='FOURTH4M') / 8)),2)),
(select id from user where first_name='root'),
now(),
(select id from user where first_name='root'),
now());