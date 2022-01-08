#!/bin/sh
echo "La compilation s'est bien lancé"

 #javac -d build src/constraints/*.java  
 javac -Xdiags:verbose -d build -cp lib/constraintstests.jar:lib/solverstests.jar src/constraints/*.java src/solvers/*.java
 java -cp build constraints.Main
 #java -cp build:lib/constraintstests.jar:lib/solverstests.jar constraints.Test 

 

 