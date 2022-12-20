
class Presept extends HvitResept {

  public Presept(Legemiddel legemiddel, Lege utskrivende, int PasientId, int Reit) {
    super(legemiddel, utskrivende, PasientId, Reit);
  }

  public int prisAaBetale() {
    return (legemiddel.HentPris() - 108);
  }
@Override
  public String farge() {
    return "Hvitt";
  }
}
