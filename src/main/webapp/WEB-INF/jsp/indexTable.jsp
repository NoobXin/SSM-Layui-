<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>信息详情</title>
    <link rel="stylesheet" href="../../css/login.css" media="all">
    <link rel="stylesheet" href="../../css/layui.css">
</head>
<body >
<span>身份证信息</span>
<table class="layui-hide" id="one"></table><br><br>
<span>登记信息</span>
<table class="layui-hide" id="two"></table><br><br>
<span>完成情况信息</span>
<table class="layui-hide" id="three"></table>
<input type="hidden" id="ID" value="${info.ID}">
<input type="hidden" id="type" value="${info.type}">


<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript" src="../../layui/lay/modules/layer.js" ></script>
<script type="text/javascript" src="../../js/indexTable.js" charset="utf-8"></script>
<script type="text/javascript" src="../../js/dateFormat.js" charset="utf-8"></script>

<script id="startTime" type="text/html">
    {{#
    return exchangeTimeFormat(d.startTime,"yyyy-MM-dd hh:mm:ss");
    }}
</script>
<script id="endTime" type="text/html">
    {{#
    return exchangeTimeFormat(d.endTime,"yyyy-MM-dd hh:mm:ss");
    }}
</script>
<script id="wyjjrq" type="text/html">
    {{#
    return exchangeTimeFormat(d.wyjjrq,"yyyy-MM-dd hh:mm:ss");
    }}
</script>
<script id="yjmx_qzrq" type="text/html">
    {{#
    return exchangeTimeFormat(d.yjmx_qzrq,"yyyy-MM-dd hh:mm:ss");
    }}
</script>
<script id="xgsj" type="text/html">
    {{#
    return exchangeTimeFormat(d.xgsj,"yyyy-MM-dd hh:mm:ss");
    }}
</script>
<script id="jjsj" type="text/html">
    {{#
    return exchangeTimeFormat(d.jjsj,"yyyy-MM-dd hh:mm:ss");
    }}
</script>
</body>
</html>