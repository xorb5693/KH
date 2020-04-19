/**
 * 
 */

$(function () {
    $(window).scroll(function () {
        if ($(this).scrollTop() > 100) {
            $(".upper").fadeIn(300);
        } else {
            $(".upper").fadeOut(300);
        }
    });

    $(".upper").click(function () {
        $("html, body").animate({
            scrollTop: 0
        }, 400);
        return false;
    });
    
    $(".bjh_logo").children("img").click(function () {
        location.href = "./animal_main.html";
    });
    
    $(".bjh_navigation>ul>li>a").click(function() {
        $(this).siblings("ul").children("li").eq(0).click();
    });
    
    $(".bjh_sub>li").hover(function() {
        $(this).css("opacity", "1.0");
    }, function() {
        $(this).css("opacity", "0.5");
    });
    
    $(".bjh_sub>li").click(function() {
        var index = $(".bjh_sub>li").index($(this));
        
        switch(index) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                location.href="./comexplain.html";
                break;
            case 3:
                location.href="./alliance_company.html";
                break;
            case 4:
                location.href="./Affiliation.html";
                break;
            case 5:
                location.href="./pickboard.html";
                break;
            case 6:
                location.href="./pickBoard_writing.html";
                break;
            case 7:
                location.href="./d_day_counter.html";
                break;
            case 8:
                location.href="./dog_goods.html";
                break;
            case 9:
                location.href="./cat_goods.html";
                break;
            case 10:
                location.href="./jq_11SemiPro.html";
                break;
            case 11:
                location.href="./jq_13SemiPro.html";
                break;
            case 12:
                location.href="./board.html";
                break;
            case 13:
                location.href="./noticeWrite.html";
                break;
        }
    });
});