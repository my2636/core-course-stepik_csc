import java.util.Objects;

public final class ComplexNumber {
    private final double re;
    private final double im;

    public static void main(String[] args) {
        System.out.println(new ComplexNumber(3.1, 3.1).equals(new ComplexNumber(3.1, 3.1)));
        System.out.println(new ComplexNumber(3.1, 3.1).hashCode());
        System.out.println(new ComplexNumber(3.1, 3.1).hashCode());
        System.out.println(new ComplexNumber(3.8, 3.5).hashCode());
    }

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return  false;
        }
        ComplexNumber cn = (ComplexNumber) o;
        return re == cn.re && im == cn.im;
    }

    @Override
    public int hashCode() {
        return Objects.hash(re, im);
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
}