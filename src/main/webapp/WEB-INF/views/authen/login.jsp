<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="/WEB-INF/views/layouts/admin/tablib.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0"/>
<link rel="stylesheet" href="<c:url value ="/assets/css/style.css"/>"/>
<link rel="stylesheet" href="<c:url value ="/assets/css/responsive.css"/>"/>
<link rel="stylesheet" href="<c:url value ="/assets/css/grid.css"/>"/>
<link rel="stylesheet" href="<c:url value ="/assets/css/toast.css"/>"/>
<link rel="stylesheet" href="<c:url value ="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"/>" integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA==" crossorigin="anonymous" />

<title>Đăng nhập</title>
</head>
<body>
<div class="main">
<div id="toast"></div>
  <form:form class="form l-12 c-12" id="form-1" action="/ProjectSmartphoneMVC/authen/login" method="POST" modelAttribute="userLogin">
      <h3 class="heading">Đăng nhập tài khoản</h3>
       <div class="spacer"></div>
       <div style="color: red;text-align:center;">${status}</div>
    <div class="form-group c-12 ">
        <label for="fullname" class="form-label">Tên tài khoản: </label>
        <form:input name="username" type="text" required="true" placeholder="VD: trantoi" class="form-control" path="userName"/>
        <span class="form-message"></span>
    </div>

    <div class="form-group c-12">
        <label for="password" class="form-label">Nhập mật khẩu: </label>
        <form:input name="password" required="true" type="password" minlength="6"  class="form-control" path="password"/>
        <span class="form-message"></span>
    </div>
    <div class="form-dangki c-12">
        <a href="<c:url value = "/authen/register"/>" class="form-dangki-link">Đăng kí tài khoản</a>
    </div>
    <button type="submit" class="form-submit">Đăng nhập</button>
  </form:form>
 
<script src= "../../Javascript/Toast_mes.js"></script>
</div>

</body>
</html>