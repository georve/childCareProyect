<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page session="true"%>
<%-- <%@page contentType="text/html" pageEncoding="UTF-8"%> --%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
 
<c:set var="url" value="${pageContext.request.contextPath}"></c:set>

<c:url value="/j_spring_security_logout" var="logoutUrl" />


 <!doctype html>
 <html class="no-js" lang="en">
 <head>
     <meta charset="utf-8">
     <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
     <link rel="icon" type="image/png" href="${url}/resources/assets/img/favicon.ico">
     <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
     <meta name="viewport" content="width=device-width" />

	 <title>
		<dec:title default="BabyCare Application" />
	 </title>
     <!--global css goes here...-->
         <!-- Bootstrap core CSS     -->
    <link href="${url}/resources/assets/bootstrap/css/bootstrap.min.css" rel="stylesheet" />

    <!-- Animation library for notifications   -->
    <link href="${url}/resources/assets/css/animate.min.css" rel="stylesheet"/>
    
    <!--  Light Bootstrap Table core CSS    -->
    <link href="${url}/resources/assets/css/light-bootstrap-dashboard.css" rel="stylesheet"/>
    
    
    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="${url}/resources/assets/css/demo.css" rel="stylesheet" />
    
        
    <!--     Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'>
    <link href="${url}/resources/assets/css/pe-icon-7-stroke.css" rel="stylesheet" />
 
     <dec:head />
 </head>
 <body>
<!-- <div class="container bs-docs-container"> -->
<!--     <div id="m_header">             -->
<%--     	<%@ include file="header.jsp"%>   --%>
<!--     </div>        		     -->
<!--     /header -->
<!--     <div id="m_menu_top">             -->
<%--     	<%@ include file="menu-top.jsp"%>   --%>
<!--     </div> -->
<!--     /top menu -->
<!--     <div id="m_container"> -->
<!--     	if not using sidebar, only add <dec:body /> in here -->
<!--     	<div id="content"> -->
<!-- 	 		<div class="row"> -->
<!-- 	 			<div class="col-sm-8"> -->
<%-- 	 				<dec:body /> --%>
<!-- 		   		</div> -->
<!-- 		   		<div class="col-sm-4" style="border-left: 1px solid #fff; min-height: 300px;"> -->
<%-- 		   			<%@ include file="sidebar.jsp"%> --%>
<!-- 		   		</div> -->
<!-- 	 		</div>	 	    -->
<!-- 		</div>         -->
<!--     </div> -->
<!--     /main -->
<!--     <div id="m_footer"> -->
<%-- 		<%@ include file="footer.jsp"%> --%>
<!--     </div> -->
<!--     /footer -->
<!-- </div> -->
<div class="wrapper">
	<div id="menu">
		<%@ include file="menu.jsp"%>
	</div>
	<div class="main-panel">
	   <div id="menu_header">
	       <%@ include file="menu_top.jsp"%>
	   </div>
	   <div id="content">
	        <dec:body />
	   </div>
	   <div id="footer">
	      <%@ include file="footer.jsp"%>
	   </div>
	
	</div>


</div>
 
    
    

 </body>
 <!--   Core JS Files   -->
    <script src="${url}/resources/assets/js/jquery-1.11.1.js" type="text/javascript"></script>
	<script src="${url}/resources/assets/bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
	
	<!--  Checkbox, Radio & Switch Plugins -->
	<script src="${url}/resources/assets/bootstrap/js/bootstrap-checkbox-radio-switch.js"></script>
	
	<!--  Charts Plugin -->
	<script src="${url}/resources/assets/js/chartist.min.js"></script>

    <!--  Notifications Plugin    -->
    <script src="${url}/resources/assets/bootstrap/js/bootstrap-notify.js"></script>
    
    <!--  Google Maps Plugin    -->
    <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?sensor=false"></script>
	
    <!-- Light Bootstrap Table Core javascript and methods for Demo purpose -->
	<script src="${url}/resources/assets/js/light-bootstrap-dashboard.js"></script>
	
	<!-- Light Bootstrap Table DEMO methods, don't include it in your project! -->
	<script src="${url}/resources/assets/js/demo.js"></script>
	
    <script type="text/javascript"> 
     	$(document).ready(function(){
        	
        	demo.initChartist();
        	
//         	$.notify({
//              	icon: 'pe-7s-gift',
//              	message: "Welcome to <b>Light Bootstrap Dashboard</b> - a beautiful freebie for every web developer."
            	
//              },{
//                  type: 'info',
//                  timer: 4000
//              });
            
     	});
 </script>

</html>


