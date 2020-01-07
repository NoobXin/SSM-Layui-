$(function () {
    var id = $("#ID").val();
    var type = $("#type").val();

    var table = layui.table;
    var url = getRootPath() + "/station/StationInfo/searchList";
    var cols =
        layui.use('table', function () {
            var table = layui.table;
            table.render({
                elem: '#one'
                , url: '/searchList?ID=' + id
                , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
                , cols: [[
                    {field: 'id', width: 200, title: '身份证号', sort: true},
                    {field: 'typeName', width: 200, title: '居住类型'}
                    , {field: 'startTime', width: 200, title: '开始时间', templet: '#startTime'}
                    , {field: 'endTime', width: 200, title: '截止时间', templet: '#endTime'}
                ]], page: true   //开启分页
                , limit: 10   //默认十条数据一页
                , limits: [10, 20, 30, 50]  //数据分页条
            });
            table.render({
                elem: '#two'
                , url: '/searchListTwo?ID=' + id + "&type=" + type
                , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
                , cols: [[
                    {field: 'dzsffsbh', width: 200, title: '是否申请地址变更'},
                    {field: 'wyjjrq', width: 200, title: '网约取件时间', templet: '#wyjjrq'}
                    , {field: 'jjr_xm', width: 200, title: '取件人姓名'}
                    , {field: 'jjr_lxdh', width: 200, title: '取件联系电话'}
                    , {field: 'jjr_dz', width: 300, title: '取件地址'}

                    , {field: 'jjtscg', width: 200, title: '是否取件成功'}
                    , {field: 'jjsbyy', width: 200, title: '取件失败原因'}
                    , {field: 'jjsj', width: 200, title: '取件时间', templet: '#jjsj'}
                    , {field: 'jjdh', width: 200, title: '取件单号'}
                    , {field: 'sjr_xm', width: 200, title: '收件人姓名'}

                    , {field: 'sjr_lxdh', width: 200, title: '收件人联系电话'}
                    , {field: 'sjr_dz', width: 200, title: '收件地址'}
                    , {field: 'psrq', width: 200, title: '配送日期'}
                    , {field: 'psdh', width: 200, title: '配送单号'}
                    , {field: 'xgsj', width: 200, title: '修改日期', templet: '#xgsj'}
                ]],
                parseData: function (res) {
                    console.log(res);
                }
            });
            table.render({
                elem: '#three'
                , url: '/searchListThree?ID=' + id
                , cellMinWidth: 80 //全局定义常规单元格的最小宽度，layui 2.2.1 新增
                , cols: [[
                    {field: 'yjmx_qzrq', width: 200, title: '签注时间', templet: '#yjmx_qzrq'},
                    {field: 'yjmx_sfps', width: 200, title: '是否配送'}
                    , {field: 'yjmx_pspc', width: 200, title: '配送批次'}
                    , {field: 'yjmx_qsrq', width: 200, title: '签收日期'}
                    , {field: 'yjmx_psdh', width: 200, title: '配送单号'}
                ]]
                , page: true   //开启分页
                , limit: 10   //默认十条数据一页
                , limits: [10, 20, 30, 50]  //数据分页条
            });
        });
});
