var app = angular.module("myApp",['ui.router']).config(function ($stateProvider, $urlRouterProvider) {
            $stateProvider.state("index",{
                url: '/index',
                templateUrl:"index.html",
                controller:"mainCtrl"
            }).state("login",{
                url: '/login',
                templateUrl:"html/login.html",
                controller:"loginCtrl"
            }).state("register",{
                url: '/register',
                templateUrl:"html/register.html",
                controller:"registerCtrl"
            })
        });
app.controller("mainCtrl",function ($rootScope,$scope) {
    $rootScope.isLandingPage = true;
    console.log("This is indexPage--->"+$rootScope.isLandingPage);
})