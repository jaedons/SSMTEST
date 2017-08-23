<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户信息</title>
</head>
<body>
	<fieldset>
		<legend>用户信息</legend>
		<form action="<%=request.getContextPath()%>/user/update"  method="post">
		<input name ="id" value="${user.id }"/><br>
		用户名: <input name="username"  value="${user.username}" /><br>
		密码: <input name="password" value="${user.password }"/><br>
		邮箱:<input name="email" value="${user.email }"/><br>
		电话:<input name="mobile" value="${user.mobile }"/><br>
		注册时间:<input name="create" value="${user.createtime }" /><br>
		<input type="submit"  value="提交"/> <input type="reset" value="重置"/>
		</form>
	</fieldset>
</body>
</html>