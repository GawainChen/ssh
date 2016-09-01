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
			</ul>
			<div id="date"></div>
		</div>
		<div id="primarycontent">
			<!-- primary content start -->
			<div class="post">
				<div class="header">
					<h3>
						<s:property value="information.title" />
					</h3>
					<div class="date">
						<s:date name="information.publishingTime"
							format="yy-mm-dd HH:MM:ss" />
					</div>
				</div>
				<div class="content">
					<p>
						<s:iterator value="informations.content" />
					</p>
				</div>
				<div class="footer">
					<ul>
						<li class="readmore"><s:a href="main.action">返回</s:a></li>
					</ul>
				</div>
			</div>
			<div class="post">
				<div class="header">
					<h3>评论</h3>
					<div class="date"></div>
				</div>
				<div class="content">
					<s:iterator value="comments">
						<p>
							<b><s:property value="title" /></b> &nbsp;&nbsp;
							<s:date name="deliveredTime" format="yy-mm-dd HH:MM:ss" />
							&nbsp;
							<s:if test="userId==commenter.id">
								<s:url id="deleteComment" action="comment_delete.action">
									<s:param name="infoId">
										<s:property value="infoId" />
									</s:param>
									<s:param name="commentId">
										<s:property value="id" />
									</s:param>
								</s:url>
								<s:a href="%{deleteComment}">删除</s:a>
							</s:if>
						</p>
						<p>
							<s:property value="content" />
						</p>
					</s:iterator>
				</div>
				<div class="footer">
					<ul>
						<li class="readmore"><s:url id="addComment"
								action="comment_input.action">
								<s:param name="infoId">
									<s:property value="infoId" />
								</s:param>
							</s:url> <s:a href="%{addComment}">发表评论</s:a></li>
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