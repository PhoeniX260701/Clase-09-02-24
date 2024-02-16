public class Tiktok {
    public static void main(String[] args) {
        Usuario usu1 = new Usuario("Jose David");
        Video vid1= new Video (6000,"Mi primera pentakill :v","Https://youtube.com/v1");
        usu1.SubirVideo(vid1);
        usu1.MostrarInfoUsuario();
        
        System.out.println("------------");
        
        Usuario usu2 = new Usuario ("David Urrutia");
        Comentario commt1 = new Comentario("que buen contenido", usu2);
        
        System.out.println("El usuario: " + usu2.getNombre() + "    Realizo el comentario: " + commt1.getContenido());
}
}