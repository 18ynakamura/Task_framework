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
<title>更新画面</title>
<link href="/css/commons.css" rel="stylesheet">
</head>
<body>
<p>更新を行うデータのIDを入力してください<br>
<span class="required"></span>は必須です</p>

<c:if test="${not empty errmsg}">
  <p class="error">${fn:escapeXml(errmsg)}</p>
</c:if>

<form:form action="updateInput" method="post" modelAttribute="updateForm">
  <fieldset>
    <div>
      <label class="required">ID</label><form:input path="userId" />
    </div>
  </fieldset>
  <input type="submit" value="確認">
</form:form>
<div>
  <a href="menu">メニューに戻る</a>
</div>
</body>
</html>
