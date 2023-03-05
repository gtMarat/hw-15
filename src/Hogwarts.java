public abstract class Hogwarts {

    private String name;
    private int knowMagic;
    private int tarnsgresiate;

    public Hogwarts(String name , int knowMagic, int tarnsgresiate) {
        this.name = name;
        this.knowMagic = knowMagic;
        this.tarnsgresiate = tarnsgresiate;
    }

    public String getName() {
        return name;
    }

    public int getKnowMagic() {
        return knowMagic;
    }

    public int getTarnsgresiate() {
        return tarnsgresiate;
    }

    private int calculateBasicSkillsSum() {
        return knowMagic+tarnsgresiate;
    }
    public void compareBasicSkills(Hogwarts hogwarts){
        if (calculateBasicSkillsSum()>hogwarts.calculateBasicSkillsSum()){
            System.out.println( this.getName()+ " обладает бОльшей мощностью магии, чем "+hogwarts.getName());
        }else if (calculateBasicSkillsSum()<hogwarts.calculateBasicSkillsSum()){
            System.out.println(hogwarts.getName() + " обладает бОльшей мощностью магии, чем "+ this.getName());
        }else {
            System.out.println("Студенты обладают одинаковой мощность магии "+this.getName()+" и "+ hogwarts.getName());
        }
    }

    @Override
    public String toString() {
        return "Hogwarts :" + " Имя студента " + name +  ", колдовство " + knowMagic + ", трансгресия " + tarnsgresiate ;
    }
}
