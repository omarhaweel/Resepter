
class Vanedannende extends Legemiddel {
  private int VanedannendeNivaa;

  public Vanedannende(int Pris, String navn, double MengdeVirkestoff, int VanedannendeNivaa) {
    super(Pris, navn, MengdeVirkestoff);

    this.VanedannendeNivaa = VanedannendeNivaa;

  }

  public int hentVanedannendeStyrke() {
    return VanedannendeNivaa;
  }
}
