package Arrays;

public class Numbers {
    public static void main(String[] args) {

        int[] bricks = new int[10];
        int i;
        for (i = 0; i < bricks.length; i++) {
            bricks[i] = (int) (Math.random() * 100);
            System.out.println(bricks[i]);
        }
        System.out.println();
        char[] trees = new char[5];

        for (int i1 = 0; i1 < 5; i1++) {

            {
                trees[i1] = 'A';

                System.out.println(trees[i1]);
            }
        }
    }
}



