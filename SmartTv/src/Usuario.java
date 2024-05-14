public class Usuario {
    public static void main(String[] args) throws Exception{

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        System.out.println("TV ligada?: " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.escolherCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        smartTv.ligar();
        System.out.println("TV ligada?: " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("TV ligada?: " + smartTv.ligada);
        

      int numero1 = 1;
      String numero2 = "2";
      System.out.println(numero1+numero2); 
    }

    
}
