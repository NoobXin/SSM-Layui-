// 构造json
$.fn.serializeObject = function() {
	var o = {};
	var a = this.serializeArray();
	$.each(a, function() {
		if (o[this.name] !== undefined) {
			if (!o[this.name].push) {
				o[this.name] = [ o[this.name] ];
			}
			// o[this.name].push(this.value || '');
			o[this.name] = o[this.name] + ',' + this.value || '';
		} else {
			o[this.name] = $.trim(this.value) || '';
		}
	});
	var $radio = $('input[type=radio],input[type=checkbox]', this);
	$.each($radio, function() {
		if (!o.hasOwnProperty(this.name)) {
			o[this.name] = '';
		}
	});
	return o;
};

/**
 * table 表格初始化 必要 
 * url 数据接口 必要 
 * cols 表头 必要 
 * height 表格高度 默认 'full-200' 
 * elem 目标容器
 * 默认'#Lay-normal-table' 
 * reloadTable 表格id 默认'testReload' 
 * size 表格尺寸 默认 '' 
 * limit 表格显示行数 默认 10
 */

function showtable(table, url, cols, height, elem, reloadTable, size, limit) {
	table.render({
		elem : elem || '#Lay-normal-table',
		url : url,
		skin: 'line',
		method : 'post',
		where : $("#listForm").serializeObject(),
		async : false, 
		request : {
			pageName : 'page' // 页码的参数名称，默认：page
			,
			limitName : 'rows' // 每页数据量的参数名，默认：limit
		},
		response : {
			statusName : 'status',
			statusCode : '200',
			msgName : 'msg',
			countName : 'totalRecords',
			dataName : 'records'
		},
		limit : limit || 20,
		limits : [ 5, 10, 15, 20, 25 ],
		page : { // 支持传入 laypage 组件的所有参数（某些参数除外，如：jump/elem） - 详见文档
			layout : [ 'limit', 'count', 'prev', 'page', 'next', 'skip' ] // 自定义分页布局
			,
			groups : 1 // 只显示 1 个连续页码
			,
			first : true // 不显示首页
			,
			last : true,
			id : 1
		// 不显示尾页

		},
		cols : cols,
		id : reloadTable || 'testReload',
		page : true,
		even : true,
		height : height || 'full-200',
		size : size || '',
		done: function(res) {
			for (var i = 0;i < res.recordsReturned;i++) {
				showimg(i);
			}
			
		}
	});
	var active = {
		reload : function() {
			var selectForm = $("#listForm").serializeObject();
			// 执行重载
			table.reload('testReload', {
				url : url,
				page : {
					curr : 1
				// 重新从第 1 页开始
				},
				where : selectForm
			});
		}
	};
	$('#btnSearch').on('click', function() {
		var type = $(this).data('type');
		active[type] ? active[type].call(this) : '';
	});
}



function showtableOther(table, url, cols, height,elem, reloadTable,size, limit) {
	table.render({
		elem : elem || '#Lay-normal-table',
		url : url,
		skin: 'line',
		method : 'post',
		where : $("#listForm").serializeObject(),
		async : false, 
		request : {
			pageName : 'page' // 页码的参数名称，默认：page
			,
			limitName : 'rows' // 每页数据量的参数名，默认：limit
		},
		response : {
			statusName : 'status',
			statusCode : '200',
			msgName : 'msg',
			countName : 'totalRecords',
			dataName : 'records'
		},
		limit : 999,
		cols : cols,
		id : reloadTable || 'testReload',
		type: "all",
		even : true,
		height : height || 'full-200',
		size : size || '',
		done: function(res) {
			for (var i = 0;i < res.recordsReturned;i++) {
				showimg(i);
			}
			
		}
	});
	var active = {
		reload : function() {
			var selectForm = $("#listForm").serializeObject();
			// 执行重载
			table.reload('testReload', {
				url : url,
				where : selectForm
			});
		}
	};
	$('#btnSearch').on('click', function() {
		var type = $(this).data('type');
		active[type] ? active[type].call(this) : '';
	});
}
