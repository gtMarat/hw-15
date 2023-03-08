public class Puffenday extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;


    public Puffenday(String name, int knowMagic, int tarnsgresiate, int hardworking, int loyal, int honest) {
        super(name, knowMagic, tarnsgresiate);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    private int calculateSumSkills() {
        return hardworking+loyal+honest;
    }
    public void comparePuffendayBasicSkills(Puffenday puffenday){
        if (calculateSumSkills()>puffenday.calculateSumSkills()){
            System.out.println( this.getName()+ " лучший Пуфендуец, чем "+puffenday.getName());
        }else if (calculateSumSkills()<puffenday.calculateSumSkills()){
            System.out.println(puffenday.getName() + " лучший Пуфендуец, чем "+ this.getName());
        }else {
            System.out.println("Студенты Пуфендуя равны"+this.getName()+" и "+ puffenday.getName());
        }
    }
}
