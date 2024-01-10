<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="design.css" type="text/css">

<!-- <meta http-equiv="Content-type" content="text/html; charset=Shift_JIS"> -->
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--  <meta charset="UTF-8">　-->
<title>Register</title>
</head>
<body>

<h1>Register</h1>



<form method="post" action="/WaitingApp/comfirmation.jsp">

<table>

<tr>
<td>Name</td>
<td><input type="text" name="name"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td>E-mail address</td>
<td><input type="text" name="mail"></td>
</tr>

<tr>
<td>Comfirm E-mail</td>
<td><input type="text" name="mailForCheck"></td>
</tr>

<tr>
<td>Phone number</td>
<td><input type="text" name="phoneNumber"></td>
</tr>

<tr>
<td>Postcode</td>
<td><input type="text" name="postcode"></td>
</tr>


<tr>
<td>Gender</td>
<td>
<p style="display:inline-block; with:100px">
<input class="radioClass" type="radio" name="gender" value="man">
</p>
<p style="display:inline-block; with:100px">
Man&nbsp;
</p>

<p style="display:inline-block">
<input class="radioClass" type="radio" name="gender" value="woman">
</p>
<p style="display:inline-block; with:100px">
Woman
</p>
</td>
</tr>

<tr>
<td>Age</td>
<td>
<select name="age">
<option value="none">◼Please select</option>

<option value="10's">10's️</option>
<option value="20's">20's️</option>
<option value="30's">30's️</option>
<option value="40's">40's️</option>
<option value="50's">50's️</option>
<option value="60's">60's️</option>
</select>
</td>
</tr>

<tr>
<td>Preferred Course</td>
<td>
<p style="display:inline-block; with:100px">
<input type="checkbox" name="subject" value="japanese">
</p>
<p style="display:inline-block; with:100px">
Japanese&nbsp;
</p>
<p style="display:inline-block; with:100px">
<input type="checkbox" name="subject" value="english">
</p>
<p style="display:inline-block; with:100px">
English
</p>

</td>
</tr>
<tr>

<td>
<input type="submit"  value="register" id="submitButton">
</td>


</table>

</form>

</body>

</html>