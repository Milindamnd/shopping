$(function(){
	switch(menu){
	case 'About Us':
		$('#about').addClass('active');
		break;
		
	case 'View Products':
		$('#product').addClass('active');
		break;
	
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
		
	case 'Manage Products':
		$('#manageProduct').addClass('active');
		break;
		
	case 'My Cart':
		$('#mycart').addClass('active');
		break;
	default:
		if(menu == 'Home') $('#home').addClass('active');break;
		$('#product').addClass('active');
		$('#a_'+ menu).addClass('active');
		break;
	}
	//cfrf token for ajax
	var token=$('meta[name="_csrf"]').attr('content');
	var header=$('meta[name="_csrf_header"]').attr('content');
	if(token.length > 0 && header.length > 0){
		$(document).ajaxSend(function(e,xhr,options){
			xhr.setRequestHeader(header,token);
		});
	}
	
	var $table=$('#productListTable');
	
	if($table.length){
		var jsonURL = '';
		if(window.categoryId ==''){
			jsonURL = window.contextRoot +'/json/data/all/products';
		}else{
			jsonURL = window.contextRoot +'/json/data/category/'+ window.categoryId +'/products';
			
		}
		$table.DataTable({
			
			ajax:{
				url :jsonURL,
				dataSrc :''
			},
			columns:[
				{
					data: 'code',
					mRender:function(data,type,row){
						return '<img src="'+window.contextRoot+'/resources/images/'+data+'.jpg" class="dataTableImage"/>'
					}
				},
				{
					data: 'name'
				},
				{
					data: 'brand'
				},
				{
					data: 'unitPrice',
					mRender:function(data,type,row){
						return '&#8377; ' + data
					}
				},
				{
					data: 'qty',
					mRender:function(data,type,row){
						if(data < 1){
							return '<span style="color:red">Out Of Stock!</span>';
						}
						return data;
					}
				},
				{
					data:'productId',
					bSortable:false,
					mRender:function(data,type,row){
						var src='';
						src +='<a href="'+window.contextRoot+'/show/'+data+'/product" class="btn btn-primary"><span class="glyphicon glyphicon-eye-open"></span></a> &#160 ';
						if(window.userRole == 'ADMIN'){
							src +='<a href="'+window.contextRoot+'/manage/'+data+'/products"class="btn btn-success"><span class="glyphicon glyphicon-pencil"></span></a> ';
						}else{
							if(row.qty < 1){
								src +='<a href="javascript:void(0)"class="btn btn-danger disable"><strike><span class="glyphicon glyphicon-shopping-cart"></span></strike></a> ';
							}else{
									src +='<a href="'+window.contextRoot+'/cart/add/'+data+'/product"class="btn btn-danger"><span class="glyphicon glyphicon-shopping-cart"></span></a> ';	
								
							}
						}
						
						return src;
					}
				}
			]
			
		});
		
	}
var $adminTable=$('#adminProductList');
	
	if($adminTable.length){
		var jsonURL = window.contextRoot +'/json/data/admin/all/products';
		$adminTable.DataTable({
			
			ajax:{
				url :jsonURL,
				dataSrc :''
			},
			columns:[
				{
					data:'productId',
				},
				
				{
					data: 'code',
					mRender:function(data,type,row){
						return '<img src="'+window.contextRoot+'/resources/images/'+data+'.jpg" class="adminDataTableImage"/>'
					}
				},
				{
					data: 'name'
				},
				{
					data: 'brand'
				},
				{
					data: 'unitPrice',
					mRender:function(data,type,row){
						return '&#8377; ' + data
					}
				},
				{
					data: 'qty',
					mRender:function(data,type,row){
						if(data < 1){
							return '<span style="color:red">Out Of Stock!</span>';
						}
						return data;
					}
				},
				{
					data:'active',
					bSortable:false,
					mRender:function(data,type,row){
						var source='';
						source += '<label class="switch">';
						if(data){
							source += '<input type="checkbox" checked="checked" value="'+row.productId+'"/>';
						}else{
							source += '<input type="checkbox" value="'+row.productId+'"/>';
						}
						
						source +='<div class="slider"></div>';
						return source;
					}
				
					
				},
			
				{
					data:'productId',
					bSortable:false,
					mRender:function(data,type,row){
						var source='';
						source += '<a href="'+window.contextRoot+'/manage/'+data+'/products" class="btn btn-warning"/><span class="glyphicon glyphicon-pencil"></span>';
						return source;
					}
					
					
				}
			],
			initComplete : function(){
				var api = this.api();
				api.	$('.switch input[type="checkbox"]').on('change',function(){
					var checkbox = $(this);
					var checked = checkbox.prop('checked');
					var msg = (checked)?'You Want to Active this Product ?':'You want to Deactivate this Product  ?';
					var value=checkbox.prop('value');
					
					bootbox.confirm({
						size : 'medium',
						title : 'Product Activation',
						message : msg,
						callback : function(confirmed){
							if(confirmed){
								var activeProductUrl = window.contextRoot + '/manage/product/'+ value +'/activation';
								$.post(activeProductUrl,function(data){
									bootbox.alert({
										size : 'medium',
										title : 'Warning',
										message : data,
									});
								});
								
							}else{
								checkbox.prop('checked',!checked);
							}
							
						}
					});
					
					
				})
			}
			
		});
		
	}

	
	//alert dismiss auto after 3 secound
	var $alert=$('.alert');
	if($alert.length){
		setTimeout(function(){
			$alert.fadeOut('slow');
			
		},3000)
	}
	//add category form validation
	var $categoryForm=$('#categoryForm');
		if($categoryForm.length){
			$categoryForm.validate({
				
				rules :{
					
					name :{
						required :true,
						minlength:2
			
					},
					description :{
						required :true
					}
					
				},
				messages :{
					name:{
						required:'This Field Cannot be Empty',
						minlength:'Name Cannot less than 2 Charactors'
					},
					description :{
						required:'This Field Cannot be Empty'
					}
				},
				errorElement:'em',
				errorPlacement:function(error,element){
					error.addClass('help-block');
					error.insertAfter(element);
				}
				
			});
		}
		
//add login validation
		var $loginForm=$('#loginForm');
		if($loginForm.length){
			$loginForm.validate({
				
				rules :{
					
					username :{
						required :true,
						email:true
			
					},
					password :{
						required :true
					}
					
				},
				messages :{
					username:{
						required:'Please Enter Username',
						email:'Please Enter Valid Email Address'
						
					},
					password :{
						required:'Check Password Again'
					}
				},
				errorElement:'em',
				errorPlacement:function(error,element){
					error.addClass('help-block');
					error.insertAfter(element);
				}
				
			});
		}
		
	

});