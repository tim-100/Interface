package Interface;

public class Bogd extends Family implements Semiy {

    private final String fam;

    public Bogd(){
        super("Dmitrii", 52);
        this.fam = "Bogdanov";
    }

    public  void infoBogd() {
        System.out.println("�������: " + this.fam + "; ���: "+ super.getName() + "; �������: "+ super.getAge());
    }

    @Override
    public void kalinino() {
        System.out.println("���� �� ��.��������");
    }
}
