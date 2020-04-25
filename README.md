# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/maven-plugin/)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.2.6.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### TODO
- 开发模式 DONE
- 异常捕获 DONE
- 请求响应 DONE
- 分页查询 DONE
- 软删，创建时间/更新时间 DONE 
- 数据校验 DONE
- 联合查询 DONE
- 修改记录 DONE
- 日志规范 DONE
- 性能监控 DONE

### 需要巩固
- Spring MVC DONE
- Spring JPA 
- 字符串操作 DONE
- 数组操作 DONE
- 设计模式 
- Lombok 使用 DONE
- 组合/注解 DONE
- 数据校验 DONE

### 相关链接
- Spring Boot: https://www.yiibai.com/spring-boot/
- Spring MVC: https://www.yiibai.com/spring-boot/spring_boot_building_restful_web_services.html
- 异常捕获: https://www.yiibai.com/spring-boot/spring_boot_exception_handling.html
- 热加载: https://juejin.im/post/5bcd328ef265da0ade1cf25a
- 响应规范化: https://segmentfault.com/a/1190000020052492
- Lombok 使用: https://zhuanlan.zhihu.com/p/32779910
- Validation: https://www.cnkirito.moe/spring-validation/
- Validation: https://www.cnblogs.com/mr-yang-localhost/p/7812038.html
- 管理查询: https://www.cnblogs.com/hhhshct/p/9492741.html
- 时间更新: https://blog.csdn.net/vili_sky/article/details/84928373

#### 日志规范
- https://github.com/L316476844/springbootexample/blob/master/src/main/resources/logback.xml
- https://www.cnblogs.com/lspz/p/6473686.html

#### 修改记录
- https://www.cnblogs.com/zjdxr-up/p/10573936.html

#### 字符串操作
- https://www.runoob.com/java/java-string.html


### Mysql createdAt updatedAt 自动更新
```
create table demo(
create_time TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
update_time TIMESTAMP not null DEFAULT CURRENT_TIMESTAMP on UPDATE CURRENT_TIMESTAMP
COMMENT '更新时间'
)
```


### 工程模块化

#### common
- EntityTimes 问题
- ExceptionHandler 问题
- ResponseData 问题

#### contract
- Entity 组合问题
- Filter 筛选问题
- Page 继承于JPA

#### service/client
- Controller 如果自动载入
- UserFilter 转 JpaCondition 问题
- Common 相关问题
