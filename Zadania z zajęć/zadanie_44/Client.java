import java.time.LocalDate;
import java.util.Date;

public class Client implements Comparable<Client>{
    String name;
    int clientNumber;
    Date lastLogin;

    public Client(String name, int clientNumber, Date lastLogin) {
        this.name = name;
        this.clientNumber = clientNumber;
        this.lastLogin = lastLogin;
    }



    @Override
    public int compareTo(Client o) {
        return o.lastLogin.compareTo(this.lastLogin);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", clientNumber=" + clientNumber +
                ", lastLogin=" + lastLogin +
                '}';
    }
}
