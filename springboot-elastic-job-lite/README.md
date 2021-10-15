# 工程简介
使用官方提供的`elastic-job` 3.0 的 starter 完成`springboot`集成实现定时任务的执行.


### 依赖:
```xml
<dependency>
    <groupId>org.apache.shardingsphere.elasticjob</groupId>
    <artifactId>elasticjob-lite-spring-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>
```

### 排雷:

elasticjob-lite-spring-boot-starter 3.0 自带的 Curator 是 5.1.0 版本, 而这需要 3.6+ 的`zookeeper`, 因为这版本兼容问题鼓捣了一天.



# 延伸阅读

* https://cwiki.apache.org/confluence/display/CURATOR/Releases
* http://archive.apache.org/dist/zookeeper/zookeeper-3.6.2/
* https://developer.aliyun.com/mvn/search

