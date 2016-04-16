app.controller('CustomersController', ['$scope', '$http', function ($scope, $http) {

    var baseUrl = "http://localhost:8080/api/customers/";
    var errorMessage = "One or More Operations failed. Please contact Thompadude.";
    var successMessage = "Operation successful.";

    $scope.sortType = "lastName";
    $scope.sortReverse = false;

    updateCustomerListData();

    $scope.createCustomer = function () {
        $http({
            url: baseUrl,
            method: 'POST',
            data: getFormInJsonFormat(),
            header: {'Content-Type': 'application/json'}
        }).success(function () {
            $('#div-feedback').html(successMessage).hide().fadeIn();
            updateCustomerListData();
        }).error(function () {
            $('#div-feedback').html(errorMessage).hide().fadeIn();
        })
    };

    $scope.toggleCustomerList = function () {
        $('#div-customer-list').fadeToggle();
    };

    function updateCustomerListData() {
        $http({
            url: baseUrl,
            method: 'GET',
            header: {'Content-Type': 'application/json'}
        }).success(function (data) {
            $scope.listOfAllCustomers = data;
        }).error(function () {
            $('#div-feedback').html(errorMessage).hide().fadeIn();
        })
    }

    function getFormInJsonFormat() {
        return JSON.stringify({
            "firstName": $('#input-first-name').val(),
            "lastName": $('#input-last-name').val(),
            "phoneNumber": $('#input-phone-number').val()
        });
    }

}]);