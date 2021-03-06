<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link href="/resources/css/style.css?after" rel="stylesheet" type="text/css">
<script type='text/javascript' src='http://code.jquery.com/jquery-3.3.1.js'></script>
    
<nav class="menuArea">
    <h1>Welcome</h1>
    <div class="menuList">
        <div>
            <a href="/board.do?boardType=1&reqPage=1">Notice</a>
        </div>
        <div>
            <a href="/board.do?boardType=2&reqPage=1">우리회사게시판</a>
        </div>
        <div>
            <a href="/board.do?boardType=3&reqPage=1">자유게시판</a>
        </div>
        <div>
            <a href="#">익명게시판</a>
        </div>
    </div>
</nav>
<script>
    $(function() {
        $(".menuButton>button").click(function() {
            if ($("nav").hasClass("hide")) {
                $("nav").animate({
                    marginLeft: "0px"
                }, 300);
                $("nav").removeClass("hide");
            } else {
                $("nav").animate({
                    marginLeft: "-200px"
                }, 300);
                $("nav").addClass("hide");
                $(".main").removeClass("showMenu");
            }
        });
        
        var loc = location.href;
        var menuList = $(".menuList>div>a");

        if(loc.includes("/board.do")) {
            menuList.eq(${boardType} - 1).addClass("select");
        } 
    });
</script>