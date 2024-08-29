package aula2.receitas_culinarias;

public class Main {
    public static void main(String[] args) {
        String[] ingredientesBolo = {"2 xícaras de farinha de trigo",
                "1 xícara de açúcar",
                "1 xícara de leite",
                "3 ovos",
                "1 colher de sopa de fermento"};

        Receitas bolo = new Receitas("Bolo", ingredientesBolo,
                "Bata as claras em neve e reserve.\n" +
                        "Misture as gemas, a margarina e o açúcar até obter um creme homogêneo.\n" +
                        "Acrescente o leite e a farinha de trigo aos poucos, sem parar de bater.\n" +
                        "Por último, adicione as claras em neve e o fermento.\n" +
                        "Despeje a massa em uma forma untada e enfarinhada.\n" +
                        "Asse em forno pré-aquecido a 180°C por cerca de 40 minutos ou até dourar",
                50, 10 );

        bolo.mostrarReceita();


        String[] ingredientesSalada = {"1 alface",
                "2 tomates",
                "1 pepino",
                "1 cenoura",
                "Azeite e sal a gosto"};
        String preparoSalada = "Lave e corte os ingredientes, misture tudo e tempere.";
        Receitas salada = new Receitas("Salada", ingredientesSalada, preparoSalada, 15, 5);

        salada.mostrarReceita();

        String[] ingredientesPanqueca = {"1 xícara de farinha de trigo",
                "1 xícara de leite",
                "1 ovo",
                "1 pitada de sal,",
                "Óleo para untar"};
        String preparoPanqueca = "Bata todos os ingredientes no liquidificador até obter uma massa homogênea.\n" +
                "Aqueça uma frigideira antiaderente e unte com um pouco de óleo.\n" +
                "Despeje uma concha de massa na frigideira e espalhe bem.\n" +
                "Cozinhe até as bordas começarem a soltar, vire e cozinhe o outro lado.\n" +
                "Repita o processo com o restante da massa.\n" +
                "Sirva com o recheio de sua preferência";

        Receitas panqueca = new Receitas("Panqueca", ingredientesPanqueca, preparoPanqueca, 15, 5);

        panqueca.mostrarReceita();
    }
}
