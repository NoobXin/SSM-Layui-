<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>次数查询页面</title>
  <link rel="stylesheet" href="../../css/login.css" media="all">
  <link rel="stylesheet" href="../../css/layui.css">
</head>
<body>
<form iclass="layui-form" >
  <div class="layui-form-item">
    <div class="layui-inline">
      <label class="layui-form-label">日期选择</label>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="test1" placeholder="开始时间" name="startDay" id="startDay">
      </div>
      <div class="layui-input-inline">
        <input type="text" class="layui-input" id="test2" placeholder="结束时间" name="endDay" id="endDay">
      </div>
    </div>
  </div>
  <div class="layui-form-item">
    <label class="layui-form-label">身份证号码</label>
    <div class="layui-input-block">
      <input type="text" id="card_id"  lay-verify="title" autocomplete="off" placeholder="请输入身份证号码" class="layui-input" style="width: 390px;" name="card_id">
    </div>
  </div><br>
  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit lay-filter="formDemo" >立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>

</form>
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript" src="../../layui/lay/modules/layer.js" ></script>
<script type="text/javascript" src="../../js/indexSel.js" ></script>
</body>
</html>