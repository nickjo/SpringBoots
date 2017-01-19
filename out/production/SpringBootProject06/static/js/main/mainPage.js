$(function () {
    var myApp = angular.module('mui',[]);

    myApp.service('mainPageService', function ($http) {
        var mainPageSc = {};

        mainPageSc.getBoard = function () {
            $http({
                url: '/selectMainPageData',
                dataType: 'json',
                method: 'POST',
                data: '',
                headers: {
                    "Content-Type": "application/json"
                }
            })
                .success(function (data) {
                    console.log("###success: " + data);
                })
                .error(function (data, status) {
                    console.error("###error: ", status, data);
                }).finally(function () {
                    console.log("###finally")
                });
        };
    });
    myApp.controller('mainPageCtrl', function($scope, mainPageService){
        init();
        $scope.mainPageSc = mainPageService;

        function init(){
            $scope.message = "NickJO 1211";
        }
    });





}());


