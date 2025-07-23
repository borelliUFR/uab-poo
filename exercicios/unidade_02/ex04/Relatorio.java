package exercicios.unidade_02.ex04;

// Exercício 4: Relatórios Polimórficos (Opção A - Classe Abstrata)
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.Month;

abstract class Relatorio {
    protected String titulo;

    public Relatorio(String titulo) {
        this.titulo = titulo;
    }

    public abstract String gerarConteudo();
}

class RelatorioVendas extends Relatorio {
    public RelatorioVendas(String titulo) {
        super(titulo);
    }

    @Override
    public String gerarConteudo() {
        return "Conteúdo de vendas: " + LocalDate.now();
    }
}

class RelatorioFinanceiro extends Relatorio {
    public RelatorioFinanceiro(String titulo) {
        super(titulo);
    }

    @Override
    public String gerarConteudo() {
        return "Conteúdo financeiro: " + Month.from(LocalDate.now());
    }
}

class MainRelatorio {
    public static void main(String[] args) {
        List<Relatorio> relatorios = new ArrayList<>();
        relatorios.add(new RelatorioVendas("Relatório de Vendas Semanal"));
        relatorios.add(new RelatorioFinanceiro("Relatório Financeiro Mensal"));

        for (Relatorio r : relatorios) {
            System.out.println(r.gerarConteudo());
        }
    }
}
