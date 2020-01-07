layui.use('laydate', function() {
    var laydate = layui.laydate;
    //日期范围
    laydate.render({
        elem: '#test2'
    });
    laydate.render({
        elem: '#test1'
    });
});

layui.use('form', function(){
    var form = layui.form;
    //监听提交

    form.on('submit(formDemo)', function(data) {
        var card_id = $("#card_id").val();
        var startDay = $("#test1").val();
        var endDay = $("#test2").val();
        $.ajax({
            url: '/selectNumByID',
            type : 'POST',
            data: {
                'card_id': card_id,
                'startDay': startDay,
                'endDay':endDay
            },
            dataType: 'json',
            success: function (res) {
                if (res.msg != '' && res.msg != null) {
                    layer.msg(res.msg);
                    return false;
                }
            },
            error: function (res) {
                layer.msg("失败");
                return false;
            }
    });
        return false;
    });
});