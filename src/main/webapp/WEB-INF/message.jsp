<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.github.soulaway.messagebook.*"%>
 
<jsp:useBean id="messageDao" type="com.github.soulaway.messagebook.MessageDao" scope="request" />
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
        <title>The Message book Web Application Template</title>
    </head>
 
    <body>
        <form method="POST" action="message.html">
            Message: <input type="text" name="text" />
            <input type="submit" value="Add" />
        </form>
 
        <hr><ol> 
        <% for (Message message : messageDao.getAllMessages()) { %>
            <li> The message: <%= message %></li>
        <% } %>
        </ol><hr>
 
		<iframe src="https://github.com/soulaway/spring-mvc-template"
            frameborder="0" scrolling="no" width="100%" height="30"></iframe>
	</body>
</html>