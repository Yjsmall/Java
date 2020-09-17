```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <parent>
        <artifactId>spring</artifactId>
        <groupId>com.small</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>

    <artifactId>spring-02-hellospring</artifactId>


</project>

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd">

    <!-- collaborators and configuration for this bean go here -->
    <!--使用spring来创建对象,在spring这些都成为bean-->
    <!--
    Hello hello = new Hello();

    id = 变量名
    class = new 的对象
    property 相当于对象的属性,相当于给属性赋值
    -->
    <bean id="hello" class="com.small.pojo.Hello">
        <property name="str" value="Spring"/>
    </bean>
</beans>
```