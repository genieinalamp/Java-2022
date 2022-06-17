package EasyJava.ch07.pro05;

public class TV extends Controller{
    @Override
    String getName() {
        return "TV";
    }

    TV(boolean power){
        this.power=power;
    }
}
