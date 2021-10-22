 class Main {
    public static void main(String[] args) {
      Heroes hero = new Heroes();
  
      hero.setProfile("Nabila wasyah", 21, 160);
      hero.profile();
      
  
      // jalankan aktivitas disini...
      hero.jalan();
      hero.jalan();
      
      hero.lari();
      hero.lari();

      hero.makan();

      hero.minum();
      hero.minum();
      hero.minum();

      hero.lompat();

      hero.duduk();
      hero.duduk();

      // tampilkan status terkini...
      hero.profile();
      
    }
  }