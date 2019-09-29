
// Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
// таким образом:
// 1    1    1    1    1
// 0    1    1    1    0
// 0    0    1    0    0
// 0    1    1    1    0
// 1    1    1    1    1


//Вакханалия какая-то, но бабочка получилась для размеров [3][3], [4][4], [5][5], [6][6]



public class Butterfly {
    public static void main(String[] args) {
        int[][] array = new int[5][5];


        for (int i = 0; i <= array.length/2; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j<i || j>=array[i].length-i){
                    array[i][j] = 0;
                } else
                    array[i][j] = 1;
            }
        }


        for (int i = array.length-1; i >= array.length/2 ; i--) {
            for (int j = 0; j < array[i].length; j++) {
                if (j < array[i].length - 1 - i || j > i){
                    array[i][j] = 0;
                } else {
                    array[i][j] = 1;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "     ");
            }
            System.out.println("\n");
        }


        /*for (int i = 0; i < array.length; i++) {
                array[0][i] = 1;
                array[array.length-1][i] = 1;
            for (int j = 1; j < array.length-1; j++) {
                array[1][j] = 1;
                array[array.length-2][j] = 1;
                for (int k = 2; k < array.length-2; k++) {
                    array[2][k] = 1;
                    array[array.length - 3][k] = 1;
                    for (int l = 3; l < array.length-3; l++) {
                        array[3][l] = 1;
                        array[array.length - 4][l] = 1;
                    }
                }
            }
        }*/









        /*for (int i = 0; i < array.length; i++) {
            for (int j = 1; j > 0 ; j--) {
                array[j-1][i] = 1;
                array[array.length-1][i] = 1;
                for (int k = 1; k < array.length-1; k++) {
                   array[j][k] = 1;
                   array[array.length-2][k] = 1;
                    for (int l = 2; l < array.length-2; l++) {
                        array[array.length-i-1][l] = 1;
                        array[array.length-j-1][l] = 1;
                        //array[array.length-4][l] = 1;    array[array.length-i-1][l] = 1;
                        //array[array.length-3][l] = 1;
                    }
                }
            }
        }*/



    }
}
