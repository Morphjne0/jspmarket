<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import = "java.util.Date" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="utf=8">

<title>Welcome</title>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css" >
<script type="text/javascript">
    function showClock()
    {
        var currentDate=new Date();
        var divClock=document.getElementById("divClock");
        var apm=currentDate.getHours();
        if(apm<12)
        {
            apm="오전";
            var msg = "현재시간 : "+apm +(currentDate.getHours())+"시";
            msg += currentDate.getMinutes() + "분";
            msg += currentDate.getSeconds() + "초";
        }
        else
        {
            apm="오후";
            var msg = "현재시간 : "+apm +(currentDate.getHours()-12)+"시";
            msg += currentDate.getMinutes() + "분";
            msg += currentDate.getSeconds() + "초";
        }
        

        
        divClock.innerText=msg;
        
        setTimeout(showClock,1000);
    }
</script>
</head>
<body>
<%@ include file="menu.jsp" %>
	<%! String greeting = "Market M에 오신것을 환영합니다";
	String tagline = "Welcome to Market M"; %>
	<h1>
	<div class = "jumbotron"> <%//여기 노란줄//%>
		<div class = "container">
			<h1 class = "display-3">
				<%= greeting %>
			</h1>
		</div>
	</div>
	</h1>
	<main role = "main">
	<div class = "container">
		<div class = "text-center">	
			<h3>
				<%= tagline %>
			</h3>			

<h3><body onload="showClock()">
    <div id="divClock" class="clock"></div></h3>
				
		</div>	
		<hr>
	</div>
</main>

	<%@include file="footer.jsp" %>
</body>
</html>