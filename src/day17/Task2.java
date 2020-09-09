package day17;

/*
 * В методе main() класса Task2 создайте новый объект класса ChessBoard, передав ему в качестве аргумента
 * двумерный массив с расположением фигур как на картинке ниже (матч Крамник - Каспаров 2000 года).
 * Затем, используя метод print() выведите шахматную доску в консоль, используя строковые обозначения шахматных фигур.
 * Вывод в консоль должен быть таким:
 *
 * ♜____♜♚_
 * _♖__♟♟_♟
 * ♟_♞___♟_
 * ♛__♗____
 * ___♝♙___
 * ____♗♙__
 * ♙__♕_♙_♙
 * _____♖♔_
 */

public class Task2 {
    private static final String KRAMNIK_KASPAROV_2000 = "♜____♜♚__♖__♟♟_♟♟_♞___♟_♛__♗_______♝♙_______♗♙__♙__♕_♙_♙_____♖♔_";

    public static void main(String[] args) {
        ChessPiece[][] chessPieces = new ChessPiece[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessPieces[i][j] = ChessPiece.findChessPiece(KRAMNIK_KASPAROV_2000.substring(i * 8 + j, i * 8 + j + 1));
            }
        }

        ChessBoard board = new ChessBoard(chessPieces);

        board.print();

    }


}
