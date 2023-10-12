package p2;

public class Main {
    public static void main(String[] args) {
int[] numbers;
int numbers2[];

numbers = new int[5];
for(int i = 0; i<5; i++){
    System.out.println(numbers[i]);
    //numbers[i] = 1;
    System.out.println(numbers[i]);
}

numbers2 = new int[]{1,2,3,4,5};
int[] numbers3 = {1,2,3,4,5};
int len = numbers3.length;
        System.out.println(len);
        int last = numbers3[len-1];
        System.out.println("Last:" + last);

int [][] dnum = new int[][]{
        {1,2,3},
        {4,5,6},
        {7,8,9}
};
int [][][] tnum = new int[][][]{
        {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        },
        {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }
        ,
        {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        },
        {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        }

};

for (int i = 0; i < dnum.length; i++){
    for(int j = 0; j<dnum[i].length; j++){
        System.out.print(dnum[i][j] + " ");
    }
    System.out.println();
}




    }

}
