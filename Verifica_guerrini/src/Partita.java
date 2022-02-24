
/**
 *
 * @author tss
 */
public class Partita {

    private int giornata;
    private String squadraCasa;
    private String squadraTrasferta;
    private int goalCasa;
    private int goalTrasferta;

    public Partita(int giornata, String squadraCasa, String squadraTrasferta, int goalCasa, int goalTrasferta) {
        this.giornata = giornata;
        this.squadraCasa = squadraCasa;
        this.squadraTrasferta = squadraTrasferta;
        this.goalCasa = goalCasa;
        this.goalTrasferta = goalTrasferta;
    }

    public int getGiornata() {
        return giornata;
    }

    public void setGiornata(int giornata) {
        this.giornata = giornata;
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(String squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public String getSquadraTrasferta() {
        return squadraTrasferta;
    }

    public void setSquadraTrasferta(String squadraTrasferta) {
        this.squadraTrasferta = squadraTrasferta;
    }

    public int getGoalCasa() {
        return goalCasa;
    }

    public void setGoalCasa(int goalCasa) {
        this.goalCasa = goalCasa;
    }

    public int getGoalTrasferta() {
        return goalTrasferta;
    }

    public void setGoalTrasferta(int goalTrasferta) {
        this.goalTrasferta = goalTrasferta;
    }
    
    
    public String getpartiteCSV() {
        String ris= "";
        String lr="";
        lr += getGiornata()+ ";" + getSquadraCasa()+ ";"+ getSquadraTrasferta()+ ";"+ getGoalCasa()+ ";"+ getGoalTrasferta()+ "\n";
        
        return lr;
    }

   
    
   
    
    
   
}
