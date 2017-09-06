<#assign context = request.contextPath />
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script type="text/javascript" src="/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="/bootstrap/js/bootstrap.js"></script>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.css">
</head>

<body>
<div class="container">
    错误信息：
    <h4 id="erro"></h4>
    <form>
        <p>
            账号：<input id="username" type="text" name="username"/>
        </p>
        <p>
            密码：<input id="password" type="text" name="password"/>
        </p>
        <p>
            <input type="button" id="ajaxLogin" value="登录"/>
        </p>
    </form>
</div>

<script>
    $("#ajaxLogin").click(function () {
        $.ajax({
            url: '${context}/login/submit',
            dataType: 'json',
            type: 'POST',
            data: {
                'username': $("#username").val(),
                'password': $("#password").val()
            },
            success: function (data) {
                if (data && 200 === data.code) {
                    window.location.href = '${context}/index';
                } else {
                    $("#erro").html(data.message);
                }
            }
        });
    });
</script>
</body>
</html>

