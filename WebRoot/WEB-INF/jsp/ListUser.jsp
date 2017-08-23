<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>展示所有用户</title>
</head>
<body>
	<table class="table">
					<thead>
						<tr class="table_header">
							<td>编号</td>
							<td>姓名</td>
							<td>年龄</td>
							<td>邮箱</td>
							<td>电话</td>
							<td>入职时间</td>
							<td>操作</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${users}" var="user" varStatus="s">
						<tr class="row${ s.index%2+1}">
							<td>${s.index+1}</td>
							<td>${user.username}</td>
							<td>${user.password}</td>
							<td>${user.email}</td>
							<td>${user.mobile}</td>
							<td>${user.createtime}</td>
							<td>
								<a href="<%=request.getContextPath()%>/user/delete?id=${user.id}" onclick="return confirm('确定删除${user.username}吗?')">删除</a>&nbsp;
								<a href="<%=request.getContextPath()%>/user/toUpdate?id=${user.id}">修改</a>
							</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>、
</body>
</html>