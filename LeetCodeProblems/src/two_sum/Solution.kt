package two_sum

fun main() {

    var nums:IntArray = intArrayOf(2,5,5,11)
    var target:Int = 10

    twoSum(nums,target)
}

fun twoSum(nums:IntArray,target:Int):IntArray{

    var indices = mutableListOf<Int>()

    for (i in nums.indices){
        for (j in i+1..nums.size - 1){
            if (nums[i]+nums[j] == target){
                indices.add(i)
                indices.add(j)
                return indices.toIntArray()
            }
        }
    }

    return indices.toIntArray()
}