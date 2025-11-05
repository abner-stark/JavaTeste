public class Roteador {
    private String marca;
    private String modelo;
    private int enderecoIP;
    private boolean status;

    //Método construtor

    public Roteador(String marca, String modelo, int enderecoIP) {
        this.marca = marca;
        this.modelo = modelo;
        this.enderecoIP = enderecoIP;
        this.status = false; // inicia desligado

    }

    //Getters e Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getEnderecoIP() {
        return enderecoIP;
    }

    public void setEnderecoIP(int enderecoIP) {
        this.enderecoIP = enderecoIP;
    }

    public boolean isStatus() {
        return status;
    }

    public String ligar() {
        if (!status) {
            status = true;
            return "Roteador ligado com sucesso.";
        } else {
            return "O roteador já está ligado.";
        }
    }

    // Método para desligar o roteador
    public String desligar() {
        if (status) {
            status = false;
            return "Roteador desligado com sucesso.";
        } else {
            return "O roteador já está desligado.";
        }
    }


    @Override
    public String toString() {
        return "Roteador{" +
                "marca='" + marca + "\n" +
                ", modelo='" + modelo + "\n" +
                ", enderecoIP='" + enderecoIP + "\n" +
                ", status=" + status + "\n" +
                '}';
    }
}
