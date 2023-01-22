<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html lang="en" >
<head>
    <meta charset="UTF-8">
    <title>Sign up / Login Form</title>
<%--    <link rel="stylesheet" href="/src/main/webapp/WEB-INF/resources/static/css/signupStyle.css">--%>
<%--    <link href="<c:url value="/src/main/webapp/resources/static/css/signupStyle.css"/>" rel="stylesheet" type="text/css">--%>
    <link href="<c:url value="/resources/static/css/signupStyle.css" />" rel="stylesheet">

</head>
<body>
<!-- partial:index.partial.html -->
<!DOCTYPE html>
<html>
<head>
    <title>Slide Navbar</title>
    <link rel="stylesheet" type="text/css" href="slide navbar style.css">
    <link href="https://fonts.googleapis.com/css2?family=Jost:wght@500&display=swap" rel="stylesheet">
</head>
<body>
<div class="main">

<%--    <h1>${message}</h1>--%>
    <input type="checkbox" id="chk" aria-hidden="true">

    <div class="signup">
        <form>
            <label for="chk" aria-hidden="true">Sign up</label>
            <input type="text" name="txt" placeholder="User name" required="">
            <input type="email" name="email" placeholder="Email" required="">
            <input type="password" name="pswd" placeholder="Password" required="">
            <button>Sign up</button>
        </form>
    </div>

    <div class="login">
        <form>
            <label for="chk" aria-hidden="true">
<%--                <a href="./Login.jsp" style="text-decoration: none;">Login</a>--%>
                <a href="<c:url value="./Login" />" style="text-decoration: none;">Login</a>
<%--                <a class="button" href="./Login.jsp">Get Started</a>--%>
            </label>

            <!-- <input type="email" name="email" placeholder="Email" required="">
            <input type="password" name="pswd" placeholder="Password" required="">
            <button>Login</button> -->
        </form>
    </div>
</div>
</body>
</html>
<!-- partial -->

</body>
</html>
