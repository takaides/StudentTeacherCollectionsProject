package com.theironyard.java.studentteachercollectionsproject;

public class RandomName {
    private String firstName;
    private String lastName;

    private String[] firstNames = new String[]{"Fuller","Walter","Holmes","Alfonso","Lucian","Fatima","Ross","Xandra","Quon","Risa","Rajah","Christopher","Heather","Juliet","Chase","Ishmael","Serina","Colt","Jamal","Kasper","Cailin","Ignatius","India","Giacomo","Cole","Basia","Vivien","Jamal","Amir","Isabelle","Chloe","Lenore","Martha","Cain","Cooper","Jelani","Reese","Quamar","Kennedy","Tobias","Kalia","Clio","Allegra","Lila","Dylan","Lenore","Echo","Ulysses","TaShya","Zia","Denton","Owen","Elaine","Brady","Roanna","Ishmael","Kerry","Chiquita","Jessica","Amena","Kylie","Shad","Wylie","Jena","Ulric","Catherine","Medge","Kitra","Aladdin","Katell","Cameron","Marsden","Katell","Lewis","Francis","Rhona","Timothy","Christen","Emerson","Dahlia","Patrick","Gary","Kyla","Louis","Kitra","Arden","Laura","Acton","Imani","Quinlan","Kaitlin","Alan","TaShya","Mia","Benedict","Ahmed","Idona","Lewis","Linda","Xantha"};

    private String[] lastNames = new String[]{"England","Brown","Snider","Castro","Pierce","Butler","Klein","Owen","Fitzgerald","Ochoa","Oneill","Steele","Francis","Peters","Hall","Mann","Daniel","Rasmussen","Pacheco","Stark","Graves","Whitaker","Shaffer","Heath","Fulton","Vasquez","Long","Hutchinson","Stephenson","Key","Kinney","Pace","Allen","Mullen","Spears","Richmond","Noel","Hartman","Kaufman","Baldwin","Dunlap","Hahn","Baldwin","Strong","Emerson","Gonzales","Calhoun","Chandler","Weaver","Leblanc","Gordon","Justice","Booker","Maxwell","Garrison","Workman","Harrington","Barnett","Payne","Nunez","Shaffer","Ayala","Morton","Rios","Patrick","Hurley","Logan","Russell","Buckner","Hamilton","Payne","Ashley","Hogan","Jennings","Cummings","Hinton","Mcknight","Solomon","Ramirez","Hartman","Simon","Chase","Trevino","Orr","Levy","Jordan","Acevedo","Michael","Beck","Evans","Fuentes","Crawford","Rich","Sellers","Maldonado","Dyer","Berger","Cohen","Valencia","Hall"};

    public String getFirstName() {
        Double rand = Math.floor(Math.random() * 100);
        int randInt = rand.intValue();
        firstName = firstNames[randInt];
        return firstName;
    }

    public String getLastName() {
        Double rand = Math.floor(Math.random() * 100);
        int randInt = rand.intValue();
        lastName = lastNames[randInt];
        return lastName;
    }
}
