let arr = ['aba', 'aa', 'ad', 'c', 'vcd'];
let result = [];

const getStringHasMaxLength = (arr) => {
    let maxLength = 0;
    for (let i = 0; i < arr.length; i++) {
        if (arr[i].length > maxLength) {
            maxLength = arr[i].length;
        }
    }
    for (let i = 0; i < arr.length; i++) {
        if (arr[i].length === maxLength) {
            result.push(arr[i]);
        }
    }

    return result;
}

console.log(getStringHasMaxLength(arr));