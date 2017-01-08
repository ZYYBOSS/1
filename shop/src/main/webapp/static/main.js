// console.log("Hello World");
//
// var div = document.getElementsByTagName('div')

// div.childElementCount
//
//
// var a = document.createElement('a');/*新创建一个标签*/
// a.innerText = 'bing';
// a.href = "http://www.bing.com";
//
// div.appendChild(a);

// var n = document.getElementById('button');
// n.addEventListener('click',function(){
//   console.log(this.name);
// },false);
// function print(e){
//   e.stopPropagation();
//   console.log(e.target);
// }
//
// function abiaoqian(e){
//   e.preventDefault();
// }
// // n.addEventListener('click',print)
//
// var var1 = document.getElementById('parent');
// var var2 = document.getElementById('child');
// var p = document.getElementById('p');
// var p = document.getElementById('a');
//
//
// var1.addEventListener('click',print,false);
// var2.addEventListener('click',print,false);
// p.addEventListener('click',print,false);
//
// a.addEventListener('click',abiaoqian,false);
//
// var1.addEventListener('click',print,false);
// var2.addEventListener('click',print,false);
// p.addEventListener('click',print,true);
//
// var1.addEventListener('click',print,true);
// var2.addEventListener('click',print,true);
// p.addEventListener('click',print,true);

// var1.addEventListener('click',function(){
//   console.log("爸爸动了");
// },false);
// var2.addEventListener('click',function(){
//   console.log("儿子动了");
// },false);
// p.addEventListener('click',function(){
//   console.log("放了个p");
// },false);
//
// console.log("p是true");
// var1.addEventListener('click',function(){
//   console.log("爸爸动了");
// },false);
// var2.addEventListener('click',function(){
//   console.log("儿子动了");
// },false);
// p.addEventListener('click',function(){
//   console.log("放了个p");
// },true);
// var submitPut = document.getElementById('sub');


// function print(){
//   if(!usernae || !passwore){
//     document.querySelector("message").innerText = "error";
//     return
//   }
//
//   else {
//     var user = document.getElementById('name').value;
//     var pass = document.getElementById('pass').value;
//
//     console.log(user);
//     console.log(pass);
//   }
// }
var submitPut = document.getElementById('sub');
submitPut.addEventListener('click',print,false);
//不要传结果
function print(){
  var username = document.querySelector('#name').value;
  var password = document.querySelector('#pass').value;

  console.log(username,password);

if(!username || !password){
  document.querySelector('#errorMessage').innerText = "有东西空的！真傻！";
  return;
}else {
  document.querySelector('#errorMessage').innerText ="";
}

  var http = new XMLHttpRequest();
  http.onreadystatechange = function(){
    if(this.readyState == 4 && this.status ==200){
      document.querySelector('#errorMessage').innerText = "success"
    }else{
      document.querySelector('#errorMessage').innerText = "failed";
    }
  }
  var payload = {
    username:username,
    password:password
  };

  http.open('post','user',true);
  http.setRequestHeader('content-type','application/json');
  http.send(JSON.stringify(payload));
}

// var http = new XMLHttpRequest();
// http.orreadystatechange = function(){
//   if(this.readyState == 4 && this.status ==200){
//     document.querySelector("message").innerText = "success";
//   }else {
//     document.querySelector("message").innerText = "failed";
//   }
// }
//
// var payload = {
//   username:name;
//   password:pass;
// };
//
// http.open('post','user',true);
// http.setRequestHeader('Content-Type','application/json');
// http.send(JSON.payload);








// document.querySelector('#errormessage').innerText=""
