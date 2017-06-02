#!/bin/bash
echo "Task #1"
mkdir bin
javac -d bin -cp src src/javase01/t01/main/Main.java
java -cp bin javase01/t01/main/Main
echo "Task #2"
mkdir bin/javase01/t02/
javac -d bin/javase01/t02/ src/javase01/t02/Epsilon.java
java -cp bin/javase01/t02/ Epsilon 0.003

