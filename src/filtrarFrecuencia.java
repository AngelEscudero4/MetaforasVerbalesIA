import java.io.*;

public class filtrarFrecuencia {

	/**
	 * Del fichero de la rae en codificacion ISO-8859-1 para las tildes extrae las
	 * palabras en orden de utilizacion
	 * 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {

		//abro ficheros
		File archivo = new File("frecs.txt");
		File fichero = new File("frecsPalabras.txt");

		String cadena;
		String[] partido;

		//abro para leer y escribir
		FileReader f = new FileReader(archivo);
		FileWriter writer = new FileWriter(fichero, false); // false para sobrescribir
		PrintWriter pw = new PrintWriter(writer);
		BufferedReader b = new BufferedReader(f);

		cadena = b.readLine(); // quito la linea de cabecera
		
		//voy leyendo cada linea y me quedo con la palabra
		while ((cadena = b.readLine()) != null) {
			partido = cadena.split("\t");
			// System.out.println(partido[1]);
			pw.println(partido[1]);
		}
		
		//cierro recursos
		pw.close();
		writer.close();
		b.close();
		f.close();

	}

}
