package game2048logic;
import game2048rendering.Board;
import game2048rendering.Side;
import game2048rendering.Tile;
import java.util.Formatter;


/** The state of a game of 2048.
 *  @author P. N. Hilfinger + Josh Hug
 */
public class Model {
    /** Current contents of the board. */
    private final Board board;
    /** Current score. */
    private int score;

    /* Coordinate System: column x, row y of the board (where x = 0,
     * y = 0 is the lower-left corner of the board) will correspond
     * to board.tile(x, y).  Be careful!
     */

    /** Largest piece value. */
    public static final int MAX_PIECE = 2048;

    /** A new 2048 game on a board of size SIZE with no pieces
     *  and score 0. */
    public Model(int size) {
        board = new Board(size);
        score = 0;
    }

    /** A new 2048 game where RAWVALUES contain the values of the tiles
     * (0 if null). VALUES is indexed by (x, y) with (0, 0) corresponding
     * to the bottom-left corner. Used for testing purposes. */
    public Model(int[][] rawValues, int score) {
        board = new Board(rawValues);
        this.score = score;
    }

    /** Return the current Tile at (x, y), where 0 <= x < size(),
     *  0 <= y < size(). Returns null if there is no tile there.
     *  Used for testing. */
    public Tile tile(int x, int y) {
        return board.tile(x, y);
    }

    /** Return the number of squares on one side of the board. */
    public int size() {
        return board.size();
    }

    /** Return the current score. */
    public int score() {
        return score;
    }


    /** Clear the board to empty and reset the score. */
    public void clear() {
        score = 0;
        board.clear();
    }

    /** Add TILE to the board. There must be no Tile currently at the
     *  same position. */
    public void addTile(Tile tile) {
        board.addTile(tile);
    }

    /** Return true iff the game is over (there are no moves, or
     *  there is a tile with value 2048 on the board). */
    public boolean gameOver() {
        return maxTileExists() || !atLeastOneMoveExists();
    }

    /** Returns this Model's board. */
    public Board getBoard() {
        return board;
    }

    /** Returns true if at least one space on the Board is empty.
     *  Empty spaces are stored as null.
     * */
    public boolean emptySpaceExists() {
        for (int x = 0; x < size(); x++){
            for (int y = 0; y < size(); y++){
                if (board.tile(x, y) ==null){
                    return true;
                }
            }
        }
        // TODO: Task 2. Fill in this function.
        return false;
    }

    /**
     * Returns true if any tile is equal to the maximum valid value.
     * Maximum valid value is given by this.MAX_PIECE. Note that
     * given a Tile object t, we get its value with t.value().
     */
    public boolean maxTileExists() {
        for (int x = 0; x < size(); x++){
            for (int y = 0; y < size(); y++){
                Tile t = board.tile(x, y);
                if ( t != null && tile(x, y).value() == MAX_PIECE){ //不清楚怎么表达tile value
                return true;
                }
            }
        }
        // TODO: Task 3. Fill in this function.
        return false;
        /* 首先第一个点是怎么获取tile的value，tile(x, y).value() 这是表达的方法，
        但是还需要考虑的一点，是我们需要考虑到：我们不能直接写 tile(x, y).value() == MAX_PIECE
        因为如果循环历遍了整个棋盘，如果遇到了null，会遇到空指针可能会爆炸，所以我们首先得保证指针不能保证
        保证循环能完整历遍。还有Tile t = board.tile(x, y)在循环里可以每次都历遍到，如果放在外面，可能
        只能运行一次，所以不符合要求
         */

    }

    /**
     * Returns true if there are any valid moves on the board.
     * There are two ways that there can be valid moves:
     * 1. There is at least one empty space on the board.
     * 2. There are two adjacent tiles with the same value.
     */
    public boolean atLeastOneMoveExists() {
        for (int x = 0; x < size(); x++){
            for (int y = 0; y < size(); y++){
                if (board.tile(x, y) == null){
                    return true;
                }
                else if (board.tile(x, y) != null){
                    Tile t = board.tile(x, y);
                    if ( y < size() - 1){
                        Tile up = board.tile(x, y + 1);
                        if (up != null && t.value() == up.value()){
                             return true;
                        }
                    }
                    if ( y > 0){
                        Tile down = board.tile(x, y - 1);
                        if (down != null && t.value() == down.value()){
                            return true;
                        }
                    }
                    if ( x > 0){
                        Tile left = board.tile(x - 1, y);
                        if (left != null && t.value() == left.value()){
                            return true;
                        }
                    }
                    if (x < size() -1){
                        Tile right = board.tile( x + 1, y);
                        if (right != null && t.value() == right.value()){
                            return true;
                        }
                    }

                }
            }
        }
        // TODO: Fill in this function.
        return false;
    }
/*
And here has a another better version for future thinking:

public boolean atLeastOneMoveExists() {
    for (int x = 0; x < size(); x++) {
        for (int y = 0; y < size(); y++) {
            Tile t = board.tile(x, y);

            // 1️⃣ 有空格
            if (t == null) {
                return true;
            }

            // 2️⃣ 检查上下左右
            if (y < size() - 1) {
                Tile up = board.tile(x, y + 1);
                if (up != null && t.value() == up.value()) {
                    return true;
                }
            }

            if (y > 0) {
                Tile down = board.tile(x, y - 1);
                if (down != null && t.value() == down.value()) {
                    return true;
                }
            }

            if (x > 0) {
                Tile left = board.tile(x - 1, y);
                if (left != null && t.value() == left.value()) {
                    return true;
                }
            }

            if (x < size() - 1) {
                Tile right = board.tile(x + 1, y);
                if (right != null && t.value() == right.value()) {
                    return true;
                }
            }
        }
    }
    return false;
}
 */
    /**
     * Moves the tile at position (x, y) as far up as possible.
     * Rules for Tilt:
     * 1. If two Tiles are adjacent in the direction of motion and have
     *    the same value, they are merged into one Tile of twice the original
     *    value and that new value is added to the score instance variable
     * 2. A tile that is the result of a merge will not merge again on that
     *    tilt. So each move, every tile will only ever be part of at most one
     *    merge (perhaps zero).
     * 3. When three adjacent tiles in the direction of motion have the same
     *    value, then the leading two tiles in the direction of motion merge,
     *    and the trailing tile does not.
     */

    public void moveTileUpAsFarAsPossible(int x, int y) {
        Tile currTile = board.tile(x, y);
        if (currTile == null){
            return;
        }
        int myValue = currTile.value();
        int targetY = y;
        boolean willMerge = false;

        while (targetY < size() - 1 && board.tile(x, targetY + 1) == null) {
            targetY++;
        }

        if ( targetY < size() - 1) {
            Tile above = board.tile(x, targetY + 1);
            if (above != null && above.value() == myValue && !above.wasMerged()) {
                targetY = targetY + 1;
                willMerge = true;
            }
        }
            if (targetY == y) {
                return;
            }
            board.move(x, targetY, currTile);
            if (willMerge){
                score += myValue * 2;
            }
        }
   /* public void moveTileUpAsFarAsPossible(int x, int y) {
        Tile currTile = board.tile(x, y);
        int myValue = currTile.value();
        int targetY = y;

        while (targetY < size() - 1 && board.tile(x, targetY + 1) == null) {
            targetY++;
        }
        if (targetY == y)
            return;
        board.move(x, y, x, targetY);
    }
    public void moveTileDownAsFarAsPossible(int x, int y) {
        Tile currTile = board.tile(x, y);
        int myValue = currTile.value();
        int targetY = y;

        while (targetY > 0 && board.tile(x, targetY - 1) == null) {
            targetY--;
        }
        if (targetY == y)
            return;
        board.move(x, y, x, targetY);
    }

    public void moveTileLeftAsFarAsPossible(int x, int y) {
        Tile currTile = board.tile(x, y);
        int myValue = currTile.value();
        int targetX = x;

        while (targetX < size() - 1 && board.tile(targetX + 1, y) == null) {
            targetX++;
        }
        if (targetX == x)
            return;
        board.move(x, y, targetX, y);

    }
    public void moveTileRightAsFarAsPossible(int x, int y) {
        Tile currTile = board.tile(x, y);
        int myValue = currTile.value();
        int targetX = x;

        while (targetX > 0 && board.tile(targetX - 1, y) == null) {
            targetX--;
        }
        if (targetX == x)
            return;
        board.move(x, y, targetX, y);
        // TODO: Tasks 5, 6, and 10. Fill in this function.
    }
*/
    /** Handles the movements of the tilt in column x of the board
     * by moving every tile in the column as far up as possible.
     * The viewing perspective has already been set,
     * so we are tilting the tiles in this column up.
     * */
    public void tiltColumn(int x) {
        for (int y = size() - 2; y >= 0; y--){
            moveTileUpAsFarAsPossible(x, y);
        }
        // TODO: Task 7. Fill in this function.
    }

    public void tilt(Side side) {
        board.setViewingPerspective(side);
        for (int x = 0; x < size(); x++){
            tiltColumn(x);
        }
        board.setViewingPerspective(Side.NORTH);
        // TODO: Tasks 8 and 9. Fill in this function.
    }

    /** Tilts every column of the board toward SIDE.
     */
    public void tiltWrapper(Side side) {
        board.resetMerged();
        tilt(side);
    }


    @Override
    public String toString() {
        Formatter out = new Formatter();
        out.format("%n[%n");
        for (int y = size() - 1; y >= 0; y -= 1) {
            for (int x = 0; x < size(); x += 1) {
                if (tile(x, y) == null) {
                    out.format("|    ");
                } else {
                    out.format("|%4d", tile(x, y).value());
                }
            }
            out.format("|%n");
        }
        String over = gameOver() ? "over" : "not over";
        out.format("] %d (game is %s) %n", score(), over);
        return out.toString();
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Model m) && this.toString().equals(m.toString());
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }
}
