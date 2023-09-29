let arr = ["one", "two", "three", "one", "one", "three"];

const getCountElement = (arr) => {
    let count = {};

    for (let i = 0; i < arr.length; i++) {
        if (count[arr[i]]) {
            count[arr[i]]++;
        } else {
            count[arr[i]] = 1;
        }
    }
    return count;

}

console.log(getCountElement(arr));