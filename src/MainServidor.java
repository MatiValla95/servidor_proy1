public class MainServidor {
    static void main() {
        Servidor s1 = new Servidor("coco", "12718t1723t562");
        System.out.println(" El nombre del servidor es" + s1.getNombre() + " La direccion IP es"+ s1.getIP());
    }
}
