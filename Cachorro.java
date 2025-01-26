public class Animal{
    private String nome;

    public Animal (){
        nome = "cacique";
        System.out.println("Animal criado com construtor padrão");
    }
}

public class Cachorro extends Animal{
    
    public Cachorro (){
        super();
        System.out.println("Cachorro criado com construtor padrão");
        System.out.println("au au");
    }
}