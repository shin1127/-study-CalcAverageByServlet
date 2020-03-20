<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>平均値を算出する</title>
</head>
<body>
<h1>平均値算出</h1>
<form action="/outputTest/Average" method="post">
変数1：<input type="text" name="first"><br>
変数2：<input type="text" name="second"><br>
変数3：<input type="text" name="third"><br>
<input type="submit" value="算出">
</form>
</body>
</html>
