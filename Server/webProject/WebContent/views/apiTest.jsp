<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>API 테스트</title>
    <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    <script src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=vbwzojnjmc"></script>
</head>

<body>
    <jsp:include page="/WEB-INF/views/common/header.jsp" />
    <section class="container">
        <h2>1. 다음(카카오) 주소찾기 API</h2>
        <ul>
            <li>
                <input type="text" id="postCode" style="width: 200px; display: inline-block;" class="form-control" placeholder="우편번호" readonly>
                <button id="addrSearchBtn" onclick="addrSearch();" class="btn btn-primary">주소검색</button>
            </li>
            <li>
                <input id="roadAddr" style="width: 400px; display: inline-block;" type="text" class="form-control" placeholder="도로명주소">
                <input id="jibunAddr" style="width: 400px; display: inline-block;" type="text" class="form-control" placeholder="지번주소">
            </li>
            <li>
                <input id="detailAddr" style="width: 803px; display: inline-block;" type="text" class="form-control" placeholder="상세주소">
            </li>
        </ul>
        
        <h2>2. 네이버지도</h2>
        <div id="map" style="width: 100%; height: 500px;"></div>
    </section>
    <script>
        function addrSearch () {
            new daum.Postcode({
                oncomplete: function(data) {
                    // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분입니다.
                    // 예제를 참고하여 다양한 활용법을 확인해 보세요.
                    $("#postCode").val(data["zonecode"]);
                    $("#roadAddr").val(data["roadAddress"]);
                    $("#jibunAddr").val(data["jibunAddress"]);
                }
            }).open();
        }
        
        window.onload = function() {
            var map = new naver.maps.Map('map', {
                center: new naver.maps.LatLng(37.533807, 126.896772),
                zoom: 17,
                zoomControl: true,
                zoomControlOptions: {
                    position: naver.maps.Position.TOP_RIGHT,
                    style: naver.maps.ZoomControlStyle.SMALL
                }
            });
        }
    </script>
</body>

</html>
