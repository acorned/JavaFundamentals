#!/bin/bash
echo "Task #1"
mkdir bin -p
javac -d bin -cp src src/javase01/t01/main/Main.java
java -cp bin javase01/t01/main/Main
echo "Task #2"
javac -d bin src/javase01/t02/Epsilon.java
java -cp bin javase01/t02/Epsilon 0.003
echo "Task #3"
javac -d bin src/javase01/t03/Tg.java
java -cp bin javase01/t03/Tg 1 4 .5
echo "Task #4"
echo "WARNING! Task is solved for array (a1, a2 … a2n), because solving for (a1, a2 … an) doesn't make sense."
javac -d bin src/javase01/t04/Arrs.java
java -cp bin javase01/t04/Arrs 1 2 4 5 3 5 1 2 4 3
echo "Task #5"
javac -d bin src/javase01/t05/Matrix.java
java -cp bin javase01/t05/Matrix 11
