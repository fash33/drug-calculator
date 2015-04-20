
import java.util.Date;
public class DrugCalculator {
    private String[] drugs = {"Angilock","Bipinor","Lithusun SR","Esita","Clonium","Omega 3"};
    public String[] getDrugs() {
        return drugs;
    }
    public void printDrugs(String[] drugs) {
        for (int i=0;i<drugs.length;i++) {
            System.out.println(drugs[i]);
        }
    }
    
}
