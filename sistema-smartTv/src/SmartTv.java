public class SmartTv {
  
  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void tvLigada() {

    ligada = true;
   }
   public void tvDesligada() {

    ligada = false;
   }

   public void aumentarVolume() {
      volume++;
   }
   public void diminuirVolume() {
    volume--;
 }

}
