package Sweet;

public class jellybean extends sweet {
    private String teste;

    public jellybean(String name, double price, double weight, String teste) {
        super(name, price, weight);
        this.teste = teste;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    @Override
    public String toString() {
        return "jellybean {" + super.toString()+ "teste = " + teste + " " + '}';
    }
}
