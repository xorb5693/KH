<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>API 테스트</title>
    <script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    <script src="https://openapi.map.naver.com/openapi/v3/maps.js?ncpClientId=vbwzojnjmc&submodules=geocoder"></script>
    <script src="https://cdn.iamport.kr/js/iamport.payment-1.1.5.js"></script>
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

        <h2>3. 결제모듈(i'mport)</h2>
        <div id="pay">
            <h4>
                <label><input type="checkbox" value="1000">1000원</label>
                <label><input type="checkbox" value="5000">5000원</label>
                <label><input type="checkbox" value="10000">10000원</label>
                <label><input type="checkbox" value="50000">50000원</label>
            </h4>
            <h4>총 결제 금액 : <span></span></h4>
            <button class="btn btn-danger">결제하기</button>
            <p id="paymentResult"></p>
        </div>

        <h2>4. 영화 순위 검색</h2>
        <input type="text" id="movie" class="form-control" style="width: 200px; display:inline-block;" placeholder="ex.20200507">
        <button id="movieBtn" class="btn btn-primary">영화 순위 검색</button>
        <div id="movieResult"></div>

        <h2>5. LOL 전적검색</h2>
        <input type="text" id="lol" class="form-control" style="width: 200px; display:inline-block;" placeholder="소환사명 입력">
        <button id="lolBtn" class="btn btn-primary">전적 검색</button>
        <p id="lolResult"></p>

        <h2>6. 메일보내기</h2>
        <input type="text" id="mail" class="form-control" style="width: 300px; display: inline;">
        <button id="mailBtn" class="btn btn-primary">메일전송</button><br>
        <input type="text" id="mailCode" style="display: none; width: 300px;" class="form-control">
        <button id="mailResult" class="btn btn-primary" style="display: none;">메일확인</button><br>
        <span id="mailMsg"></span>
    </section>
    <style>
        .form-control {
            display: inline-block;
        }

    </style>
    <script>
        function addrSearch() {
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
            var marker = new naver.maps.Marker({
                position: new naver.maps.LatLng(37.533807, 126.896772),
                map: map
            });

            //최초 중심지의 주소
            var contentString = [
                "<div class='iw_inner'>",
                "   <h3>KH정보교육원</h3>",
                "   <p>서울시 영등포구 선유로 2동 57 이레빌딩 19F</p>",
                "</div>"
            ].join("");

            var infoWindow = new naver.maps.InfoWindow();
            naver.maps.Event.addListener(marker, "click", function(e) {
                if (infoWindow.getMap()) {
                    infoWindow.close();
                } else {
                    infoWindow = new naver.maps.InfoWindow({
                        content: contentString
                    });

                    infoWindow.open(map, marker);
                }
            });

            naver.maps.Event.addListener(map, "click", function(e) {
                marker.setPosition(e.coord);
                if (infoWindow != null) {
                    if (infoWindow.getMap()) {
                        infoWindow.close();
                    }
                }

                naver.maps.Service.reverseGeocode({
                    location: new naver.maps.LatLng(e.coord.lat(), e.coord.lng())
                }, function(status, response) {
                    if (status !== naver.maps.Service.Status.OK) {
                        return alert("못찾겠어");
                    }

                    var result = response.result;

                    items = result.items;
                    address = items[2].address;
                    contentString = [
                        "<div class='iw_inner'>",
                        "   <p>" + address + "</p>",
                        "</div>"
                    ].join("");
                });
            });

            var totalPay = 0;
            $("#pay input").change(function() {
                if ($(this).is(":checked")) {
                    totalPay += Number($(this).val());
                } else {
                    totalPay -= Number($(this).val());
                }

                $("#pay span").html(totalPay);
            });

            $("#pay button").click(function() {
                var price = $("#pay span").html();
                //                console.log($("#pay span").html());
                var d = new Date();
                var date = d.getFullYear() + "" + (d.getMonth() + 1) + "" + d.getDate() + "" + d.getHours() + "" + d.getMinutes() + "" + d.getSeconds();
                IMP.init("imp19457973");
                IMP.request_pay({
                    merchant_uid: '상품명_' + date,
                    name: '결제테스트',
                    amount: price,
                    buyer_email: 'test@naver.com',
                    buyer_name: '박태규',
                    buyer_tel: '010-1111-1111',
                    buyer_addr: '타워펠리스',
                    buyer_postcode: '01234'
                }, function(rsp) {
                    if (rsp.success) {
                        var msg = "결제가 완료되었습니다.";
                        var r1 = "고유 ID : " + rsp.imp_uid;
                        var r2 = "상점 거래 아이디 : " + rsp.merchant_uid;
                        var r3 = "결제 금액 : " + rsp.paid_amount;
                        var r4 = "카드 승인번호 : " + rsp.apply_num;
                        $("#paymentResult").html(msg + "<br>" + r1 + "<br>" + r2 + "<br>" + r3 + "<br>" + r4);
                    } else {
                        $("#paymentResult").html('에러내용 : ' + rsp.error_msg);
                    }
                });
            })

            $("#movieBtn").click(function() {
                var targetDt = $("#movie").val();

                $.ajax({
                    url: "/movie",
                    type: "get",
                    data: {
                        targetDt: targetDt
                    },
                    success: function(data) {
                        var html = "";
                        for (var i = 0; i < data.length; i++) {
                            html += "순위 : " + data[i]['rank'] + "<br>";
                            html += "영화명 : " + data[i]['movieNm'] + "<br><br>";
                        }

                        $("#movieResult").html(html);
                    }
                });
            });

            $("#lolBtn").click(function() {
                var id = $("#lol").val();
                $.ajax({
                    url: "/lolSearch",
                    type: "get",
                    data: {
                        id: id
                    },
                    success: function(data) {
                        var html = "";
                        html += "소환사명 : " + data[0]['summonerName'] + "<br>";
                        html += "솔로랭크 : " + data[0]['tier'] + data[0]['rank'] + "<br>";
                        html += "전적<br>";
                        html += "WIN : " + data[0]['wins'] + "승<br>";
                        html += "LOSS : " + data[0]['losses'] + "패";

                        $("#lolResult").html(html);
                    }
                });
            });

            var mailCode = "";

            $("#mailBtn").click(function() {
                var email = $("#mail").val();

                $.ajax({
                    url: "/sendMail",
                    type: "post",
                    data: {
                        email: email
                    },
                    success: function(data) {
                        $("#mailCode").show();
                        $("#mailResult").show();
                        mailCode = data;
                    }
                });
            });
            
            $("#mailResult").click(function() {
                if ($("#mailCode").val() == mailCode) {
                    $("#mailMsg").html("인증 성공");
                    $("#mailMsg").css("color", "green")
                } else {
                    $("#mailMsg").html("인증 실패");
                    $("#mailMsg").css("color", "red")
                }
            });
        }

    </script>
</body>

</html>
