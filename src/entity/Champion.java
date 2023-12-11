package entity;

public class Champion {
   private String name;
   private int life;
   private int attack;
   private int armor;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getLife() {
      return life;
   }

   public void setLife(int life) {
      this.life = life;
   }

   public int getAttack() {
      return attack;
   }

   public void setAttack(int attack) {
      this.attack = attack;
   }

   public int getArmor() {
      return armor;
   }

   public void setArmor(int armor) {
      this.armor = armor;
   }

   public void takeDamage(Champion other) {
      int damage = other.attack - armor;

      if (damage < 0)
         life -= 1;
      else
         life -= damage;

      if (life < 0)
         life = 0;
   }

   public String status() {
      if (life <= 0)
         return String.format("%s: %d de vida (morreu)", name, life);
      else
         return String.format("%s: %d de vida", name, life);
   }
}
