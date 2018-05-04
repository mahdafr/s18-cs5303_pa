# CS5303 Programming Project (Option 1: Propositional Logic)

## General Description
For the CS5303 course, I will be doing the Propositional Logic Programming Assignment (Option 1). The program will prompt the user for a propositional logic expression (see accepted input below). The program will prompt the user to choose from the following:
* Transform it into Conjunctive Normal Form (CNF).
* Transform it into Disjunctive Normal Form (DNF).
* Transform it into full CNF.
* Transform it into full DNF.
* Evaluate its truth value given values of the atoms.
* Determine if the formula is satisfiable, a tautology, or a contradiction.

## Link to GitHub Repository
The project/program is available for download/viewing at: https://github.com/mahdafr/s18-cs5303_pa

### Design / Environment
The project follows a Model-View Controller (MVC) software design with a GUI/Frontend, Backend, and a Controller to handle communications between the two. The program is built in a Windows 10 Home environment, using an Intel i7 7th-gen processor and 16GB installed RAM. The program is developed in IntelliJ IDEA (2018.1.2 Community Edition) using java1.8u144.

## To Run
As of May03, there is no executable/jar for the program. To run (in the terminal):
1. Navigate to the src directory of the project.
2. In a Windows terminal with java SDK installed, build the Main.java file (javac Main.java).
3. Running this build will create an instance of the program (java Main).
4. Program compiles/runs with no warnings/errors.
5. Program has no backend behavior (see code in src/pa/ and src/utils/ directories), but will exit on command (-1).

### Releases
* v1.1 contains a functional GUI, stubs for each class, flowcharts (in PDF and Word formats), and a readme with the description of how to run
    * this version is adapted from the working version of my option 2 decision I cannot complete at this time

### Accepted Forms of Input
The syntax we will use for propositional formulas is the following: i.e., here are rules that should be used when putting together propositional formulas.
1. All letter from our roman alphabet _A = {a, ..., z}_ can be used as variables.
2. Given any two propositional formulas _P_ and _Q_:
	* the conjunction of _P_ and _Q_ will be represented as _(P & Q)_.
	* the disjunction of _P_ and _Q_ will be represented as _(P | Q)_.
	* the implication of _P_ and _Q_ will be represented as _(P -> Q)_.
	* _note that the parentheses are important, and part of the syntax to be used._

## Progress
### May03 GUI / Backend Stubs
* Contains a functional GUI/Frontend.
* Contains a stubbed-Backend.
* Contains a Flow-Chart presented as both PDF and Word documents.
* Contains a Readme up to V1.2.

# Previous Attempt: Option 2 _oh, the shame!_
I unfortunately don't have the time to debug my errors for Option 2... :(

## General Description
For the CS5303 course, I will be doing the Predicate Logic Programming Assignment (Option 2). The program will prompt the user for a predicate logic expression (see accepted input below). The program will prompt the user to choose from the following:
* Transform it into prenex form.
* Skolemize the prenex form.
* Transform the Skolemized form into Conjunctive Normal Form (CNF).
* Transform the Skolemized form into Disjunctive Normal Form (DNF).

## Link to GitHub Repository
The project/program is available for download/viewing at: https://github.com/mahdafr/s18-cs5303_pl

### Design / Environment
The project follows a Model-View Controller (MVC) software design with a GUI/Frontend, Backend, and a Controller to handle communications between the two. The program is built in a Windows 10 Home environment, using an Intel i7 7th-gen processor and 16GB installed RAM. The program is developed in Eclipse Java Oxygen3 (Release 4.7.3) using java1.8u144.

## To Run
As of Apr13, there is no executable/jar for the program. To run (in the terminal):
1. Navigate to the src directory of the project.
2. In a Windows terminal with java SDK installed, build the Main.java file (javac Main.java).
3. Running this build will create an instance of the program (java Main).
4. Program compiles/runs with no warnings/errors.
5. Program has no backend behavior (see code in src/pa/ and src/utils/ directories), but will exit on command (-1).

### Releases
* v1.1 contains a functional GUI
* v1.2 contains a functional GUI AND stubs for each class
* v1.3 contains a functional GUI, stubs for each class, and flowcharts (in PDF and Word formats)
* v1.4 contains all above, and a readme with the description of how to run

### Accepted Forms of Input
The syntax we will use for propositional formulas is the following: i.e., here are rules that should be used when putting together propositional formulas.
1. All letter from our roman alphabet _A = {a, ..., z}_ can be used as variables.
2. Skolem constants are denoted by alphabet letters from _A_ with a subscripted integer value (e.g., _x3_).
3. Skolem functions are denoted by _fn(.)_ where _n_ is a given integer.
4. The existential quantifier (there exists) is represented by TE.
5. The universal quantifier (for all) is represented by FA.
6. Predicate names start with a capital letter.
7. Given any predicate logic formula _P_, _not (P)_ will be represented as _!P_.
8. Given any two propositional formulas _P_ and _Q_:
	* the conjunction of _P_ and _Q_ will be represented as _(P & Q)_.
	* the disjunction of _P_ and _Q_ will be represented as _(P | Q)_.
	* the implication of _P_ and _Q_ will be represented as _(P -> Q)_.
	* _note that the parentheses are important, and part of the syntax to be used._

## Progress
### Mar23 GUI / Backend Stubs
* Contains a functional GUI/Frontend.
* Contains a stubbed-Backend.
### Apr13 Flow-Chart / Readme
* Contains a Flow-Chart presented as both PDF and Word documents.
* Contains a Readme up to V1.2.