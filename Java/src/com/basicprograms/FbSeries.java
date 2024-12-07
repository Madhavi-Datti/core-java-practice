package com.basicprograms;
class FbSeries
{
public static void main(String[] args)
{
int num = 10;
int firstNum = 0;
int secondNum = 1;
for(int i = 1; i<=num;i++)
{
System.out.println(firstNum);
if(i<num)
{
System.out.println(firstNum);
}
}
int nextNum = firstNum+secondNum;
firstNum = secondNum;
secondNum = nextNum;
}
}
