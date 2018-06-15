<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>更新結果確認画面</title>
<link href="/css/commons.css" rel="stylesheet">
</head>
<body>
<p>実行者：${fn:escapeXml(user.adminName)}</p>
<p>正常に更新されました</p>
<form:form action="select" modelAttribute="updateForm">
  <form:hidden path="userId" />
  <input type="submit" value="検索">
</form:form>
<div>
  <a href="menu">メニューに戻る</a>
</div>
</body>
</html>
