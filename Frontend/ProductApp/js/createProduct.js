document.addEventListener("DOMContentLoaded", function(){
    getCategories();
})

const getCategories = () => {
    fetch("http://localhost:8081/categories")
    .then((response) => {
        return response.json();
    }).then((data) => {

        let cat = document.getElementById('categoryId');

        data.map((category) => {
            const option = document.createElement('option');
            option.value = category.id;
            option.text = category.name;
            cat.appendChild(option);
        });
    }).catch((error) =>{
        console.log(error);
    })
}

const createProduct = (event) => {
    event.preventDefault();

    let name = document.getElementById("name").value;
    let price = document.getElementById("price").value;
    let quantity = document.getElementById("qty").value;
    let categoryId = document.getElementById("categoryId").value;

    let data = {
                "name" : name,
                "price" : price,
                "qty" : quantity,
                "categoryId" : categoryId
            }

    fetch("http://localhost:8081/products", {
        method: 'POST',
        body: JSON.stringify(data),
        headers: {
            "Content-Type": "application/json"
        }
    }).then((response) =>{
        return response.json();
    }).then((data) =>{
        window.location.href = "/index.html"
    }).catch((error) =>{
        console.log(error);
    })
}