# JavaSpring 模板

## 第一阶段未完成
- Response 代理
- Client 实现

## 第二阶段未完成
- 日志规范
- 入参验证
- 数据转换

## 第三阶段未完成
- 支持多种传输方式

## Java Web 基础内容
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
- 关联查询: https://www.cnblogs.com/hhhshct/p/9492741.html
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
- ExceptionHandler 问题
- Response 问题

#### service/client
- Controller 如果自动载入
- Entity 问题 Model 问题
