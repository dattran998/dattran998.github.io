const h1 = document.querySelector('h1');
console.log(h1.classList);

h1.classList.add('text-big', 'text-bold');

h1.classList.remove('text-big');

// console.log(h1.classList.contains('text-bold'));
// setInterval(() => {
//     h1.classList.toggle('text-red');
// }, 1000);

let count = 10;
let interval = setInterval(() => {
    count--;
    h1.innerText = `${count}s`
    if(count === 0) {
        h1.innerText = "Chúc mừng năm mới";
        clearInterval(interval);
    }
}, 1000)