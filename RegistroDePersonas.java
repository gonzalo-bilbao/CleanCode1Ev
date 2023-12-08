
package registrodepersonas;
class Personas {
            long dniNumero;
            char dniLetra;
            String nombre;
            String primerApellido;
            String segundoAapellido;
            int edad;
            char sexo;
        }

public class RegistroDePersonas {
    public static void main(String[] args) {
       //Definir Personas
        Personas primeraPersona = new Personas();
        Personas segundaPersona =new Personas();
        Personas terceraPersona = new Personas();

        // Establecer valores
        primeraPersona.dniNumero = 33333333;
        primeraPersona.dniLetra = 'A';
        primeraPersona.nombre = "Gonzalo";
        primeraPersona.primerApellido= "Bilbao";
        primeraPersona.segundoApellido="Alcazar";
        primeraPersona.edad=21;
        primeraPersona.sexo='H';

        segundaPersona.dniNumero = 11111111;
        segundaPersona.dniLetra = 'B';
        segundaPersona.nombre = "Maria";
        segundaPersona.primerApellido= "Martin";
        segundaPersona.segundoApellido="Tadeo";
        segundaPersona.edad=21;
        segundaPersona.sexo='M';
        
        terceraPersona.dniNumero = 22222222;
        terceraPersona.dniLetra = 'C';
        terceraPersona.nombre = "Adrián Marcelo";
        terceraPersona.primerApellido= "Taboada";
        terceraPersona.segundoApellido="Velasquez";
        terceraPersona.edad=20;
        terceraPersona.sexo='H';

        //Visualizar: 
        System.out.println("Datos de las Personas:");
        mostrarDatosPersona(primeraPersona);
        mostrarDatosPersona(segundaPersona);
        mostrarDatosPersona(terceraPersona);
    }
        
    private static void mostrarDatosPersona(Persona persona) {
        System.out.printf("%16s %16s %16s %8s-%1c, edad %2d, Sexo : %1c \n", persona.nombre,persona.primerApellido,persona.segundoAapellido,persona.dniNumero,persona.dniLetra,persona.edad,persona.sexo);
    }
}
