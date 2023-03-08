public class Slizaren extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;


    public Slizaren(String name, int knowMagic, int tarnsgresiate, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, knowMagic, tarnsgresiate);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    private int calculateSumSkills() {
        return cunning+determination+ambition+resourcefulness+thirstForPower;
    }
    public void compareSlizarenBasicSkills(Slizaren slizaren){
        if (calculateSumSkills()>slizaren.calculateSumSkills()){
            System.out.println( this.getName()+ " лучший Слизарен, чем "+slizaren.getName());
        }else if (calculateSumSkills()<slizaren.calculateSumSkills()){
            System.out.println(slizaren.getName() + " лучший Слизарен, чем "+ this.getName());
        }else {
            System.out.println("Студенты Слизарен равны"+this.getName()+" и "+ slizaren.getName());
        }
    }
}
