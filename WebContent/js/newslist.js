app.controller('newslistController',
		function($rootScope, $scope, $http, $location) {
		$scope.titleName=localStorage.getItem("heading");
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
			$scope.redirectPage = function(id,title){
					console.log(id);
				  localStorage.setItem("heading", title);
				  //window.location = '/description/'+id;
				  $location.path( "/description/"+id );
				}
		
		});