public class Main {
    public static void main(String[] args) {
        ICalcMedia calculoAritmetico = new Aritmetica();
        ICalcMedia calculoGeometrico = new Geometrica();

        Disciplina disciplinaAritmetica = new Disciplina(calculoAritmetico);
        Disciplina disciplinaGeometrica = new Disciplina(calculoGeometrico);

        disciplinaAritmetica.setNome("Engenharia de Software");
        disciplinaAritmetica.setP1(10);
        disciplinaAritmetica.setP2(5);
        disciplinaAritmetica.CalcularMedia();

        disciplinaGeometrica.setNome("Sistemas Operacionais");
        disciplinaGeometrica.setP1(9);
        disciplinaGeometrica.setP2(8);
        disciplinaGeometrica.CalcularMedia();

        System.out.println("Disciplina Engenharia de Sortware:");
        System.out.println(String.format("P1: %.2f P2: %.2f Média: %.2f Situação: %s",
                disciplinaAritmetica.getP1(), disciplinaAritmetica.getP2(),
                disciplinaAritmetica.getMedia(), disciplinaAritmetica.getSituacao()));

        System.out.println("Disciplina Sistemas Operacionais:");
        System.out.println(String.format("P1: %.2f P2: %.2f Média: %.2f Situação: %s",
                disciplinaGeometrica.getP1(), disciplinaGeometrica.getP2(),
                disciplinaGeometrica.getMedia(), disciplinaGeometrica.getSituacao()));
    }
}