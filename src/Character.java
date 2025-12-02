// Character.java
public class Character {
    // Atribut: Data karakter kayak stats di Minecraft
    private final String name; // Nama karakter, misal "Steve"
    private int health;  // Darah, misal 100
    private int level;   // Level, misal 1

    // Constructor: "Craft" karakter baru
    public Character(String xname, int health, int level) {
        this.name = xname;
        this.health = health;
        this.level = level;
    }
    // Constructor 2: Cuma nama, health & level default
    public Character(String name) {
        this.name = name;
        this.health = 100; // Default health
        this.level = 1;    // Default level
    }
    // Constructor 3: Nama & level, health default
    public Character(String name, int level) {
        this.name = name;
        this.health = 100; // Default
        this.level = level;
    }

    // Method: Naik level
    public void levelUp() {
        this.level++;
        setHealth(100); // Naik level, darah full lagi
        System.out.println(name + " naik level jadi " + level + "!");
    }

    // Method: Kena damage
    public void takeDamage(int damage) {
       setHealth(getHealth() - damage); //pake setter biar validasi
        System.out.println(name + " kena " + damage + " damage. Darah: " + getHealth());
    }

    //Methos: Ambil item
    public void addItem(String item) {
        System.out.println(name + " ambil " + item + "!");
    }

    // Getter: Ambil data nama
    public String getName() {
        return name;
    }

    // Getter: Ambil data darah
    public int getHealth() {
        return health;
    }

    // Getter: Ambil data level
    public int getLevel() {
        return level;
    }
    
    // Method buat heal (nambah darah, maks 100)
    public void heal(int amount) {
        this.health += amount;
        if(health > 100) health = 100; // Maksimal darah 100
        System.out.println(name + " sembuh " + amount + " poin. Darah: " + health);
    }

    //Setter untuk health
    public void setHealth(int health) {
        if(health < 0) {
             this.health = 0; // Minimal darah 0, kayak mati
        } 
        else if(health > 100) {
            this.health = 100; // Maksimal darah 100
        } 
        else {
            this.health = health;
        }
    }

}