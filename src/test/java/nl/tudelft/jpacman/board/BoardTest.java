package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class BoardTest {
    @Test
    void testValidBoard() {
        Square[][] grid = new Square[1][1];
        grid[0][0] = new BasicSquare();

        Board board = new Board(grid);
    }

    @Test
    void testNullBoard() {
        Square[][] grid = new Square[1][1];

        Board board = new Board(grid);

        assertThat(board.squareAt(0, 0)).isNull();
    }
}
