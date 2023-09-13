//Bài 1:
function findMax(arr) {
    let max = arr[0];
    for(let i = 0; i < arr.length; i++) {
        if(arr[i] > max) {
            max = arr[i];
        }
    }
    return max;
}

let arr = [1, 3, 6, 32, 5, 322];

console.log(findMax(arr));

console.log('------------------------')

//Bài 2:
function findMin(arr) {
    let min = arr[0];
    for(let i = 0; i < arr.length; i++) {
        if(arr[i] < min) {
            min = arr[i];
        }
    }
    return min;
}

let arr2 = [1, 3, 6, 32, 5, 322];

console.log(findMin(arr2));

console.log('------------------------')

//Bài 3:
function processArray(arr) {
    let arr2 = [];
    for (let i = 0; i < arr.length; i++) {
        arr2[i] = arr[i] % 2;
    }

    return arr2;
}

arr = [4,2,5,6,2,7];
console.log(processArray(arr))

console.log('------------------------')

//Bài 4:
function processarray2(str) {
    let newStr = '';
    for(let i = 0; i < 10; i++) {
        newStr += str;
    }

    return newStr;
}
console.log(processarray2('a'));
console.log('------------------------')

//Bài 5:
function processarray3(str) {
    let newStr = '';
    for(let i = 0; i < 10; i++) {
        newStr += str + '-';
    }

    return newStr.slice(0, -1);
}
console.log(processarray3('a'));
console.log('------------------------')

//Bài 6:
function isSymmetricString(str){
    let newStr1 = str.replace(/\s/g, '').toLowerCase().split('').reverse().join('');
    let newStr2 = str.replace(/\s/g, '').toLowerCase().split('').join('');
    return newStr1 == newStr2;
}

console.log(isSymmetricString('hello world'))
console.log('------------------------')

//Bài 7:
function sortNumber(num) {
    let str = num.toString();
    let arr = str.split('');


}
console.log('------------------------')

// Danh sách các sản phẩm có trong giỏ hàng
let products = [
    {
        name: "Iphone 13 Pro Max", // Tên sản phẩm
        price: 3000000, // Giá mỗi sản phẩm
        brand: "Apple", // Thương hiệu
        count: 2, // Số lượng sản phẩm trong giỏ hàng
    },
    {
        name: "Samsung Galaxy Z Fold3",
        price: 41000000,
        brand: "Samsung",
        count: 1,
    },
    {
        name: "IPhone 11",
        price: 15500000,
        brand: "Apple",
        count: 1,
    },
    {
        name: "OPPO Find X3 Pro",
        price: 19500000,
        brand: "OPPO",
        count: 3,
    },
]

// 1. In ra thông tin các sản phẩm trong giỏ hàng theo cấu trúc sau
// Tên - Giá - Thương Hiệu - Số lượng
// Ví dụ : OPPO Find X3 Pro - 19500000 - OPPO - 3

const showProduct = products => {
    products.forEach(p => {
        console.log(`${p.name} - ${p.price} - ${p.brand} - ${p.count}`);
    });
}

showProduct(products)

// 2. Tính tổng tiền tất cả sản phẩm trong giỏ hàng
// Tổng tiền mỗi sản phẩm = price * count

const totalPrice = products => {
    let total = 0;
    products.forEach(p => {
        total += p.price * p.count;
    })
    return total;
}

console.log(totalPrice(products))

// 3. Tìm các sản phẩm của thuơng hiệu "Apple"

const findByBranch = (products, brandname) => {
    let rs = [];
    products.forEach(p => {
        if(p.brand == brandname) {
            rs.push(p);
        }
    })

    return rs;
}

console.log(findByBranch(products, 'Apple'));
// 4. Tìm các sản phẩm có giá > 20000000

// 5. Tìm các sản phẩm có chữ "pro" trong tên (Không phân biệt hoa thường)

// 6. Thêm 1 sản phẩm bất kỳ vào trong mảng product

// 7. Xóa tất cả sản phẩm của thương hiệu "Samsung" trong giỏ hàng

// 8. Sắp xếp giỏ hàng theo price tăng dần

// 9. Sắp xếp giỏ hàng theo count giảm dần

// 10. Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng
