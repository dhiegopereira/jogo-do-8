public class Tabuleiro implements TabuleiroInterface {
    int[][] pecas = new int[3][3];
    String jogada = "";
    int linha = 0;
    int coluna = 0;
    int linhaVazia = 0;
    int colunaVazia = 0;
    boolean jogar = false;
    String sonar = "teste";

    public Tabuleiro(int[][] pecas) {
        this.pecas = pecas;
    }

    @Override
    public void jogar() {
        System.out.print("Linha/Coluna: ");
        this.jogada = System.console().readLine();
        this.linha = Integer.parseInt(this.jogada.split(" ")[0]);
        this.coluna = Integer.parseInt(this.jogada.split(" ")[1]);
        this.linhaVazia = Integer.parseInt(this.jogada.split(" ")[2]);
        this.colunaVazia = Integer.parseInt(this.jogada.split(" ")[3]);
    }

    @Override
    public void exibirTabuleiro() {
        for (int i = 0; i < pecas.length; i++) {
            for (int j = 0; j < pecas[i].length; j++) {
                System.out.print(pecas[i][j] + " ");
            }
            System.out.println("");
        }
    }

    @Override
    public void trocarPeças() {
        int aux = this.pecas[this.linhaVazia][this.colunaVazia];
        this.pecas[this.linhaVazia][this.colunaVazia] = this.pecas[this.linha][this.coluna];
        this.pecas[this.linha][this.coluna] = aux;
    }

    @Override
    public boolean verificarJogada() {
        if (this.linha < 0
                || this.linha > 2
                || this.coluna < 0
                || this.coluna > 2
                || this.linhaVazia < 0
                || this.linhaVazia > 2
                || this.colunaVazia < 0
                || this.colunaVazia > 2) {
            System.out.println("Linha/Coluna inválida");
            return false;
        }
        return true;

    }

    @Override
    public boolean verificarTroca() {
        if ((this.pecas[this.linha][this.coluna] == 0 && this.pecas[this.linhaVazia][this.colunaVazia] != 0)
                || (this.pecas[this.linha][this.coluna] != 0 && this.pecas[this.linhaVazia][this.colunaVazia] == 0)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean verificarVitoria() {
        int contador = 1;
        for (int i = 0; i < this.pecas.length; i++) {
            for (int j = 0; j < this.pecas[i].length; j++) {
                contador = contador == 9 ? 0 : contador;
                if (this.pecas[i][j] == contador) {
                    contador++;
                } else {
                    return false;
                }
            }
        }
        System.out.println("Você venceu!");
        return true;
    }

    public int getLinha() {
        return linha;
    }

    public int getColuna() {
        return coluna;
    }

    public int getLinhaVazia() {
        return linhaVazia;
    }

    public int getColunaVazia() {
        return colunaVazia;
    }

    public int[][] getPecas() {
        return pecas;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public void setLinhaVazia(int linhaVazia) {
        this.linhaVazia = linhaVazia;
    }

    public void setColunaVazia(int colunaVazia) {
        this.colunaVazia = colunaVazia;
    }

    public void setPecas(int[][] pecas) {
        this.pecas = pecas;
    }
}
