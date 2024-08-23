public class LivingRoomLight implements Light{
    private int brightness;




    public void on () {

        System.out.println("Living Room light is ON at full brightness.");
    }


    @Override

    public void off () {
        brightness = 100;
        System.out.println("Living Room light OFF.");
    }


    @Override

    public void dim(int level) {
        brightness = level;

        System.out.println("Living Room light is dimmed to" +brightness+"%");
    }

    int getBrightness(){
        return brightness;
    }

}
