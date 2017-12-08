<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TimesNowTelugu</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.0rc1/angular-route.min.js?v=1"></script>

<script src="js/app.js"></script>
<script src="js/services.js"></script>
<script src="js/dashboard.js"></script>
<style>

</style>
</head>
<body ng-app="myApp" class="bg-1">
	Í
		<div ng-view ></div>
	<div class="container" ng-controller="loginController">
		<div class="row" />
		<div style="margin-top: 100px">

			<div class="row">
				<center>
					<img src="images/times.jpg" style="margin-top: 30px"
						class="img-circle" alt="Bird" width="100" height="100">
				</center>
				<center>
					<h1>Login</h1>
				</center>
				<div class="row">
					<div class="col-sm-3"></div>
					<div class="col-sm-6  form-group">
						<br> <br>
						<form name="loginform" class="form-horizontal"
							ng-submit="loginUser()">
							<div class="form-group">
								<input class="form-control" type="text" data-ng-model="username"
									name="username" placeholder="Username" /> <br> <input
									class="form-control" type="password" data-ng-model="password"
									name="password" placeholder="Password" /> <br> <br>
								<br>
								<center>
									<input type="submit" id="submit" value="Submit" />
								</center>
							</div>
						</form>
					</div>
					<div class="mt-2 col-md-12"></div>
				</div>
			</div>

			<div class="row">
				</del>
			</div>
		</div>
	</div>
</body>
</html>