import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java");
		curso1.setDescricao("Orientação a objeto no Java");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso JavaScript");
		curso2.setDescricao("Orientação a objeto no JS");
		curso2.setCargaHoraria(4);
	
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria do Curso de Java");
		mentoria.setDescricao("Mentoria sobre orientação a objeto");
		mentoria.setData(LocalDate.now());
		
		
		/* System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria); */
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescrição("Descrição do Boocamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devVezio = new Dev();
		devVezio.setNome("Vézio");
		devVezio.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos Vézio" + devVezio.getConteudosInscritos());
		devVezio.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Vézio" + devVezio.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Vézio" + devVezio.getConteudosConcluidos());
		devVezio.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos Vézio" + devVezio.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos Vézio" + devVezio.getConteudosConcluidos());
		System.out.println("XP: " + devVezio.calcularTotalXp());
		
		System.out.println("-------------");
		
		Dev devJoao = new Dev();
		devJoao.setNome("João");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("-");
		System.out.println("Conteúdos Inscritos João" + devJoao.getConteudosInscritos());
		System.out.println("Conteúdos Concluidos João" + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	}

}
