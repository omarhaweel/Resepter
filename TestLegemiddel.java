
class TestLegemiddel {
  public static void main(String[] args) {
    // Opretter Legemiddel objekter //

    Legemiddel narko = new Narkotisk(100, "NARKOS", 40.5, 80);
    Legemiddel vane = new Vanedannende(90, "SOBRIL", 20.5, 70);
    Legemiddel vanlig = new Vanlig(80, "PARACET", 66.66);
    System.out.println();
    System.out.println();
    System.out.println("********************************************************");
    System.out.println("Skriver info om legemidler");
    System.out.println("********************************************************");
    System.out.println();
    System.out.println();
    System.out.println();

    System.out.println(narko.toString());
    System.out.println();
    System.out.println(vane.toString());
    System.out.println();
    System.out.println(vanlig.toString());

    // Opretter Resept Objekter med referanser til legemidler og utskrivende leger//
    Lege kari = new Lege("Kari Nordmann");
    Lege ole = new Lege("Ole Nordmann");

    Resept hvitt = new HvitResept(narko, kari, 66066, 2);
    Resept blatt = new Blaa(vane, ole, 33033, 2);
    Resept mil = new Milresept(vanlig, ole, 10000);
    Resept pr = new Presept(vanlig, kari, 44044, 2);
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("********************************************************");
    System.out.println("skriver info om Resepter");
    System.out.println("********************************************************");
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println(hvitt.toString());
    System.out.println();
    System.out.println(blatt.toString());
    System.out.println();
    System.out.println(mil.toString());
    System.out.println();
    System.out.println(pr.toString());
    System.out.println();

    // Oppretter Lege objekter //
    System.out.println();
    System.out.println();
    System.out.println();
    System.out.println("********************************************************");
    System.out.println("Skriver info om leger ");
    System.out.println("********************************************************");
    System.out.println();
    System.out.println();
    Lege doc = new Lege("M.Gilbert");
    Lege spes = new Spesialist("R.Smith", "222033");
    System.out.println(doc.toString());
    System.out.println(spes.toString());
    System.out.println();
    System.out.println();

  }

  public static boolean testLegemiddelId(Legemiddel legemiddel, int forventetLegemiddelId) {
    return legemiddel.hentId() == forventetLegemiddelId;
  }

}
