#!/bin/bash
echo "Task #1"
mkdir bin
javac -d bin -cp src src/javase01/t01/main/Main.java
java -cp bin javase01/t01/main/Main
echo "Task #2"
javac -d bin src/javase01/t02/Epsilon.java
java -cp bin javase01/t02/Epsilon 0.003
echo "Task #3"
javac -d bin src/javase01/t03/Tg.java
java -cp bin javase01/t03/Tg 1 4 .5

