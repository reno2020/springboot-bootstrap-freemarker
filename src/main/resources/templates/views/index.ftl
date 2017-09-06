<#assign context = request.contextPath />
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Index</title>
    <script type="text/javascript" src="/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">

</head>
<body>

<div class="container">
    <h2>登录成功</h2>
    <h2>username:${name}</h2>
    <h2>login datetime:${date}</h2>
    <a href="${context}/logout"><h2>退出登录</h2></a>
</div>

</body>
</html>
