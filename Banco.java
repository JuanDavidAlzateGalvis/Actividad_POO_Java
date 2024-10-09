public class Banco {

    private String nombre;
    private String pais;
    private int numeroSucursales;
    private int numeroClientes;

    public Banco(){
        this.nombre = "Banco de la moneda";
        this.pais = "Argentina";
        this.numeroSucursales = 3;
        this.numeroClientes = 3000000;
    }
    
    public Banco(String nombre, String pais, int numeroSucursales, int numeroClientes){
        this.nombre = nombre;
        this.pais = pais;
        this.numeroSucursales = numeroSucursales;
        this.numeroClientes = numeroClientes;
    }
    
    public String getNombre(){
        return nombre;}

    public void setNombre(String nombre){
        this.nombre = nombre;}

    public String getPais(){
        return pais;}

    public void setPais(String pais){
        this.pais = pais;}

    public int getNumeroSucursales(){
        return numeroSucursales;}

    public void setNumeroSucursales(int numeroSucursales){
        this.numeroSucursales = numeroSucursales;}

    public int getNumeroClientes(){
        return numeroClientes;}

    public void getNumeroClientes(int numeroClientes){
        this.numeroClientes = numeroClientes;}
    
    public void mostrarDatos(){
        System.out.println("Informacion del banco");
        System.out.println("El nombre del banco es: " + nombre);
        System.out.println("El pais donde se encuentra el banco es: " + pais);
        System.out.println("El numero de sucursales que tiene el banco es de: " + numeroSucursales);
        System.out.println("El numero de clientes del banco es de: " + numeroClientes);
    }
    
}
