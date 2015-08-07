public class Tester {
    public static void main(String [] args) {
        DrugCalculator d=new DrugCalculator();
        d.addDrugs("Nutrum Gold");
        d.addDrugs("Dormicum");
        d.printDrugs(d.getDrugs());
    }
}