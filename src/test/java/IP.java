class IP {

    private final int a;
    private final int b;
    private final int c;
    private final int d;

    IP(String a, String b, String c, String d) {
        this.a = Integer.parseInt(a);
        this.b = Integer.parseInt(b);
        this.c = Integer.parseInt(c);
        this.d = Integer.parseInt(d);
    }

    @Override
    public String toString() {
        return String.format("IP ADDRESS -> %s.%s.%s.%s", a, b, c, d);
    }
}
