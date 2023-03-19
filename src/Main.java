import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {
		
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Orientação a objeto no Java");
		curso1.setCargaHoraria(2);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Orientação a objeto no JS");
		curso2.setCargaHoraria(2);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria do Curso de Java");
		mentoria.setDescricao("Mentoria sobre orientação a objeto");
		mentoria.setData(LocalDate.now());
		
		
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);
	}

}
