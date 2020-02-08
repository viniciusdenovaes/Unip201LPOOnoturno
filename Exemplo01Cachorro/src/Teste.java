class Teste{
    
    public static void main(String args[]){
        System.out.println("Olá, primeiro programa");
        
        Cachorro caozinho = new Cachorro();
        
        caozinho.nome = "Rex";
        caozinho.idade = 10;
        caozinho.peso = 2.5;
        
        System.out.println("o caozinho vai latir");
        caozinho.latir();
        
        Cachorro caozao;
        caozao = new Cachorro();
        
        caozao.nome = "Jao";
        caozao.idade = 12;
        caozao.peso = 12.5;
        
        System.out.println("o caozao vai latir");
        caozao.latir();
        
        caozinho = caozao;
        
        caozinho.nome = "Eddie";
        
        System.out.println("o caozinho vai latir");
        caozao.latir();
        
    }
    
}
