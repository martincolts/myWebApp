app.controller('main.ctrl', ['$scope', '$location', function($scope , $location){
	$scope.name ="ingrese su nombre aqui";
	
	$scope.toAlgo = function (){
		$location.path('/algo');
	}
}]);