function singUp() {
    let username = document.getElementById("username").value;
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmPassword").value;
    let user = {
        username: username,
        password: password,
        confirmPassword: confirmPassword
    }
    $.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json',
        },
        type: "POST",
        url: "http://localhost:8086/register",
        dataType: "json",
        data: JSON.stringify(user),
        success: function () {
            alert("Đăng kí thành công!")
            $('#username').val("");
            $('#password').val("");
            $('#confirmPassword').val("");
        },
        error: function (error) {
            console.log(error)
            alert("Đăng kí thất bại!")
        }
    })
}
