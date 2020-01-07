
layui.use('form', function() {
    var form = layui.form;
    var layer = layui.layer;
    form.on('submit(index)', function(data){
        $.ajax({
            url: '/indexNum',
            type : 'POST',
            data: {
                'ID': data.field.ID
            },
            dataType: 'json',
            success: function (res) {
                console.log(res.result);
                if (res.msg != '' && res.msg != null) {
                    layer.msg(res.msg);
                    return false;
                }
                $(location).prop('href','/indexTable?ID='+res.result.id)
            },
            error: function (res) {
                layer.msg("失败");
                return false;
            }
        });
    });
    form.on('submit(num)', function(data){
        $(location).prop('href','/selectIDNum')
    });
})

$(document).keyup(function(e){
    if (e.keyCode == 13) {
        if ($('ID').val() != '') {
            $('#index')[0].click();
        }
    }

});