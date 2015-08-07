
import java.util.Date;
public class DrugCalculator {
    
        private static String[] drugs = {"Angilock","Bipinor","Lithusun SR","Esita","Clonium","Omega 3","","","",""};
    
        public String[] getDrugs() {
            return drugs;
            
        }
    
    public static void printDrugs(String[] drugs) {
        for (int i=0;i<drugs.length;i++) {
            System.out.println(drugs[i]);
        }
    }
    public static void addDrugs(String drug) {
        for(int i=0;i<drugs.length;i++){
            if(drugs[i].equals("")){
                drugs[i]=drug;
                return ;
            }
        }
        
    }
   
}
