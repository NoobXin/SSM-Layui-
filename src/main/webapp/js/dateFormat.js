function exchangeTimeFormat(timeStr,formatStr){
	if(timeStr==null||timeStr.length==0){
		return;
	}
	//去除特殊符号
	timeStr=timeStr.replace(/[&\|\\\*^%$#@\-]/g,"");
	var len=timeStr.length;
	if(len>14){
		timeStr=timeStr.substr(0,14);
	}else{
		var diff=14-len;
		var addZeros="";
		for(var i=0;i<diff;i++){
			addZeros+="0";
		}
		timeStr+=addZeros;
	}
	//正则转换时间格式
	var  regExp=/^(\d{4})(\d{2})(\d{2})(\d{2})(\d{2})(\d{2})$/;
	var  formatTime= '$1/$2/$3 $4:$5:$6';
	timeStr=timeStr!=null&&timeStr!=""&&timeStr.length==14?timeStr.replace(regExp, formatTime):timeStr;
	if(formatStr==null||formatStr.length==0){
		formatStr="yyyy-MM-dd hh:mm:ss";
	}
	timeStr = new Date(timeStr).Format(formatStr);
	return  timeStr;
}

//定义时间

Date.prototype.Format = function(fmt){
	var o = {
		"M+" : this.getMonth() + 1, //月份
		"d+" : this.getDate(),         //日
		"h+" : this.getHours(),     //小时
		"m+" : this.getMinutes(),     //分
		"s+" : this.getSeconds(),     //秒
		"q+" : Math.floor((this.getMonth() + 3) / 3), //季度
		"S" : this.getMilliseconds()//毫秒
	};
	if (/(y+)/.test(fmt))
		fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "").substr(4 - RegExp.$1.length));
	for (var k in o)
		if (new RegExp("(" + k + ")").test(fmt))
			fmt = fmt.replace(RegExp.$1, (RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k]).substr(("" + o[k]).length)));
	return fmt;
}
