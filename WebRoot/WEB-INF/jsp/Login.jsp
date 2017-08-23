<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录操作</title>
</head>
<body>
	<fieldset>
		<legend>登录</legend>
		<form action="<%=request.getContextPath()%>/user/login" method="post">
		用户名: <input name="username" placeholder="请输入用户名" /><br>
		&nbsp;密&nbsp;&nbsp;码&nbsp;:<input name="password" type="password" placeholder="请输入密码"/><br>
		<input type="submit" value="提交"/><br>
		</form>
	</fieldset>
</body>
</html>