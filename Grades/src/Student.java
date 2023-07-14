public class Student {
    String name;
    double notaPrimeiroTrimestre, notaSegundoTrimestre, notaTerceiroTrimestre;

    public void notaFinal(){

        double finalGrade = notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
        double faltaParaPassar = 60.00 - finalGrade;

        if (finalGrade < 60){
            System.out.println("FINAL GRADE: "+ finalGrade);
            System.out.println("FAILED");
            System.out.println("MISSING "+ faltaParaPassar + " POINTS");
        }  else {
            System.out.println("FINAL GRADE: "+finalGrade);
            System.out.println("PASS");
        }

    }


}
