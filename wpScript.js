//alert("oi");
window.onload = function() {
    let requestUrl = 'http://localhost:8080/tasks';
    let request = new XMLHttpRequest();
    request.open('GET', requestUrl);
    request.responseType = 'json';
    request.send();

    request.onload = function() {
        const dataTasks = request.response;
        //alert(dataTasks);
        alert(dataTasks[0].description);
        populateTable(dataTasks);

    }
}
//alert("tchau");
