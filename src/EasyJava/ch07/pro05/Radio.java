package EasyJava.ch07.pro05;

public class Radio extends Controller{
    @Override
    String getName() {
        return "라디오";
    }

   Radio(boolean power){
        this.power=power;
    }
}
