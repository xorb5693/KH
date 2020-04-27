<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script type="text/javascript" src="/js/jquery-3.3.1.js"></script>
<link rel="stylesheet" href="/css/bootstrap.css">
<link rel="stylesheet" href="/css/header/style.css">
<link rel="stylesheet" href="/css/header/responsive.css">
<script type="text/javascript" src="/js/bootstrap.js"></script>

<header class="header_area">
	<div class="main_menu">
		<nav class="navbar navbar-expand-lg navbar-light">
			<div class="container">
				<a class="navbar-brand log_h" href="/index.jsp">
					<img src="/img/logo.png" width="165" height="80">
					<!-- 좌측 상단 로고 이미지 -->
				</a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expended="false" aria-label="Toggle navigation">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <div class="collapse navbar-collapse offset" id="navbarSupportedContent">
                    <ul class="nav navbar-nav menu_nav ml-auto">
                        <li class="nav-item">
                            <a class="nav-link" href="#">Menu1</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Menu2</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Menu3</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Menu4</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Menu5</a>
                        </li>
                    </ul>
                </div>
                <div class="right-button">
                    <ul>
                        <c:if test="${empty sessionScope.member }">
                        	<li class="nav-item">
                        		<button class="btn btn-danger" onclick="location.href='/loginFrm';">로그인</button>
                        		<button class="btn btn-danger">회원가입</button>
                        	</li>
                        </c:if>
                        <c:if test="${not empty sessionScope.member }">
                        	<li class="nav-item">
                        		<button class="btn btn-danger">${sessionScope.member.memberName }</button>
                        		<button class="btn btn-danger">로그아웃</button>
                        	</li>
                        </c:if>
                    </ul>
                </div>
			</div>
		</nav>
	</div>
</header>