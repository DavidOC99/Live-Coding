
/*David Ortiz Campos
Comentarios:
Buena explicacion de los pasos, 
aunque se atoro en un punto pudo retomar el codigo y continuar 
Buen uso de funciones, else , else if

*/


package liveCoding4;

public class FizzBuzz {
	public void imprimir() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

}

