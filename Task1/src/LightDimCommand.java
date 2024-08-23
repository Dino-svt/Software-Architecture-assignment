public class LightDimCommand implements  Command{
         private final Light lights;
         private final int level;
         private int lastLevel;



         public LightDimCommand(Light light, int level){
             this.lights = light;
             this.level = level;


         }

         @Override

    public void execute() {
             if (lights instanceof KitchenRoomLight kitchenRoomLight) {
                 lastLevel = kitchenRoomLight.getBrightness();
             }else if (lights instanceof LivingRoomLight livingRoomLight) {
                 lastLevel = livingRoomLight.getBrightness();
             }
             lights.dim(level);
         }



         @Override

    public void Undo() {
             lights.dim(lastLevel);
         }



}
