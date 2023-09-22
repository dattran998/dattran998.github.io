//Bài 1
const text = document.getElementById('text')
text.style.color = '#777'
text.style.fontSize = '2rem'
text.innerHTML = 'Tôi có thể làm <em> bất cứ điều gì </em> tôi muốn với JavaScript'

//Bài 2
const item = document.querySelectorAll('li')
Array.from(item).map(ele => ele.style.color = 'blue')

//Bài 3
const insertItem8 = document.createElement('li')
insertItem8.innerText = 'Item 8'
const myList = document.getElementById('list')
myList.appendChild(insertItem8)

const insertItem9 = document.createElement('li')
insertItem9.innerText = 'Item 9'
myList.appendChild(insertItem9)

const insertItem10 = document.createElement('li')
insertItem10.innerText = 'Item 10'
myList.appendChild(insertItem10)

const item1 = document.getElementsByTagName('li')[0];
item1.style.color = 'red';

const item3 = document.getElementsByTagName('li')[2];
item3.style.backgroundColor = 'blue';

const item4 = document.getElementsByTagName('li')[3];
item4.remove();


const newItem = document.createElement('li')
newItem.innerText = 'New item'
myList.insertBefore(newItem, myList.children[3])