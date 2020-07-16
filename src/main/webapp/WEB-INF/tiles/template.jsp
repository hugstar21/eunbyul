<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html lang="kr">
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="x-ua-compatible" content="ie=edge">
	
		<title><spring:eval expression="@config['site.title']"/></title>
	
		<!-- Font Awesome Icons -->
		<link rel="stylesheet" href="/resources/plugins/fontawesome-free/css/all.min.css">
		<!-- overlayScrollbars -->
		<link rel="stylesheet" href="/resources/plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
		<link rel="stylesheet" href="/resources/plugins/bootstrap-datepicker/css/bootstrap-datepicker3.standalone.min.css">
		<!-- Theme style -->
		<link rel="stylesheet" href="/resources/css/adminlte.css">
		<link rel="stylesheet" href="/resources/css/ams.css">
			
		<link rel="shortcut icon" href="/resources/img/favicon.ico">
		
		<!-- REQUIRED SCRIPTS -->
		<!-- jQuery -->
		<script src="/resources/plugins/jquery/jquery.min.js"></script>
		<!-- Bootstrap -->
		<script src="/resources/plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
		<!-- overlayScrollbars -->
		<script src="/resources/plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
		<!-- ChartJS -->
		<script src="/resources/plugins/chart.js/Chart.min.js"></script>
		<script src="/resources/plugins/bootstrap-datepicker/js/bootstrap-datepicker.min.js"></script>
		<!-- AdminLTE App -->
		<script src="/resources/js/adminlte.js"></script>
		
		<!-- jQuery Mapael -->
		<script src="/resources/plugins/jquery-mousewheel/jquery.mousewheel.js"></script>
		<script src="/resources/plugins/raphael/raphael.min.js"></script>
		
		<script src="/resources/js/ams.js"></script>
	
	</head>
	
	<body>
    <div style="width:100%; height:100%;">
    <div id="header"><tiles:insertAttribute name="header" /></div>
    <div id="left"><tiles:insertAttribute name="left" /></div>
    <div id="main"><tiles:insertAttribute name="body" /></div>    
    <div id="footer"><tiles:insertAttribute name="footer" /></div>
    </div>
 
    <script type="text/javascript">
        $(function() {
 
        });    
    </script>    
</body>
</html>
