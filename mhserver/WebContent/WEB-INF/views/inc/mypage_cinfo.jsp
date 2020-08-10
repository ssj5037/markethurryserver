<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link rel="stylesheet" href="/mh/css/markethurryMyPage.css">

    <!-- 회원 정보 -->
    <div id="memberContain">
        <div style="display: inline-block; width: 760px; height: 170px; margin: 40px;">
            <div id="memberInfo">
                <div id="memberGrade">일반회원</div>
                <div style="width: 160px; height: 80px; text-align: left; margin: 45px 15px;">
                    <span id="memberName" class="txtInfo" style="margin-top: 10px; font-size: 1.3em; font-weight: bold;">신수진<small>님</small></span>
                    <span id="memberBenefits" class="txtInfo">0.5% 할인 + 0.5% 적립</span>
                </div>
                <div>
                    <input id="goAllGrade" type="button" value="전체 등급 보기" class="btnGrade" style="margin-bottom: 10px;">
                    <input id="goNextGrade" type="button" value="다음 달 예상 등급 보기" class="btnGrade">
                </div>
            </div>
            <div id="memberPoint">
                <div style="margin-bottom: 0px;">마일리지</div>
                <div id="goMyPoint" style="margin-top: 30px; font-size: 1.4em;">
                    <span style=" color: #08718E;">1,100 P</span>
                    <span style=" color: #aaaaaa;">></span>
                </div>
            </div>
        </div>
    </div>
    
    