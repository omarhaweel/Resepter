
class HvitResept extends Resept {
  public HvitResept(Legemiddel legemiddel, Lege utskrivende, int PasientId, int Reit) {
    super(legemiddel, utskrivende, PasientId, Reit);
  }

  public String farge() {
    return "hvitt0";
  }

  public int prisAaBetale() {
    return legemiddel.HentPris();
  }
}
