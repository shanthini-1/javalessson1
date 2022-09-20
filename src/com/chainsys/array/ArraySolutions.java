package com.chainsys.array;

public class ArraySolutions {
public static void findSumandAverageOfaFloatArray(float[]nums) {
//write code to find the sum ,and average of nums
double result=0;
int count=nums.length;
for(int i=0;i<count;i++) {
System.out.println(nums[i]+",");
}
System.out.println();
for(int i=0;i<count;i++) {
result=result+nums[i];
}
System.out.println("sum is:"+result);
System.out.println("Average is:"+result/count);
}
public static void findTheLargestNumberinArray(float[]num) {
//write code to find the largest number
double result=num[0];
int count=num.length;
for(int i=1;i<count;i++) {
if(result<num[i])result=num[i];
}
System.out.println("The largest No is:"+result);
}
public static void bubbleSort() {
int[]nos= {11,23,4,56,32,43,323,76,8,54,56};
System.out.println("Original Values Before: ");
for(int index=0;index<nos.length;index++) {
System.out.print(nos[index]+",");
}
System.out.println();
int count=nos.length;
int temp=0;
for(int i=0;i<count;i++) {
for(int j=0;j<(count-1);j++) {
if(nos[j+1]<nos[j]) {
temp=nos[j];
nos[j]=nos[j+1];
nos[j+1]=temp;
temp=0;
}
}
}
System.out.println("Values after SORT");
for(int index=0;index<nos.length;index++) {
System.out.print(nos[index]+",");
}
}
}
