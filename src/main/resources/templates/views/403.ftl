<!--Author: W3layouts
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<#assign context = request.contextPath />
<!DOCTYPE html>
<html>
<head>
    <title>No Permisson</title>
    <script type="text/javascript" src="/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">

</head>
<body>
<div>
    <h2>OOPS</h2>
    <h1>ERROR 403</h1>
    <h3>"Sorry ! You have no permission to access this page!"</h3>
    <a href="${request}/login" class="back">BACK TO HOME</a>
    <div class="footer agileits">
        <p>Copyright © 2016 Simple Error Page. All Rights Reserved | Design by <a href="http://w3layouts.com"
                                                                                  target="_blank">W3layouts</a></p>
    </div>
</div>

</body>
</html>