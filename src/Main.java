public class Main {
    public static void main(String[] args) {
        Griffindor harry = new Griffindor("Harry Potter", 20, 10, 15, 35, 40);
        System.out.println(harry +", благородство "+harry.getNobility()+", честь "+harry.getHonor()+", храбрость "+harry.getCourage());
        Griffindor germiona =  new Griffindor("Germiona Greinger", 25, 50, 37, 29, 20);
        System.out.println(germiona +", благородство "+germiona.getNobility()+", честь "+germiona.getHonor()+", храбрость "+germiona.getCourage());
        Griffindor ron = new Griffindor("Ron Uizli", 10, 12, 5, 20, 37);
        System.out.println(ron +", благородство "+ron.getNobility()+", честь "+ron.getHonor()+", храбрость "+ron.getCourage());
        harry.compareGriffindorBasicSkills(germiona);
        harry.compareGriffindorBasicSkills(ron);
        germiona.compareGriffindorBasicSkills(ron);
        ron.compareGriffindorBasicSkills(harry);

        Slizaren draco =  new Slizaren("Draco Malfoi", 30, 40, 50, 45, 20, 15, 10);
        System.out.println(draco +", хитрость " +draco.getCunning()+", решительность "+draco.getDetermination()+", амбициозность "+draco.getAmbition()+", находчивость "+draco.getResourcefulness()+", жажада власти "+draco.getThirstForPower());
        Slizaren grekhem = new Slizaren("Grekhem Montegy", 20, 20, 10, 25, 20, 19, 20);
        System.out.println(grekhem +", хитрость " +grekhem.getCunning()+", решительность "+grekhem.getDetermination()+", амбициозность "+grekhem.getAmbition()+", находчивость "+grekhem.getResourcefulness()+", жажада власти "+grekhem.getThirstForPower());
        Slizaren george = new Slizaren("George Goil", 32, 15, 45, 25, 10, 25, 20);
        System.out.println(george +", хитрость " +george.getCunning()+", решительность "+george.getDetermination()+", амбициозность "+george.getAmbition()+", находчивость "+george.getResourcefulness()+", жажада власти "+george.getThirstForPower());

        Kogtevran chjou = new Kogtevran("Chjou Chang",20,20,35,40,25,40);
        System.out.println(chjou +", креативность "+chjou.getCreativity()+", ум "+chjou.getSmart()+", мудрость "+chjou.getWise()+", остроумие "+chjou.getWitty());
        Kogtevran padma = new Kogtevran("Padma Patil ",36,25,15,30,15,20);
        System.out.println(padma +", креативность "+padma.getCreativity()+", ум "+padma.getSmart()+", мудрость "+padma.getWise()+", остроумие "+padma.getWitty());
        Kogtevran markus = new Kogtevran("Markus Belby ",15,22,45,20,25,50);
        System.out.println(markus +", креативность "+markus.getCreativity()+", ум "+markus.getSmart()+", мудрость "+markus.getWise()+", остроумие "+markus.getWitty());

        Puffenday zahariay = new Puffenday("Zahariya Smit ",50,25,40,30,25);
        System.out.println(zahariay + ", трудолюбие "+zahariay.getHardworking()+", верность "+zahariay.getLoyal()+", честь "+zahariay.getHonest());
        Puffenday sedrik = new Puffenday("Sedrik Diggery ",30,45,60,50,15);
        System.out.println(sedrik + ", трудолюбие "+sedrik.getHardworking()+", верность "+sedrik.getLoyal()+", честь "+sedrik.getHonest());
        Puffenday jastin = new Puffenday("Jastin Flit-Fletchi ",45,35,60,40,25);
        System.out.println(jastin + ", трудолюбие "+jastin.getHardworking()+", верность "+jastin.getLoyal()+", честь "+jastin.getHonest());
        chjou.compareKogtevranBasicSkills(markus);

        draco.compareBasicSkills(harry);
        sedrik.compareBasicSkills(padma);


    }
}