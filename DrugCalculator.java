
import java.util.Date;
public class DrugCalculator {
    
        private static String[] drugs = {"Angilock","Bipinor","Lithusun SR","Esita","Clonium","Omega 3"};
    
    
    
    public static void printDrugs() {
        for (int i=0;i<drugs.length;i++) {
            System.out.println(drugs[i]);
        }
    }
    public static void main(String[] args){
        printDrugs();
        }
}
