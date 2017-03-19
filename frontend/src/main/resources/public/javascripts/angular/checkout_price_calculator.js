var entrypoint = function () {
    var controllers = angular.module("controllers");
    var PriceCalculatorController = controllers.controller("PriceCalculatorController", function ($scope) {
            var trackerPrice = 200;
            var monthlyPrice = 9.99;
            var annualPrice = 99;

           angular.extend($scope,{
                numberOfTrackers :  1,
                subscriptionType : 'MONTHLY',
                price : "199"
           });

           $scope.$watch('[numberOfTrackers,subscriptionType]', function() {
                var count = $scope.numberOfTrackers;
                var type = $scope.subscriptionType;
                var price = trackerPrice + monthlyPrice;

                if (type == 'MONTHLY') {
                    var unitPrice = trackerPrice + monthlyPrice;
                    price = unitPrice * count;
                    }
                 else if(type == 'ANNUAL') {
                    var unitPrice = trackerPrice + annualPrice;
                    price = unitPrice * count;
                }
                $scope.price = price;
           })

       });
       PriceCalculatorController.$inject = ["$scope"];
}();