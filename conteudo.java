public class conteudo {
    public String id; // id interno do conteúdo
    public String texto;
    public String imagemUrl; // opcional
    public String videoUrl;  // opcional

    public conteudo(String id, String texto) {
        this.id = id;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Conteudo{id=" + id + ", texto=\"" + texto + "\"}";
    }
}
