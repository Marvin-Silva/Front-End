let btn = document.querySelector('#btn1');
let inp = document.querySelector('#inp1');
let btn1 = document.querySelector('#btn2');
let inp1 = document.querySelector('#inp2');
let btn2 = document.querySelector('#btn3');
let inp2 = document.querySelector('#inp3');
let btn3 = document.querySelector('#btn4');
let inp3 = document.querySelector('#inp4');
let btn4 = document.querySelector('#btn5');
let inp4 = document.querySelector('#inp5');
btn.addEventListener('click', function(){
    inp.value = parseInt(inp.value) + 1;
    inp.style.color = "blue";
}),
btn1.addEventListener('click', function(){
    inp1.value = parseInt(inp1.value) + 1;
    inp1.style.color = "blue";
}),
btn2.addEventListener('click', function(){
    inp2.value = parseInt(inp2.value) + 1;
    inp2.style.color = "blue";
}),
btn3.addEventListener('click', function(){
    inp3.value = parseInt(inp3.value) + 1;
    inp3.style.color = "blue";
}),
btn4.addEventListener('click', function(){
    inp4.value = parseInt(inp4.value) + 1;
    inp4.style.color = "blue";
})
