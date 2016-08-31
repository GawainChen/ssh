<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/default.css" />
<title>社区主页</title>
</head>
<body>
	<div id="outer"></div>
	<div id="upbg"></div>
	<div id="inner">
		<div id="header">
			<h1>
				<span>简易社区</span>
			</h1>
			<h2>by社区小组</h2>
		</div>
		<div id="splash"></div>
		<div id="menu">
			<ul>
				<li class="first"><a href="main.action">信息浏览</a></li>
				<li><a href="#">控制面板</a></li>
			</ul>
			<div id="date"></div>
		</div>

		<div id="primarycontent">
			<!-- primary content start -->
			<div class="post">
				<div class="header">
					<h3>个人信息</h3>
					<div class="date"></div>
				</div>
				<div class="content">
					<s:form action="register">
						<s:textfield name="userName" label="用户名"></s:textfield>
						<s:select list="{'男','女'}" name="gender" label="性别"></s:select>
						<s:textfield name="age" label="年 龄"></s:textfield>
						<s:textfield name="realName" label="真实姓名"></s:textfield>
						<s:password name="password" label="密码" showPassword="true"></s:password>
						<s:textfield name="personalSignature" label="修改签名"></s:textfield>
						<s:submit value="修改"></s:submit>
					</s:form>
				</div>

				<div class="footer">
					<ul>
						<li class="readmore"><a href="main.action">返回</a></li>
					</ul>
				</div>
			</div>

			<!-- primary content end -->

		</div>
		<div id="secondarycontent">
			<!-- secondary content start -->
			<h3></h3>
			<!-- secondary content end -->
		</div>
		<div id="footer">&copy;社区小组。 All rights reserved. Design by
			社区小组。</div>
	</div>

</body>
</html>