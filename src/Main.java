import br.com.dio.desafio.dominio.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Java Backend");
        cursoJava.setDescricao("Aprenda Spring Boot e Collections");
        cursoJava.setCargaHoraria(8);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("Mentoria de Carreira");
        mentoriaJava.setDescricao("Como conseguir sua primeira vaga");
        mentoriaJava.setData(LocalDate.now());


        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição do Bootcamp Java");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(mentoriaJava);


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootcamp);

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootCamp(bootcamp);


        System.out.println("--- Progresso dos Devs ---");
        devMaria.progredir();
        devMaria.progredir();

        devJoao.progredir();


        System.out.println("\n--- Ranking do Bootcamp ---");
        int posicao = 1;
        for (Dev dev : bootcamp.rankDevs()) {
            System.out.println(posicao + "º - " + dev.getNome() + " | XP: " + dev.calcularTotalXP());
            posicao++;
        }


        System.out.println("\n--- Status de Certificação ---");
        System.out.print("João: ");
        devJoao.exibirCertificado();

        System.out.print("Maria: ");
        devMaria.exibirCertificado();
    }
}