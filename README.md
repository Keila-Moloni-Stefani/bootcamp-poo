# Bootcamp POO - Desafio DIO

Projeto Java que demonstra os **4 pilares da Programação Orientada a Objetos** usando o contexto de um Bootcamp. Projeto desenvolvido como parte do desafio da Formação Java Developer na plataforma DIO (Digital Innovation One).

---

## Estrutura do Projeto

```
src/
└── br/com/dio/desafio/
    ├── Main.java                    ← Classe principal (execute aqui)
    └── dominio/
        ├── Conteudo.java            ← Classe ABSTRATA (base)
        ├── Curso.java               ← Herda de Conteudo
        ├── Mentoria.java            ← Herda de Conteudo
        ├── Bootcamp.java            ← Agrupa Conteúdos e Devs
        └── Dev.java                 ← Representa o desenvolvedor
```

---

## Os 4 Pilares na Prática

### ABSTRAÇÃO
- `Conteudo` é uma classe abstrata que modela o conceito genérico de "conteúdo" de um bootcamp.
- `Bootcamp` e `Dev` abstraem entidades do mundo real com seus atributos essenciais.

### ENCAPSULAMENTO
- Todos os atributos são `private`, acessados apenas via `getters` e `setters`.
- A lógica de negócio (ex: `progredir()`, `inscreverBootcamp()`) fica dentro da própria classe.

### HERANÇA
- `Curso` **herda** de `Conteudo` e adiciona `cargaHoraria`.
- `Mentoria` **herda** de `Conteudo` e adiciona `data`.
- Ambas reutilizam `titulo`, `descricao` e `XP_PADRAO` da classe pai.

### POLIMORFISMO
- O método `calcularTotalXp()` é sobrescrito em `Curso` e `Mentoria` com lógicas diferentes.
- Em `Dev.calcularTotalXp()`, chamamos `Conteudo::calcularTotalXp` sem saber se é Curso ou Mentoria — o Java resolve em tempo de execução!

---

## Como executar

### Clone o repositório

```bash
git clone https://github.com/Keila-Moloni-Stefani/bootcamp-poo.git
cd bootcamp-poo
```

### No IntelliJ IDEA
1. Abra o projeto (`File > Open` → selecione a pasta `bootcamp-poo`)
2. Marque `src` como Sources Root (botão direito → Mark Directory as → Sources Root)
3. Execute `Main.java`

### Via terminal (com Java 11+)
```bash
# Na raiz do projeto
mkdir -p out
find src -name "*.java" | xargs javac -d out
java -cp out br.com.dio.desafio.Main
```

---

## Saída esperada

```
✅ Ana inscrita no Bootcamp: Bootcamp Java Developer
✅ João inscrito no Bootcamp: Bootcamp Java Developer

--- Progresso da Ana ---
📚 Ana concluiu: Java Fundamentos
📚 Ana concluiu: Programação Orientada a Objetos com Java
📚 Ana concluiu: Spring Framework

--- Progresso do João ---
📚 João concluiu: Java Fundamentos

========================================
           RELATÓRIO FINAL              
========================================

📋 Ana:
  Conteúdos inscritos  : [Mentoria de Carreira Dev]
  Conteúdos concluídos : [Java Fundamentos, POO com Java, Spring Framework]
  XP Total             : 440 XP

📋 João:
  Conteúdos inscritos  : [POO com Java, Spring Framework, Mentoria de Carreira Dev]
  Conteúdos concluídos : [Java Fundamentos]
  XP Total             : 80 XP

🏆 Ranking de XP:
  1º Ana - 440 XP
  2º João - 80 XP
```

---

## Licença

Este projeto foi desenvolvido para fins educacionais como parte do desafio da Formação Java Developer na plataforma DIO.

---

## Desenvolvedor

Desenvolvido por Keila Moloni Stefani
LinkedIn: [linkedin](https://www.linkedin.com/in/keila-moloni-stefani/)


---

⭐ Se este projeto foi útil para você, considere dar uma estrela!
