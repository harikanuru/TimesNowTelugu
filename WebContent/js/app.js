var app = angular.module('myApp', [ "ngRoute" ]);
app.controller('customersCtrl', function($rootScope, $scope, $http) {

	console.log("App.js Controller")

	$scope.addNewsItem = function(news) {

		var newsItem = {
			"categoryId" : news.category,
			"news" : news.matter,
			"heading" : news.heading
		}

		$http({
			method : 'POST',
			data : newsItem,
			url : 'rest/item/addItem'
		}).then(function successCallback(response) {
			console.log(response);
		}, function errorCallback(response) {
			console.log(response.statusText);
		});

	};
});

app.controller('homeController',
		function($rootScope, $scope, $http, $location) {

			$http({
				method : 'GET',
				url : 'rest/category/getCategories'
			}).then(function successCallback(response) {
				$scope.categories = response.data;

			}, function errorCallback(response) {
				console.log(response);
			});

			$http({
				method : 'GET',
				url : 'rest/item/getItems'
			}).then(function successCallback(response) {
				$scope.mainItems = response.data;
				console.log(response);

			}, function errorCallback(response) {
				console.log(response);
			});

			$scope.getItemsByCateogry = function(categoryId) {
				console.log(categoryId);

				var data = {
					"categoryId" : categoryId
				}
				$http({
					method : 'POST',
					url : 'rest/item/getItemsByCategory',
					data : data

				}).then(function successCallback(response) {
					$scope.newsItems = response.data;
                    console.log($scope.newsItems[0]);
					$location.path($scope.newsItems[0].categoryId+"");

				}, function errorCallback(response) {
					console.log(response);
					console.log("Error")

				});

			};

		});

/*
 * Routing Configuration
 */
app.config(function($routeProvider) {
	$routeProvider.when("/", {
		templateUrl : "home.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/3", {
		templateUrl : "andhrapradesh.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/4", {
		templateUrl : "telangana.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/2", {
		templateUrl : "national.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/1", {
		templateUrl : "international.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/7", {
		templateUrl : "sports.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/6", {
		templateUrl : "study.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/5", {
		templateUrl : "jobs.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/8", {
		templateUrl : "movies.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/homepage", {
		templateUrl : "home.html",
		controller : 'homeController',
		publicAccess : true
	}).otherwise({
		redirectTo : 'index.html',
		controller : 'homeController',
		publicAccess : true
	});
});