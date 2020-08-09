<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Find Lyrics</title>
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <script type="text/javascript">
        function getLyrics() {

            var b = document.getElementById('b').value;
            var s = document.getElementById('s').value;
            var url = "https://api.lyrics.ovh/v1/" + b + "/" + s;
            var xhttp = new XMLHttpRequest();
            xhttp.onreadystatechange = function () {
                if (this.readyState == 4 && this.status == 200) {
                    var jsontoobject = JSON.parse(this.responseText)
                    document.getElementById("lyrics").innerHTML = jsontoobject.lyrics;
                }
            };
            xhttp.open("GET", url, true);
            xhttp.send();
        }
    </script>
</head>
<body>
<div>
    <input type="text" name="band" id="b"/>Artist Name<br>
    <input type="text" name="song" id="s"/>Song Name<br>
    <button onclick=getLyrics() value="Find lyrics">Find lyrics!</button>
    <div class="row mt-5">
        <div class="col-12 text-center mt-xl-2">
            <a class="text-white font-weight-medium" href="${pageContext.request.contextPath}">Back to Home Page</a>
        </div>
    </div>
</div>
<h1>
    <div id="lyrics"></div>
</h1>
</body>
</html>
