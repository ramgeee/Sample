<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
h1 {font-family: verdana}
h1 {text-align: center;}
h1{font-size: 650%}
h1{color: grey }
h2 {font-family: verdana}
h2 {text-align: center;}
h2{font-size: 350%}
h2{color: blue}
h3 {font-family: verdana}
h3 {text-align: left;}
h3{font-size: 90%}
h3{color: black}

p{color: maroon}
p{font-style: verdana}
p{text-align: center}

a:link    {color:black; background-color:transparent; text-decoration:none , font-family: verdana; font-size: 300%}
a:visited {color:red; background-color:transparent; text-decoration:none}
a:hover   {color:red; background-color:transparent; text-decoration:underline}
a:active  {color:Blue; background-color:transparent; text-decoration:underline}
a{text-align: center;}
a{font size: 300%}


input[type="submit"]{
background-color: #555;
color: #fff;
border-radius: 10px;
}


</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body background = "http://wallpapercave.com/wp/HLy0ev6.png">
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

<h2><br><br><br>Current:</h2><br><br>
<form action = "Assignment.jsp" method = "post">
<h3><input type="checkbox" name="id" value="English"/> English <br><br></h3>
<h3><input type="checkbox" name="id" value="Philosophy"/> Philosophy <br><br></h3>
<h3><input type="checkbox" name="id" value="Filipino"/> Filipino <br><br></h3>
<h3><input type="checkbox" name="id" value="Accounting"/> IS 204 <br><br></h3>
<h3><input type="checkbox" name="id" value="Programming"/> ICS 113 <br><br></h3>
<h3><input type="checkbox" name="id" value="BPM"/> IS 206 <br><br></h3>
<h3><input type="checkbox" name="id" value="ArtApp"/> Art Appreciation<br><br><br></h3> 

<input type="submit" value="Completed">
</form>
<%
String select[]=request.getParameterValues("id");
if (select != null && select.length != 0)
{ 
out.println("You have completed:");
for (int i=0; i<select.length; i++){
out.println(select[i]);
}
}%>

</body>
</html>