import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AppEAC4P1 {
	static final short ID_CIUTAT= 0;
    static final short ID_ANY= 1;
    static final short ID_TEMP= 0;
    static final short ID_PLUJA= 1;
    static final short NUM_CIUTATS= 5;
    static final short NUM_ANYS= 5;
    
    static final String MISSATGE_INGRES_OK= "Dades climàtiques correctament introduides";
    static final String MISSATGE_ERROR_COLISIO= "Error - Dades de ciutat i any ja existent:";
    static final String MISSATGE_ERROR_NOESPAI= "Error - Espai insuficient:";
    
    
	//Matriuqueemmagatzemaràdadesdeciutati any
    String[][] dadesCiutats= new String [NUM_CIUTATS*NUM_ANYS][2];
    //Matriuqueemmagatzemaràdadesdetemperaturai plujaacumulada
    float[][] dadesClima= new float[NUM_CIUTATS*NUM_ANYS][2];    //Matriudeciutati anysdel'estudi
    String[] ciutats= {"BCN","LIS","LON","PAR","MUN"};
    String[] anys= {"2021","2022","2023","2024","2025"};
    
    
    public static void main(String[] args) {
        AppEAC4P1 prg= new AppEAC4P1();
        prg.inici();
    }
    
    
    private void inici(){
    	int opcio;
    	int iCiu;
    	int iAny;
        float tempRnd;
        float plujaRnd;
        boolean res;
        
        //Inicialitzeml'array deciutatsamb""
        for(int i=0;i<NUM_CIUTATS*NUM_ANYS;i++) {
        	dadesCiutats[i][0]="";
        	dadesCiutats[i][1]="";           		
        }
        
    	
        // Simuleml'entrada dadesdecincciutats
    	for( iCiu=0;iCiu<ciutats.length;iCiu++) {
    		for( iAny=0;iAny<anys.length;iAny++) {
    			tempRnd=generaFloatRnd(10.0f,30.0f);
    			plujaRnd=generaFloatRnd(100.0f,500.0f);
    			res= registraDadesClima(dadesCiutats,dadesClima,ciutats[iCiu],anys[iAny],tempRnd,plujaRnd);
    			if(res) System.out.println(MISSATGE_INGRES_OK+ "per "+ ciutats[iCiu] + "- "+ anys[iAny]);
    		}
    	} 
    	//Provoquenunerror ambdadesjaexistents.
    	tempRnd=generaFloatRnd(10.0f,30.0f);
		plujaRnd=generaFloatRnd(100.0f,500.0f);
		res= registraDadesClima(dadesCiutats,dadesClima,ciutats[0],anys[1],tempRnd,plujaRnd);
    	
		//Provoquemunerror d'espai insuficient.
    	res= registraDadesClima(dadesCiutats,dadesClima,"MAD",anys[1],tempRnd,plujaRnd);
    	
    	//Aramostremlesdadesdetoteslesciutats.
    	for( iCiu=0;iCiu<ciutats.length;iCiu++)  {
    		mostrarDadesCiutat(dadesCiutats,dadesClima,ciutats[iCiu]);
    	}
        
    }
    
    //Mètodeper generarfloat entremini max.
    public float generaFloatRnd(float min, float max) {
    	Random rand= new Random();
        return min+ ( max- min) * rand.nextFloat();
    }
    
    //Mètodea implementar
    public boolean registraDadesClima(String [][] dCiutats, float[][] dClima,String ciutat, String any, float temp, float pluja) {
    	//comprovar no dades ciutat i any, comprovar espai disponible
        boolean isInputOk=false;
        for(int i=0;i<dCiutats.length;i++) {
            if(dCiutats[i][0]==ciutat && dCiutats[i][1]==any){
                isInputOk = false;
                if(dCiutats[i][0]==null){
                    isInputOk=true;
                } else isInputOk =false;
            } else isInputOk = true;
        }
        return isInputOk;
    }
    
    	
    //Mètodea implementar
    private void mostrarDadesCiutat(String [][] dCiutats,float[][] dClima,String ciutat){
    	
            System.out.println(ciutat);
            System.out.println(dCiutats[0][1]);
            System.out.println(dClima[1][0]);
           
        
        
       
    }

}	 


