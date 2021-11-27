package com.company;

public class test {

    public static void testCall()
    {
        System.out.println("Calling test from the class test");
    }
    public void test2()
    {
        System.out.println("Calling test2 without the static keyword");
    }

    private int add()
    {
        return 1 + 3;
    }

    public static void CallMe()
    {
        testPrivate local = new testPrivate();
        local.getI(34);
        local.output();
    }

    public void access()
    {
        System.out.print("\nCalling the public method access:");
        testCall();
        test2();
        int i = add();
        System.out.println("Calling add function: " + i );
    }

    private static class testPrivate
    {
        private int i;
        void getI(int y)
        {
            i = y;
        }
        void output()
        {
            System.out.println("Calling output function: " + i );
        }
    }
}
