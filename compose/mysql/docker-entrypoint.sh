#!/bin/bash
#-u为数据库用户名 -p为密码如果数据库密码不是root记得修改这里
echo 'service mysql status'
echo '1.启动mysql....'+$mysql_pass
mysql -uroot -proot <<EOF
source $WORK_PATH/$FILE_0;
source $WORK_PATH/$FILE_1;
use mysql;
ALTER USER 'root'@'%' IDENTIFIED WITH mysql_native_password BY 'root';


