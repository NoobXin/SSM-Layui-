<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>登录页面</title>
  <link rel="stylesheet" href="../../css/login.css" media="all">
  <link rel="stylesheet" href="../../css/layui.css">
</head>
<body style="margin: 0px;
	padding: 0px;
	background-color: #005cb1;
	width: 100%;
	height: 100%;
	text-align: center;">
<form id="userForm" class="layui-form" method="post">
  <div>
    <div id="card">
      <div id="top" style="text-align: center;
	font-family: 'Microsoft Tai Le Bold', 'Microsoft Tai Le Regular',
		'Microsoft Tai Le';
	font-weight: bold;
	font-style: normal;
	font-size: 20px;
	height: 50px;
	color: white;">身份证查询
      </div>
      <div>
        <div>
          <input id="ID" name="ID" type="text" placeholder="请输入身份证号" autocomplete="off" style="background-color: white;
	border-radius: 10px;
	width: 390px;
	height: 40px;
	margin-top: 65px;
	text-indent: 15px;"/>
        </div>
      </div>
      <div>
        <div style="color: #FCC800;width: 390px;margin: auto;">
          <button id="index" type="button" style="margin-top: 25px;background-color: #005cb1" lay-submit
                  lay-filter="index"
                  class="layui-btn layui-btn-fluid">查询
          </button>
          <button id="num" type="button" style="margin-top: 25px;background-color: #005cb1;margin-left: 1px;" lay-submit
                  lay-filter="num"
                  class="layui-btn layui-btn-fluid">身份证查询计数
          </button>
        </div>
      </div>
    </div>
  </div>
</form>
<script type="text/javascript" src="../../js/jquery.min.js"></script>
<script type="text/javascript" src="../../layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript" src="../../layui/lay/modules/layer.js" ></script>
<script type="text/javascript" src="../../js/index.js" charset="utf-8"></script>
</body>
</html>