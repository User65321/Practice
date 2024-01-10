<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<link rel="stylesheet" href="designComfirmation.css" type="text/css">


<!--　meta http-equiv="Content-type" content="text/html; charset=Shift_JIS">-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- <meta charset=”UTF-8”> -->
<title>Copmfirmation</title>
</head>
<body>

<h1>Comfirmtion</h1>

<ul>
<li>The following information has been registered</li>
</ul>

<table>

<tr>
<td>Name</td>
<td class="value">${param.name}</td>
</tr>

<tr>
<td>Password</td>
<td class="value">⚫⚫⚫⚫⚫⚫⚫️</td>
</tr>

<tr>
<td>E-mail</td>
<td class="value">${param.mail}</td>
</tr>

<tr>
<td>Phone number</td>
<td class="value">${param.phoneNumber}</td>
</tr>

<tr>
<td>Cellphone number</td>
<td class="value">${param.cellphoneNumber}</td>
</tr>

<tr>
<td>Postcode</td>
<td class="value">${param.postcode}</td>
</tr>

<tr>
<td>Gender</td>
<td class="value">${param.gender}</td>
</tr>

<tr>
<td>Age</td>
<td class="value">${param.age}</td>
</tr>

<tr>
<td>Preferred Course</td>
<td class="value">
${paramValues.subject[0]}
${paramValues.subject[1]}
</td>
</tr>

</table>


</body>
</html>