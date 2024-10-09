public class principal {

    public static void main(String[] args) {

        Banco banco1 = new Banco();
        Cliente cliente1 = new Cliente();
        CuentaBancaria cuentabancaria1 = new CuentaBancaria();

        
        Banco banco2 = new Banco ("International PES","Colombia",5,3000000);
        Cliente cliente2 = new Cliente ("Juan Alzate","30","Corriente");
        CuentaBancaria cuentabancaria2 = new CuentaBancaria ("1789506244","Corriente",2500000);
        
        System.out.println("Codigo: 7502410040");
        System.out.println("Juan David ALzate Galvis");
        System.out.println("***********************");

        
        System.out.println("");
        banco1.mostrarDatos();
        System.out.println("");
        cliente1.mostrarDatos();
        System.out.println("");
        cuentabancaria1.mostrarDatos();
        System.out.println("");


        System.out.println("***********************");
        
        System.out.println("");
        banco2.mostrarDatos();
        System.out.println("");
        cliente2.mostrarDatos();
        System.out.println("");
        cuentabancaria2.mostrarDatos();
        
    }
    
}