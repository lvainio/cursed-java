enum CursedEnum {
    ONE(1), 
    TWO(ONE, ONE), 
    THREE(TWO, ONE),
    FOUR(1, 3);

    public final int val;

    CursedEnum(int i) {
        this.val = i;
    }

    CursedEnum(CursedEnum n1, CursedEnum n2) {
        this(n1.val + n2.val);
    }

    CursedEnum(int n1, int n2) {
        this(n1 + n2);
    }

    public int getVal() {
        return this.val;
    }

    public static void main(String... args) {
        CursedEnum one = CursedEnum.ONE;
        CursedEnum two = CursedEnum.TWO;
        CursedEnum three = CursedEnum.THREE;
        CursedEnum four = CursedEnum.FOUR;

        System.out.println(one.getVal());
        System.out.println(two.getVal());
        System.out.println(three.getVal());
        System.out.println(four.getVal());
    }
}