
public class Estudante1 {
    

    
    
  
    
    String nome;
    String endereço;
    int idade;
    double notaMatematica;
    double notaPortugues;
    double notaCiencias;
    
    
    
    public double getMedia(){
        double result = 0;
        result = (notaMatematica + notaPortugues + notaCiencias)/3;
        System.out.printf("\tResultado:\n",
result);
        
        return result;
}
}

