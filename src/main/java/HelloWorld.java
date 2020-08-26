public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        
        String mensaje1= "Existe bandera";
        String mensaje2 = "No se encontro bandera";
        int numero1 = 5;
        boolean bandera1  = true;

        System.out.println("numero1 = " + numero1);

        if (bandera1){
            System.out.println("mensaje1 = " + mensaje1);
        }else{
            System.out.println("mensaje2 = " + mensaje2);
        }

        for (int i = 0; i<numero1; i++){
            System.out.println("Contador = " + i);
        }
        numero1 = 0;

        while(numero1 < 5){
            System.out.println("numero1 = " + numero1);
            numero1++;
        }
    }
}
