TYPE=VIEW
query=select `sush`.`suppliers`.`name` AS `supplier name`,`sush`.`product`.`name` AS `product name` from (`sush`.`product` join `sush`.`suppliers` on(`sush`.`product`.`s_id` = `sush`.`suppliers`.`s_id`))
md5=b74923764aaab569007d78f7ff043614
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2019-07-31 03:45:59
create-version=2
source=select suppliers.name as \'supplier name\',product.name as \'product name\' from product join suppliers on product.s_id=suppliers.s_id
client_cs_name=latin1
connection_cl_name=latin1_swedish_ci
view_body_utf8=select `sush`.`suppliers`.`name` AS `supplier name`,`sush`.`product`.`name` AS `product name` from (`sush`.`product` join `sush`.`suppliers` on(`sush`.`product`.`s_id` = `sush`.`suppliers`.`s_id`))
mariadb-version=100225
