# Sudoku
##### A simple soduku game
A sudoku game made using arrays where an initial array and a final array are set. The initial array is the solvable sudoku board where the user will guess the missing numbers, and the system will check the responses to see if they match the final array. This program will work by checking inputs for the rows and columns and sets a new value. 

As of now, we are able to get user input for each cell, and have a check to make sure the uuser doesn't over lay values. In the future, we will add functionality to check the individual/groups of rows and columns to make sure no values are respeated

#### Documentation
Currently, integers are used as comparators to the answer and question arrays, which are preset for now, in the future, random gameboard generation will be implemented with respect to difficulty
#### Current UML
Integers set for N0 and N1 comparison, along with insertion values. Integer Arrays set up for game board production and comparison check to answer array. Display Array set for initial game board, and an updating array to display user input

![TestGraphic](https://github.com/WREX-YX/Group5Project/blob/main/sudoku%20uml1.png)
#### Conceptual UML
Custom methods and values to set cells and put in place with the actual array, with method setting and colors for errors. Game method added to tie together functionality and game control to check for positioning and errors.

![TestGraphic](https://github.com/WREX-YX/Group5Project/blob/main/SudokuUML.png)

#### Credidation
Jonathan Ma-Design and UML/Technical Docs/Coding
Katherine Smirnov-Class Orginization/Coding
Elijah Hansen-Conceptual Data/Research/Lead Coding
Samuel Nelson-Class Design/Coding
