public class SearchDriver{
  //bunch of helper methods to simplify code, or to test code
  //populate array method so we don't need random for loops in the main method
  public static void populateArray(Comparable[] input) {
    for (int i = 0; i < input.length; i++) {
      input[i] = i;
    }
  }

  public static void populateRandom(Integer[] input, int size) {
    for (int i = 0; i < input.length; i++) {
      input[i] = (int)(Math.random()*size);
    }
  }

  public static long testTimeB(Comparable[] input, int target) {
    long startTimeB = System.currentTimeMillis();
    for (int i = 0; i < 100000; i++){
      BinSearch.binSearch(input, target);
    }
    long endTimeB = System.currentTimeMillis();
    long resultB = endTimeB - startTimeB;
    return resultB;
  }

  public static long testTimeL(Comparable[] input) {
    long startTimeL = System.currentTimeMillis();
    for (int i =0; i< 10; i++){
      LinSearch.linSearch(input, input[input.size-1]);
    }
    long endTimeL = System.currentTimeMillis();
    long resultL = endTimeL - startTimeL;
    return resultL;
  }

  public static void print2DArray(int[][] input) {
    String output = "";
    for (int i = 0; i < input.length; i++) {
      output += "[";
      for (int j = 0; j < input[i].length; j++) {
        if (j == 0) {
          output += input[i][j];
        } else {
        output += "," + input[i][j];
        }
      }
      output += "]" + "\n";
    }
    System.out.println(output);
  }

  public static void fillResults(Comparable[] input, Integer[] randoms, int[][] results) {
    for (int i = 0; i < 50; i++) {
      results[0][i] += testTimeB(input, randoms[i]);
      results[1][i] += testTimeL(input);
    }
  }

  //extra toString method for testing populate ( (very) slow method to run, especially for the longer arrays)
  public static String toString(Comparable[] input) {
    String output = "[";
    for (int i = 0; i < input.length; i++) {
      if (i == 0) {
        output += input[i];
      } else {
        output += "," + input[i];
      }
    }
    output += "]";
    return output;
  }
  
  public static void averageTestTime(int[][] results){
    int binary = 0;
    int linear = 0;
    for (int i = 0; i < results[0].length; i++){
      binary += results[0][i];
    }
    for (int i = 0; i < results[0].length; i++){
      linear += results[1][i];
    }
    binary = binary / results[0].length;
    linear = linear / results[1].length;
    System.out.println("Binary Average: " + binary);
    System.out.println("Linear Average: " + linear);
  }

  public static void main(String[] args){
    //declares array of integers to be filled in ascending order
    Comparable[] one = new Integer[100000];
    Comparable[] two = new Integer[200000];
    Comparable[] three = new Integer[500000];
    Comparable[] four = new Integer[1000000];
    Comparable[] five = new Integer[7000000];
    Comparable[] six = new Integer[8000000];

    //declares array of integers to be filled by random numbers
    Integer[] randomNums1 = new Integer[50];
    Integer[] randomNums2 = new Integer[50];
    Integer[] randomNums3 = new Integer[50];
    Integer[] randomNums4 = new Integer[50];
    Integer[] randomNums5 = new Integer[50];
    Integer[] randomNums6 = new Integer[50];

    //declares array of results (time it took for the search to run)
    int[][] results1 = new int[2][50];
    int[][] results2 = new int[2][50];
    int[][] results3 = new int[2][50];
    int[][] results4 = new int[2][50];
    int[][] results5 = new int[2][50];
    int[][] results6 = new int[2][50];

    //populates each of the arrays
    populateArray(one);
    populateArray(two);
    populateArray(three);
    populateArray(four);
    populateArray(five);
    populateArray(six);

    //populates the random arrays with integers in the range 0 to 2nd argument - 1
    populateRandom(randomNums1, 100000);
    populateRandom(randomNums2, 200000);
    populateRandom(randomNums3, 500000);
    populateRandom(randomNums4, 1000000);
    populateRandom(randomNums5, 7000000);
    populateRandom(randomNums6, 8000000);

    //fills the result arrays
    fillResults(one, randomNums1, results1);
    fillResults(two, randomNums2, results2);
    fillResults(three, randomNums3, results3);
    fillResults(four, randomNums4, results4);
    fillResults(five, randomNums5, results5);
    fillResults(six, randomNums6, results6);

    //prints it out for easy viewing
/*
    print2DArray(results1);
    print2DArray(results2);
    print2DArray(results3);
    print2DArray(results4);
    print2DArray(results5);
    print2DArray(results6);
  */  
    averageTestTime(results1);
    averageTestTime(results2);
    averageTestTime(results3);
    averageTestTime(results4);
    averageTestTime(results5);
    averageTestTime(results6);
    //things to add: something to find the average time, in milliseconds to find out which is faster
    //maybe print out the random array?
    //fix the binary search thing so it gives actual numbers (unless it actually is that fast)
    //something to test out speed of binary search recursive vc binary search iterative
  }
}

