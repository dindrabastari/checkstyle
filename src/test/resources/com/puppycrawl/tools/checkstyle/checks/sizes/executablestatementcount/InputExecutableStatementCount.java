package com.puppycrawl.tools.checkstyle.checks.sizes.executablestatementcount;

public class InputExecutableStatementCount {
    public void foo() {
        while (true) {
            Runnable runnable = new Runnable() {
                public void run() {
                    while (true) {
                    }
                }
            };

            new Thread(runnable).start();
        }
    }

    public void bar() {
        if (System.currentTimeMillis() == 0) {
            if (System.currentTimeMillis() == 0 && System.currentTimeMillis() == 0) {
            }

            if (System.currentTimeMillis() == 0 || System.currentTimeMillis() == 0) {
            }
        }
    }

    public void simpleElseIf() {
        if (System.currentTimeMillis() == 0) {
        } else if (System.currentTimeMillis() == 0) {
        } else {
        }
    }

    public void stupidElseIf() {
        if (System.currentTimeMillis() == 0) {
        } else {
            if (System.currentTimeMillis() == 0) {
            } else {
                if (System.currentTimeMillis() == 0) {
                }
            }

            if (System.currentTimeMillis() == 0) {
            }
        }
    }

    public InputExecutableStatementCount()
    {
        int i = 1;
        if (System.currentTimeMillis() == 0) {
        } else if (System.currentTimeMillis() == 0) {
        } else {
        }
    }

    // STATIC_INIT
    static {
        int i = 1;
        if (System.currentTimeMillis() == 0) {
        } else if (System.currentTimeMillis() == 0) {
        } else {
        }
    }

    // INSTANCE_INIT
    {
        int i = 1;
        if (System.currentTimeMillis() == 0) {
        } else if (System.currentTimeMillis() == 0) {
        } else {
        }
    }

    /** Inner */
    public InputExecutableStatementCount(int aParam)
    {
        Runnable runnable = new Runnable() {
            public void run() {
                while (true) {
                }
            }
        };
        new Thread(runnable).start();
    }

    /** Empty constructor */
    public InputExecutableStatementCount(String someString) {}

    static Runnable r1 = () -> {
        String.valueOf("Hello world one!");
    };
}
