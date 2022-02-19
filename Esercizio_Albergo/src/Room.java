
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author riccardo
 */
public class Room {

    private String nomeCliente;
    private int dataInizioP;
    private int dataFineP;

    List prenotazioni = Arrays.asList();

    public Room(String nomeCliente, int dataInizioPrenotazione, int dataFinePrenotazione) {
        this.nomeCliente = nomeCliente;
        this.dataInizioP = dataInizioP;
        this.dataFineP = dataFineP;
    }

    Room() {

    }

    public String getNome() {
        return nomeCliente;
    }

    public void setNome(String nome) {
        this.nomeCliente = nome;
    }

    public int getDataInizioP() {
        return dataInizioP;
    }

    public void setDataInizioP(int dataInizioP) {
        this.dataInizioP = dataInizioP;
    }

    public int getDataFineP() {
        return dataFineP;
    }

    public void setDataFineP(int dataFineP) {
        this.dataFineP = dataFineP;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 61 * hash + Objects.hashCode(this.nomeCliente);
        hash = 61 * hash + this.dataInizioP;
        hash = 61 * hash + this.dataFineP;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Room other = (Room) obj;
        if (this.dataInizioP != other.dataInizioP) {
            return false;
        }
        if (this.dataFineP != other.dataFineP) {
            return false;
        }
        return Objects.equals(this.nomeCliente, other.nomeCliente);
    }

    public List reserve(String nome, int dataInizio, int dataFine) {

        if (prenotazioni.equals(dataInizio) == prenotazioni.contains(dataInizio)) {
            System.out.println("camera già occupata!");

        } else {
            prenotazioni.add(reserve(nome, dataInizio, dataFine)
            );
        }

        return prenotazioni;

    }

}
