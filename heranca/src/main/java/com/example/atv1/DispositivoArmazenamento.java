package com.example.atv1;

public class DispositivoArmazenamento extends CPU{
    private String capacidadeArmazenamento;
    private String tipoConexao;
    public DispositivoArmazenamento(String marca, String modelo, String capacidadeArmazenamento, String tipoConexao) {
        super(marca, modelo);
        this.capacidadeArmazenamento = capacidadeArmazenamento;
        this.tipoConexao = tipoConexao;
    }
    public String getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }
    public void setCapacidadeArmazenamento(String capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }
    public String getTipoConexao() {
        return tipoConexao;
    }
    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    

}
