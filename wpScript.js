body.onload = function(){let requestUrl = 'http://localhost:8080/tasks';
let request = new XMLHttpRequest();
request.open('GET', requestURL);
request.responseType = 'json';
request.send();

request.onload = function() {
  const dataTasks = request.response;
  populateTable(dataTasks);
  
}}