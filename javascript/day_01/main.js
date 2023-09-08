// let mark;
// function bai1(mark) {
//     if(mark >= 85) {
//         return 'A';
//     } else if (mark >= 70 && mark < 85) {
//         return 'B';
//     } else if ( mark >= 40 && mark < 70) {
//         return 'C';
//     } else {
//         return 'D';
//     }
// }

// console.log(bai1(45))

// function findMax(a, b) {
//     return Math.max(a, b);
// }

// console.log(findMax(2, 5))

// var number = prompt("Nhập vào một số: ");
// console.log("Bạn đã nhập số: " + number);
// function checkNumber(number) {
//     if(number > 0) {
//         return "Số dương";
//     } else if (number < 0) {
//         return "Số âm";
//     } else {
//         return "Số 0";
//     }
// }

// console.log(checkNumber(number));

// var number = prompt("Nhập vào một số: ");
// console.log("Bạn đã nhập số: " + number);
// function evenOrOdd(number) {
//     if(number % 2 == 0) {
//         return "Số chẵn";
//     } else {
//         return "Số lẻ";
//     }
// }

// console.log(evenOrOdd(number));

// var number = prompt("Nhập vào một số: ");
// console.log("Bạn đã nhập số: " + number);
// function checkNumber(number) {
//     if(number % 3 == 0 && number % 5 ==0) {
//         return true;
//     } else {
//         return false;
//     }
// }

// console.log(checkNumber(number));

// var a = parseInt(prompt("Nhập a: ")) ;
// console.log("a: " + a);
// var b = parseInt(prompt("Nhập b: ")) ;
// console.log("b: " + b);
// var c = parseInt(prompt("Nhập c: ")) ;
// console.log("c: " + c);
// function check(a, b, c) {
//     if(a + b === c) {
//         return true;
//     } else {
//         return false;
//     }
// }

// console.log(check(a, b, c));

//Bài 1:

// function repeatString(str) {
//     let newStr = "";
//     for (let i = 0; i < 10; i++) {
//         newStr += str; 
//     }
//     return newStr;
// }

// console.log(repeatString('a'));

//Bài 2:

// function repeatString(str) {
//     let newStr = "";
//     for (let i = 0; i < 10; i++) {
//         newStr += str + '-'; 
//     }
//     return newStr.slice(0, -1);
// }

// console.log(repeatString('a'));

//Bài 3 

// function repeatString(str, count) {
//     let newStr = "";
//     for (let i = 0; i < count; i++) {
//         newStr += str + '-'; 
//     }
//     return newStr.slice(0, -1);
// }

// console.log(repeatString('a', 5));

//Bài 4:

// function calcSum() {
//     let sum = 0;
//     for (let i = 0; i <= 100; i++) {
//         if (i % 5 === 0) {
//             sum += i;
//         }
//     }
//     return sum;
// }

// console.log(calcSum());

// Bài 5:

// function calcVol(r) {
//     return 4/3 * Math.PI * r * r* r;
// }

// console.log(calcVol(3));

//Bài 6:

function calcSum(a, b){
    let sum = 0;
    for(let i = Math.min(a, b) + 1; i < Math.max(a, b); i++) {
        sum += i;
    }
    return sum;
}

console.log(calcSum(8, 3));


