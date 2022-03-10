import static org.junit.Assert.*;

import org.junit.Test;

public class TabuleiroTest {

    @Test
    public void iniciarTabuleiroTest() {
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

        assertArrayEquals(tabuleiro.getPecas(), pecas);
    }

    @Test
    public void verificarJogadaTest() {
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

        tabuleiro.setLinha(2);
        tabuleiro.setColuna(1);

        tabuleiro.setLinhaVazia(2);
        tabuleiro.setColunaVazia(2);

        assertTrue(tabuleiro.verificarJogada());
    }

    @Test
    public void trocarPecasTest() {
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

        tabuleiro.setLinha(2);
        tabuleiro.setColuna(1);

        tabuleiro.setLinhaVazia(2);
        tabuleiro.setColunaVazia(2);

        tabuleiro.trocarPeças();

        assertEquals(tabuleiro.getPecas()[2][2], 0);
    }

    @Test
    public void verificarVitoriaTest() {
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

        tabuleiro.setLinha(2);
        tabuleiro.setColuna(1);

        tabuleiro.setLinhaVazia(2);
        tabuleiro.setColunaVazia(2);

        tabuleiro.trocarPeças();

        assertTrue(tabuleiro.verificarVitoria());
    }

}
