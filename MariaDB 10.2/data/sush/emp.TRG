TYPE=TRIGGERS
triggers='CREATE DEFINER=`root`@`localhost` trigger tri_emp after insert on emp for each row \nupdate emp_count set emp_count.headcount=emp_count +1'
sql_modes=1411383296
definers='root@localhost'
client_cs_names='latin1'
connection_cl_names='latin1_swedish_ci'
db_cl_names='utf8_general_ci'
created=156499679164
