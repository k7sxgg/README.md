/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaria;


public class Pedido {
   private int codigo;
    private String cliente;
    private String tamanho;
    private String tipoEntrega;
    private boolean bordaRecheada;
    private boolean queijoExtra;
    private boolean refrigerante;
    private float valorTotal;

    public Pedido() {
    }

    public Pedido(int codigo, String cliente, String tamanho, String tipoEntrega, boolean bordaRecheada, boolean queijoExtra, boolean refrigerante, float valorTotal) {
        this.codigo = codigo;
        this.cliente = cliente;
        this.tamanho = tamanho;
        this.tipoEntrega = tipoEntrega;
        this.bordaRecheada = bordaRecheada;
        this.queijoExtra = queijoExtra;
        this.refrigerante = refrigerante;
        this.valorTotal = valorTotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipoEntrega() {
        return tipoEntrega;
    }

    public void setTipoEntrega(String tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public boolean isQueijoExtra() {
        return queijoExtra;
    }

    public void setQueijoExtra(boolean queijoExtra) {
        this.queijoExtra = queijoExtra;
    }

    public boolean isRefrigerante() {
        return refrigerante;
    }

    public void setRefrigerante(boolean refrigerante) {
        this.refrigerante = refrigerante;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }  
}
