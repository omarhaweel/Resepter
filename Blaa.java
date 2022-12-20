
class Blaa extends Resept {
  public Blaa(Legemiddel legemiddel, Lege utskrivende, int PasientId, int Reit) {
    super(legemiddel, utskrivende, PasientId, Reit);
  }

  public int prisAaBetale() {
    return (legemiddel.HentPris() * 25 / 100);
  }

  public String farge() {
    return "Blaa";
  }
}
