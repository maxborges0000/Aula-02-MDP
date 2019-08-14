public class Max {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudante1 f = new Estudante1();
            f.nome = "max";
            f.endereço = "Rua são pedro";
            f.idade = 20;
            f.notaCiencias = 5;
            f.notaMatematica = 4;
            f.notaPortugues = 2;
            double media = f.getMedia();
            System.out.println(media);
    }
}
