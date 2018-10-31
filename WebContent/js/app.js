var app = angular.module('myApp', [ "ngRoute","ui.bootstrap" ]);
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
					console.log($scope.newsItems);
					console.log($scope.newsItems.length);

					$location.path($scope.newsItems[0].categoryId+"");

				}, function errorCallback(response) {
					console.log(response);
					console.log("Error")

				});

			};
			
			$scope.getNewsDescription = function(itemId){
				
			}
			
			$scope.myInterval = 3000;
			  $scope.slides = [
				{
				  image: './images/NewsTitle/news1.jpg', msg:"పాకిస్థాన్‌కు భారత్‌  హెచ్చరిక"
				},
				{
				  image: './images/NewsTitle/news2.jpg', msg:"అమృతసర్‌లో రావణ దహనం వేడుక నిర్వాహకుడు వెల్లడి"
				},
				{
				  image: './images/NewsTitle/news3.jpg', msg:"అగ్రరాజ్యంలో మన భాషకు పెరుగుతున్న ఆదరణ"
				},
				{
				  image: './images/NewsTitle/news4.jpg', msg:"వీణతో శంకర్‌ మహదేవన్‌ పాటను మీటి ఫిదా చేసిన వీణా శ్రీవాణి"
				}
			  ];
			  
			  $scope.allItems = [
				{
				  image: './images/news_thumbnail3.jpg', msg:"బేడీలు వేయటం పొరపాటే: మంత్రి"
				},
				{
				  image: './images/news_thumbnail3.jpg', msg:"ట్రిపుల్ తలాఖ్ అంటే... ఉరిశిక్ష లాంటిదే: సీజే"
				},
				{
				  image: './images/news_thumbnail3.jpg', msg:"అగ్రరాజ్యంలో మన భాషకు పెరుగుతున్న ఆదరణ"
				},
				{
				  image: './images/news_thumbnail3.jpg', msg:"వీణతో శంకర్‌ మహదేవన్‌ పాటను మీటి ఫిదా చేసిన వీణా శ్రీవాణి"
				}	
			  
			  ]
			  
			  $scope.newslist = [
				{
				  image: './images/post_img1.jpg', msg:"బేడీలు వేయటం పొరపాటే: మంత్రి",pageId:1,title:"ప్రధాన వార్తలు"
				},
				{
				  image: './images/post_img2.jpg', msg:"ట్రిపుల్ తలాఖ్ అంటే... ఉరిశిక్ష లాంటిదే: సీజే",pageId:2,title:"ప్రధాన వార్తలు"
				},
				{
				  image: './images/post_img1.jpg', msg:"అగ్రరాజ్యంలో మన భాషకు పెరుగుతున్న ఆదరణ",pageId:3,title:"ప్రధాన వార్తలు"
				},
				{
				  image: './images/post_img2.jpg', msg:"వీణతో శంకర్‌ మహదేవన్‌ పాటను మీటి ఫిదా చేసిన వీణా శ్రీవాణి",pageId:4,title:"ప్రధాన వార్తలు"
				},
				{
				  image: './images/post_img1.jpg', msg:"వీణతో శంకర్‌ మహదేవన్‌ పాటను మీటి ఫిదా చేసిన వీణా శ్రీవాణి",pageId:5,title:"ప్రధాన వార్తలు"
				},
				{
				  image: './images/post_img2.jpg', msg:"వీణతో శంకర్‌ మహదేవన్‌ పాటను మీటి ఫిదా చేసిన వీణా శ్రీవాణి",pageId:6,title:"ప్రధాన వార్తలు"
				},
				{
				  image: './images/post_img1.jpg', msg:"వీణతో శంకర్‌ మహదేవన్‌ పాటను మీటి ఫిదా చేసిన వీణా శ్రీవాణి",pageId:7,title:"ప్రధాన వార్తలు"
				},
				{
				  image: './images/post_img2.jpg', msg:"వీణతో శంకర్‌ మహదేవన్‌ పాటను మీటి ఫిదా చేసిన వీణా శ్రీవాణి",pageId:8,title:"ప్రధాన వార్తలు"
				}	
			  
			  ]
			  
			  //Describsion page.

				$scope.redirectPage = function(id,title){
					console.log(id);
				  localStorage.setItem("heading", title);
				  //window.location = '/description/'+id;
				  $location.path( "/description/"+id );
				}
				
				$scope.redirectlist = function(){				  //localStorage.setItem("heading", title);
				  //window.location = '/description/'+id;
				  $location.path( "/newslist" );
				}

		});

/*
 * Routing Configuration
 */
app.config(function($routeProvider,$locationProvider) {
	$routeProvider.when("/", {
		templateUrl : "home.html",
		controller : 'homeController',
		publicAccess : true
	}).when("/description/:id", {
		templateUrl : "./description.html",
		controller : 'descriptionController',
		publicAccess : true
	}).when("/newslist", {
		templateUrl : "./newslist.html",
		controller : 'newslistController',
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
	 // use the HTML5 History API
      //  $locationProvider.html5Mode(true);
});