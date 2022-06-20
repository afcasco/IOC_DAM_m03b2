import java.util.Scanner;

public class DiesMesPerDividir {
    int mesEscollit;
    int diesQueTeElMesEscollit;

    public static void main(String[] args) {
        //Es crea una intència del programa
        DiesMesPerDividir programa = new DiesMesPerDividir();
        //Es crida el mètode inici per tal de comencçar l'execució
        programa.inici();
    }

    public void inici() {
        mesEscollit = escollirMes();
        diesQueTeElMesEscollit = diesMesEscollit(mesEscollit);
        mostrarResultat(mesEscollit, diesQueTeElMesEscollit);
    }
    
    public int escollirMes(){
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el número del més de l'any per saber quants dies té:");
        return scanner.nextInt();
    }

    public int diesMesEscollit(int mes){
    	  switch(mes){
            case 1:
                diesQueTeElMesEscollit = 31;
                break;
            case 2:
                diesQueTeElMesEscollit = 28;
                break;
            case 3:
                diesQueTeElMesEscollit = 31;
                break;
            case 4:
                diesQueTeElMesEscollit = 30;
                break;
            case 5:
                diesQueTeElMesEscollit = 31;
                break;
            case 6:
                diesQueTeElMesEscollit = 30;
                break;
            case 7:
                diesQueTeElMesEscollit = 31;
                break;
            case 8:
                diesQueTeElMesEscollit = 31;
                break;
            case 9:
                diesQueTeElMesEscollit = 30;
                break;
            case 10:
                diesQueTeElMesEscollit = 31;
                break;
            case 11:
                diesQueTeElMesEscollit = 30;
                break;
            case 12:
                diesQueTeElMesEscollit = 31;
                break;
            default:
                diesQueTeElMesEscollit =-1;
        }
        return diesQueTeElMesEscollit;
    }

    public void mostrarResultat(int mesEscollit, int diesQueTeElMesEscollit){
    	if(diesQueTeElMesEscollit==-1){
            System.out.print("No existeix el mes ");
            System.out.print(mesEscollit);
            System.out.print(". Només hi ha 12 mesos.");
        }else{
            System.out.print("T'informem que el més ");
            System.out.print(mesEscollit);
            System.out.print("conté ");
            System.out.print(diesQueTeElMesEscollit);
            System.out.println("dies");            
        }
    }
}