$(function () {
    var myApp = angular.module('App',[]);

    myApp.controller('mainPageCtrl',['$scope', function($scope){
        $scope.message = "NickJO AngularJs!!";
    }]);
});