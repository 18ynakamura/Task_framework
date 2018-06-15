<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>削除結果確認画面</title>
<link href="/css/commons.css" rel="stylesheet">
</head>
<body>
<p>実行者：${fn:escapeXml(user.adminName)}</p>
<p>正常に削除されました</p>
<form action="select">
  <input type="submit" value="検索">
</form>
<div>
  <a href="menu">メニューに戻る</a>
</div>
</body>
</html>
