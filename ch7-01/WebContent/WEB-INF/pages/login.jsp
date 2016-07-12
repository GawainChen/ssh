<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/default.css" />
<title>成员登录</title>
</head>
<body>
	<table align="center" border="0" cellpadding="0" cellspacing="7"
		height="170" width="234">
		<tbody>
			<tr>
				<td align="left" valign="middle">&nbsp;</td>
			</tr>
		</tbody>
	</table>
	<table align="center" border="0" cellpadding="0" cellspacing="7"
		height="170" width="234">
		<tbody>
			<tr>
				<td align="left" valign="middle"><s:a
						href="register_input.action">注册为新成员</s:a></td>
			</tr>
		</tbody>
	</table>
	<s:form action="login" validate="true">
		<table align="center" border="0" cellpadding="0" cellspacing="7"
			width="234">
			<tr>
				<td align="left" valign="middle" width="26"><img
					src="css/images/jiantou3.jpg" width="11" height="10"></td>
				<td align="center" valign="middle" width="60"><img
					src="css/images/user.jpg" width="46" height="15"></td>
				<td align="center" valign="middle" width="148"><s:textfield
						name="userName" label=" "></s:textfield></td>
			</tr>
			<tr>
				<td align="left" valign="middle" width="26"><img
					src="css/images/jiantou3.jpg" width="11" height="10"></td>
				<td align="center" valign="middle" width="60"><img
					src="css/images/pass.jpg" width="47" height="15"></td>
				<td align="center" valign="middle" width="148"><s:textfield
						name="password" label=" "></s:textfield></td>
			</tr>
			<tr>
				<td align="left"><s:submit value="进入"></s:submit></td>
			</tr>
		</table>
	</s:form>
</body>
</html>