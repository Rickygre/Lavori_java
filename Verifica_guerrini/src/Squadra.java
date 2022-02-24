
/**
 *
 * @author tss
 */
public class Squadra {

    private String nome;
    private String sede;

    public Squadra(String nome, String sede) {
        this.nome = nome;
        this.sede = sede;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getCSV() {
        String ris= "";
        String lr="";
        lr += getNome()+ ";" + getSede()+ "\n";
        
        return lr;
    }

}
