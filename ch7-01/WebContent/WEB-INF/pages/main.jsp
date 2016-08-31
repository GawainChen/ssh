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
				<li class="controlPanel_input.action"><a href="main.action">控制面板</a></li>
				<li><a href="logout.action">退出</a></li>
			</ul>
			<div id="date"></div>
		</div>
		<div id="primarycontent">
			<!-- primary content start -->
			<div class="post">
				<s:iterator value="information.keySet()" id="listType">
					<div class="header">
						<h3>
							<s:property value="#listType" />
						</h3>
						<div class="date"></div>
					</div>
					<div class="content">
						<s:iterator value="informations.get(#listType)">
							<s:url id="detail" action="information_detail.action">
								<s:param name="infoId">
									<s:property value="id" />
								</s:param>
							</s:url>
							<p>
								<s:a href="%{detail}">
									<s:property value="title" />
								</s:a>
								&nbsp;&nbsp;
								<s:date name="publishingTime" format="yy-mm-dd HH:MM:ss" />
							</p>
						</s:iterator>
					</div>
					<div class="footer">
						<ul>
							<s:url id="readMore" action="information_list">
								<s:param name="listType">
									<s:property value="#listType" />
								</s:param>
							</s:url>
							<li class="readmore"><s:a href="%{readMore}">更多。。。</s:a></li>
						</ul>
					</div>
				</s:iterator>
			</div>
			<!-- primary content end -->

		</div>
		<div id="secondarycontent">
			<!-- secondary content start -->

			<h3>
				<s:property value="userName" />
			</h3>
			<div class="content">
				<p>
					<s:a href="information_input.action">发布信息</s:a>
				</p>
			</div>
			<!-- secondary content end -->
		</div>
		<div id="footer">&copy;社区小组。 All rights reserved. Design by
			社区小组。</div>
	</div>

</body>
</html>