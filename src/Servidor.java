public class Servidor {
    private int id;
    private String nombre;
    private String IP;
    private boolean activo;
    private static int totalServidores = 0;
    private static int servidoresActivos = 0;
    public Servidor(String nombre, String IP){
        id= totalServidores;
        this.nombre= nombre;
        this.IP = IP;
        activo= false;
        totalServidores++;

    }

    public String getNombre() {
        return nombre;
    }

    public String getIP() {
        return IP;
    }

    public boolean isActivo() {
        return activo;
    }
}
