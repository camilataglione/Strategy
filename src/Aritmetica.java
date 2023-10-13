public class Aritmetica implements ICalcMedia{
    @Override
    public double CaculaMedia(double P1, double P2) {
        return (P1 + P2) / 2     ;
    }

    @Override
    public String Situacao(double media) {
        if (media >= 5 )
            return "Aprovado";
        else {
            return "Reprovado";
        }

    }
}