public class Tiktok {
    public static void main(String[] args) {
        Usuario usu1 = new Usuario("Jose David");
        Videos vid1= new Videos (6000,"Mi primera pentakill :v","Https://youtube.com/v1");
        usu1.SubirVideo(vid1);
        usu1.MostrarInfoUsuario();
}
}