
abstract class Beverages {
     boolean wantsExtras;

    Beverages() {
        this.wantsExtras = false;
    }

    abstract void brew();
    abstract void addCondiments();
    abstract void addExtras();

    void boilWater() {
        System.out.println("Boiling water...");
    }

    void pourInCup(){
        System.out.println("Pouring into cup...");
    }
    void setWantsExtras(boolean wantsExtras){
        this.wantsExtras = wantsExtras;
    }

    final void finalTemplateMethod(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        if (wantsExtras){
            addExtras();
        }
    }

}
