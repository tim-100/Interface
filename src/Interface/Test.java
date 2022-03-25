package Interface;

public class Test {
    public static void main(String[] args) {
        Bogd bog = new Bogd();
        Family tali = new Family("Talimae", 49);
        bog.infoBogd();
        Info(bog);
        tali.infoFamily();
        InfoTali(bog);

    }
    public static void Info(Semiy i){
        i.kalinino();
    }
      public static void InfoTali(Semiy i){i.vmeste();}
}
