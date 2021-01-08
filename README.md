# Exercises

1. Create an array that will hold 10 integer values, populate the array with values, then call and output each element.

```java
// question 1 
int firstArray[] = { 0,1,2,3,4,5,6,7,8,9 };
 
for (int i = 0; i < firstArray.length; i++) {
	System.out.println(firstArray[i]);
}
```

2. Create a for loop that populates an integer array with values, outputting them at each iteration.

```java
// question 2
List<Integer> secondArray = new ArrayList<Integer>();
 
for (int i=0; i < 10; i++) {
 	secondArray.add(i);
 	System.out.println(secondArray);
}
 ```

3. Then create another loop that iterates through the array, changing the values at each point to equal itself times 10, outputting them at each iteration.

```java
// question 3
List<Integer> thirdArray = new ArrayList<Integer>();

for (int i=0; i < 10; i++) {
	thirdArray.add(i);
}

for (int i=0; i < thirdArray.size(); i++) {
	thirdArray.set(i, i*10);
}

System.out.println(thirdArray);
```