CREATE TABLE `Employee` (
  `emp_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(20) NOT NULL,
  `emp_salary` double(10,0) NOT NULL DEFAULT '0',
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
  
CREATE TABLE `Address` (
  `emp_id` int(11) unsigned NOT NULL,
  `address_line1` varchar(50) NOT NULL DEFAULT '',
  `zipcode` varchar(10) DEFAULT NULL,
  `city` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`emp_id`),
  CONSTRAINT `emp_fk_1` FOREIGN KEY (`emp_id`) REFERENCES `Employee` (`emp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 
INSERT INTO `Employee` (`emp_id`, `emp_name`, `emp_salary`)
VALUES
    (002, 'Kayla', 105),
    (004, 'Devree', 110),
    (007, 'Sterling', 195),
    (010, 'Adrian', 105);
 
 
INSERT INTO `Address` (`emp_id`, `address_line1`, `zipcode`, `city`)
VALUES
    (1, 'Grem Rd', '85120', 'Payson'),
    (2, 'Roadblock Dr', '85646', 'Phoenix'),
    (3, 'Dawnstone Ave', '85294', 'Chandler'),
    (4, 'Gravestone Yard', '83451', 'Show Low');
     
commit;
