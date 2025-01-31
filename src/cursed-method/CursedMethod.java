import java.util.Arrays;

public class CursedMethod {
    public static void main(String... args) {
        System.out.println(Arrays.toString(cursedArray()));
        System.out.println(Arrays.deepToString(evenMoreCursedArray()));
        System.out.println(Arrays.deepToString(whatIsThis(1, 2, 3)));
        System.out.println(Arrays.deepToString(𝓷𝓮𝓼𝓽𝓮𝓭()));
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
}
