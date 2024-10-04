package main.java.modules;

public enum Alphabet {
    A("a", new byte[]{1, 0, 0, 0, 0, 0}),
    B("b", new byte[]{1, 0, 1, 0, 0, 0}),
    C("c", new byte[]{1, 1, 0, 0, 0, 0}),
    D("d", new byte[]{1, 1, 0, 1, 0, 0}),
    E("e", new byte[]{1, 0, 0, 1, 0, 0}),
    F("f", new byte[]{1, 1, 1, 0, 0, 0}),
    G("g", new byte[]{1, 1, 1, 1, 0, 0}),
    H("h", new byte[]{1, 0, 1, 1, 0, 0}),
    I("i", new byte[]{0, 1, 1, 0, 0, 0}),
    J("j", new byte[]{0, 1, 1, 1, 0, 0}),
    K("k", new byte[]{1, 0, 0, 0, 1, 0}),
    L("l", new byte[]{1, 0, 1, 0, 1, 0}),
    M("m", new byte[]{1, 1, 0, 0, 1, 0}),
    N("n", new byte[]{1, 1, 0, 1, 1, 0}),
    O("o", new byte[]{1, 0, 0, 1, 1, 0}),
    P("p", new byte[]{1, 1, 1, 0, 1, 0}),
    Q("q", new byte[]{1, 1, 1, 1, 1, 0}),
    R("r", new byte[]{1, 0, 1, 1, 1, 0}),
    S("s", new byte[]{0, 1, 1, 0, 1, 0}),
    T("t", new byte[]{0, 1, 1, 1, 1, 0}),
    U("u", new byte[]{1, 0, 0, 0, 1, 1}),
    V("v", new byte[]{1, 0, 1, 0, 1, 1}),
    W("w", new byte[]{0, 1, 1, 1, 0, 1}),
    X("x", new byte[]{1, 1, 0, 0, 1, 1}),
    Y("y", new byte[]{1, 1, 0, 1, 1, 1}),
    Z("z", new byte[]{1, 0, 0, 1, 1, 1}),
    SPACE(" ", new byte[]{0, 0, 0, 0, 0, 0});

    private final String value;
    private final byte[] combination;

    Alphabet(String value, byte[] combination) {
        this.value = value;
        this.combination = combination;
    }

    public String getValue() {
        return this.value;
    }

    public byte[] getCombination() {
        return this.combination;
    }
}

enum Numbers{
    CERO(0), ONE(1), 
    TWO(2), THREE(3), 
    FOUR(4), FIVE(5), 
    SIX(6), SEVEN(7), 
    EIGHT(8), NINE(9);

    private final int value;

    Numbers(int value) {
        this.value = value;
    }
}

enum Symbols {
    DOT("."), 
    COMMA(","),
    SEMI_COLON(";"),
    COLON(":"),
    SLASH("/"),
    QUESTION_MARK("?"),
    EXCLAMATION_POINT("!"),
    PARENTHESES("()"),
    AT("@");

    private final int value;

    Symbols(String value) {
        this.value = value;
    }
}
