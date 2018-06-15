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
<title>検索結果画面</title>
<link href="/css/commons.css" rel="stylesheet">
</head>
<body>
<table>
  <caption>検索結果</caption>
  <thead>
    <tr>
      <th>ID</th>
      <th>名前</th>
      <th>TEL</th>
    </tr>
  </thead>
  <tbody>
    <c:forEach items="${userlist}" var="user">
      <tr>
        <td>${fn:escapeXml(user.userId)}</td>
        <td>${fn:escapeXml(user.userName)}</td>
        <td>${fn:escapeXml(user.telephone)}</td>
      </tr>
    </c:forEach>
  </tbody>
</table>
<div>
  <a href="menu">メニューに戻る</a>
</div>
</body>
</html>
