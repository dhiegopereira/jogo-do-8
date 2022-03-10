public class Main {
    public static void main(String[] args) {
        int[][] pecas = new int[3][3];
        pecas[0][0] = 1;
        pecas[0][1] = 2;
        pecas[0][2] = 3;
        pecas[1][0] = 4;
        pecas[1][1] = 5;
        pecas[1][2] = 6;
        pecas[2][0] = 7;
        pecas[2][1] = 0;
        pecas[2][2] = 8;

        Tabuleiro tabuleiro = new Tabuleiro(pecas);
        do {

            tabuleiro.exibirTabuleiro();
            tabuleiro.jogar();
            if (tabuleiro.verificarJogada()) {
                tabuleiro.trocarPeças();
            }
        } while (!tabuleiro.verificarVitoria());
    }
}