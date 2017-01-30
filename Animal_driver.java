import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Animal_driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("test.java");
		try (BufferedWriter br = new BufferedWriter(new FileWriter(file))) {
			br.write("public class test {");
			br.newLine();
			br.write("    public static void main (String[] args) {");
			br.newLine();
			br.write("        System.out.println(\"Hello World\");");
			br.newLine();
			br.write("    }");
			br.newLine();
			br.write("}");
		}
		catch (IOException e) {
			System.out.println("Unable to read file " + file.toString());
		}
		
		
		
	}

}