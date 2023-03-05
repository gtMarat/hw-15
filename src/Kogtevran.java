public class Kogtevran extends Hogwarts {
    private int smart;
    private int wise;
    private int witty;
    private int creativity;


    public Kogtevran(String name, int knowMagic, int tarnsgresiate, int smart, int wise, int witty, int creativity) {
        super(name, knowMagic, tarnsgresiate);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    private int calculateSumSkills() {
        return smart+wise+witty+creativity;
    }

    public void compareKogtevranBasicSkills(Kogtevran kogtevran){
        if (calculateSumSkills()>kogtevran.calculateSumSkills()){
            System.out.println( this.getName()+ " лучший Когтевран, чем "+kogtevran.getName());
        }else if (calculateSumSkills()<kogtevran.calculateSumSkills()){
            System.out.println(kogtevran.getName() + " лучший Когтевран, чем "+ this.getName());
        }else {
            System.out.println("Студенты Когтеврана равны "+this.getName()+" и "+ kogtevran.getName());
        }
    }
}
