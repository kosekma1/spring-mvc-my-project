<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculator</title>
</head>
<body>


<form:form action="processForm" modelAttribute="calculator">

Amount: <form:input path="amount" />
<form:errors path="amount" cssClass="error" />
<br>
Interest: <form:input path="interest" />
<form:errors path="interest" cssClass="error" />
<br>
Years: <form:input path="years" />
<form:errors path="interest" cssClass="error" />
<br>
<input type="submit" value="Submit" />

</form:form>

</body>
</html>