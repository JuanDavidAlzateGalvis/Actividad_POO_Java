public class Cliente {

    private String nombre; 
    private String edad; 
    private String tipoCuenta;

    public Cliente(){
        this.nombre = "Angie Alzate";
        this.edad = "24";
        this.tipoCuenta = "Ahorro"; 
    }

    public Cliente(String nombre, String edad, String tipoCuenta){
        this.nombre = nombre;
        this.edad = edad;
        this.tipoCuenta = tipoCuenta;
    }
    
    public String getNombre(){
        return nombre;}

    public void setNombre(String nombre){
        this.nombre = nombre;}
    
     public String getEdad(){
        return edad;}

    public void setEdad(String edad){
        this.edad = edad;}

    public String getCuenta(){
        return tipoCuenta;}

    public void setCuenta(String tipoCuenta){
        this.tipoCuenta = tipoCuenta;}

    public void mostrarDatos(){
        System.out.println("Informacion del cliente");
        System.out.println("El nombre del cliente es: " + nombre);
        System.out.println("La edad del cliente es: " + edad);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
    }
    
}