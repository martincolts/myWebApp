var app = angular.module ("myapp", ["ngRoute"]);
app.config(function($routeProvider) {
    $routeProvider
    .when("/", {
        templateUrl : "templates/main.tpl.html"
    })
    .when("/algo", {
    	templateUrl : "templates/algo.tpl.html" 
    });
});