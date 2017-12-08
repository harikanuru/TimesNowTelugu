var app = angular.module('myApp', [ "ngRoute" ]);
app.controller('customersCtrl', function($rootScope, $scope, $http) {

	console.log("App.js Controller")

	$scope.addNewsItem = function(news) {

		console.log(news.category);
		console.log(news.matter);
		console.log(news.heading);

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

		$http({
			method : 'GET',
			url : 'rest/category/getCategories'
		}).then(function successCallback(response) {
			$scope.categories = response.data;
			console.log($scope.categories[0].categoryName)

		}, function errorCallback(response) {
			console.log(response.statusText);
		});

	};
});

app.controller('homeController', function($rootScope, $scope, $http) {

	console.log("home Controller")

	$http({
		method : 'GET',
		url : 'rest/category/getCategories'
	}).then(function successCallback(response) {
		$scope.categories = response.data;
		console.log($scope.categories);
		console.log($scope.categories[0].categoryName)

	}, function errorCallback(response) {
		console.log(response.statusText);
	});

});

/*
 * Routing Configuration
 */
app.config(function($routeProvider) {
	$routeProvider.when("/", {
		templateUrl : "home.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/andhra", {
		templateUrl : "andhrapradesh.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/telangana", {
		templateUrl : "telangana.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/national", {
		templateUrl : "national.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/international", {
		templateUrl : "international.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/sports", {
		templateUrl : "sports.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/study", {
		templateUrl : "study.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/jobs", {
		templateUrl : "jobs.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/movies", {
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