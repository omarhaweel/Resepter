class Narkotisk extends Legemiddel {
  private int Styrke;

  public Narkotisk(int Pris, String navn, double MengdeVirkestoff, int Styrke) {
    super(Pris, navn, MengdeVirkestoff);
    this.Styrke = Styrke;

  }

  public int hentNarkotiskStyrke() {
    return Styrke;
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
