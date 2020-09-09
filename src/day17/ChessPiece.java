package day17;

/*
 * Создайте Enum “Шахматная фигура” (англ. ChessPiece).
 * Всего существует 6 различных шахматных фигур: король (англ. king), ферзь (англ. queen), ладья (англ. rook),
 * слон (англ. bishop), конь (англ. knight) и пешка (англ. pawn).
 * В нашей программе, у каждой шахматной фигуры есть следующие характеристики:
 * Ценность фигуры - вещественное число
 * Строковое обозначение фигуры
 *
 * В нашем перечислении необходимо создать 12 фигур - 6 белых и 6 черных.
 * Названия фигур в перечислении должны иметь следующий вид:
 * KING_WHITE, KING_BLACK, QUEEN_WHITE, QUEEN_BLACK, и так далее
 *
 * У каждой фигуры должны быть заданы две характеристики - ее ценность и строковое обозначение.
 *
 * Ценности шахматных фигур приведены в таблице:
 * Пешка  1
 * Конь   3
 * Слон   3.5
 * Ладья  5
 * Ферзь  9
 * Король 100
 *
 * Строковые обозначения шахматных фигур приведены в таблице:
 * Пешка (белая)  ♙
 * Конь (белый)   ♘
 * Слон (белый)   ♗
 * Ладья (белая)  ♖
 * Ферзь (белый)  ♕
 * Король (белый) ♔
 *
 *
 * Пешка (черная)  ♟
 * Конь (черный)   ♞
 * Слон (черный)   ♝
 * Ладья (черная)  ♜
 * Ферзь (черный)  ♛
 * Король (черный) ♚
 *
 * Добавьте новую “фигуру” в enum ChessPiece, которая будет называться EMPTY.
 * Эта “фигура” будет обозначать пустое пространство на шахматной доске.
 * Ценность этой фигуры равна -1, а строковое обозначение равно нижнему подчеркиванию ("_").
 */

public enum ChessPiece {
    KING_WHITE("♔",100),
    KING_BLACK("♚",100),
    QUEEN_WHITE("♕",9),
    QUEEN_BLACK("♛",9),
    ROOK_WHITE("♖",5),
    ROOK_BLACK("♜",5),
    BISHOP_WHITE("♗",3.5),
    BISHOP_BLACK("♝",3.5),
    KNIGHT_WHITE("♘",3),
    KNIGHT_BLACK("♞",3),
    PAWN_WHITE("♙",1),
    PAWN_BLACK("♟",1),
    EMPTY("_", -1);


    private String look;
    private double weight;

    ChessPiece(String look, double weight) {
        this.look = look;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return look;
    }

    public String getLook() {
        return look;
    }

    public static ChessPiece findChessPiece(String s){
        for(ChessPiece c : ChessPiece.values()){
            if(c.getLook().equals(s)) return c;
        }
        return ChessPiece.EMPTY;
    }
}
