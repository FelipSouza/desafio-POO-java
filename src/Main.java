import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do Curso JavaScript");
        curso2.setCargaHoraria(30);


        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria JavaScript");
        mentoria1.setDescricao("Descriçaõ da mentoria JavaScript");
        mentoria1.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descrição Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);

        Dev devFelipe = new Dev();
        devFelipe.setNome("Felipe Souza");
        devFelipe.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos: " + devFelipe.getConteudosInscritos());

        devFelipe.progredir();
        devFelipe.progredir();
        System.out.println("-");
        System.out.println("Conteúdos concluidos: " + devFelipe.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + devFelipe.getConteudosInscritos());
        System.out.println("XP: " + devFelipe.calcularTotalXp());


        System.out.println("-------------");

        Dev devBia = new Dev();
        devBia.setNome("Bia Souza");
        devBia.inscreverBootcamp(bootcamp1);
        System.out.println("Conteúdos inscritos: " + devBia.getConteudosInscritos());

        devBia.progredir();
        devBia.progredir();
        devBia.progredir();
        System.out.println("-");
        System.out.println("onteúdos concluidos: " + devFelipe.getConteudosConcluidos());
        System.out.println("Conteúdos inscritos: " + devBia.getConteudosInscritos());
        System.out.println("XP: " + devBia.calcularTotalXp());

    }
}