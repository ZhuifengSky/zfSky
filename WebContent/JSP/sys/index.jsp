<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>主页</title>
</head>

<body>
   <div id="container" style="height: 800px">
   	  <div id="top" style="background-color: red; height: 15%">顶部</div>
      <div id="content" style="height:70%">
         <div id="left" style="background-color: yellow; width: 20%;float: left">
         	菜单区域
         </div>
         <div id="right" style="width: 80%;">
            <iframe src="right.jsp"/>
         </div>
      </div>
      <div id="footer" style="background-color:blue;height:15%">这是底部</div>
   </div>
</body>
</html>