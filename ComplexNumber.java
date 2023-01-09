public class ComplexNumber {

    private final double real_part;
    private final double imaginary_part;


    /* Constructor */
    public ComplexNumber(double realPart, double imaginaryPart) {
        this.real_part = realPart;
        this.imaginary_part = imaginaryPart;
    }

    public double getRealPart() {
        return real_part;
    }
    

    public double getImaginaryPart() {
        return imaginary_part;
    }    
    
    
    public ComplexNumber plus(ComplexNumber other) {
        
        return new ComplexNumber(this.real_part + other.real_part, this.imaginary_part + other.imaginary_part);
        
    }
    public ComplexNumber minus(ComplexNumber other) {
        
        return new ComplexNumber(this.real_part - other.real_part, this.imaginary_part - other.imaginary_part);
        
    }


    public ComplexNumber times(ComplexNumber other) {
        return new ComplexNumber(this.real_part * other.real_part - this.imaginary_part * other.imaginary_part,
                                this.real_part * other.imaginary_part + this.imaginary_part * other.real_part);
    }


    
    public ComplexNumber divide(ComplexNumber other) {

        double divisor = other.real_part * other.real_part + other.imaginary_part * other.imaginary_part;

        return new ComplexNumber((this.real_part * other.real_part + this.imaginary_part * other.imaginary_part) / divisor,
                               (this.imaginary_part * other.real_part - this.real_part * other.imaginary_part) / divisor);
    }

    public static void main(String[] argumentss) {
        
    }
}