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
				<li><a href="controlPanel_input.action">控制面板</a></li>
			</ul>
			<div id="date"></div>
		</div>

		<div id="primarycontent">
			<!-- primary content start -->
			<div class="post">
				<div class="header">
					<h3>发布信息</h3>
					<div class="date"></div>
				</div>
				<div class="content">
					<s:form action="information_add">
						<s:textfield name="title" label="标题"></s:textfield>
						<s:textarea name="content" label="内容"></s:textarea>
						<s:select label="类型" name="type" list="{'社区信息','日志'}"></s:select>
						<s:submit value="发布"></s:submit>
					</s:form>
				</div>

				<div class="footer">
					<ul>
						<li class="readmore"><a href="javascript；history.back{-1};">返回</a></li>
					</ul>
				</div>
			</div>

			<!-- primary content end -->

		</div>
		<div id="secondarycontent">
			<!-- secondary content start -->
			<h3>
				<s:property value="userName" />
			</h3>
			<!-- secondary content end -->
		</div>
		<div id="footer">&copy;社区小组。 All rights reserved. Design by
			社区小组。</div>
	</div>

</body>
</html>