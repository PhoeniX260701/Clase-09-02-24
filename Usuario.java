public class Usuario {

    String nombre;
    Video Video;

    public Usuario () {
    }
    public Usuario  (String nombre) {
        this.nombre= nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre (String nombre) {
        this.nombre= nombre;
    }
     public Video getVideosubido () {
        return Video;
    }
    public void SubirVideo (Video video) {
        this. Video= video;
    }   
    public void MostrarInfoUsuario() {
        System.out.println("Tu usuario es: " + getNombre());
        if (Video != null) {
            System.out.println ("Ultimo video subido: " + Video.getTitulo());
        } else {
            System.out.println ("Aun no ha subido ningun video.");
         }   
}
}