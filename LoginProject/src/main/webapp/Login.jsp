<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<title>User Login Page</title>
<script>
	// jdbc:mysql://localhost:3306/?user=root
	function loginFunction() {
		if (validateInput()) {
			document.getElementById("loginForm").action = "LoginServlet";
			document.getElementById("loginForm").method = "POST";
			document.getElementById("loginForm").submit();
		}
	}
	function validateInput() {
		var isvalidInput = true;

		var isvalidUN = chkUserName();
		var isvalidPwd = chkPassword();

		if (isvalidUN && isvalidPwd) {
			isvalidInput = true;
		} else {
			isvalidInput = false;
		}
		return isvalidInput;
	}
	function chkUserName() {
		var isvalidUn = true;
		var username = document.getElementById("username").value;
		//alert('username : '+username);

		if (username != '') {
			isvalidUn = true;
			document.getElementById("username_err").innerHTML = "";

		} else {
			//alert('please enter username');
			document.getElementById("username_err").innerHTML = "please enter username !";

			isvalidUn = false;
		}

		return isvalidUn;
	}

	function chkPassword() {
		var isvalidPwd = true;
		var password = document.getElementById("userpassword").value;
		//alert('password :'+password);

		if (password != '') {
			isvalidPwd = true;
			document.getElementById("password_err").innerHTML = "";

		} else {
			//	alert('please enter password');
			document.getElementById("password_err").innerHTML = "please enter password !";

			isvalidPwd = false;
		}
		return isvalidPwd;
	}
</script>
</head>

<body>

	<div style="color: red;">
	<%
	if(session.getAttribute("loginErrMsg") != null){
		out.println(session.getAttribute("loginErrMsg"));
	}
	%>
	</div>
<br><br>




	<form action="" id="loginForm" name="loginForm">
		UserName : <input type="text" id="username" name="username"
			onkeypress="return ((event.charCode >= 48 && event.charCode <= 57) || (event.charCode > 64 && event.charCode < 91) || (event.charCode >= 96 && event.charCode <= 123)
             || (event.charCode == 36));"
			maxlength="25" onchange="chkUserName()"> <br> <span
			id="username_err" style="color: red"></span> <br> <br>
		Password : <input type="password" id="userpassword"
			name="userpassword" maxlength="20" onchange="chkPassword()">
		<br> <span id="password_err" style="color: red"></span> <br>
		<br> <input type="button" id="loginButton" name="loginButton"
			value="LOGIN" onclick="loginFunction()" />
	</form>
</body>

</html>
