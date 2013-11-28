package tk.R3creat3.MCP.object;

import org.bukkit.Bukkit;
import org.bukkit.craftbukkit.v1_6_R3.CraftServer;
import org.bukkit.craftbukkit.v1_6_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import tk.R3creat3.MCP.MCP;
import tk.R3creat3.MCP.Type;

public class Trainer extends CraftPlayer {

    public Trainer(Player p) {
        super((CraftServer) Bukkit.getServer(), ((CraftPlayer) p).getHandle());
    }

    public Pokemon p1;
    public Pokemon p2;
    public Pokemon p3;
    public Pokemon p4;
    public Pokemon p5;
    public Pokemon p6;

    /**
     * Sets a trainer's pokemon.
     *
     * @param p     A pokemon
     * @param range What place you put it in
     */
    public void setPokemon(Pokemon p, int range) {
        if (range > 6 || range < 1) return;
        if (range == 1) p1 = p;
        if (range == 2) p2 = p;
        if (range == 3) p3 = p;
        if (range == 4) p4 = p;
        if (range == 5) p5 = p;
        if (range == 6) p6 = p;
    }

    /**
     * Gets a trainer's pokemon
     *
     * @param range What place to get it from
     */
    public Pokemon getPokemon(int range) {
        if (range > 6 || range < 1) return new Pokemon("Unidentified", Type.NONE, Type.NONE, null, null, null, null);
        if (range == 1) return p1;
        if (range == 2) return p2;
        if (range == 3) return p3;
        if (range == 4) return p4;
        if (range == 5) return p5;
        if (range == 6) return p6;
        return new Pokemon("Unidentified", Type.NONE, Type.NONE, null, null, null, null);
    }

    /**
     * Get ALL of the trainer's pokemon
     */
    public Pokemon[] getPokemon() {
        return new Pokemon[]{p1, p2, p3, p4, p5, p6};
    }

    /**
     * Gets a player's Trainer object form their username.
     */
    public static Trainer getTrainer(String name) {
        return MCP.getInstance().getTrainers().get(name);
    }

    /**
     * Gets a player's Trainer object from their player instance.
     */
    public static Trainer getTrainer(Player p) {
        return MCP.getInstance().getTrainers().get(p.getName());
    }

    /**
     * Creates a Trainer instance for a player.
     *
     * @param p A Player
     */
    public static void craftTrainer(Player p) {
        Trainer t = new Trainer(p);
        MCP.getInstance().getTrainers().put(p.getName(), t);
    }

    public boolean hasPermisson(String perm) {
        return Bukkit.getPlayer(getName()).hasPermission(perm);
    }


    // *********** Deprecated shit thanks to Bukkit's over-mapped thing ***********

    public double getLastDamage() {
        return super.getLastDamage();
    }

    public double getMaxHealth() {
        return super.getMaxHealth();
    }

    public double getHealth() {
        return super.getHealth();
    }

    @Deprecated
    public void setMaxHealth(int amount) {
        super.setMaxHealth((double) amount);
    }

    @Deprecated
    public void setHealth(int amount) {
        // This is a dud. Use setHealth(double)
    }

    @Deprecated
    public void damage(int amount) {
        super.damage((double) amount);
    }

    @Deprecated
    public void damage(int amount, org.bukkit.entity.Entity entity) {
        super.damage((double) amount, entity);
    }

    @Deprecated
    public void setLastDamage(int amount) {
        super.damage((double) amount);
    }

}