FROM mysql:latest
#mysql的工作位置
ENV WORK_PATH /usr/local/work

#定义会被容器自动执行的目录
ENV AUTO_RUN_DIR /docker-entrypoint-initdb.d

#初始化数据库的SQL
ENV FILE_0 zxl_schema.sql
ENV FILE_1 zxl_data.sql

#定义SQL
ENV INSTALL_DATA_SHELL docker-entrypoint.sh

#创建文件夹
RUN mkdir -p $WORK_PATH

COPY ./$FILE_0 $WORK_PATH/
COPY ./$FILE_1 $WORK_PATH/
#把要执行的shell文件放到/docker-entrypoint-initdb.d/目录下，容器会自动执行这个shell
COPY ./$INSTALL_DATA_SHELL $AUTO_RUN_DIR/


#给执行文件增加可执行权限
RUN chmod a+x $AUTO_RUN_DIR/$INSTALL_DATA_SHELL

#设置容器启动时执行的命令
#CMD ["sh", "/docker-entrypoint-initdb.d/docker-entrypoint.sh"]
