启动springboot方式：
  1.通过内嵌tomcat启动
  2.在命令行中输入：mvn spring-boot:run
  3.(1)mvn install (2)进入项目target目录 (3) java -jar ***-SNAPSHOT-jar 或者 java -jar ***-SNAPSHOT-jar --spring.profiles.active=dev --server.port=8888
  *** 一个项目可以在不同端口同时打开！！！

注解：
  1.@RestController  等同于 @Controller + @ResponseBody

前端页面如果想用put或者delete请求 需在form中添加<input type="hidden" name="_method" value="PUT" />，并在后台设置过滤器HiddenHttpMethodFilter

如果项目访问了数据库，则需要在Application加上 @SpringBootApplication(exclude=SecurityAutoConfiguration.class)