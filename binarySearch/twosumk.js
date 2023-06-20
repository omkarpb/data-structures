var twoSumLessThanK = function(nums, k) {
    let max = -1;
    for (let i = 0; i <= nums.length - 2; i++) {
        for (let j = i + 1; j <= nums.length - 1; j++) {
            const addition = nums[i] + nums[j];
            if (addition < k && addition > max) {
                max = addition;
            }
        }
    }
    return max;
};
const nums = [358,898,450,732,672,672,256,542,320,573,423,543,591,280,399,923,920,254,135,952,115,536,143,896,411,722,815,635,353,486,127,146,974,495,229,21,733,918,314,670,671,537,533,716,140,599,758,777,185,549]

console.log(twoSumLessThanK(nums, 1800));