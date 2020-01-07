
layui.use('form', function() {
    var form = layui.form;
    var layer = layui.layer;
    form.on('submit(login)', function(data){
        $.ajax({
            url: '/login',
            type : 'POST',
            data: {
                'username': data.field.username,
                'password': data.field.password
            },
            dataType: 'json',
            success: function (res) {
                if (res.msg != '' && res.msg != null) {
                    layer.msg(res.msg);
                    return false;
                }
                $(location).prop('href','/index')
            },
            error: function (res) {
                layer.msg("登录失败");
                return false;
            }
        });
    });
})

$(document).keyup(function(e){
    if (e.keyCode == 13) {
        if ($('username').val() != '' && $('password').val() != '') {
            $('#login')[0].click();
        }
    }

});