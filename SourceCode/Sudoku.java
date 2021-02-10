import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    //Array for Finding
    int[][] visArr = {
      {50,30,0,0,70,0,0,0,0},
      {60,0,0,10,90,50,0,0,0},
      {0,90,80,0,0,0,0,60,0},
      {80,0,0,0,60,0,0,0,30},
      {40,0,0,80,0,30,0,0,10},
      {70,0,0,0,20,0,0,0,60},
      {0,60,0,0,0,0,20,80,0},
      {0,0,0,40,10,90,0,0,50},
      {0,0,0,0,80,0,0,70,90}
    };
    //Array for Answers
    int[][] ansArr = {import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    //Array for Finding
    int[][] visArr = { 
      {50,30,0,0,70,0,0,0,0},
      {60,0,0,10,90,50,0,0,0},
      {0,90,80,0,0,0,0,60,0},
      {80,0,0,0,60,0,0,0,30},
      {40,0,0,80,0,30,0,0,10},
      {70,0,0,0,20,0,0,0,60},
      {0,60,0,0,0,0,20,80,0},
      {0,0,0,40,10,90,0,0,50},
      {0,0,0,0,80,0,0,70,90}
    };
    //Array for Answers
    int[][] ansArr = {
      {50,30,4,6,70,8,9,1,2},
      {60,7,2,10,90,50,3,4,8},
      {1,90,80,3,4,2,5,60,7},
      {80,5,9,7,60,1,4,2,30},
      {40,2,6,80,5,30,7,9,10},
      {70,1,3,9,20,4,8,5,60},
      {9,60,1,5,3,7,20,80,4},
      {2,8,7,40,10,90,6,3,50},
      {3,4,5,2,80,6,1,70,90}
    };

    Scanner inp = new Scanner(System.in);
    
    String sep = "  |--------------|||--------------|||--------------|";

    String sep2 = "  |==============|||==============|||==============|";

    //Display Sets a[x=a,y=i]
    while(visArr!=ansArr){
      System.out.println("    1    2    3      4    5    6      7    8    9");

      //a(1,0-8)
      System.out.println(sep);

      System.out.println("1 | "+visArr[0][0]+" | "+visArr[0][1]
      +" | "+visArr[0][2]+"_ ||| "+visArr[0][3]+"_ | "+visArr[0][4]
      +" | "+visArr[0][5]+"_ ||| "+visArr[0][6]+"_ | "+visArr[0][7]+"_ | "+visArr[0][8]+"_ | ");

      //a(2,0-8)
      System.out.println(sep);

      System.out.println("2 | "+visArr[1][0]+" | "+visArr[1][1]
      +"_ | "+visArr[1][2]+"_ ||| "+visArr[1][3]+" | "+visArr[1][4]
      +" | "+visArr[1][5]+" ||| "+visArr[1][6]+"_ | "+visArr[1][7]+"_ | "+visArr[1][8]+"_ |");

      //a(3,0-8)
      System.out.println(sep);

      System.out.println("3 | "+visArr[2][0]+"_ | "+visArr[2][1]
      +" | "+visArr[2][2]+" ||| "+visArr[2][3]+"_ | "+visArr[2][4]
      +"_ | "+visArr[2][5]+"_ ||| "+visArr[2][6]+"_ | "+visArr[2][7]+" | "+visArr[2][8]+"_ |");

      //a(4,0-8)
      System.out.println(sep2);

      System.out.println("4 | "+visArr[3][0]+" | "+visArr[3][1]
      +"_ | "+visArr[3][2]+"_ ||| "+visArr[3][3]+"_ | "+visArr[3][4]
      +" | "+visArr[3][5]+"_ ||| "+visArr[3][6]+"_ | "+visArr[3][7]+"_ | "+visArr[3][8]+" |");

      //a(5,0-8)
      System.out.println(sep);

      System.out.println("5 | "+visArr[4][0]+" | "+visArr[4][1]
      +"_ | "+visArr[4][2]+"_ ||| "+visArr[4][3]+" | "+visArr[4][4]
      +"_ | "+visArr[4][5]+" ||| "+visArr[4][6]+"_ | "+visArr[4][7]+"_ | "+visArr[4][8]+" |");

      //a(6,0-8)
      System.out.println(sep);

      System.out.println("6 | "+visArr[5][0]+" | "+visArr[5][1]
      +"_ | "+visArr[5][2]+"_ ||| "+visArr[5][3]+"_ | "+visArr[5][4]
      +" | "+visArr[5][5]+"_ ||| "+visArr[5][6]+"_ | "+visArr[5][7]+"_ | "+visArr[5][8]+" |");

      //a(7,0-8)
      System.out.println(sep2);

      System.out.println("7 | "+visArr[6][0]+"_ | "+visArr[6][1]
      +" | "+visArr[6][2]+"_ ||| "+visArr[6][3]+"_ | "+visArr[6][4]
      +"_ | "+visArr[6][5]+"_ ||| "+visArr[6][6]+" | "+visArr[6][7]+" | "+visArr[6][8]+"_ |");

      //a(8,0-8)
      System.out.println(sep);

      System.out.println("8 | "+visArr[7][0]+"_ | "+visArr[7][1]
      +"_ | "+visArr[7][2]+"_ ||| "+visArr[7][3]+" | "+visArr[7][4]
      +" | "+visArr[7][5]+" ||| "+visArr[7][6]+"_ | "+visArr[7][7]+"_ | "+visArr[7][8]+" |");

      //a(9,0-8)
      System.out.println(sep);

      System.out.println("9 | "+visArr[8][0]+"_ | "+visArr[8][1]
      +"_ | "+visArr[8][2]+"_ ||| "+visArr[8][3]+"_ | "+visArr[8][4]
      +" | "+visArr[8][5]+"_ ||| "+visArr[8][6]+"_ | "+visArr[8][7]+" | "+visArr[8][8]+" |");

      //a[x,b]
      System.out.println(sep);

      //Gets collum input
      System.out.println("Which column would you like to change?");
      int val1 = inp.nextInt();
      //val1--;

      //Gets row Input
      System.out.println("Which row would you like to select?");
      int val2 = inp.nextInt();
      //val2--;

      //gets value change input
      System.out.println("What would you like to change the value to? (interger 1-9)");
      int newVal = inp.nextInt();

      //sets new value
      if((val1==1 && val2==1)||(val1==2 && val2==1)||(val1==5 && val2==1)||(val1==1 && val2==2)||(val1==4 && val2==2)||(val1==5 && val2==2)||(val1==6 && val2==2)||(val1==2 && val2==3)||(val1==3 && val2==3)||(val1==8 && val2==3)||(val1==1 && val2==4)||(val1==5 && val2==4)||(val1==9 && val2==4)||(val1==1 && val2==5)||(val1==4 && val2==5)||(val1==6 && val2==5)||(val1==9 && val2==5)||(val1==1 && val2==6)||(val1==5 && val2==6)||(val1==9 && val2==6)||(val1==2 && val2==7)||(val1==7 && val2==7)||(val1==8 && val2==7)||(val1==4 && val2==8)||(val1==5 && val2==8)||(val1==6 && val2==8)||(val1==9 && val2==8)||(val1==5 && val2==9)||(val1==8 && val2==9)||(val1==9 && val2==9)||newVal>9||newVal<1||val1>9||val1<1||val2>9||val2<1){
        System.out.println("invalid entry");
      } else{
        val1--;
        val2--;
        visArr[val2][val1] = newVal;
      }
    }
    System.out.println("you win!");
  }
}
//System.out.println(Arrays.deepToString(ansArr)); 
      {50,30,4,6,70,8,9,1,2},
      {6,7,2,10,90,50,3,4,8},
      {1,90,8,3,4,2,5,60,7},
      {80,5,9,7,60,1,4,2,30},
      {40,2,6,80,5,30,7,9,10},
      {70,1,3,9,20,4,8,5,60},
      {9,60,1,5,3,7,20,80,4},
      {2,8,7,40,10,90,6,3,50},
      {3,4,5,2,80,6,1,70, 90}
    };

    Scanner inp = new Scanner(System.in);

    //Display Sets a[x=a,y=i]
    while(visArr!=ansArr){
      System.out.println("    1    2    3      4    5    6      7    8    9");
      //a(1,0-8)
      System.out.println("  |--------------|||--------------|||--------------|");
      System.out.println("1 | "+visArr[0][0]+" | "+visArr[0][1]
      +" | "+visArr[0][2]+"_ ||| "+visArr[0][3]+"_ | "+visArr[0][4]
      +" | "+visArr[0][5]+"_ ||| "+visArr[0][6]+"_ | "+visArr[0][7]+"_ | "+visArr[0][8]+"_ | ");
      //a(2,0-8)
      System.out.println("  |--------------|||--------------|||--------------|");
      System.out.println("2 | "+visArr[1][0]+" | "+visArr[1][1]
      +"_ | "+visArr[1][2]+"_ ||| "+visArr[1][3]+" | "+visArr[1][4]
      +" | "+visArr[1][5]+" ||| "+visArr[1][6]+"_ | "+visArr[1][7]+"_ | "+visArr[1][8]+"_ |");
      //a(3,0-8)
      System.out.println("  |--------------|||--------------|||--------------|");
      System.out.println("3 | "+visArr[2][0]+"_ | "+visArr[2][1]
      +" | "+visArr[2][2]+" ||| "+visArr[2][3]+"_ | "+visArr[2][4]
      +"_ | "+visArr[2][5]+"_ ||| "+visArr[2][6]+"_ | "+visArr[2][7]+" | "+visArr[2][8]+"_ |");
      //a(4,0-8)
      System.out.println("  |==============|||==============|||==============|");
      System.out.println("4 | "+visArr[3][0]+" | "+visArr[3][1]
      +"_ | "+visArr[3][2]+"_ ||| "+visArr[3][3]+"_ | "+visArr[3][4]
      +" | "+visArr[3][5]+"_ ||| "+visArr[3][6]+"_ | "+visArr[3][7]+"_ | "+visArr[3][8]+" |");
      //a(5,0-8)
      System.out.println("  |--------------|||--------------|||--------------|");
      System.out.println("5 | "+visArr[4][0]+" | "+visArr[4][1]
      +"_ | "+visArr[4][2]+"_ ||| "+visArr[4][3]+" | "+visArr[4][4]
      +"_ | "+visArr[4][5]+" ||| "+visArr[4][6]+"_ | "+visArr[4][7]+"_ | "+visArr[4][8]+" |");
      //a(6,0-8)
      System.out.println("  |--------------|||--------------|||--------------|");
      System.out.println("6 | "+visArr[5][0]+" | "+visArr[5][1]
      +"_ | "+visArr[5][2]+"_ ||| "+visArr[5][3]+"_ | "+visArr[5][4]
      +" | "+visArr[5][5]+"_ ||| "+visArr[5][6]+"_ | "+visArr[5][7]+"_ | "+visArr[5][8]+" |");
      //a(7,0-8)
      System.out.println("  |==============|||==============|||==============|");
      System.out.println("7 | "+visArr[6][0]+"_ | "+visArr[6][1]
      +" | "+visArr[6][2]+"_ ||| "+visArr[6][3]+"_ | "+visArr[6][4]
      +"_ | "+visArr[6][5]+"_ ||| "+visArr[6][6]+" | "+visArr[6][7]+" | "+visArr[6][8]+"_ |");
      //a(8,0-8)
      System.out.println("  |--------------|||--------------|||--------------|");
      System.out.println("8 | "+visArr[7][0]+"_ | "+visArr[7][1]
      +"_ | "+visArr[7][2]+"_ ||| "+visArr[7][3]+" | "+visArr[7][4]
      +" | "+visArr[7][5]+" ||| "+visArr[7][6]+"_ | "+visArr[7][7]+"_ | "+visArr[7][8]+" |");
      //a(9,0-8)
      System.out.println("  |--------------|||--------------|||--------------|");
      System.out.println("9 | "+visArr[8][0]+"_ | "+visArr[8][1]
      +"_ | "+visArr[8][2]+"_ ||| "+visArr[8][3]+"_ | "+visArr[8][4]
      +" | "+visArr[8][5]+"_ ||| "+visArr[8][6]+"_ | "+visArr[8][7]+" | "+visArr[8][8]+" |");
      //a[x,b]
      System.out.println("  |--------------|||--------------|||--------------|");

      //Gets collum input
      System.out.println("Which collum would you like to change?");
      int val1 = inp.nextInt();
      //val1--;

      //Gets row Input
      System.out.println("Which row would you like to select?");
      int val2 = inp.nextInt();
      //val2--;

      //gets value change input
      System.out.println("What would you like to change the value to? (interger 1-9)");
      int newVal = inp.nextInt();

      //sets new value
      if((val1==1 && val2==1)||(val1==2 && val2==1)||(val1==5 && val2==1)||(val1==1 && val2==2)||(val1==4 && val2==2)||(val1==5 && val2==2)||(val1==6 && val2==2)||(val1==2 && val2==3)||(val1==3 && val2==3)||(val1==8 && val2==3)||(val1==1 && val2==4)||(val1==5 && val2==4)||(val1==9 && val2==4)||(val1==1 && val2==5)||(val1==4 && val2==5)||(val1==6 && val2==5)||(val1==9 && val2==5)||(val1==1 && val2==6)||(val1==5 && val2==6)||(val1==9 && val2==6)||(val1==2 && val2==7)||(val1==7 && val2==7)||(val1==8 && val2==7)||(val1==4 && val2==8)||(val1==5 && val2==8)||(val1==6 && val2==8)||(val1==9 && val2==8)||(val1==5 && val2==9)||(val1==8 && val2==9)||(val1==9 && val2==9)||newVal>9||newVal<1||val1>9||val1<1||val2>9||val2<1){
        System.out.println("invalid entry");
      } else{
        val1--;
        val2--;
        visArr[val2][val1] = newVal;
      }
    }
  }
}
//System.out.println(Arrays.deepToString(ansArr)); 
