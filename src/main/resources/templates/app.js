var app = angular.module('app', ['ng-router']);
        app.config(function($routerProvider){
            $routerProvider.when ("/fuck",{
                template:"<div>Hola</div>
            })
        });

        app.controller('controller1',function($scope){
            $scope.hello = "Hola a todos";
        });