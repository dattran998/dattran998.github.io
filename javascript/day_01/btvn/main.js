//Bài 1:
console.log('Bài 1:')
function calculateFactorial(num) {
    if(num == 0) return 1;
    while(num > 0) {
        return num * calculateFactorial(num -1);
    } 
}

console.log(calculateFactorial(5));
console.log('-----------')

// Bài 2
console.log('Bài 2:')
function reverseString(str) {
    let newStr = '';
    
    for (let i = str.length - 1; i >= 0 ; i--) {
        newStr += str[i];
    }
    return newStr;
}

console.log(reverseString('hello'));
console.log('-----------')

//Bài 3: 
console.log('Bài 2:')

function translate(country) {
    switch(country) {
        case 'EN': {
            return 'Hello';
            break;
        }

        case 'JP': {
            return 'こんにちは';
            break;
        }

        case 'KR': {
            return 'Bonjour';
            break;
        }
    }
}

console.log(translate('JP'));
console.log('-----------')

//Bài 4:
console.log('Bài 2:')
function subString(str) {
    let newStr = '';
    for (let i = 0; i < 10; i++) {
        newStr += str[i];
    }
    return newStr + '...';
} 

console.log(subString("xinchaocacbandenvoiTechmaster"));
console.log('-----------')


