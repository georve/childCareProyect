<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>BabyCare Web Application</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link href="<c:url value='/resources/assets/bootstrap/css/bootstrap.min.css' />"  rel="stylesheet"></link>
        <link href="<c:url value='/resources/assets/font-awesome/css/font-awesome.min.css' />"  rel="stylesheet"></link>
        <link href="<c:url value='/resources/assets/css/form-elements.css' />"  rel="stylesheet"></link>
        <link href="<c:url value='/resources/assets/css/style.css' />"  rel="stylesheet"></link>


        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link href="<c:url value='/resources/assets/ico/favicon.png' />"  rel="shortcut icon"></link>
        <link href="<c:url value='/resources/assets/ico/apple-touch-icon-144-precomposed.png' />" sizes="144x144" rel="apple-touch-icon-precomposed"></link>
        <link href="<c:url value='/resources/assets/ico/apple-touch-icon-114-precomposed.png' />" sizes="114x114" rel="apple-touch-icon-precomposed"></link>
        <link href="<c:url value='/resources/assets/ico/apple-touch-icon-72-precomposed.png' />" sizes="72x72" rel="apple-touch-icon-precomposed"></link>
        <link href="<c:url value='/resources/assets/ico/apple-touch-icon-57-precomposed.png' />" rel="apple-touch-icon-precomposed"></link>
        


    </head>

    <body>

        <!-- Top content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                            <h1><strong>Baby Care Web App</strong></br> Login Form</h1>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 form-box">
                        <!-- message to be shown -->
                        <c:if test="${not empty message}">
                        	<div class="alert alert-warning">
                        	    <div class="container">
                        	       <b>Oups....</b>${message}
                        	    </div>
                        	
                        	</div>
                        
                        </c:if>
                        	<div class="form-top">
                        		<div class="form-top-left">
                        			<h3>Login to our site</h3>
                            		<p>Enter your username and password to log on:</p>
                            		<strong style="color: red">${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"]}</strong>
                        		</div>
                        		<div class="form-top-right">
                        			<i class="fa fa-key"></i>
                        		</div>
                            </div>
                            <div class="form-bottom">
			                    <form role="form" action="<c:url value='j_spring_security_check' />" method="post" class="login-form"  authentication-failure-handler-ref="authenticationFailureHandler">
			                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			                    	<div class="form-group">
			                    		<label class="sr-only" for="username">Username</label>
			                        	<input type="text" name="username" placeholder="Username..." class="form-control" id="form-username">
			                        </div>
			                        <div class="form-group">
			                        	<label class="sr-only" for="password">Password</label>
			                        	<input type="password" name="password" placeholder="Password..." class="form-control" id="form-password">
			                        </div>
			                        <button type="submit" class="btn">Sign in!</button>
			                    </form>
		                    </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-sm-offset-3 social-login">
                        	<h3>...or login with:</h3>
                        	<div class="social-login-buttons">
	                        	<a class="btn btn-link-1 btn-link-1-facebook" href="#">
	                        		<i class="fa fa-facebook"></i> Facebook
	                        	</a>
	                        	<a class="btn btn-link-1 btn-link-1-twitter" href="#">
	                        		<i class="fa fa-twitter"></i> Twitter
	                        	</a>
	                        	<a class="btn btn-link-1 btn-link-1-google-plus" href="#">
	                        		<i class="fa fa-google-plus"></i> Google Plus
	                        	</a>
                        	</div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>


        <!-- Javascript -->
        <script src="<c:url value="/resources/assets/js/jquery-1.11.1.min.js"/>"></script>
        <script src="<c:url value="/resources/assets/bootstrap/js/bootstrap.min.js"/>"></script>
        <script src="<c:url value="/resources/assets/js/jquery.backstretch.min.js"/>"></script>
        <script src="<c:url value="/resources/assets/js/scripts.js"/>"></script>

        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>

</html>