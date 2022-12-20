
abstract class Resept {
  private static int count = 0;
  protected int id = 0;
  Legemiddel legemiddel;
  Lege utskrivende;
  int PasientId;
  int Reit;

  public Resept(Legemiddel legemiddel, Lege utskrivende, int PasientId, int Reit) {
    this.legemiddel = legemiddel;
    this.utskrivende = utskrivende;
    this.Reit = Reit;
    this.PasientId = PasientId;
    id = count++;
  }

  public int hentId() {
    return id;
  }

  public int hentReit() {
    return Reit;
  }

  public Legemiddel hentLegemiddel() {
    return legemiddel;
  }

  public Lege hentLege() {
    return utskrivende;
  }

  public int hentPasientid() {
    return PasientId;
  }

  public boolean bruk() {
    if (Reit == 0) {
      return false;
    } else {
      Reit--;
      return true;
    }
  }

  public String toString() {
    return "Id nummer på Resept er:" + hentId() + "\n" + "Info om Legemiddelet:" + "\n" + hentLegemiddel().toString()
        + "\n" + "Antall Reit i reseptet er :" + hentReit() + "\n" + "utskrivende lege er " + hentLege().toString()
        + "\n" + "Pasient id er :" + hentPasientid();
  }

  abstract public String farge();

  abstract public int prisAaBetale();

}
