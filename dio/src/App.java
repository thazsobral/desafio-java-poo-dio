import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {
        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Curso de Java");
        curso1.setCargaHoraria(40);
        System.out.println("Curso: "+curso1+"\n");

        Curso curso2 = new Curso();
        curso2.setTitulo("Javascript");
        curso2.setDescricao("Curso de Javascript");
        curso2.setCargaHoraria(32);
        System.out.println("Curso: "+curso2+"\n");

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Java");
        mentoria1.setDescricao("Primeiro mentoria sobre Java");
        mentoria1.setData(LocalDate.now());
        System.out.println("Mentoria: "+mentoria1+"\n");

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp J");
        bootcamp1.setDescricao("Primeiro Bootcamp");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        System.out.println("Bootcamp: "+bootcamp1+"\n");

        Dev dev1 = new Dev();
        String nome1 = "Fulano 1";
        dev1.setNome(nome1);
        dev1.inscreverBootcamp(bootcamp1);
        System.out.println("Dev: "+dev1+"\n");
        dev1.progredir();
        dev1.progredir();
        System.out.println("Dev: "+dev1+"\n");

        Dev dev2 = new Dev();
        String nome2 = "Fulano 2";
        dev2.setNome(nome2);
        dev2.inscreverBootcamp(bootcamp1);
        System.out.println("Dev: "+dev2+"\n");
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("Dev: "+dev2+"\n");
    }
}
