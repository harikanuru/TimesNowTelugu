<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.4/angular.min.js"></script>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


<script src="js/app.js"></script>
</head>
<body ng-app="myApp">

	<div class="container" ng-controller="customersCtrl">
		<center>
			<h2>News POST</h2>
		</center>

		<form ng-submit="addNewsItem(news)">
			<div class="form-group">
				<label for="inputdefault">Heading</label> <input
					class="form-control" id="inputdefault" ng-model="news.heading"
					type="text">
			</div>

			<div class="form-group">
				<label for="sel2">input-lg</label> <select
					class="form-control input-lg" id="sel2" ng-model="news.category">
					<option ng-repeat="category in categories"
						value={{category.categoryId}}>{{category.categoryName}}</option>

				</select>
			</div>

			<div class="form-group">
				<label for="comment">News:</label>
				<textarea class="form-control" rows="5" id="comment"
					ng-model="news.matter"></textarea>
			</div>
			<div class="form-group">
				<input type="submit" class="btn btn-info" value="Submit Button">
			</div>


		</form>
	</div>

</body>
</html>
