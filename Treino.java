class Treino {
    private String nome;
    private String data;
    private String resultado;
    private String comentario;
    public Treino(String nome, String data, String resultado, String comentario) {
        this.nome = nome;
        this.data = data;
        this.resultado = resultado;
        this.comentario = comentario;
    }
    public String getNome() {
        return nome;
    }
    public String getData() {
        return data;
    }
    public String getResultado() {
        return resultado;
    }
    public String getComentario() {
        return comentario;
    }
    public String toString() {
        return nome + " em " + data + ": " + resultado + " (" + comentario + ")";
    }
}
