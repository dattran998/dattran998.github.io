const heading = document.getElementById("heading");
console.log(heading);

const p1 = document.querySelector('p');
console.log(p1);

const p2 = document.querySelector(".para");
console.log(p2);

const p3 = document.querySelector("p:nth-child(4)");
console.log(p3)

const paraList = document.querySelectorAll("p");
console.log(paraList);

heading.style.backgroundColor = 'red';

paraList.forEach(p => {
    p.style.color = 'blue';
    p.style.fontSize = "24px";
})

console.log(heading.innerHTML);
console.log(heading.innerText);
console.log(heading.textContent);

const ul1 = document.querySelector(".box ul");

console.log(ul1.innerHTML);
console.log(ul1.innerText);
console.log(ul1.textContent);

//set lại nội dung
heading.innerHTML = "<i>Xin chào</i>"

document.body.removeChild(p1);

const li22 = document.querySelector(".box ul .li");
ul1.removeChild(li22);

const btn = document.createElement("button");
btn.innerText = "Click me";
console.log(btn);
document.body.replaceChild(btn, p2);

const box = document.querySelector(".box");
const boxCopy = box.cloneNode(true);

document.body.insertBefore(boxCopy, p3);

