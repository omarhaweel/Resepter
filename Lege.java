class Lege {
  String navn;

  public Lege(String navn) {
    this.navn = navn;
  }

  public String toString() {
    return "navnet på lege er :" + navn;
  }

  public String hentNavn() {
    return navn;
  }

}
