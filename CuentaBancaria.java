public class CuentaBancaria {

    private String numeroCuenta;
    private String tipoCuenta;
    private double saldoCuenta;

    public CuentaBancaria(){
        this.numeroCuenta = "1003098929";
        this.tipoCuenta = "ahorro";
        this.saldoCuenta = 3000500;  
    }
    
    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoCuenta = saldoCuenta;
    }
    
    public String getNumeroCuenta(){
        return numeroCuenta;}

    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;}
    
     public String getTipoCuenta(){
        return tipoCuenta;}

    public void setTipoCuenta(String tipoCuenta){
        this.tipoCuenta = tipoCuenta;}

    public double getSaldoCuenta(){
        return saldoCuenta;}

    public void setSaldoCuenta(double saldoCuenta){
        this.saldoCuenta = saldoCuenta;}

    public void mostrarDatos(){
        System.out.println("Informacion de la cuenta bancaria");
        System.out.println("Numero de la cuenta: " + numeroCuenta);
        System.out.println("Tipo de la cuenta: " + tipoCuenta);
        System.out.println("El saldo actual de la cuenta es: " + saldoCuenta);
    }
    
}
