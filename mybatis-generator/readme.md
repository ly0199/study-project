## MyBatis Generator 使用手册

- 修改 `src/main/resources/mybatis/generatorConfig.xml`
    `classPathEntry`：数据库驱动jar的位置
    `jdbcConnection`：连接信息、用户名、密码
    `targetPackage` ：输出路径改成需生成路径    
    `table`         ：定义各个表的信息，一个表一个table

- 运行 `mvn mybatis-generator:generate`

- 参考地址 [http://mbg.cndocs.ml/](http://mbg.cndocs.ml/)
    