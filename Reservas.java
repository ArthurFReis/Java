
package Model;

import java.util.*;

public class Reservas {
    
    private int cpf;
    private String nomeCliente;
    private String carroCategoria;
    private String nomeCarro;
    private String dataReserva;
    private String horaReserva;
    private String dataEntrega;
    private String horaEntrega;
    private double preco;
    private String tipoReserva;
    private double precoTotal;
    ArrayList<Cliente> listaCliente;
    ArrayList<Carros> listaCarros;

    public Reservas() {
        listaCliente = new ArrayList<>();
        listaCarros = new ArrayList<>();
    }

    public Reservas(ArrayList<Cliente> listaCliente, ArrayList<Carros> listaCarros) {
        this.listaCliente = listaCliente;
        this.listaCarros = listaCarros;
    }

    public Reservas(int cpf, String nomeCliente, String carroCategoria, String nomeCarro, String dataReserva, String horaReserva, String dataEntrega, String horaEntrega, double preco, String tipoReserva, double precoTotal) {
        this.cpf = cpf;
        this.nomeCliente = nomeCliente;
        this.carroCategoria = carroCategoria;
        this.nomeCarro = nomeCarro;
        this.dataReserva = dataReserva;
        this.horaReserva = horaReserva;
        this.dataEntrega = dataEntrega;
        this.horaEntrega = horaEntrega;
        this.preco = preco;
        this.tipoReserva = tipoReserva;
        this.precoTotal = precoTotal;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCarroCategoria() {
        return carroCategoria;
    }

    public void setCarroCategoria(String carroCategoria) {
        this.carroCategoria = carroCategoria;
    }

    public String getNomeCarro() {
        return nomeCarro;
    }

    public void setNomeCarro(String nomeCarro) {
        this.nomeCarro = nomeCarro;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }

    public void setHoraReserva(String horaReserva) {
        this.horaReserva = horaReserva;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getHoraEntrega() {
        return horaEntrega;
    }

    public void setHoraEntrega(String horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipoReserva() {
        return tipoReserva;
    }

    public void setTipoReserva(String tipoReserva) {
        this.tipoReserva = tipoReserva;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    
    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(ArrayList<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }
    
    public void addCliente(Cliente cliente){
        cliente.setReservaCliente(this);
        listaCliente.add(cliente);
    }

    public List<Carros> getListaCarros() {
        return listaCarros;
    }

    public void setListaCarros(ArrayList<Carros> listaCarros) {
        this.listaCarros = listaCarros;
    }
    
    public void addCarros(Carros carros){
        carros.setReservaCarro(this);
        listaCarros.add(carros);
   }  
}  