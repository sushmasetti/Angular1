TYPE=VIEW
query=select `sush`.`product`.`id` AS `id`,`sush`.`product`.`code` AS `code`,`sush`.`product`.`pname` AS `pname`,`sush`.`product`.`quantity` AS `quantity`,`sush`.`product`.`price` AS `price`,`sush`.`product`.`s_id` AS `s_id` from `sush`.`product`
md5=408268a6c652d868fc4f9e551e185770
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=2
timestamp=2019-07-31 04:26:52
create-version=2
source=select * from product with check option
client_cs_name=latin1
connection_cl_name=latin1_swedish_ci
view_body_utf8=select `sush`.`product`.`id` AS `id`,`sush`.`product`.`code` AS `code`,`sush`.`product`.`pname` AS `pname`,`sush`.`product`.`quantity` AS `quantity`,`sush`.`product`.`price` AS `price`,`sush`.`product`.`s_id` AS `s_id` from `sush`.`product`
mariadb-version=100225