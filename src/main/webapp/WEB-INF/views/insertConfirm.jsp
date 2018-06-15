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
<title>登録確認画面</title>
<link href="/css/commons.css" rel="stylesheet">
</head>
<body>
<p>これでよろしいですか？</p>

<c:if test="${not empty errmsg}">
  <p class="error">${fn:escapeXml(errmsg)}</p>
</c:if>

<form:form action="insert" method="post" modelAttribute="insertForm">
  <fieldset class="label-110">
    <div>
      <label>名前</label><form:input path="name" readonly="true" />
    </div>
    <div>
      <label>TEL</label><form:input path="tel" readonly="true" />
    </div>
    <div>
      <label>PASS（再入力）</label><form:password path="confirmPassword" />
    </div>
  </fieldset>
  <div>
    <input type="submit" name="button" value="登録">
    <input type="submit" name="button" value="戻る" onclick="location.href='insertBack'; return false;">
  </div>
</form:form>
<div>
  <a href="menu">メニューに戻る</a>
</div>
</body>
</html>
