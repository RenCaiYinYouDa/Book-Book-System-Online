<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>

<html>
  <head>
    <title>��Ʒ��ϸҳ��</title> 
	<link rel="stylesheet" href="css/styles.css" type="text/css" />
  </head>
  
  <body>
    <table width="90%" height="629" border="0" cellpadding="0"
			cellspacing="0" align="center">
			<tr>
				<td width="200" height="101">
					<img src="images/jb_logo.jpg" width="64" height="32" />
					<strong><span
						style="font-size: 20px;">���϶���ϵͳ</span> </strong>
				</td>
			</tr>
			<tr>
				<td height="41" colspan="2"
					style="background-image:url(images/001.gif);" align="center">
					|
					<a href="/Restrant/toShowMeal">��վ��ҳ</a> |
					<s:if test="(#session.admin==null) && (#session.user==null)">					
					<a href="register.jsp">�û�ע��</a> |
					<a href="login.jsp?role=user">�û���¼</a> |
					<a href="login.jsp?role=admin">����Ա��¼</a> |
					</s:if>
					<s:if test="#session.user!=null">
					<a href="modifyMyInfo.jsp">�޸ĸ�����Ϣ</a> |
					<a href="shopCart.jsp">�ҵĹ��ﳵ</a> |
					<a href="/Restrant/toMyOrders">�ҵĶ���</a> |
					<a href="/Restrant/logOut?type=userlogout">ע��</a> &nbsp;&nbsp; &nbsp;&nbsp;
					<font style="color: red">��ӭ����${sessionScope.user.trueName }</font>					
					</s:if>
					<s:if test="#session.admin!=null">
					<a href="/Restrant/toAddMeal">��Ӳ�Ʒ</a> |
					<a href="/Restrant/toManageMeal">�����Ʒ</a> |
					<a href="/Restrant/toManageOrders">��������</a> |
					<a href="/Restrant/logOut?type=adminlogout">ע��</a> &nbsp;&nbsp; &nbsp;&nbsp;
					<font style="color: red">��ӭ����${sessionScope.admin.loginName }</font>
					</s:if>
				</td>
			</tr>
			<tr>
				<td valign="top" width="80%">
					<img src="images/001.jpg" style="width: 100%; height: 72px" />
					<br />
					<div style="background-image:url(images/004.gif)">
						&nbsp;
					</div>
					<div style="background-color:#FFCC99; font-size: 40px;" align="center">
						��Ʒ����
					</div>
					<br>
					<br />			
					<table width: 100% border="0" cellspacing="0" cellpadding="3">
						<tr>
							<td width="148">
								<img src="mealimages/500047.jpg" width="500" height="450" />
							</td>
							<td width="268" valign="top">
								<br />
								<span style="font-size: 20px;"> ��ϸ����:
								<br />
								<span style="font-size: 20px;"> &nbsp;&nbsp; &nbsp;&nbsp; Ƥ��������
								<br />
								
							</td>
						</tr>
						<tr>
							<td>
								<span style="text-decoration:line-through;color:gray;font-size: 20px;">ԭ�ۣ������${requestScope.aMeal.mealPrice }Ԫ</span>
								<br />
								<span style="font-size: 20px;"> �ּۣ������${requestScope.aMeal.mealPrice*0.9 }Ԫ
							</td>
						</tr>
						<tr>
							<td>
								<span style="font-size: 20px;">��ţ�123456789
								<a style="float: right;" href="/Restrant/addtoshopcart?mealId=${requestScope.aMeal.mealId }">
									<img src="images/buy_cn.gif" border="0" width="60" height="20" />
								</a>
							</td>
						</tr>
					</table>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<br>
					<hr width=100%>					
				</td>
			</tr>
		</table>
  </body>
</html>
