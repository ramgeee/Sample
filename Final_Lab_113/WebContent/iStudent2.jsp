<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
<style>
h1 {font-family: verdana}
h1 {text-align: left;}
h1{font-size: 650%}
h1{color: grey }
h2 {font-family: verdana}
h2 {text-align: left;}
h2{font-size: 350%}
h2{color: grey}
h3 {font-family: verdana}
h3 {text-align: left;}
h3{font-size: 90%}
h3{color: black}

p{color: maroon}
p{font-style: verdana}
p{text-align: center}


input[type="submit"]{
background-color: #555;
color: #fff;
border-radius: 10px;
}



a:link    {color:black; background-color:transparent; text-decoration:none , font-family: verdana; font-size: 300%}
a:visited {color:red; background-color:transparent; text-decoration:none}
a:hover   {color:red; background-color:transparent; text-decoration:underline}
a:active  {color:Blue; background-color:transparent; text-decoration:underline}
a{text-align: center;}
a{font size: 300%}

</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>iStudent 2</title>
</head>
<body background = "http://wallpapercave.com/wp/HLy0ev6.png" >

<h1>iStudent</h1>

<form action= "Overview.jsp" method="post">
<input type= "submit" value = "Overview" style="width:33%" style="height:15%" >
</form>

<form action= "Assignment.jsp" method = "post">
<input type ="submit" value ="Assignments"style="width:33%" style="height:15%">
</form>

<form action="Planner.jsp" method="post">
<input type = "submit" value = "Planner" style="width:33%" style="height:15% ">
</form>

<form action = "Login.jsp" method = "post">
<input type = "submit" value = "Log Out" style="width:33%" style="height:15%">
</form>

<h2>Schedule</h2>

	

</body>
</html>