<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Personal form</title>
</head>
<body>

Last name: ${person.lastName}

<form:form action="processForm" modelAttribute="person">

First name: <form:input path="firstName" />
<br>
Last name: <form:input path="lastName" />
<br>
Age: <form:input path="age" />
<br>
<input type="submit" value="Submit" />

</form:form>

</body>
</html>