<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-image:url('11111.jpg');"  >
	<%
		String userid = (String) session.getAttribute("userid");
		if (null != userid) {
	%>
	<p>
		欢迎<%=session.getAttribute("userid")%>光临本系统
	</p>
	<a href="loginOut.jsp">注销</a>
	<%
		} else {
	%>
	<p>
		请先进行系统的<a href="login.jsp"></a>登陆
	</p>
	<%
		}
	%>
</body>
</html>