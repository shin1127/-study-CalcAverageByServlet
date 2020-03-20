<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "average.Number" %>

<%
// リクエストスコープに保存されたNumberインスタンスを取得する
Number number = (Number) request.getAttribute("average");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>平均値算出結果</title>
</head>
<body>

<h1>平均値算出の結果</h1>
<p>
変数1：<%= number.getFirstNumber() %><br>
変数2：<%= number.getSecondNumber() %><br>
変数3：<%= number.getThirdNumber() %>
</p>
平均値：<%= number.getAverage() %>

</body>
</html>
