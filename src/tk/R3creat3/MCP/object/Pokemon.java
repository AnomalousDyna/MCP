package tk.R3creat3.MCP.object;

import tk.R3creat3.MCP.Type;

public class Pokemon {
    public Pokemon(String name, Type type1, Type type2, Move move1, Move move2,
                   Move move3, Move move4) {
        this.name = name;
        this.type = type1;
        this.type2 = type2;
        this.move = move1;
        this.move2 = move2;
        this.move3 = move3;
        this.move4 = move4;
    }

    String name;
    Type type;
    Type type2;
    Move move;
    Move move2;
    Move move3;
    Move move4;

    public String getName() {
        return name;
    }

    /**
     * Gets a pokemon's move
     *
     * @param range What place to get it from
     */
    public Move getMove(int range) {
        if (range > 4 || range < 1) return null;
        if (range == 1) return move;
        if (range == 2) return move2;
        if (range == 3) return move3;
        if (range == 4) return move4;
        return null;
    }

    /**
     * Get ALL of the pokemon's moves
     */
    public Move[] getMoves() {
        return new Move[]{move, move2, move3, move4};
    }

    private boolean isDualType() {
        if (type2.equals(Type.NONE)) {
            return true;
        }
        return false;
    }

    public Type getType(){
        return type;
    }

    public Type getSecondType(){
        if(isDualType()) return Type.NONE;
        return type2;
    }
}
