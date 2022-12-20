
class Milresept extends HvitResept {

  public Milresept(Legemiddel legemiddel, Lege utskrivende, int PasientId) {
    super(legemiddel, utskrivende, PasientId, 3);
  }

  public int prisAaBetale() {
    return 0;
  }
}
