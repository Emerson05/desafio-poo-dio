🚀 Abstração de um Bootcamp com POO
Este projeto é um desafio prático da plataforma DIO (Digital Innovation One), focado em aplicar os pilares da Programação Orientada a Objetos (POO) utilizando a linguagem Java. O objetivo é simular a dinâmica de um Bootcamp, gerenciando conteúdos (Cursos e Mentorias), desenvolvedores inscritos e progressão de aprendizado.

🛠️ Tecnologias e Conceitos Aplicados
Linguagem: Java 21.

Paradigma: Programação Orientada a Objetos (Abstração, Herança, Encapsulamento e Polimorfismo).

Collections: Uso estratégico de Set, LinkedHashSet e HashSet para garantir a unicidade e a ordem dos elementos.

Java Streams: Implementação de filtros, mapeamentos e ordenação para cálculos de XP e geração de rankings.

🌟 Funcionalidades Implementadas
Além da estrutura base proposta pelo desafio, adicionei funcionalidades extras para tornar o sistema mais completo:

Inscrição e Progressão: O desenvolvedor pode se inscrever em um Bootcamp e progredir nos conteúdos seguindo a ordem de inscrição.

Cálculo de XP: Cada curso ou mentoria possui uma lógica de pontuação (XP) baseada em carga horária ou bônus fixos.

Ranking de Devs (Nova): Sistema que ordena os desenvolvedores inscritos pelo total de XP acumulado, permitindo visualizar os líderes do bootcamp.

Sistema de Certificação (Nova): Validação automática que verifica se todos os conteúdos foram concluídos para emitir uma mensagem de sucesso ao desenvolvedor.

📂 Estrutura das Classes
Conteudo: Classe abstrata que serve como base para Cursos e Mentorias.

Curso: Extensão de Conteúdo com atributo de carga horária.

Mentoria: Extensão de Conteúdo com atributo de data.

BootCamp: Gerencia os conteúdos, desenvolvedores e o período de duração.

Dev: Representa o desenvolvedor, suas inscrições e conteúdos concluídos.
