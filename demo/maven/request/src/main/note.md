# 基础知识
以后不用但是 代表整个web

## Servlet

### ServletContext--整个webapp应用
1. 共享数据
2. 获取初始化参数
3. 请求转发
4. 读取资源文件

**Properties**
   * 在java目录下新建properties
   * 在resources目录下新建properties

结果: 都被打包同一个路径下:classes,俗称这个路径为:classpath:
思路:需要一个文件流

### 两个参数--Request,Response
web服务器接收客户端的http请求,针对这个请求,创建request对象和response对象

  * 获取客户端请求过来的参数--->HTTPServletRequest
  * 给客户端响应一些信息--->HTTPServletRequest

#### Response响应

##### 1.简单分类

**负责向浏览器发送数据的方法**

```java
//一般流
servletoutputStream getoutputStream() throws IOException;
//中文
PrintWriter getWriter() throws IOException;
```

**向浏览器发送响应头的方法**

##### 2.常见应用
1. 向浏览器输出消息
2. 下载文件
    1. 现在文件路径
    2. 下载的文件名
    3. 设置浏览器支持下载我们需要的东西
    4. 获取下载文件的输入流
    5. 创建缓冲区
    6. 获取InputStream对象
    7. 将FileOutputStream流写入buffer缓冲区
    8. 使用InputStream将缓冲区的数据输出到客户端
3. 验证码---ImageServlet
4. 实现重定向(重点)
面试题:重定向与转发区别
相同点
  * 页面都会跳转

不同点
* 请求转发,URL不会变坏
* 重定向时候 ,URL地址栏会发生变化
![重定向--请求转发](resources/2.png)

#### Request请求
  HttpServletRequest代表客户端的请求,通过http协议访问服务器,http请求中的所有信息会被封装HTTPServletRequest,通过这个方法可以获取客户端的 **所有信息**

**获取前端传递的参数,转发**

## Cookie,Session
会话:打开-点击超链接-访问web资源-关闭浏览器
有状态会话:一个同学来过教室,下次再来我们知道这个同学来过

**一个网站,怎么证明你来过**
客户端          服务端
1. 服务端给客户单一个信件,客户端下次访问带上信件----cookie
2. 服务端登记你来过,下次来到时候我来匹配你     -----session

**保存会话的两种技术**
常见应用:网站登录,下次不用登录,第二次直接访问
### cookie
* 客户端技术(响应,请求)

1. 从请求拿到cookie信息
2. 服务器响应给客户端
```java
Cookie[] cookies = req.getCookies(); //获得cookie
//键值对
cookie.getName();
cookie.getValue();
new Cookie("lastLoginTimeL",System.currentTimeMillis()+"");//新建一个cookie
cookie.setMaxAge(24*60*60);//设置cookie有效期
resp.addCookie(cookie);//响应客户端一个cookie
```

一个网站cookie是否存在上限!
* 一个Cookie只能保存一个信息;
* 一个web站点可以给浏览器多个cookie,最多存放20个cookie
* cookie大小有限制40kb
* 300个cookie浏览器上限

**删除cookie:**
* 不设置有效期,关闭浏览器,自动生效
* 有效期时间设置为0

**编码,解码**
解决中文乱码


### session(非常重点)
* 服务器技术,利用这个技术,可以保存用户的会话信息,可以把信息或者数据放在session
什么是Session:
* 服务器给每一个用户(浏览器)创建一个Session对象;
* 一个Session独占一个浏览器,没有关闭,就一直存在
* 用户登录,整个网站都可访问---保存用户信息,保存购物车


Session和cookie区别:
* cookie是把用户的数据写给用户的浏览器,浏览器保存(可以保存多个)
* session把用户的数据写到独占session,服务器端保存(保存重要信息,减少服务器的浪费)
* session对象由服务器创建;

## JSP(Java Server Pages)
Java服务器端,用来开发动态web

### JSP基础语法

**jsp表达式**
```jsp
 <%= new java.util.Date()%>
```
**jsp脚本片段**
```jsp
<%
      int sum = 0;
      for (int i = 1;i <= 100; i++){
          sum+=i;
      }
      out.println("<h1>Sum=" + sum +"</h1>");
  %>

  <%
      int x = 10;
      out.println(x);
  %>
  <p>这是一个jsp文档</p>

  <%
      for (int i = 0; i < 5; i++) {
  %>
  <h1>hello, world1</h1>
  <%
      }
  %>
```

**jsp声明**
```jsp
  <%!
      static {
          System.out.println("Loading Servlet!");
      }
      private int globalVar = 0;
      public void kuang(){
          System.out.println("进入方法");
      }

  %>
```

Jsp声明:会被编译到jsp生产的class类中,其他会被生成jspService方法中

### JSP指令

### 9大内置对象
* PageContext 存东西
* Request 存东西
* Response
* Session 存东西
* Application [ServletContext] 存东西
* Config [ServletConfig]
* out
* page 不用了解
* exception


```java
//通过pageContext取出我们的值
//从底层到高层(作用域): page->request->session->application
Object name1 = pageContext.findAttribute("name1");//保存数据只在一个页面有效
Object name2 = pageContext.findAttribute("name2");//保存数据只在一次请求有效,请求转发携带这个数据
Object name3 = pageContext.findAttribute("name3");//保存数据只在一次会话有效,从打开浏览器到关闭浏览器
Object name4 = pageContext.findAttribute("name4");//保存数据只在服务器有效,打开服务器到关闭服务器
```

request:客户端向服务器发送请求,产生数据,用户看完就没用了:新闻
session:用户用完还有用 :购物车
application:一个用户用完,其他用户还可能要用:聊天数据 

### jsp标签,jstl标签,el表达式

EL表达式:(需要导入两个包) ${}

```xml
<!-- JSTL表达式依赖 -->
<dependency>
    <groupId>javax.servlet.jsp.jstl</groupId>
    <artifactId>jstl-api</artifactId>
    <version>1.2</version>
</dependency>

<!-- standard标签 -->
<dependency>
    <groupId>taglibs</groupId>
    <artifactId>standard</artifactId>
    <version>1.1.2</version>
</dependency>
```

* 获取数据
* 执行运算
* 获取web开发的常用对象

**JSP标签**

```jsp
<jsp:forward page="jsptag2.jsp">
    <jsp:param name="name" value="value1"/>
    <jsp:param name="age" value="value2"/>
</jsp:forward>
```

**JSTL表达式**--导入包,使用方法

​	**核心标签**

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>if test</h4>

<hr>

<form action="coreif.jsp" method="get">
    <%--
    EL表达式获取表单中的数据
    ${param.参数名}
    --%>
    <input type="text" name="username" value="${param.username}">
    <input type="submit" value="登录">
</form>
<%--判断如果提交的用户是管理员,则登录成功--%>
<c:if test="${param.username=='admin'}" var="isAdmin">
    <c:out value="管理员欢迎你"/>
</c:if>
<%--自闭和标签--%>
<c:out value="${isAdmin}"/>

</body>
</html>
```

```jsp
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:set var="score" value="85"/>

<c:choose>
    <c:when test="${score>=90}">你的成绩优秀</c:when>
    <c:when test="${score>=80}">你的成绩良好</c:when>
    <c:when test="${score<=60}">及格</c:when>
</c:choose>

</body>
</html>
```

---



## JavaBean

实体类

JavaBean特定写法 :

* 必须有 一个无参构造
* 属性必须私有化
* 必须有get/set方法

一般用来和数据字段做映射: ORM;

ORM:对象关系映射

* 表--->类
* 字段-->属性
* 行记录-->对象

| id   | name   | age  | address |
| ---- | ------ | ---- | ------- |
| 1    | small1 | 24   | 先      |
| 2    | small2 | 24   | 先      |

```java
class People{
    private int id;
    private String name;
    private int age;
    private String address;
}MVC 三层架构
```

​	



## MVC三层架构

### 早些年

![image-20200803225302919](C:\Users\shuai qi de yj\AppData\Roaming\Typora\typora-user-images\image-20200803225302919.png)

```
servlet-->CRUD-->数据库
弊端:程序十分臃肿,不利于维护
servlet代码中:处理请求,响应,视图跳转,处理JDBC,处理业务代码,处理逻辑代码

架构:没有什么加一层结局不了

程序员调用
|
JDBC
|
mysql Oracle SQLserver ...
```

### MVC三层架构



![image-20200803230149494](C:\Users\shuai qi de yj\AppData\Roaming\Typora\typora-user-images\image-20200803230149494.png)

Model 

* 业务处理: 业务逻辑(Service)
* 数据持久层:CRUD(DAO)

View

* 展示数据
* 提供链接发起Servlet请求(a,form,img...)

Controller (Servlet)

* 接收用户的请求:(req:请求参数,Session信息)
* 交给业务层处理对应的代码
* 控制视图的跳转

> 登录-->接收用户的登录请求-->处理用户的请求(获取用户的登录参数,username,password)-->交给业务层处理登录业务(判断un,pwd是否正确:事务)-->Dao层查询用户名和密码是否正确-->数据库

## Filter(重点)

![image-20200803231708670](C:\Users\shuai qi de yj\AppData\Roaming\Typora\typora-user-images\image-20200803231708670.png)

1. 导包Filter(javax.servlet)
2. 代码

接口 重写 在web.xml(和Servlet一样)

```java
public class CharacterEncodingFilter implements Filter {
   @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        System.out.println("初始化成功");
    }

    /**
     * 1. 顾虑中的所有代码,过滤特定请求的时候都会执行
     * 2. 必须让过滤器继续同行
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;charset=UTF-8");

        System.out.println("CharacterEncodingFilter执行前");

        //让我们过滤器继续走,不写这里就会被拦截
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("执行后");

    }

    @Override
    public void destroy() {
        System.out.println("销毁成功");

    }
}
```

```xml
<servlet>
    <servlet-name>showservlet</servlet-name>
    <servlet-class>com.small.servlet.ShowServlet</servlet-class>
</servlet>
<servlet-mapping>
    <servlet-name>showservlet</servlet-name>
    <url-pattern>/s</url-pattern>
</servlet-mapping>
<servlet-mapping>
    <servlet-name>showservlet</servlet-name>
    <url-pattern>/servlet/s</url-pattern>
</servlet-mapping>

<filter>
    <filter-name>cf</filter-name>
    <filter-class>com.small.filter.CharacterEncodingFilter</filter-class>
</filter>
<filter-mapping>
    <filter-name>cf</filter-name>
    <!--只要是/servlet的任何请求,都会执行这个过滤器-->
    <url-pattern>/servlet/*</url-pattern>
</filter-mapping>
```

## 监听器

实现一个监听器接口(有N钟方式)

```java
public class OnlineCountListener implements HttpSessionListener {
    /**
     * 创建session监听;
     * 一旦创建session就会触发这个事件
     * @param httpSessionEvent
     */
    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        ServletContext ctx = httpSessionEvent.getSession().getServletContext();
        Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");

        if (onlineCount == null){
            onlineCount = new Integer(1);
        } else {
            int count = onlineCount.intValue();

            onlineCount = new Integer(count + 1);
        }

        ctx.setAttribute("OnlineCount",onlineCount);


    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        ServletContext ctx = httpSessionEvent.getSession().getServletContext();

        System.out.println(httpSessionEvent.getSession().getId());

        Integer onlineCount = (Integer) ctx.getAttribute("OnlineCount");

        if (onlineCount == null){
            onlineCount = new Integer(1);
        } else {
            int count = onlineCount.intValue();

            onlineCount = new Integer(count - 1);
        }

        ctx.setAttribute("OnlineCount",onlineCount);

        /**
         * Session销毁
         * 手动 getSession().invalidate
         * 自动 web.xml
         *
         */
    }
}

    <session-config>
		<!-- 1分钟-->
        <session-timeout>1</session-timeout>
    </session-config>
```

 