package tk.R3creat3.MCP;

public class TypeHandler {

    MCP plugin = MCP.getInstance();

    /**
     * Returns the effectiveness of an attack.
     *
     * @param type1      A pokemon's first type.
     * @param type2      A pokemon's second type, if applicable.
     * @param attackType The move type.
     */
    public static double getEffectiveness(Type type1, Type type2, Type attackType) {
        if (attackType == Type.NONE) return 0;
        double effectiveness1 = getEffectivenessForType(type1, attackType);
        double effectiveness2 = 1;
        if (type2 != Type.NONE) {
            effectiveness2 = getEffectivenessForType(type2, attackType);
        }
        if (effectiveness1 == 0 || effectiveness2 == 0) {
            return 0;
        }
        if (effectiveness1 == 1 && effectiveness2 == 1) {
            return 1;
        }
        if (effectiveness1 == 2 && effectiveness2 == 2) {
            return 4;
        }
        if (effectiveness1 == 1 && effectiveness2 == 2) {
            return 2;
        }
        if (effectiveness1 == 2 && effectiveness2 == 1) {
            return 2;
        }
        if (effectiveness1 == 2 && effectiveness2 == 0.5) {
            return 1;
        }
        if (effectiveness1 == 0.5 && effectiveness2 == 2) {
            return 1;
        }
        if (effectiveness1 == 0.5 && effectiveness2 == 0.5) {
            return 0.25;
        }
        return 1;
    }

    private static double getEffectivenessForType(Type type1, Type attackType) {
        if (type1 == Type.NONE) return 800;
        if (type1 == Type.NORMAL) {
            if (attackType == Type.FIGHTING) return 2;
            return 1;
        }
        if (type1 == Type.FIGHTING) {
            if (attackType == Type.FLYING) return 2;
            if (attackType == Type.FAIRY) return 2;
            if (attackType == Type.PSYCHIC) return 2;
            if (attackType == Type.BUG) return 0.5;
            if (attackType == Type.ROCK) return 0.5;
            return 1;
        }
        if (type1 == Type.FLYING) {
            if (attackType == Type.ELECTRIC) return 2;
            if (attackType == Type.ICE) return 2;
            if (attackType == Type.ROCK) return 2;
            if (attackType == Type.BUG) return 0.5;
            if (attackType == Type.FIGHTING) return 0.5;
            if (attackType == Type.GRASS) return 0.5;
            if (attackType == Type.GROUND) return 0;
            return 1;
        }
        if (type1 == Type.STEEL) {
            if (attackType == Type.POISON) return 0;
            if (attackType == Type.BUG) return 0.5;
            if (attackType == Type.FAIRY) return 0.5;
            if (attackType == Type.STEEL) return 0.5;
            if (attackType == Type.ROCK) return 0.5;
            if (attackType == Type.PSYCHIC) return 0.5;
            if (attackType == Type.NORMAL) return 0.5;
            if (attackType == Type.ICE) return 0.5;
            if (attackType == Type.GRASS) return 0.5;
            if (attackType == Type.FLYING) return 0.5;
            if (attackType == Type.DRAGON) return 0.5;
            if (attackType == Type.FIRE) return 2;
            if (attackType == Type.GROUND) return 2;
            if (attackType == Type.FIGHTING) return 2;
            return 1;
        }
        if (type1 == Type.ROCK) {
            if (attackType == Type.NORMAL) return 0.5;
            if (attackType == Type.FIRE) return 0.5;
            if (attackType == Type.FLYING) return 0.5;
            if (attackType == Type.POISON) return 0.5;
            if (attackType == Type.FIGHTING) return 2;
            if (attackType == Type.GRASS) return 2;
            if (attackType == Type.GROUND) return 2;
            if (attackType == Type.STEEL) return 2;
            if (attackType == Type.WATER) return 2;
            return 1;
        }
        if (type1 == Type.GROUND) {
            if (attackType == Type.POISON) return 0.5;
            if (attackType == Type.ROCK) return 0.5;
            if (attackType == Type.WATER) return 2;
            if (attackType == Type.GRASS) return 2;
            if (attackType == Type.ICE) return 2;
            if (attackType == Type.ELECTRIC) return 0;
            return 1;
        }
        if (type1 == Type.ELECTRIC) {
            if (attackType == Type.ELECTRIC) return 0.5;
            if (attackType == Type.FLYING) return 0.5;
            if (attackType == Type.STEEL) return 0.5;
            if (attackType == Type.GROUND) return 0;
            return 1;
        }
        if (type1 == Type.WATER) {
            if (attackType == Type.FIRE) return 0.5;
            if (attackType == Type.ICE) return 0.5;
            if (attackType == Type.STEEL) return 0.5;
            if (attackType == Type.WATER) return 0.5;
            if (attackType == Type.ELECTRIC) return 2;
            if (attackType == Type.GRASS) return 2;
            return 1;
        }
        if (type1 == Type.FIRE) {
            if (attackType == Type.FAIRY) return 0.5;
            if (attackType == Type.BUG) return 0.5;
            if (attackType == Type.FIRE) return 0.5;
            if (attackType == Type.GRASS) return 0.5;
            if (attackType == Type.ICE) return 0.5;
            if (attackType == Type.STEEL) return 0.5;
            if (attackType == Type.WATER) return 2;
            if (attackType == Type.ROCK) return 2;
            if (attackType == Type.GROUND) return 2;
            return 1;
        }
        if (type1 == Type.PSYCHIC) {
            if (attackType == Type.FIGHTING) return 0.5;
            if (attackType == Type.PSYCHIC) return 0.5;
            if (attackType == Type.DARK) return 2;
            if (attackType == Type.BUG) return 2;
            if (attackType == Type.GHOST) return 2;
            return 1;
        }
        if (type1 == Type.DARK) {
            if (attackType == Type.FIGHTING) return 2;
            if (attackType == Type.BUG) return 2;
            if (attackType == Type.FAIRY) return 2;
            if (attackType == Type.PSYCHIC) return 0;
            if (attackType == Type.DARK) return 0.5;
            if (attackType == Type.GHOST) return 0.5;
            return 1;
        }
        if (type1 == Type.DRAGON) {
            if (attackType == Type.ELECTRIC) return 0.5;
            if (attackType == Type.GRASS) return 0.5;
            if (attackType == Type.FIRE) return 0.5;
            if (attackType == Type.WATER) return 0.5;
            if (attackType == Type.DRAGON) return 0.5;
            if (attackType == Type.ICE) return 0.5;
            if (attackType == Type.FAIRY) return 0.5;
            return 1;
        }
        if (type1 == Type.GHOST) {
            if (attackType == Type.DARK) return 2;
            if (attackType == Type.GHOST) return 2;
            if (attackType == Type.NORMAL) return 0;
            if (attackType == Type.FIGHTING) return 0;
            if (attackType == Type.BUG) return 0.5;
            if (attackType == Type.POISON) return 0.5;
            return 1;
        }
        if (type1 == Type.FAIRY) {
            if (attackType == Type.DARK) return 0.5;
            if (attackType == Type.FIGHTING) return 0.5;
            if (attackType == Type.BUG) return 0.5;
            if (attackType == Type.POISON) return 2;
            if (attackType == Type.STEEL) return 2;
            if (attackType == Type.DRAGON) return 0;
            return 1;
        }
        return 1;
    }
}
