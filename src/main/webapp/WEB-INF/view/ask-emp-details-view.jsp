<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<body>

<h2>  Dear Employee, enter you fucking name </h2>

<br>
<br>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path ="name" />
    <form:errors path="name"/>
<br>
<br>
    Surname <form:input path ="surname" />
    <form:errors path="surname"/>
    <br>
    <br>
        Phone number <form:input path ="phoneNumber" />
         <form:errors path="phoneNumber"/>
<br>
<br>
    Salary <form:input path ="salary" />
        <form:errors path="salary"/>
        <br>
        <br>
            Enter your email <form:input path ="email" />
                    <form:errors path="email"/>
<br>
<br>
    Department <form:select path="department">
    <form:options items="${employee.dpts}"/>
    </form:select>
<br>
<br>
Choose a Car
Renault <form:radiobuttons path="carBrand" items="${employee.cars}"/>
<br>
<br>
Foreign language(s)
<form:checkboxes path="languages" items="${employee.langs}" />


<br>
<br>
    <input type="submit" value="OK">


</form:form>


</body>

</html>