package day17;

/*
 * Затем создайте класс Шахматная доска (англ. ChessBoard). Этот класс в единственном аргументе
 * конструктора должен принимать на вход двумерный массив шахматных фигур. Этот двумерный массив
 * задает конфигурацию фигур на шахматной доске. Пустое пространство на шахматной доске задается
 * с помощью значения EMPTY. Также, у класса ChessBoard должен быть реализован метод print(), который
 * выводит шахматную доску в консоль.
 */

public class ChessBoard {
    private ChessPiece[][] board = new ChessPiece[8][8];

    public ChessBoard(ChessPiece[][] board) {
        this.board = board;
    }

    public void print(){
        for(int i = 0; i<8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
