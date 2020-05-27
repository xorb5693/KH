<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="/css/style.css?after" rel="stylesheet" type="text/css">
<script type='text/javascript' src='http://code.jquery.com/jquery-3.3.1.js'></script>
<header class="header">
    <div class="left">
        <a href="/main">A_CLASS</a>
    </div>
    <div class="right">
        <a href="/main">
            <img src="/img/logo/${sessionScope.company.companyLogo }">
            MY PAGE
        </a>
        <a href="/logout">LOGOUT</a>
    </div>
</header>