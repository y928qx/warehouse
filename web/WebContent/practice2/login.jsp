<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>;
</head>
<body   style="background-image:url('11111.jpg');" marginheight="220em" >
	<form action="login.jsp" method="post"    >
		<center>
			用户名:<input type="text" name="uname" /><br /><br/> 
			密&nbsp;码:<input type="password" name="upass" /><br /><br />
	&nbsp;&nbsp;<input type="submit" value="登陆"> &nbsp;&nbsp;&nbsp;
			 <input type="reset" value="重置"><br/>
		</center>
	</form>
	<%
	        
	
	
		String name = request.getParameter("uname");
		String pwd = request.getParameter("upass");

		if (null != name && null != pwd && "yqx".equals(name) && "123456".equals(pwd)) {
			response.setHeader("refresh", "3;url=loginOK.jsp");//定时跳转
			session.setAttribute("userid", name);//将用户名保存在session中
	%>
	<p>用户登陆成功，3秒后跳转到欢迎页</p>
	<p>
		如果没有跳转请点击<a href="loginOK.jsp">这里</a>
	</p>
	<%
	}  
	%>
	<!-- <h3>对不起。你输入的密码错误</h3> -->
	<%
	
	%>
</body>
</html>