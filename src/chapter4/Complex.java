package chapter4;

public final class Complex {

    // Thread-safe immutable objects
    public static final Complex ZERO = new Complex(0, 0);
    public static final Complex ONE = new Complex(1,0);
    public static final Complex I = new Complex(0, 1);

    private final double re;
    private final double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    private Complex(final Complex other) {
        re = other.re;
        im = other.im;
    }

    public Complex valueOf(final double re, final double im) {
        return new Complex(re, im);
    }

    public Complex plus(final Complex other) {
        return new Complex(re + other.re, im + other.im);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return Double.compare(complex.re, re) == 0 && Double.compare(complex.im, im) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(re);
        result = 31 * result + Double.hashCode(im);
        return result;
    }
}
