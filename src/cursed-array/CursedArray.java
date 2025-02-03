import java.util.Arrays;

public class CursedArray {
    public static void main(String... args) {
        System.out.println(Arrays.toString(cursedArray()));
        System.out.println(Arrays.deepToString(evenMoreCursedArray()));
        System.out.println(Arrays.deepToString(whatIsThis(1, 2, 3)));
        System.out.println(Arrays.deepToString(𝓷𝓮𝓼𝓽𝓮𝓭()));
        cursedDeclaration();
    }

    private static int cursedArray() [] {
        int result [] = { 1 , 2, 3 };

        return result;
    }

    private static int [] evenMoreCursedArray() [] [] {
        int result [][][] = {{{1}, {2}, {3}}}; 

        return result;
    }

    private static int [] whatIsThis(int... $) [] {
        return new int[][] {$, $};
    }

    public static int 𝓷𝓮𝓼𝓽𝓮𝓭()[][][][][][][][][][][][][][][][][][][][] {
        return new int[][][][][][][][][][][][][][][][][][][][] 
                        {{{{{{{{{{{{{{{{{{{{1}}}}}}}}}}}}}}}}}}}};
    }

    public static void cursedDeclaration() {
        int[] vector, matrix[];

        vector = new int['A'];
        matrix = new int['\u0001']['\u0001'];

        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.deepToString(matrix));
    }
}
