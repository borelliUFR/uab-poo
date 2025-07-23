package exercicios.unidade_02.ex02;

// Exercício 2: Gerenciador de Tarefas
class GerenciadorDeTarefas {
    public void adicionarTarefa(String descricao) {
        System.out.println("Tarefa '" + descricao + "' adicionada.");
    }

    public void adicionarTarefa(String descricao, int prioridade) {
        System.out.println("Tarefa '" + descricao + "' (Prioridade: " + prioridade + ") adicionada.");
    }

    public boolean concluirTarefa(String descricao) {
        System.out.println("Tarefa '" + descricao + "' concluída com sucesso.");
        return true;
    }

    public static void main(String[] args) {
        GerenciadorDeTarefas gt = new GerenciadorDeTarefas();

        gt.adicionarTarefa("Estudar Java");
        gt.adicionarTarefa("Fazer exercícios", 2);
        boolean resultado = gt.concluirTarefa("Estudar Java");
        System.out.println("Resultado da conclusão: " + resultado);
    }
}