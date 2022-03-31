<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Error</title>
</head>
<body>
    <header>
        <h1>Error: Invalid url</h1>
        <h2><a href="/">Return to main documentation</a></h2>
    </header>

    <h2>Valid endpoints:</h2>
    <jsp:include page="APIFunctions/CalcDoc.jsp" />
    <jsp:include page="APIFunctions/RSPDoc.jsp" />
    <jsp:include page="APIFunctions/CSVDoc.jsp" />
    <jsp:include page="APIFunctions/RandomImageDoc.jsp" />
    
</body>
</html>