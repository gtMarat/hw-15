public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;


    public Griffindor(String name, int knowMagic, int tarnsgresiate, int nobility, int honor, int courage) {
        super(name, knowMagic, tarnsgresiate);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }
    private int calculateSumSkills() {
        return nobility+honor+courage;
    }

    public void compareGriffindorBasicSkills(Griffindor griffindor){
        if (calculateSumSkills()>griffindor.calculateSumSkills()){
            System.out.println( this.getName()+ " лучший Гриффиндорец, чем "+griffindor.getName());
        }else if (calculateSumSkills()<griffindor.calculateSumSkills()){
            System.out.println(griffindor.getName() + " лучший Гриффиндорец, чем "+ this.getName());
        }else {
            System.out.println("Студенты Гриффиндора равны"+this.getName()+" и "+ griffindor.getName());
        }
    }
}
