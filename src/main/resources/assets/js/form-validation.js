// Inspired by:
// http://stackoverflow.com/questions/16693383/jquery-loop-form-to-check-for-all-empty-fields-then-execute-a-function
$(document).ready(function () {
    $(document).keyup(function () {
        var isAnyInputEmpty = $('input').filter(function () {
                return $.trim(this.value).length === 0;
            }).length > 0;

        if (isAnyInputEmpty) {
            $('#btn-submit').attr('disabled', true);
        } else {
            $('#btn-submit').attr('disabled', false);
        }
    });
});