<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="springForm"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload Mp3</title>
    </head>
    <body>
        <h1 id="title">Mp3 Upload</h1>
        <form  method="POST" action="/mp3mapping/douploadmp3" enctype="multipart/form-data">
            <input class="inputfile" id ="upload" type="file" name="myfile" accept=".mp3">
            <label for="upload">Submit to upload your Mp3 File</label>
            <input class="btn-1" type="submit">
        </form>
        <div class="row mt-5">
            <div class="col-12 text-center mt-xl-2">
                <a class="text-white font-weight-medium" href="${pageContext.request.contextPath}">Back to Home Page</a>
            </div>
        </div>      
    </body>
</html>
