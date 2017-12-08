var app = angular.module('myApp', []);
app.controller('customersCtrl', function($scope, $http) {
  
	console.log("App.js Controller")
	
	
	$http({
	    method : 'GET',
	    url : 'rest/category/getCategories'
	}).then(function successCallback(response) {
	    $scope.employees = response.data.employees;
	    console.log($scope.employees);
	}, function errorCallback(response) {
	    console.log(response.statusText);
	});
	
});