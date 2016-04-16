app.directive('customerList', function() {
    return {
        restrict: 'E',
        scope: {
            list: '='
        },
        // TODO create this :-)
        templateUrl: 'directives/customerList.html'
    }
});