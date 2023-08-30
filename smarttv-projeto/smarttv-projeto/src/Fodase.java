public class Fodase {
    //atributos
private boolean ligada;
private int volume;
private int canal;

    //metodos
    public Fodase(){
        this.ligada = false;
        this.volume = 50;
        this.canal = 4;
    }

        public void ligar(){
            if(!ligada == true){
                System.out.println("Ligando...");
                ligada = true;
            } else{
                System.out.print("a TV ja esta ligada");
            }
    }

        public void desligar(){
            if (ligada) {
                System.out.println("Desligando...");
                ligada = false;
            } else {
                System.out.println("a TV ja esta desligada");
                
            }
        }

        public void aumentarVolume(){
            if(ligada && volume < 50){
                volume ++;
                System.out.println("o volume aumentou para " + volume);
            } else{
                System.out.println("o volume já está no máximo possivel");
            }
        }

        public void diminuirVolume(){
            if (ligada && volume > 0) {
                volume --;
                System.out.println("o volume aumentou para " + volume);
            } else {
                System.out.println("o volume já ta no minimo paizao");
            }
    }

        public void proximoCanal(){
            if (ligada && canal <= 13) {
                canal ++;
                System.out.println("Próximo canal... " + canal);
            } else {
                canal = 1;
                System.out.print("Próximo canal... " + canal);
            }
        }

        public void anteriorCanal(){
            if (ligada && canal >= 1) {
                canal --;
                System.out.println("Canal anterior..." + canal);
            } else {
                canal = 13;
                System.out.println("Canal anterior " + canal);
            }
        }

    public boolean taLigada(){
        return ligada;
    }

    public int qualCanal(){
        return canal;
    }

    public int getVolume(){
        return volume;
    }

    // método main
    public static void main(String[] args) {
        Fodase minhaTV = new Fodase();
        // chamada do método: TV ligada?
        minhaTV.ligar();
        System.out.println("A TV está ligada? " + minhaTV.taLigada());

        // canal
        minhaTV.proximoCanal();
        System.out.println("Estamos no canal " + minhaTV.qualCanal());

        // volume
        minhaTV.aumentarVolume();
        System.out.println("Estamos no volume " + minhaTV.getVolume());
}
}
