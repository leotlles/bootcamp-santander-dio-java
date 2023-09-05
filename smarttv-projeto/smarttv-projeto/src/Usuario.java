public class Usuario {
    public static void main(String[] args) {
        SmartTv minhaTV = new SmartTv();
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
