<%@page import="com.util.HmitUtil"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title></title>
    <style type="text/css">@import "../css/global.css";</style>
</head>
<body>
<div class="Header">
    <div class="HeaderTop">

        <img src="../images/logo/logo.png" class="Logo" style="width: 110px;height: 40px;" />
        <div class="Bulletin">
        <marquee direction="left" onmouseover="this.stop()" onmouseout="this.start()" scrollamount="3">
            &nbsp;欢迎进入汇民CRM系统
        </marquee>
     </div>
        <ul>
            <li class="ricond">
                <a href="#">个人中心</a>
            </li>
            <li class="riconf">
                <a href="#">注销</a>
            </li>
        </ul>

    </div>
    <div class="Menu">
        <ul>
            <li class="Home">
                <img src="../images/logo/home.png" style="width:16px;height:16px;" border="0" />
            </li>
            <li>
                <a href="#">首页</a></li>
            </li>
            <li>
                <a href="#">客户</a>
            </li>
            <li>
                <a href="#">项目</a>
                <ul>
                    <li><a href="#">项目</a></li>

                    <li><a href="#">项目进度</a></li>

                </ul>
            </li>
            <li>
                <a href="#">财务</a>
                <ul>
                    <li><a href="#">销售发票</a></li>

                    <li><a href="#">采购发票</a></li>

                    <li><a href="#">收款单</a></li>

                    <li><a href="#">付款单</a></li>
                    <li><a href="#">付款计划</a></li>

                    <li><a href="#">汇款计划</a></li>

                </ul>
            </li>
            <li>
                <a href="#">采购</a>
                <ul>
                    <li><a href="#">供应商</a></li>
                    <li><a href="#">采购订单</a></li>
                </ul>
            </li>

            <li>
                <a href="#" >报表</a>
            </li>
        </ul>



    </div>

</div>
</body>
</html>