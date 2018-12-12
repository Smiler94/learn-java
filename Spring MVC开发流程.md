Spring MVC开发流程
1.添加maven依赖
    - junit
    - springframework
        - spring-test
        - spring-context-support
        - spring-jdbc
        - spring-tx
        - spring-webmvc
    - mybatis
        - mybatis
        - mybatis-spring
    - mysql
        -mysql-connector-java

2.配置web.xml
    - servlet
        - springMVC
    - filter
    - listener
    - context-param

3.配置spring-context.xml
    - 

4.配置spring-context-mvc.xml
    - context:component-scan 自动扫描
    - viewResolver 视图解析器
    - multipartResolver 文件上传处理器
    - mvc:default-servlet-handler 静态文件处理

> Spring 4.3才开始有GetMapping,PostMapping
至此简单配置已完毕，可以访问
