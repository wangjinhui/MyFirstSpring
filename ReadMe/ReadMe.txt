1. 拷贝mysql-connector-java-5.1.26-bin.jar到Tomcat安装目录下的lib/目录下

2. 修改Tomcat安装目录下的conf/context.xml，在<context>中增加如下数据源，如果需要，可能要更新这里的数据库连接信息。

    <Resource 
       name="jdbc/ptj_tz"
       auth="Container" 
       type="javax.sql.DataSource"
       initialSize="3"
       maxActive="30"
       maxIdle="5"
       maxWait="5000"
       minEvictableIdleTimeMillis="1800000"
       timeBetweenEvictionRunsMillis="1800000"
       username="root"
       password="123123"
       driverClassName="com.mysql.jdbc.Driver"
       url="jdbc:mysql://localhost:3306/ptj_tz"
    />

    具体参数的含义参见：
    1. http://commons.apache.org/proper/commons-dbcp/configuration.html
    2. http://www.iteye.com/topic/134698

3. 工具类库文档地址:http://hutool.mydoc.io/
