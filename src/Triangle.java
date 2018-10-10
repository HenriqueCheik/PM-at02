public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double alphaAngle;
    private double betaAngle;
    private double gammaAngle;
    private boolean validTriangle;

    public Triangle(double sideA, double sideB, double sideC) {
        if(!checkIfValidTriangle(sideA, sideB, sideC)) {
            validTriangle = false;
            return;
        }
        validTriangle = true;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        calculateAngles();
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public double getAlphaAngle() {
        return alphaAngle;
    }

    public double getBetaAngle() {
        return betaAngle;
    }

    public double getGammaAngle() {
        return gammaAngle;
    }

    private boolean checkIfValidTriangle(double sideA, double sideB, double sideC) {
        boolean firstCondition = sideA > 0 && sideB > 0 && sideC > 0;
        boolean secondCondition = sideA <= sideB + sideC;
        boolean thirdCondition = sideB <= sideA + sideC;
        boolean fourthCondition = sideC <= sideA + sideB;

        return firstCondition && secondCondition && thirdCondition && fourthCondition;
    }

    private void calculateAngles() {
        this.alphaAngle = Math.toDegrees(Math.acos((sideB * sideB + sideC * sideC - sideA * sideA)/(2*sideB*sideC)));
        this.betaAngle = Math.toDegrees(Math.acos((sideA * sideA + sideC * sideC - sideB * sideB)/(2*sideA*sideC)));
        this.gammaAngle = Math.toDegrees(Math.acos((sideA * sideA + sideB * sideB - sideC * sideC)/(2*sideA*sideB)));
    }

    public double getPerimeter() {
        if(validTriangle) {
            return sideA + sideB + sideC;
        }
        return 0.0;
    }

    public double getArea() {
        // Calculo da área a partir do Teorema de Heron
        if(validTriangle) {
            double semiPerimeter = getPerimeter() / 2;
            return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        }
        return 0.0;
    }

    public String getTriangleType() {
        String type = "";
        if(validTriangle) {
            // Classificação quanto ao lado
            if (sideA == sideB && sideB == sideC) {
                type += "equilatero";
            } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
                type += "isosceles";
            } else {
                type += "escaleno";
            }
            // Classificação quanto aos ângulos
            if (alphaAngle == 90.0 || betaAngle == 90.0 || gammaAngle == 90.0) {
                type += " retangulo";
            } else if (alphaAngle > 90.0 || betaAngle > 90.0 || gammaAngle > 90.0) {
                type += " obtusangulo";
            } else {
                type += " acutangulo";
            }
        }
        return type;
    }

    @Override
    public String toString() {
        if(validTriangle){
            return "Triangulo " + getTriangleType() +"\nLado 1 = " + sideA + "\nLado 2 = " + sideB + "\nLado 3 = " + sideC
                    + "\nPerimetro = " + getPerimeter() + "\nArea = " + getArea()
                    + "\nAngulo 1 = " + alphaAngle + "\nAngulo 2 = " + betaAngle+ "\nAngulo 3 = " + gammaAngle;
        }
        return "Não é um triângulo válido!";
    }
}
