TYPE=VIEW
query=select `sush`.`product`.`code` AS `code`,`sush`.`product`.`name` AS `name`,`sush`.`product`.`quantity` AS `quantity`,`sush`.`product`.`price` AS `price`,`sush`.`product`.`price` * `sush`.`product`.`quantity` AS `sales` from `sush`.`product`
md5=57de2cf6a3c86f9f9ba4096ee0894433
updatable=1
algorithm=0
definer_user=root
definer_host=localhost
suid=2
with_check_option=0
timestamp=2019-07-31 03:44:07
create-version=2
source=select code,name,quantity,price,(price*quantity) as sales from product
client_cs_name=latin1
connection_cl_name=latin1_swedish_ci
view_body_utf8=select `sush`.`product`.`code` AS `code`,`sush`.`product`.`name` AS `name`,`sush`.`product`.`quantity` AS `quantity`,`sush`.`product`.`price` AS `price`,`sush`.`product`.`price` * `sush`.`product`.`quantity` AS `sales` from `sush`.`product`
mariadb-version=100225