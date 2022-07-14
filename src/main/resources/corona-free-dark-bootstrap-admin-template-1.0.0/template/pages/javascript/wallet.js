let show = document.getElementById("display");
function showAllWallets() {
    $.ajax({
        type: "GET",
        url: "http://localhost:8086/wallets",
        success: function (data) {
            display(data)
        }, error: function (error) {
            console.log(error);
        }
    })
}
showAllWallets();
function display(data) {
    var content =``;
    for (let i = 0; i < data.length; i++) {
        content += getWallet(data[i])
    }
    document.getElementById("display").innerHTML = content;
}

function getWallet(item) {
    return `<tr>
            <td> ${item.id}</td>
            <td> ${item.name}</td>
            <td> ${item.icon}</td>
            <td> ${item.moneyAmount}</td>
            <td> ${item.moneyType.name}</td>
            <td> ${item.user.username}</td>
            <td><button type="button" class="btn btn-outline-success btn-fw">Edit</button></td>
            <td><button type="button" class="btn btn-outline-danger btn-fw" onclick="showDeleteForm()">Delete</button></td>
        </tr>`

}


// hàm xóa
function showDeleteForm(id) {
    if (confirm("Do you sure that you want to delete this wallet ???")) {
        $.ajax({
            headers:{
                Authorization: 'Bearer ' + localStorage.getItem("token")
            },
            type: 'DELETE',
            url: 'http://localhost:8086/wallets/' + id,
            success: function () {
               showAllWallets()
            },
            error: function (error) {
                console.log(error)
            }
        })
    }
}



