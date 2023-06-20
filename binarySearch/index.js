var twoSum = function(numbers, target) {
    for (let i = 0; i <= numbers.length - 2; i++) {
        const numj = target - numbers[i];
        const j = search(numbers, i + 1, numbers.length - 1, numj);
        if (!isNaN(j)) {
            return [i + 1, j + 1];
        }
    }
};

function search (numbers, start, end, numj) {
    if (end < start) {
        return undefined;
    }
    let middleIndex =  start + Math.floor((end - start + 1) / 2);
    if (numbers[middleIndex] > numj) {
        return search(numbers, start, middleIndex - 1, numj); 
    } else if (numbers[middleIndex] < numj) {
        return search(numbers, middleIndex + 1, end, numj);
    } else if (numbers[middleIndex] === numj) {
        return middleIndex;
    }
}

const numbers = [5, 25, 75];
console.log(search(numbers, 1, 2, 95));

console.log(twoSum(numbers, 100));