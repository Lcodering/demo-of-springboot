app.controller("registerCtrl",function($rootScope,$scope,$http){
	
	$rootScope.isLandingPage = false;
	//用户名是否存在的标志
	$scope.usernameValid = true;
	//邮箱是否有意义标志
	$scope.emailValid = true;
	//手机号是否有意思标志
	$scope.phoneValid = true;
	
	console.log("This is indexPage--->"+$rootScope.isLandingPage);
	
	
	
	//查看用户名是否存在
	$scope.usernameCheck = function(){
		var Username = $scope.username;
		alert(Username)
		if(""!=Username){
			$http.post("/nameCheck",Username).then(function(response){
				if(response.data.msg=="success"){
					$scope.usernameValid = true;
				}else{
					$scope.usernameValid = false;
				}
			})
		}
	}
	//
	$scope.emailCheck = function(){
		debugger;
		var reg = new RegExp("^[a-z0-9A-Z]+[- | a-z0-9A-Z . _]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z]{2,}$");
		var email = $scope.email;
		if(reg.test(email)){
			$scope.emailValid = true;
		}else{
			$scope.emailValid = false;
		}
		
	}
	//
	$scope.phoneCheck = function(){
		var reg = new RegExp("^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
		var phone = $scope.phone;
		if(reg.test(phone)){
			$scope.phoneValid = true;
		}else{
			$scope.phoneValid = false;
		}
		
	}
	
	
	//用户注册
	$scope.newUser = function(){
		var password = $scope.password;
		var email = $scope.email;
		var phone = $scope.phone;
		var username = $scope.username;
		
		
		$http.post("/register",{"username":username,"password":password,"email":email,"phoneNumber":phone}).then(function(repsonse){
			if(response.data.msg == 'success'){
				console.log("register successful");
			}else{
				console.log("register fail")
			}
		})
	}
	
})
