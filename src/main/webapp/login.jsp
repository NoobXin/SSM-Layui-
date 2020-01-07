<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录页面</title>
    <link rel="stylesheet" href="css/login.css" media="all">
    <link rel="stylesheet" href="css/layui.css">
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
	color: white;">查询登录
            </div>
            <div>
                <div>
                    <input id="username" name="username" type="text" placeholder="账号" autocomplete="off" style="background-color: white;
	border-radius: 10px;
	width: 390px;
	height: 40px;
	margin-top: 65px;
	text-indent: 15px;"/>
                </div>
            </div>
            <div>
                <div>
                    <input id="password" type="password" name="password" placeholder="密码" autocomplete="off" style="	background-color: white;
	border-radius: 10px;
	width: 390px;
	height: 40px;
	margin-top: 25px;
	text-indent: 15px;"/>
                </div>
            </div>
            <div>
                <div style="color: #FCC800;width: 390px;margin: auto;">
                    <button id="login" type="button" style="margin-top: 25px;background-color: #005cb1" lay-submit
                            lay-filter="login"
                            class="layui-btn layui-btn-fluid">登录
                    </button>
                </div>
            </div>
            <div>
                <div class="layui-col-xs-12" style="margin-top: 50px; color: white;">Project one test</div>
            </div>
        </div>
    </div>
</form>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="layui/layui.all.js" charset="utf-8"></script>
<script type="text/javascript" src="layui/lay/modules/layer.js" ></script>
<script type="text/javascript" src="js/login.js" charset="utf-8"></script>
</body>
</html>